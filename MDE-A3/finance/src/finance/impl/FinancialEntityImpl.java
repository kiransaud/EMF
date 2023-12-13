/**
 */
package finance.impl;

import finance.FinancePackage;
import finance.FinancialEntity;
import finance.FinancialEntityType;
import finance.RegulatoryEntity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Financial Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link finance.impl.FinancialEntityImpl#getFin_entityID <em>Fin entity ID</em>}</li>
 *   <li>{@link finance.impl.FinancialEntityImpl#getFin_entity_name <em>Fin entity name</em>}</li>
 *   <li>{@link finance.impl.FinancialEntityImpl#getFinancialentitytype <em>Financialentitytype</em>}</li>
 *   <li>{@link finance.impl.FinancialEntityImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link finance.impl.FinancialEntityImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link finance.impl.FinancialEntityImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link finance.impl.FinancialEntityImpl#getRegulatoryentity <em>Regulatoryentity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinancialEntityImpl extends MinimalEObjectImpl.Container implements FinancialEntity {
	/**
	 * The default value of the '{@link #getFin_entityID() <em>Fin entity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin_entityID()
	 * @generated
	 * @ordered
	 */
	protected static final int FIN_ENTITY_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFin_entityID() <em>Fin entity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin_entityID()
	 * @generated
	 * @ordered
	 */
	protected int fin_entityID = FIN_ENTITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFin_entity_name() <em>Fin entity name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin_entity_name()
	 * @generated
	 * @ordered
	 */
	protected static final String FIN_ENTITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFin_entity_name() <em>Fin entity name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin_entity_name()
	 * @generated
	 * @ordered
	 */
	protected String fin_entity_name = FIN_ENTITY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinancialentitytype() <em>Financialentitytype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinancialentitytype()
	 * @generated
	 * @ordered
	 */
	protected static final FinancialEntityType FINANCIALENTITYTYPE_EDEFAULT = FinancialEntityType.BANK;

	/**
	 * The cached value of the '{@link #getFinancialentitytype() <em>Financialentitytype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinancialentitytype()
	 * @generated
	 * @ordered
	 */
	protected FinancialEntityType financialentitytype = FINANCIALENTITYTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getContact() <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTACT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected int contact = CONTACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegulatoryentity() <em>Regulatoryentity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatoryentity()
	 * @generated
	 * @ordered
	 */
	protected RegulatoryEntity regulatoryentity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinancialEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancePackage.Literals.FINANCIAL_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFin_entityID() {
		return fin_entityID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFin_entityID(int newFin_entityID) {
		int oldFin_entityID = fin_entityID;
		fin_entityID = newFin_entityID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.FINANCIAL_ENTITY__FIN_ENTITY_ID, oldFin_entityID, fin_entityID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFin_entity_name() {
		return fin_entity_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFin_entity_name(String newFin_entity_name) {
		String oldFin_entity_name = fin_entity_name;
		fin_entity_name = newFin_entity_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.FINANCIAL_ENTITY__FIN_ENTITY_NAME, oldFin_entity_name, fin_entity_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinancialEntityType getFinancialentitytype() {
		return financialentitytype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinancialentitytype(FinancialEntityType newFinancialentitytype) {
		FinancialEntityType oldFinancialentitytype = financialentitytype;
		financialentitytype = newFinancialentitytype == null ? FINANCIALENTITYTYPE_EDEFAULT : newFinancialentitytype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.FINANCIAL_ENTITY__FINANCIALENTITYTYPE, oldFinancialentitytype, financialentitytype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.FINANCIAL_ENTITY__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getContact() {
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContact(int newContact) {
		int oldContact = contact;
		contact = newContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.FINANCIAL_ENTITY__CONTACT, oldContact, contact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.FINANCIAL_ENTITY__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegulatoryEntity getRegulatoryentity() {
		if (regulatoryentity != null && regulatoryentity.eIsProxy()) {
			InternalEObject oldRegulatoryentity = (InternalEObject)regulatoryentity;
			regulatoryentity = (RegulatoryEntity)eResolveProxy(oldRegulatoryentity);
			if (regulatoryentity != oldRegulatoryentity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinancePackage.FINANCIAL_ENTITY__REGULATORYENTITY, oldRegulatoryentity, regulatoryentity));
			}
		}
		return regulatoryentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatoryEntity basicGetRegulatoryentity() {
		return regulatoryentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegulatoryentity(RegulatoryEntity newRegulatoryentity) {
		RegulatoryEntity oldRegulatoryentity = regulatoryentity;
		regulatoryentity = newRegulatoryentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.FINANCIAL_ENTITY__REGULATORYENTITY, oldRegulatoryentity, regulatoryentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinancePackage.FINANCIAL_ENTITY__FIN_ENTITY_ID:
				return getFin_entityID();
			case FinancePackage.FINANCIAL_ENTITY__FIN_ENTITY_NAME:
				return getFin_entity_name();
			case FinancePackage.FINANCIAL_ENTITY__FINANCIALENTITYTYPE:
				return getFinancialentitytype();
			case FinancePackage.FINANCIAL_ENTITY__ADDRESS:
				return getAddress();
			case FinancePackage.FINANCIAL_ENTITY__CONTACT:
				return getContact();
			case FinancePackage.FINANCIAL_ENTITY__EMAIL:
				return getEmail();
			case FinancePackage.FINANCIAL_ENTITY__REGULATORYENTITY:
				if (resolve) return getRegulatoryentity();
				return basicGetRegulatoryentity();
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
			case FinancePackage.FINANCIAL_ENTITY__FIN_ENTITY_ID:
				setFin_entityID((Integer)newValue);
				return;
			case FinancePackage.FINANCIAL_ENTITY__FIN_ENTITY_NAME:
				setFin_entity_name((String)newValue);
				return;
			case FinancePackage.FINANCIAL_ENTITY__FINANCIALENTITYTYPE:
				setFinancialentitytype((FinancialEntityType)newValue);
				return;
			case FinancePackage.FINANCIAL_ENTITY__ADDRESS:
				setAddress((String)newValue);
				return;
			case FinancePackage.FINANCIAL_ENTITY__CONTACT:
				setContact((Integer)newValue);
				return;
			case FinancePackage.FINANCIAL_ENTITY__EMAIL:
				setEmail((String)newValue);
				return;
			case FinancePackage.FINANCIAL_ENTITY__REGULATORYENTITY:
				setRegulatoryentity((RegulatoryEntity)newValue);
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
			case FinancePackage.FINANCIAL_ENTITY__FIN_ENTITY_ID:
				setFin_entityID(FIN_ENTITY_ID_EDEFAULT);
				return;
			case FinancePackage.FINANCIAL_ENTITY__FIN_ENTITY_NAME:
				setFin_entity_name(FIN_ENTITY_NAME_EDEFAULT);
				return;
			case FinancePackage.FINANCIAL_ENTITY__FINANCIALENTITYTYPE:
				setFinancialentitytype(FINANCIALENTITYTYPE_EDEFAULT);
				return;
			case FinancePackage.FINANCIAL_ENTITY__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case FinancePackage.FINANCIAL_ENTITY__CONTACT:
				setContact(CONTACT_EDEFAULT);
				return;
			case FinancePackage.FINANCIAL_ENTITY__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case FinancePackage.FINANCIAL_ENTITY__REGULATORYENTITY:
				setRegulatoryentity((RegulatoryEntity)null);
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
			case FinancePackage.FINANCIAL_ENTITY__FIN_ENTITY_ID:
				return fin_entityID != FIN_ENTITY_ID_EDEFAULT;
			case FinancePackage.FINANCIAL_ENTITY__FIN_ENTITY_NAME:
				return FIN_ENTITY_NAME_EDEFAULT == null ? fin_entity_name != null : !FIN_ENTITY_NAME_EDEFAULT.equals(fin_entity_name);
			case FinancePackage.FINANCIAL_ENTITY__FINANCIALENTITYTYPE:
				return financialentitytype != FINANCIALENTITYTYPE_EDEFAULT;
			case FinancePackage.FINANCIAL_ENTITY__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case FinancePackage.FINANCIAL_ENTITY__CONTACT:
				return contact != CONTACT_EDEFAULT;
			case FinancePackage.FINANCIAL_ENTITY__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case FinancePackage.FINANCIAL_ENTITY__REGULATORYENTITY:
				return regulatoryentity != null;
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
		result.append(" (fin_entityID: ");
		result.append(fin_entityID);
		result.append(", fin_entity_name: ");
		result.append(fin_entity_name);
		result.append(", financialentitytype: ");
		result.append(financialentitytype);
		result.append(", address: ");
		result.append(address);
		result.append(", contact: ");
		result.append(contact);
		result.append(", email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}

} //FinancialEntityImpl
