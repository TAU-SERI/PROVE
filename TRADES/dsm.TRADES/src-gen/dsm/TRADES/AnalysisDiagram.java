/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.AnalysisDiagram#getName <em>Name</em>}</li>
 *   <li>{@link dsm.TRADES.AnalysisDiagram#getThreat <em>Threat</em>}</li>
 *   <li>{@link dsm.TRADES.AnalysisDiagram#getComponent <em>Component</em>}</li>
 *   <li>{@link dsm.TRADES.AnalysisDiagram#getControl <em>Control</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getAnalysisDiagram()
 * @model
 * @generated
 */
public interface AnalysisDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dsm.TRADES.TRADESPackage#getAnalysisDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AnalysisDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Threat</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Threat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getAnalysisDiagram_Threat()
	 * @model
	 * @generated
	 */
	EList<Threat> getThreat();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getAnalysisDiagram_Component()
	 * @model
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Control</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Control}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getAnalysisDiagram_Control()
	 * @model
	 * @generated
	 */
	EList<Control> getControl();

} // AnalysisDiagram