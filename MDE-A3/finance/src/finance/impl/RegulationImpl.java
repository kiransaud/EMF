/**
 */
package finance.impl;

import finance.FinancePackage;
import finance.Regulation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link finance.impl.RegulationImpl#getRegulation_ID <em>Regulation ID</em>}</li>
 *   <li>{@link finance.impl.RegulationImpl#getRegulationName <em>Regulation Name</em>}</li>
 *   <li>{@link finance.impl.RegulationImpl#getRegulationDescription <em>Regulation Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegulationImpl extends RegulatoryEntityImpl implements Regulation {
	/**
	 * The default value of the '{@link #getRegulation_ID() <em>Regulation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulation_ID()
	 * @generated
	 * @ordered
	 */
	protected static final int REGULATION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegulation_ID() <em>Regulation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulation_ID()
	 * @generated
	 * @ordered
	 */
	protected int regulation_ID = REGULATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegulationName() <em>Regulation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulationName()
	 * @generated
	 * @ordered
	 */
	protected static final String REGULATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegulationName() <em>Regulation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulationName()
	 * @generated
	 * @ordered
	 */
	protected String regulationName = REGULATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegulationDescription() <em>Regulation Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulationDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String REGULATION_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegulationDescription() <em>Regulation Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulationDescription()
	 * @generated
	 * @ordered
	 */
	protected String regulationDescription = REGULATION_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancePackage.Literals.REGULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRegulation_ID() {
		return regulation_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegulation_ID(int newRegulation_ID) {
		int oldRegulation_ID = regulation_ID;
		regulation_ID = newRegulation_ID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.REGULATION__REGULATION_ID, oldRegulation_ID, regulation_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegulationName() {
		return regulationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegulationName(String newRegulationName) {
		String oldRegulationName = regulationName;
		regulationName = newRegulationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.REGULATION__REGULATION_NAME, oldRegulationName, regulationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegulationDescription() {
		return regulationDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegulationDescription(String newRegulationDescription) {
		String oldRegulationDescription = regulationDescription;
		regulationDescription = newRegulationDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.REGULATION__REGULATION_DESCRIPTION, oldRegulationDescription, regulationDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinancePackage.REGULATION__REGULATION_ID:
				return getRegulation_ID();
			case FinancePackage.REGULATION__REGULATION_NAME:
				return getRegulationName();
			case FinancePackage.REGULATION__REGULATION_DESCRIPTION:
				return getRegulationDescription();
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
			case FinancePackage.REGULATION__REGULATION_ID:
				setRegulation_ID((Integer)newValue);
				return;
			case FinancePackage.REGULATION__REGULATION_NAME:
				setRegulationName((String)newValue);
				return;
			case FinancePackage.REGULATION__REGULATION_DESCRIPTION:
				setRegulationDescription((String)newValue);
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
			case FinancePackage.REGULATION__REGULATION_ID:
				setRegulation_ID(REGULATION_ID_EDEFAULT);
				return;
			case FinancePackage.REGULATION__REGULATION_NAME:
				setRegulationName(REGULATION_NAME_EDEFAULT);
				return;
			case FinancePackage.REGULATION__REGULATION_DESCRIPTION:
				setRegulationDescription(REGULATION_DESCRIPTION_EDEFAULT);
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
			case FinancePackage.REGULATION__REGULATION_ID:
				return regulation_ID != REGULATION_ID_EDEFAULT;
			case FinancePackage.REGULATION__REGULATION_NAME:
				return REGULATION_NAME_EDEFAULT == null ? regulationName != null : !REGULATION_NAME_EDEFAULT.equals(regulationName);
			case FinancePackage.REGULATION__REGULATION_DESCRIPTION:
				return REGULATION_DESCRIPTION_EDEFAULT == null ? regulationDescription != null : !REGULATION_DESCRIPTION_EDEFAULT.equals(regulationDescription);
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (regulation_ID: ");
		result.append(regulation_ID);
		result.append(", RegulationName: ");
		result.append(regulationName);
		result.append(", RegulationDescription: ");
		result.append(regulationDescription);
		result.append(')');
		return result.toString();
	}

} //RegulationImpl
