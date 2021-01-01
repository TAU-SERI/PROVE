package PROVE.design;

import java.awt.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.omg.CORBA.ACTIVITY_COMPLETED;

import dsm.PROVE.*;
import dsm.PROVE.Process;
import dsm.PROVE.impl.ArtifactImpl;
import javafx.animation.PauseTransition;
import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;


import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.diagram.business.api.helper.graphicalfilters.HideFilterHelper;
import org.eclipse.sirius.diagram.business.api.query.EObjectQuery;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.ViewpointPackage;



/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    //A validation check indicating (TRUE) if an artifact-in-state that process is implemented is used by another process
    public boolean bIsUsed(ArtifactStateInstance self) {
    	//
    	boolean is_used = false;
    	Process targetProcess = self.getUsedByActivity();
    	ArtifactState artState = (ArtifactState) self.eContainer();
    	EList<ArtifactStateInstance> instances = artState.getArtifactstateinstance();
    	for (int i=0; i < instances.size(); i++) {
    		if (instances.get(i).getOriginatingActivity()==targetProcess) {
    			is_used = true;
    		}
    	}
    	return is_used;
    }
    //A validation check indicating (TRUE) if an artifact-in-state that is required from a process is implemented within the process
    public boolean bIsImplemented(ArtifactStateInstance self) {
    	//
    	boolean is_implemented = false;
    	Process originProcess = self.getOriginatingActivity();
    	ArtifactState artState = (ArtifactState) self.eContainer();
    	EList<ArtifactStateInstance> instances = artState.getArtifactstateinstance();
    	for (int i=0; i < instances.size(); i++) {
    		if (instances.get(i).getUsedByActivity()==originProcess) {
    			is_implemented = true;
    		}
    	}
    	return is_implemented;
    }
    
    //A function to hide elements from a diagram
    public void encapsulateElements(Process process, DDiagram diagram) {
    	Collection<EObject> result = new EObjectQuery(process).getInverseReferences(ViewpointPackage.Literals.DREPRESENTATION_ELEMENT__SEMANTIC_ELEMENTS);
    	//???result.toArray();
    	System.out.println(result.toString()); //DEBUG
    	result.forEach(e->System.out.print(e.eClass().getName()+';')); //DEBUG
    	System.out.println(); //DEBUG
    	result.removeIf(obj-> obj.eClass().getName().toString() != "DNodeContainer");
    	System.out.print("filtered: ");
    	result.forEach(e->System.out.print(e.eClass().getName() + ";")); //DEBUG
    	System.out.println(); //DEBUG
    	
    	result.removeIf(n->!(((DDiagramElement) n).getParentDiagram().equals(diagram)));
		
    	//Collection<EObject> resultRep = new EObjectQuery((EObject) result).getRepresentation(diagram);
    	result.forEach(diagramElement -> HideFilterHelper.INSTANCE.hide((DDiagramElement) diagramElement));
    	
    	return;
    }
    
    //A function to show (cancel hiding) elements from diagram
    public void decapsulateElements(Process process, DDiagram diagram) {
    	Collection<EObject> result = new EObjectQuery(process).getInverseReferences(ViewpointPackage.Literals.DREPRESENTATION_ELEMENT__SEMANTIC_ELEMENTS); //past: DSEMANTIC_DECORATOR__TARGET
    	//DSemanticDecor
    	
    	result.removeIf(obj-> obj.eClass().getName().toString() != "DNodeContainer");
    	result.removeIf(n->!(((DDiagramElement) n).getParentDiagram().equals(diagram)));
   		//result.forEach(elem -> System.out.print(elem.eClass().getName().toString()));
  	
    	result.forEach(diagramElement -> HideFilterHelper.INSTANCE.reveal((DDiagramElement) diagramElement));
    	
    	//Alternative implementation (different syntax)
    	//for (EObject diagramElement : result) {
    	//	HideFilterHelper.INSTANCE.reveal((DDiagramElement) diagramElement);	
		//}    	
    	return;
    }
    
    
    
//    public EList<EObject> getSourceState(ArtifactStateInstance state){
//    	//This function is not implemented
//    	Process activity_origin = state.getOriginatingActivity();
//    	//ArtifactState sourceState = (ArtifactState) new List();
//    	Artifact source_artifact = (Artifact) state.eContainer().eContainer();
//    	EList <EObject> stateImp = (EList<EObject>) source_artifact.eAllContents();
//    	stateImp = (EList<EObject>) stateImp.stream()
//    			.filter(st_imp -> st_imp.eClass().equals(ArtifactStateInstance.class)) //getting all instances
//    			.collect(Collectors.toList());
//    	return stateImp;
//    }
    
    
//    public EList<Process> getAffectedProcesses(Process process){
//    	EList<ArtifactStateInstance> stateInstances = process.getResultArtifactInState();
//    	
//    	return
//    }
}
