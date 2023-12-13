/**
 */
package finance.impl;

import finance.FinancePackage;
import finance.RegulatoryEntity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regulatory Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link finance.impl.RegulatoryEntityImpl#getRegulatoryID <em>Regulatory ID</em>}</li>
 *   <li>{@link finance.impl.RegulatoryEntityImpl#getRegulatoryname <em>Regulatoryname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegulatoryEntityImpl extends MinimalEObjectImpl.Container implements RegulatoryEntity {
	/**
	 * The default value of the '{@link #getRegulatoryID() <em>Regulatory ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatoryID()
	 * @generated
	 * @ordered
	 */
	protected static final int REGULATORY_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegulatoryID() <em>Regulatory ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatoryID()
	 * @generated
	 * @ordered
	 */
	protected int regulatoryID = REGULATORY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegulatoryname() <em>Regulatoryname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatoryname()
	 * @generated
	 * @ordered
	 */
	protected static final String REGULATORYNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegulatoryname() <em>Regulatoryname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatoryname()
	 * @generated
	 * @ordered
	 */
	protected String regulatoryname = REGULATORYNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegulatoryEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancePackage.Literals.REGULATORY_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRegulatoryID() {
		return regulatoryID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegulatoryID(int newRegulatoryID) {
		int oldRegulatoryID = regulatoryID;
		regulatoryID = newRegulatoryID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.REGULATORY_ENTITY__REGULATORY_ID, oldRegulatoryID, regulatoryID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegulatoryname() {
		return regulatoryname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegulatoryname(String newRegulatoryname) {
		String oldRegulatoryname = regulatoryname;
		regulatoryname = newRegulatoryname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.REGULATORY_ENTITY__REGULATORYNAME, oldRegulatoryname, regulatoryname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinancePackage.REGULATORY_ENTITY__REGULATORY_ID:
				return getRegulatoryID();
			case FinancePackage.REGULATORY_ENTITY__REGULATORYNAME:
				return getRegulatoryname();
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
			case FinancePackage.REGULATORY_ENTITY__REGULATORY_ID:
				setRegulatoryID((Integer)newValue);
				return;
			case FinancePackage.REGULATORY_ENTITY__REGULATORYNAME:
				setRegulatoryname((String)newValue);
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
			case FinancePackage.REGULATORY_ENTITY__REGULATORY_ID:
				setRegulatoryID(REGULATORY_ID_EDEFAULT);
				return;
			case FinancePackage.REGULATORY_ENTITY__REGULATORYNAME:
				setRegulatoryname(REGULATORYNAME_EDEFAULT);
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
			case FinancePackage.REGULATORY_ENTITY__REGULATORY_ID:
				return regulatoryID != REGULATORY_ID_EDEFAULT;
			case FinancePackage.REGULATORY_ENTITY__REGULATORYNAME:
				return REGULATORYNAME_EDEFAULT == null ? regulatoryname != null : !REGULATORYNAME_EDEFAULT.equals(regulatoryname);
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
		result.append(" (regulatoryID: ");
		result.append(regulatoryID);
		result.append(", regulatoryname: ");
		result.append(regulatoryname);
		result.append(')');
		return result.toString();
	}

} //RegulatoryEntityImpl
