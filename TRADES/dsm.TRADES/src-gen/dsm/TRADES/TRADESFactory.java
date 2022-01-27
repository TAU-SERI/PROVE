/**
 */
package dsm.TRADES;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dsm.TRADES.TRADESPackage
 * @generated
 */
public interface TRADESFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TRADESFactory eINSTANCE = dsm.TRADES.impl.TRADESFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis</em>'.
	 * @generated
	 */
	Analysis createAnalysis();

	/**
	 * Returns a new object of class '<em>Threat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threat</em>'.
	 * @generated
	 */
	Threat createThreat();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control</em>'.
	 * @generated
	 */
	Control createControl();

	/**
	 * Returns a new object of class '<em>Threat Allocation Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threat Allocation Relation</em>'.
	 * @generated
	 */
	ThreatAllocationRelation createThreatAllocationRelation();

	/**
	 * Returns a new object of class '<em>Threat Mitigation Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threat Mitigation Relation</em>'.
	 * @generated
	 */
	ThreatMitigationRelation createThreatMitigationRelation();

	/**
	 * Returns a new object of class '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data</em>'.
	 * @generated
	 */
	Data createData();

	/**
	 * Returns a new object of class '<em>Affect Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Affect Relation</em>'.
	 * @generated
	 */
	AffectRelation createAffectRelation();

	/**
	 * Returns a new object of class '<em>Analysis Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Diagram</em>'.
	 * @generated
	 */
	AnalysisDiagram createAnalysisDiagram();

	/**
	 * Returns a new object of class '<em>Attack Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attack Chain</em>'.
	 * @generated
	 */
	AttackChain createAttackChain();

	/**
	 * Returns a new object of class '<em>Attack Chain Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attack Chain Step</em>'.
	 * @generated
	 */
	AttackChainStep createAttackChainStep();

	/**
	 * Returns a new object of class '<em>Score System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Score System</em>'.
	 * @generated
	 */
	ScoreSystem createScoreSystem();

	/**
	 * Returns a new object of class '<em>Impact Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Impact Score</em>'.
	 * @generated
	 */
	ImpactScore createImpactScore();

	/**
	 * Returns a new object of class '<em>Difficulty Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Difficulty Score</em>'.
	 * @generated
	 */
	DifficultyScore createDifficultyScore();

	/**
	 * Returns a new object of class '<em>Attack Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attack Info</em>'.
	 * @generated
	 */
	AttackInfo createAttackInfo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TRADESPackage getTRADESPackage();

} //TRADESFactory