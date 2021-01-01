/**
 */
package dsm.PROVE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.PROVE.Process#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link dsm.PROVE.Process#getProcess <em>Process</em>}</li>
 *   <li>{@link dsm.PROVE.Process#getName <em>Name</em>}</li>
 *   <li>{@link dsm.PROVE.Process#getNotes <em>Notes</em>}</li>
 *   <li>{@link dsm.PROVE.Process#getArtifactInStateUsed <em>Artifact In State Used</em>}</li>
 *   <li>{@link dsm.PROVE.Process#getResultArtifactInState <em>Result Artifact In State</em>}</li>
 *   <li>{@link dsm.PROVE.Process#getShadownodeincoming <em>Shadownodeincoming</em>}</li>
 *   <li>{@link dsm.PROVE.Process#getShadownodeoutgoing <em>Shadownodeoutgoing</em>}</li>
 * </ul>
 *
 * @see dsm.PROVE.PROVEPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.PROVE.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' containment reference list.
	 * @see dsm.PROVE.PROVEPackage#getProcess_Artifact()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getArtifact();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.PROVE.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see dsm.PROVE.PROVEPackage#getProcess_Process()
	 * @model containment="true"
	 * @generated
	 */
	EList<Process> getProcess();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dsm.PROVE.PROVEPackage#getProcess_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dsm.PROVE.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see dsm.PROVE.PROVEPackage#getProcess_Notes()
	 * @model
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link dsm.PROVE.Process#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Artifact In State Used</b></em>' reference list.
	 * The list contents are of type {@link dsm.PROVE.ArtifactStateInstance}.
	 * It is bidirectional and its opposite is '{@link dsm.PROVE.ArtifactStateInstance#getUsedByActivity <em>Used By Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact In State Used</em>' reference list.
	 * @see dsm.PROVE.PROVEPackage#getProcess_ArtifactInStateUsed()
	 * @see dsm.PROVE.ArtifactStateInstance#getUsedByActivity
	 * @model opposite="usedByActivity"
	 * @generated
	 */
	EList<ArtifactStateInstance> getArtifactInStateUsed();

	/**
	 * Returns the value of the '<em><b>Result Artifact In State</b></em>' reference list.
	 * The list contents are of type {@link dsm.PROVE.ArtifactStateInstance}.
	 * It is bidirectional and its opposite is '{@link dsm.PROVE.ArtifactStateInstance#getOriginatingActivity <em>Originating Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Artifact In State</em>' reference list.
	 * @see dsm.PROVE.PROVEPackage#getProcess_ResultArtifactInState()
	 * @see dsm.PROVE.ArtifactStateInstance#getOriginatingActivity
	 * @model opposite="originatingActivity"
	 * @generated
	 */
	EList<ArtifactStateInstance> getResultArtifactInState();

	/**
	 * Returns the value of the '<em><b>Shadownodeincoming</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadownodeincoming</em>' containment reference.
	 * @see dsm.PROVE.PROVEPackage#getProcess_Shadownodeincoming()
	 * @model containment="true" required="true" changeable="false"
	 * @generated
	 */
	ShadowNodeIncoming getShadownodeincoming();

	/**
	 * Returns the value of the '<em><b>Shadownodeoutgoing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadownodeoutgoing</em>' containment reference.
	 * @see dsm.PROVE.PROVEPackage#getProcess_Shadownodeoutgoing()
	 * @model containment="true" required="true" changeable="false"
	 * @generated
	 */
	ShadowNodeOutgoing getShadownodeoutgoing();

} // Process
