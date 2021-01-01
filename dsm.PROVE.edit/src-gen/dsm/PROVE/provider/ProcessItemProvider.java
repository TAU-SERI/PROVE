/**
 */
package dsm.PROVE.provider;

import dsm.PROVE.PROVEFactory;
import dsm.PROVE.PROVEPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dsm.PROVE.Process} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addNotesPropertyDescriptor(object);
			addArtifactInStateUsedPropertyDescriptor(object);
			addResultArtifactInStatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Process_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Process_name_feature", "_UI_Process_type"),
						PROVEPackage.Literals.PROCESS__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Notes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Process_notes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Process_notes_feature",
								"_UI_Process_type"),
						PROVEPackage.Literals.PROCESS__NOTES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Artifact In State Used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArtifactInStateUsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Process_artifactInStateUsed_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Process_artifactInStateUsed_feature",
								"_UI_Process_type"),
						PROVEPackage.Literals.PROCESS__ARTIFACT_IN_STATE_USED, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Result Artifact In State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResultArtifactInStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Process_resultArtifactInState_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Process_resultArtifactInState_feature",
								"_UI_Process_type"),
						PROVEPackage.Literals.PROCESS__RESULT_ARTIFACT_IN_STATE, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PROVEPackage.Literals.PROCESS__ARTIFACT);
			childrenFeatures.add(PROVEPackage.Literals.PROCESS__PROCESS);
			childrenFeatures.add(PROVEPackage.Literals.PROCESS__SHADOWNODEINCOMING);
			childrenFeatures.add(PROVEPackage.Literals.PROCESS__SHADOWNODEOUTGOING);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Process.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Process"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((dsm.PROVE.Process) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Process_type")
				: getString("_UI_Process_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(dsm.PROVE.Process.class)) {
		case PROVEPackage.PROCESS__NAME:
		case PROVEPackage.PROCESS__NOTES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case PROVEPackage.PROCESS__ARTIFACT:
		case PROVEPackage.PROCESS__PROCESS:
		case PROVEPackage.PROCESS__SHADOWNODEINCOMING:
		case PROVEPackage.PROCESS__SHADOWNODEOUTGOING:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(
				createChildParameter(PROVEPackage.Literals.PROCESS__ARTIFACT, PROVEFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add(
				createChildParameter(PROVEPackage.Literals.PROCESS__PROCESS, PROVEFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add(createChildParameter(PROVEPackage.Literals.PROCESS__PROCESS,
				PROVEFactory.eINSTANCE.createShadowNodeIncoming()));

		newChildDescriptors.add(createChildParameter(PROVEPackage.Literals.PROCESS__PROCESS,
				PROVEFactory.eINSTANCE.createShadowNodeOutgoing()));

		newChildDescriptors.add(createChildParameter(PROVEPackage.Literals.PROCESS__SHADOWNODEINCOMING,
				PROVEFactory.eINSTANCE.createShadowNodeIncoming()));

		newChildDescriptors.add(createChildParameter(PROVEPackage.Literals.PROCESS__SHADOWNODEOUTGOING,
				PROVEFactory.eINSTANCE.createShadowNodeOutgoing()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == PROVEPackage.Literals.PROCESS__PROCESS
				|| childFeature == PROVEPackage.Literals.PROCESS__SHADOWNODEINCOMING
				|| childFeature == PROVEPackage.Literals.PROCESS__SHADOWNODEOUTGOING;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PROVEEditPlugin.INSTANCE;
	}

}
