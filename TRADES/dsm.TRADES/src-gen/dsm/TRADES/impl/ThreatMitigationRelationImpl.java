/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.AssessmentENUM;
import dsm.TRADES.Control;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.ThreatMitigationRelation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threat Mitigation Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ThreatMitigationRelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatMitigationRelationImpl#getAssessment <em>Assessment</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatMitigationRelationImpl#getControl <em>Control</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatMitigationRelationImpl#getThreat <em>Threat</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatMitigationRelationImpl#getMitigates <em>Mitigates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatMitigationRelationImpl extends MinimalEObjectImpl.Container implements ThreatMitigationRelation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssessment() <em>Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessment()
	 * @generated
	 * @ordered
	 */
	protected static final AssessmentENUM ASSESSMENT_EDEFAULT = AssessmentENUM.UNDECIDED;

	/**
	 * The cached value of the '{@link #getAssessment() <em>Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessment()
	 * @generated
	 * @ordered
	 */
	protected AssessmentENUM assessment = ASSESSMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected Control control;

	/**
	 * The cached value of the '{@link #getThreat() <em>Threat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreat()
	 * @generated
	 * @ordered
	 */
	protected Threat threat;

	/**
	 * The cached value of the '{@link #getMitigates() <em>Mitigates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigates()
	 * @generated
	 * @ordered
	 */
	protected ThreatAllocationRelation mitigates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatMitigationRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.THREAT_MITIGATION_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT_MITIGATION_RELATION__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentENUM getAssessment() {
		return assessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssessment(AssessmentENUM newAssessment) {
		AssessmentENUM oldAssessment = assessment;
		assessment = newAssessment == null ? ASSESSMENT_EDEFAULT : newAssessment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT_MITIGATION_RELATION__ASSESSMENT,
					oldAssessment, assessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Control getControl() {
		if (control != null && control.eIsProxy()) {
			InternalEObject oldControl = (InternalEObject) control;
			control = (Control) eResolveProxy(oldControl);
			if (control != oldControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TRADESPackage.THREAT_MITIGATION_RELATION__CONTROL, oldControl, control));
			}
		}
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control basicGetControl() {
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControl(Control newControl) {
		Control oldControl = control;
		control = newControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT_MITIGATION_RELATION__CONTROL,
					oldControl, control));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Threat getThreat() {
		if (threat != null && threat.eIsProxy()) {
			InternalEObject oldThreat = (InternalEObject) threat;
			threat = (Threat) eResolveProxy(oldThreat);
			if (threat != oldThreat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TRADESPackage.THREAT_MITIGATION_RELATION__THREAT, oldThreat, threat));
			}
		}
		return threat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Threat basicGetThreat() {
		return threat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreat(Threat newThreat) {
		Threat oldThreat = threat;
		threat = newThreat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT_MITIGATION_RELATION__THREAT,
					oldThreat, threat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatAllocationRelation getMitigates() {
		if (mitigates != null && mitigates.eIsProxy()) {
			InternalEObject oldMitigates = (InternalEObject) mitigates;
			mitigates = (ThreatAllocationRelation) eResolveProxy(oldMitigates);
			if (mitigates != oldMitigates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TRADESPackage.THREAT_MITIGATION_RELATION__MITIGATES, oldMitigates, mitigates));
			}
		}
		return mitigates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatAllocationRelation basicGetMitigates() {
		return mitigates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMitigates(ThreatAllocationRelation newMitigates) {
		ThreatAllocationRelation oldMitigates = mitigates;
		mitigates = newMitigates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT_MITIGATION_RELATION__MITIGATES,
					oldMitigates, mitigates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TRADESPackage.THREAT_MITIGATION_RELATION__NAME:
			return getName();
		case TRADESPackage.THREAT_MITIGATION_RELATION__ASSESSMENT:
			return getAssessment();
		case TRADESPackage.THREAT_MITIGATION_RELATION__CONTROL:
			if (resolve)
				return getControl();
			return basicGetControl();
		case TRADESPackage.THREAT_MITIGATION_RELATION__THREAT:
			if (resolve)
				return getThreat();
			return basicGetThreat();
		case TRADESPackage.THREAT_MITIGATION_RELATION__MITIGATES:
			if (resolve)
				return getMitigates();
			return basicGetMitigates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TRADESPackage.THREAT_MITIGATION_RELATION__NAME:
			setName((String) newValue);
			return;
		case TRADESPackage.THREAT_MITIGATION_RELATION__ASSESSMENT:
			setAssessment((AssessmentENUM) newValue);
			return;
		case TRADESPackage.THREAT_MITIGATION_RELATION__CONTROL:
			setControl((Control) newValue);
			return;
		case TRADESPackage.THREAT_MITIGATION_RELATION__THREAT:
			setThreat((Threat) newValue);
			return;
		case TRADESPackage.THREAT_MITIGATION_RELATION__MITIGATES:
			setMitigates((ThreatAllocationRelation) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TRADESPackage.THREAT_MITIGATION_RELATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TRADESPackage.THREAT_MITIGATION_RELATION__ASSESSMENT:
			setAssessment(ASSESSMENT_EDEFAULT);
			return;
		case TRADESPackage.THREAT_MITIGATION_RELATION__CONTROL:
			setControl((Control) null);
			return;
		case TRADESPackage.THREAT_MITIGATION_RELATION__THREAT:
			setThreat((Threat) null);
			return;
		case TRADESPackage.THREAT_MITIGATION_RELATION__MITIGATES:
			setMitigates((ThreatAllocationRelation) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TRADESPackage.THREAT_MITIGATION_RELATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TRADESPackage.THREAT_MITIGATION_RELATION__ASSESSMENT:
			return assessment != ASSESSMENT_EDEFAULT;
		case TRADESPackage.THREAT_MITIGATION_RELATION__CONTROL:
			return control != null;
		case TRADESPackage.THREAT_MITIGATION_RELATION__THREAT:
			return threat != null;
		case TRADESPackage.THREAT_MITIGATION_RELATION__MITIGATES:
			return mitigates != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", assessment: ");
		result.append(assessment);
		result.append(')');
		return result.toString();
	}

} //ThreatMitigationRelationImpl