package PROVE.design.wizards;


import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionStatus;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import PROVE.design.Activator;
import dsm.PROVE.SemanticUtil; //for initializing model elements

public class PROVEprojectNewWizard extends BasicNewProjectResourceWizard implements INewWizard {
	protected WizardNewProjectCreationPage newProjectPage;
	
	public PROVEprojectNewWizard() {
		super();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		
	}
	
	@Override
	public void addPages() {
		newProjectPage = new WizardNewProjectCreationPage("Project"); //$NON-NLS-1$
		newProjectPage.setInitialProjectName(""); //$NON-NLS-1$
		newProjectPage.setTitle("Create a PROVE Modeling project"); //$NON-NLS-1$
		newProjectPage.setDescription("Enter a project name"); //$NON-NLS-1$
		addPage(newProjectPage);
	}

	@Override
	public boolean performFinish() {
		try {
			String projectName = newProjectPage.getProjectName();
			IProject project = ModelingProjectManager.INSTANCE.createNewModelingProject(projectName,
					newProjectPage.getLocationPath(), true, new NullProgressMonitor());

			// Enable UML viewpoints
			final Option<ModelingProject> created = ModelingProject.asModelingProject(project);
			if (created.some()) {
				Display.getDefault().syncExec(new Runnable() {

					public void run() {
						// Create default empty UML model
						createSemanticResource(project, projectName, projectName + ".prove");
						final Session session = created.get().getSession();
						if (session != null) {
							enable(session);
							if (SessionStatus.DIRTY.equals(session.getStatus())) {
								session.save(new NullProgressMonitor());
							}
						}
						Resource sessionResource = session.getSessionResource();
						DRepresentation rep = getMainRep(sessionResource);
						if (rep != null) {
							DialectUIManager.INSTANCE.openEditor(session, rep, new NullProgressMonitor());
						}

					}
				});
			}

		} catch (CoreException e) {
			PROVE.design.Activator.logError("Error while creating the project.", e);
			return false;
		}
		return true;
	}
	
	private DRepresentation getMainRep(Resource r) {
		TreeIterator<EObject> ite = r.getAllContents();
		while (ite.hasNext()) {
			EObject eObject = (EObject) ite.next();
			if (eObject instanceof DSemanticDiagram) {
				DSemanticDiagram rep = (DSemanticDiagram) eObject;
				if ("PROVE diagram".equals(rep.getDescription().getName())) {
					return rep;
				}

			}
		}
		return null;
	}
	private void enable(final Session session) {
		if (session != null) {
			session.getTransactionalEditingDomain().getCommandStack()

					.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
						@Override
						protected void doExecute() {
							final ViewpointSelectionCallback selection = new ViewpointSelectionCallback();
							for (final Viewpoint previouslySelected : session.getSelectedViewpoints(false)) {
								selection.deselectViewpoint(previouslySelected, session, new NullProgressMonitor());
							}

							selection.selectViewpoint(getTradesMainViewPoint(), session, new NullProgressMonitor());
						}
					});
		}
	}


	private Option<IFile> createSemanticResource(final IProject project, final String rootObjectName,
			String newUmlFileName) {
		final Option<ModelingProject> modelingProject = ModelingProject.asModelingProject(project);
		final Session session = modelingProject.get().getSession();
		final String platformPath = getNewModelFilePath(project, newUmlFileName);
		session.getTransactionalEditingDomain().getCommandStack()
				.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
					@Override
					protected void doExecute() {

						final URI semanticModelURI = URI.createPlatformResourceURI(platformPath, true);
						final Resource res = new ResourceSetImpl().createResource(semanticModelURI);

						/* Add the initial model object to the contents. */
						final EObject rootObject = SemanticUtil.createInitialModel(rootObjectName);

						if (rootObject != null) {
							res.getContents().add(rootObject);
						}
						try {
							res.save(Collections.emptyMap());
						} catch (final IOException e) {
							Activator.logError("Erro while creating the model", e);
						}

						session.addSemanticResource(semanticModelURI, new NullProgressMonitor());

						session.save(new NullProgressMonitor());
					}


				});
		return Options.newSome(ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformPath)));
	}
	private Viewpoint getTradesMainViewPoint() {
		return ViewpointRegistry.getInstance().getViewpoint(URI.createURI("viewpoint:/PROVE.design/"+Activator.VIEWPOINT_NAME));
	}

	private static String getNewModelFilePath(IProject project, String umlFileName) {
		return '/' + project.getName() + '/' + umlFileName.toLowerCase();
	}

}
