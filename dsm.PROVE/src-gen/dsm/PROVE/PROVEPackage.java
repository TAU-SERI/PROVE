/**
 */
package dsm.PROVE;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dsm.PROVE.PROVEFactory
 * @model kind="package"
 * @generated
 */
public interface PROVEPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PROVE";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "dsm.PROVE";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PROVE";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PROVEPackage eINSTANCE = dsm.PROVE.impl.PROVEPackageImpl.init();

	/**
	 * The meta object id for the '{@link dsm.PROVE.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.PROVE.impl.ArtifactImpl
	 * @see dsm.PROVE.impl.PROVEPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__STATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.PROVE.impl.ArtifactStateImpl <em>Artifact State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.PROVE.impl.ArtifactStateImpl
	 * @see dsm.PROVE.impl.PROVEPackageImpl#getArtifactState()
	 * @generated
	 */
	int ARTIFACT_STATE = 1;

	/**
	 * The feature id for the '<em><b>Achieved Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_STATE__ACHIEVED_STATUS = 0;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_STATE__ARTIFACT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Artifactstateinstance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_STATE__ARTIFACTSTATEINSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_STATE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Artifact State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_STATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Artifact State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.PROVE.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.PROVE.impl.ProcessImpl
	 * @see dsm.PROVE.impl.PROVEPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 2;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ARTIFACT = 0;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = 2;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NOTES = 3;

	/**
	 * The feature id for the '<em><b>Artifact In State Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ARTIFACT_IN_STATE_USED = 4;

	/**
	 * The feature id for the '<em><b>Result Artifact In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RESULT_ARTIFACT_IN_STATE = 5;

	/**
	 * The feature id for the '<em><b>Shadownodeincoming</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SHADOWNODEINCOMING = 6;

	/**
	 * The feature id for the '<em><b>Shadownodeoutgoing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SHADOWNODEOUTGOING = 7;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__START_DATE = 8;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__END_DATE = 9;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RESOURCE = 10;

	/**
	 * The feature id for the '<em><b>Resource Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RESOURCE_USED = 11;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__STATUS = 12;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.PROVE.impl.ShadowNodeIncomingImpl <em>Shadow Node Incoming</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.PROVE.impl.ShadowNodeIncomingImpl
	 * @see dsm.PROVE.impl.PROVEPackageImpl#getShadowNodeIncoming()
	 * @generated
	 */
	int SHADOW_NODE_INCOMING = 3;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_INCOMING__ARTIFACT = PROCESS__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_INCOMING__PROCESS = PROCESS__PROCESS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_INCOMING__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_INCOMING__NOTES = PROCESS__NOTES;

	/**
	 * The feature id for the '<em><b>Artifact In State Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_INCOMING__ARTIFACT_IN_STATE_USED = PROCESS__ARTIFACT_IN_STATE_USED;

	/**
	 * The feature id for the '<em><b>Result Artifact In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_INCOMING__RESULT_ARTIFACT_IN_STATE = PROCESS__RESULT_ARTIFACT_IN_STATE;

	/**
	 * The feature id for the '<em><b>Shadownodeincoming</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_INCOMING__SHADOWNODEINCOMING = PROCESS__SHADOWNODEINCOMING;

	/**
	 * The feature id for the '<em><b>Shadownodeoutgoing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_INCOMING__SHADOWNODEOUTGOING = PROCESS__SHADOWNODEOUTGOING;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_INCOMING__START_DATE = PROCESS__START_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_INCOMING__END_DATE = PROCESS__END_DATE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_INCOMING__RESOURCE = PROCESS__RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_INCOMING__RESOURCE_USED = PROCESS__RESOURCE_USED;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_INCOMING__STATUS = PROCESS__STATUS;

	/**
	 * The number of structural features of the '<em>Shadow Node Incoming</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_INCOMING_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shadow Node Incoming</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_INCOMING_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.PROVE.impl.ShadowNodeOutgoingImpl <em>Shadow Node Outgoing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.PROVE.impl.ShadowNodeOutgoingImpl
	 * @see dsm.PROVE.impl.PROVEPackageImpl#getShadowNodeOutgoing()
	 * @generated
	 */
	int SHADOW_NODE_OUTGOING = 4;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_OUTGOING__ARTIFACT = PROCESS__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_OUTGOING__PROCESS = PROCESS__PROCESS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_OUTGOING__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_OUTGOING__NOTES = PROCESS__NOTES;

	/**
	 * The feature id for the '<em><b>Artifact In State Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_OUTGOING__ARTIFACT_IN_STATE_USED = PROCESS__ARTIFACT_IN_STATE_USED;

	/**
	 * The feature id for the '<em><b>Result Artifact In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_OUTGOING__RESULT_ARTIFACT_IN_STATE = PROCESS__RESULT_ARTIFACT_IN_STATE;

	/**
	 * The feature id for the '<em><b>Shadownodeincoming</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_OUTGOING__SHADOWNODEINCOMING = PROCESS__SHADOWNODEINCOMING;

	/**
	 * The feature id for the '<em><b>Shadownodeoutgoing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_OUTGOING__SHADOWNODEOUTGOING = PROCESS__SHADOWNODEOUTGOING;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_OUTGOING__START_DATE = PROCESS__START_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_OUTGOING__END_DATE = PROCESS__END_DATE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_OUTGOING__RESOURCE = PROCESS__RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_OUTGOING__RESOURCE_USED = PROCESS__RESOURCE_USED;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_OUTGOING__STATUS = PROCESS__STATUS;

	/**
	 * The number of structural features of the '<em>Shadow Node Outgoing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_OUTGOING_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shadow Node Outgoing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADOW_NODE_OUTGOING_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.PROVE.impl.ArtifactStateInstanceImpl <em>Artifact State Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.PROVE.impl.ArtifactStateInstanceImpl
	 * @see dsm.PROVE.impl.PROVEPackageImpl#getArtifactStateInstance()
	 * @generated
	 */
	int ARTIFACT_STATE_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Used By Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_STATE_INSTANCE__USED_BY_ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Originating Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_STATE_INSTANCE__ORIGINATING_ACTIVITY = 1;

	/**
	 * The number of structural features of the '<em>Artifact State Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_STATE_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Artifact State Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_STATE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.PROVE.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.PROVE.impl.ResourceImpl
	 * @see dsm.PROVE.impl.PROVEPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.PROVE.ShadowNodeTypeENUM <em>Shadow Node Type ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.PROVE.ShadowNodeTypeENUM
	 * @see dsm.PROVE.impl.PROVEPackageImpl#getShadowNodeTypeENUM()
	 * @generated
	 */
	int SHADOW_NODE_TYPE_ENUM = 7;

	/**
	 * The meta object id for the '{@link dsm.PROVE.STATUS_ENUM <em>STATUS ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.PROVE.STATUS_ENUM
	 * @see dsm.PROVE.impl.PROVEPackageImpl#getSTATUS_ENUM()
	 * @generated
	 */
	int STATUS_ENUM = 8;

	/**
	 * Returns the meta object for class '{@link dsm.PROVE.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see dsm.PROVE.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.PROVE.Artifact#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see dsm.PROVE.Artifact#getState()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_State();

	/**
	 * Returns the meta object for the attribute '{@link dsm.PROVE.Artifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.PROVE.Artifact#getName()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Name();

	/**
	 * Returns the meta object for class '{@link dsm.PROVE.ArtifactState <em>Artifact State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact State</em>'.
	 * @see dsm.PROVE.ArtifactState
	 * @generated
	 */
	EClass getArtifactState();

	/**
	 * Returns the meta object for the attribute '{@link dsm.PROVE.ArtifactState#isAchievedStatus <em>Achieved Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Achieved Status</em>'.
	 * @see dsm.PROVE.ArtifactState#isAchievedStatus()
	 * @see #getArtifactState()
	 * @generated
	 */
	EAttribute getArtifactState_AchievedStatus();

	/**
	 * Returns the meta object for the attribute '{@link dsm.PROVE.ArtifactState#getArtifactName <em>Artifact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Name</em>'.
	 * @see dsm.PROVE.ArtifactState#getArtifactName()
	 * @see #getArtifactState()
	 * @generated
	 */
	EAttribute getArtifactState_ArtifactName();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.PROVE.ArtifactState#getArtifactstateinstance <em>Artifactstateinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifactstateinstance</em>'.
	 * @see dsm.PROVE.ArtifactState#getArtifactstateinstance()
	 * @see #getArtifactState()
	 * @generated
	 */
	EReference getArtifactState_Artifactstateinstance();

	/**
	 * Returns the meta object for the attribute '{@link dsm.PROVE.ArtifactState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.PROVE.ArtifactState#getName()
	 * @see #getArtifactState()
	 * @generated
	 */
	EAttribute getArtifactState_Name();

	/**
	 * Returns the meta object for class '{@link dsm.PROVE.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see dsm.PROVE.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.PROVE.Process#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact</em>'.
	 * @see dsm.PROVE.Process#getArtifact()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Artifact();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.PROVE.Process#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process</em>'.
	 * @see dsm.PROVE.Process#getProcess()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Process();

	/**
	 * Returns the meta object for the attribute '{@link dsm.PROVE.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.PROVE.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsm.PROVE.Process#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see dsm.PROVE.Process#getNotes()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Notes();

	/**
	 * Returns the meta object for the reference list '{@link dsm.PROVE.Process#getArtifactInStateUsed <em>Artifact In State Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Artifact In State Used</em>'.
	 * @see dsm.PROVE.Process#getArtifactInStateUsed()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ArtifactInStateUsed();

	/**
	 * Returns the meta object for the reference list '{@link dsm.PROVE.Process#getResultArtifactInState <em>Result Artifact In State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Result Artifact In State</em>'.
	 * @see dsm.PROVE.Process#getResultArtifactInState()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ResultArtifactInState();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.PROVE.Process#getShadownodeincoming <em>Shadownodeincoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shadownodeincoming</em>'.
	 * @see dsm.PROVE.Process#getShadownodeincoming()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Shadownodeincoming();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.PROVE.Process#getShadownodeoutgoing <em>Shadownodeoutgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shadownodeoutgoing</em>'.
	 * @see dsm.PROVE.Process#getShadownodeoutgoing()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Shadownodeoutgoing();

	/**
	 * Returns the meta object for the attribute '{@link dsm.PROVE.Process#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see dsm.PROVE.Process#getStartDate()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link dsm.PROVE.Process#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see dsm.PROVE.Process#getEndDate()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_EndDate();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.PROVE.Process#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see dsm.PROVE.Process#getResource()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Resource();

	/**
	 * Returns the meta object for the reference list '{@link dsm.PROVE.Process#getResourceUsed <em>Resource Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Used</em>'.
	 * @see dsm.PROVE.Process#getResourceUsed()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ResourceUsed();

	/**
	 * Returns the meta object for the attribute '{@link dsm.PROVE.Process#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see dsm.PROVE.Process#getStatus()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Status();

	/**
	 * Returns the meta object for class '{@link dsm.PROVE.ShadowNodeIncoming <em>Shadow Node Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shadow Node Incoming</em>'.
	 * @see dsm.PROVE.ShadowNodeIncoming
	 * @generated
	 */
	EClass getShadowNodeIncoming();

	/**
	 * Returns the meta object for class '{@link dsm.PROVE.ShadowNodeOutgoing <em>Shadow Node Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shadow Node Outgoing</em>'.
	 * @see dsm.PROVE.ShadowNodeOutgoing
	 * @generated
	 */
	EClass getShadowNodeOutgoing();

	/**
	 * Returns the meta object for class '{@link dsm.PROVE.ArtifactStateInstance <em>Artifact State Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact State Instance</em>'.
	 * @see dsm.PROVE.ArtifactStateInstance
	 * @generated
	 */
	EClass getArtifactStateInstance();

	/**
	 * Returns the meta object for the reference '{@link dsm.PROVE.ArtifactStateInstance#getUsedByActivity <em>Used By Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Used By Activity</em>'.
	 * @see dsm.PROVE.ArtifactStateInstance#getUsedByActivity()
	 * @see #getArtifactStateInstance()
	 * @generated
	 */
	EReference getArtifactStateInstance_UsedByActivity();

	/**
	 * Returns the meta object for the reference '{@link dsm.PROVE.ArtifactStateInstance#getOriginatingActivity <em>Originating Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Originating Activity</em>'.
	 * @see dsm.PROVE.ArtifactStateInstance#getOriginatingActivity()
	 * @see #getArtifactStateInstance()
	 * @generated
	 */
	EReference getArtifactStateInstance_OriginatingActivity();

	/**
	 * Returns the meta object for class '{@link dsm.PROVE.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see dsm.PROVE.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link dsm.PROVE.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.PROVE.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.PROVE.Resource#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see dsm.PROVE.Resource#getResource()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Resource();

	/**
	 * Returns the meta object for enum '{@link dsm.PROVE.ShadowNodeTypeENUM <em>Shadow Node Type ENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shadow Node Type ENUM</em>'.
	 * @see dsm.PROVE.ShadowNodeTypeENUM
	 * @generated
	 */
	EEnum getShadowNodeTypeENUM();

	/**
	 * Returns the meta object for enum '{@link dsm.PROVE.STATUS_ENUM <em>STATUS ENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>STATUS ENUM</em>'.
	 * @see dsm.PROVE.STATUS_ENUM
	 * @generated
	 */
	EEnum getSTATUS_ENUM();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PROVEFactory getPROVEFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dsm.PROVE.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.PROVE.impl.ArtifactImpl
		 * @see dsm.PROVE.impl.PROVEPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__STATE = eINSTANCE.getArtifact_State();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__NAME = eINSTANCE.getArtifact_Name();

		/**
		 * The meta object literal for the '{@link dsm.PROVE.impl.ArtifactStateImpl <em>Artifact State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.PROVE.impl.ArtifactStateImpl
		 * @see dsm.PROVE.impl.PROVEPackageImpl#getArtifactState()
		 * @generated
		 */
		EClass ARTIFACT_STATE = eINSTANCE.getArtifactState();

		/**
		 * The meta object literal for the '<em><b>Achieved Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_STATE__ACHIEVED_STATUS = eINSTANCE.getArtifactState_AchievedStatus();

		/**
		 * The meta object literal for the '<em><b>Artifact Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_STATE__ARTIFACT_NAME = eINSTANCE.getArtifactState_ArtifactName();

		/**
		 * The meta object literal for the '<em><b>Artifactstateinstance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_STATE__ARTIFACTSTATEINSTANCE = eINSTANCE.getArtifactState_Artifactstateinstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_STATE__NAME = eINSTANCE.getArtifactState_Name();

		/**
		 * The meta object literal for the '{@link dsm.PROVE.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.PROVE.impl.ProcessImpl
		 * @see dsm.PROVE.impl.PROVEPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ARTIFACT = eINSTANCE.getProcess_Artifact();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PROCESS = eINSTANCE.getProcess_Process();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NOTES = eINSTANCE.getProcess_Notes();

		/**
		 * The meta object literal for the '<em><b>Artifact In State Used</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ARTIFACT_IN_STATE_USED = eINSTANCE.getProcess_ArtifactInStateUsed();

		/**
		 * The meta object literal for the '<em><b>Result Artifact In State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__RESULT_ARTIFACT_IN_STATE = eINSTANCE.getProcess_ResultArtifactInState();

		/**
		 * The meta object literal for the '<em><b>Shadownodeincoming</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__SHADOWNODEINCOMING = eINSTANCE.getProcess_Shadownodeincoming();

		/**
		 * The meta object literal for the '<em><b>Shadownodeoutgoing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__SHADOWNODEOUTGOING = eINSTANCE.getProcess_Shadownodeoutgoing();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__START_DATE = eINSTANCE.getProcess_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__END_DATE = eINSTANCE.getProcess_EndDate();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__RESOURCE = eINSTANCE.getProcess_Resource();

		/**
		 * The meta object literal for the '<em><b>Resource Used</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__RESOURCE_USED = eINSTANCE.getProcess_ResourceUsed();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__STATUS = eINSTANCE.getProcess_Status();

		/**
		 * The meta object literal for the '{@link dsm.PROVE.impl.ShadowNodeIncomingImpl <em>Shadow Node Incoming</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.PROVE.impl.ShadowNodeIncomingImpl
		 * @see dsm.PROVE.impl.PROVEPackageImpl#getShadowNodeIncoming()
		 * @generated
		 */
		EClass SHADOW_NODE_INCOMING = eINSTANCE.getShadowNodeIncoming();

		/**
		 * The meta object literal for the '{@link dsm.PROVE.impl.ShadowNodeOutgoingImpl <em>Shadow Node Outgoing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.PROVE.impl.ShadowNodeOutgoingImpl
		 * @see dsm.PROVE.impl.PROVEPackageImpl#getShadowNodeOutgoing()
		 * @generated
		 */
		EClass SHADOW_NODE_OUTGOING = eINSTANCE.getShadowNodeOutgoing();

		/**
		 * The meta object literal for the '{@link dsm.PROVE.impl.ArtifactStateInstanceImpl <em>Artifact State Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.PROVE.impl.ArtifactStateInstanceImpl
		 * @see dsm.PROVE.impl.PROVEPackageImpl#getArtifactStateInstance()
		 * @generated
		 */
		EClass ARTIFACT_STATE_INSTANCE = eINSTANCE.getArtifactStateInstance();

		/**
		 * The meta object literal for the '<em><b>Used By Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_STATE_INSTANCE__USED_BY_ACTIVITY = eINSTANCE.getArtifactStateInstance_UsedByActivity();

		/**
		 * The meta object literal for the '<em><b>Originating Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_STATE_INSTANCE__ORIGINATING_ACTIVITY = eINSTANCE
				.getArtifactStateInstance_OriginatingActivity();

		/**
		 * The meta object literal for the '{@link dsm.PROVE.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.PROVE.impl.ResourceImpl
		 * @see dsm.PROVE.impl.PROVEPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__RESOURCE = eINSTANCE.getResource_Resource();

		/**
		 * The meta object literal for the '{@link dsm.PROVE.ShadowNodeTypeENUM <em>Shadow Node Type ENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.PROVE.ShadowNodeTypeENUM
		 * @see dsm.PROVE.impl.PROVEPackageImpl#getShadowNodeTypeENUM()
		 * @generated
		 */
		EEnum SHADOW_NODE_TYPE_ENUM = eINSTANCE.getShadowNodeTypeENUM();

		/**
		 * The meta object literal for the '{@link dsm.PROVE.STATUS_ENUM <em>STATUS ENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.PROVE.STATUS_ENUM
		 * @see dsm.PROVE.impl.PROVEPackageImpl#getSTATUS_ENUM()
		 * @generated
		 */
		EEnum STATUS_ENUM = eINSTANCE.getSTATUS_ENUM();

	}

} //PROVEPackage
