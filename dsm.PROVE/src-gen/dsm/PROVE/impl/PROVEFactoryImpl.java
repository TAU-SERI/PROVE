/**
 */
package dsm.PROVE.impl;

import dsm.PROVE.Artifact;
import dsm.PROVE.ArtifactState;
import dsm.PROVE.ArtifactStateInstance;
import dsm.PROVE.PROVEFactory;
import dsm.PROVE.PROVEPackage;
import dsm.PROVE.Resource;
import dsm.PROVE.ShadowNodeIncoming;
import dsm.PROVE.ShadowNodeOutgoing;
import dsm.PROVE.ShadowNodeTypeENUM;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PROVEFactoryImpl extends EFactoryImpl implements PROVEFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PROVEFactory init() {
		try {
			PROVEFactory thePROVEFactory = (PROVEFactory) EPackage.Registry.INSTANCE.getEFactory(PROVEPackage.eNS_URI);
			if (thePROVEFactory != null) {
				return thePROVEFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PROVEFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROVEFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PROVEPackage.ARTIFACT:
			return createArtifact();
		case PROVEPackage.ARTIFACT_STATE:
			return createArtifactState();
		case PROVEPackage.PROCESS:
			return createProcess();
		case PROVEPackage.SHADOW_NODE_INCOMING:
			return createShadowNodeIncoming();
		case PROVEPackage.SHADOW_NODE_OUTGOING:
			return createShadowNodeOutgoing();
		case PROVEPackage.ARTIFACT_STATE_INSTANCE:
			return createArtifactStateInstance();
		case PROVEPackage.RESOURCE:
			return createResource();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case PROVEPackage.SHADOW_NODE_TYPE_ENUM:
			return createShadowNodeTypeENUMFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case PROVEPackage.SHADOW_NODE_TYPE_ENUM:
			return convertShadowNodeTypeENUMToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtifactState createArtifactState() {
		ArtifactStateImpl artifactState = new ArtifactStateImpl();
		return artifactState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public dsm.PROVE.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShadowNodeIncoming createShadowNodeIncoming() {
		ShadowNodeIncomingImpl shadowNodeIncoming = new ShadowNodeIncomingImpl();
		return shadowNodeIncoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShadowNodeOutgoing createShadowNodeOutgoing() {
		ShadowNodeOutgoingImpl shadowNodeOutgoing = new ShadowNodeOutgoingImpl();
		return shadowNodeOutgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtifactStateInstance createArtifactStateInstance() {
		ArtifactStateInstanceImpl artifactStateInstance = new ArtifactStateInstanceImpl();
		return artifactStateInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShadowNodeTypeENUM createShadowNodeTypeENUMFromString(EDataType eDataType, String initialValue) {
		ShadowNodeTypeENUM result = ShadowNodeTypeENUM.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShadowNodeTypeENUMToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PROVEPackage getPROVEPackage() {
		return (PROVEPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PROVEPackage getPackage() {
		return PROVEPackage.eINSTANCE;
	}

} //PROVEFactoryImpl
