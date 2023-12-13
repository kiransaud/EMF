/**
 */
package finance.impl;

import finance.FinancePackage;
import finance.FinancialEntity;
import finance.FinancialEntityType;
import finance.FinancialProduct;
import finance.RegulatoryEntity;
import finance.SpecificAttribute;
import finance.Transction;
import finance.TransctionMode;
import finance.TransctionType;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link finance.impl.SpecificAttributeImpl#getFin_entityID <em>Fin entity ID</em>}</li>
 *   <li>{@link finance.impl.SpecificAttributeImpl#getFin_entity_name <em>Fin entity name</em>}</li>
 *   <li>{@link finance.impl.SpecificAttributeImpl#getFinancialentitytype <em>Financialentitytype</em>}</li>
 *   <li>{@link finance.impl.SpecificAttributeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link finance.impl.SpecificAttributeImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link finance.impl.SpecificAttributeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link finance.impl.SpecificAttributeImpl#getRegulatoryentity <em>Regulatoryentity</em>}</li>
 *   <li>{@link finance.impl.SpecificAttributeImpl#getProduct_id <em>Product id</em>}</li>
 *   <li>{@link finance.impl.SpecificAttributeImpl#getProduct_name <em>Product name</em>}</li>
 *   <li>{@link finance.impl.SpecificAttributeImpl#getServicesofferedBy <em>Servicesoffered By</em>}</li>
 *   <li>{@link finance.impl.SpecificAttributeImpl#getTransctionID <em>Transction ID</em>}</li>
 *   <li>{@link finance.impl.SpecificAttributeImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link finance.impl.SpecificAttributeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link finance.impl.SpecificAttributeImpl#getTransctiontype <em>Transctiontype</em>}</li>
 *   <li>{@link finance.impl.SpecificAttributeImpl#getTransctionmode <em>Transctionmode</em>}</li>
 *   <li>{@link finance.impl.SpecificAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link finance.impl.SpecificAttributeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificAttributeImpl extends AccountImpl implements SpecificAttribute {
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
	 * The default value of the '{@link #getProduct_id() <em>Product id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct_id()
	 * @generated
	 * @ordered
	 */
	protected static final int PRODUCT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProduct_id() <em>Product id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct_id()
	 * @generated
	 * @ordered
	 */
	protected int product_id = PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProduct_name() <em>Product name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct_name()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProduct_name() <em>Product name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct_name()
	 * @generated
	 * @ordered
	 */
	protected String product_name = PRODUCT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServicesofferedBy() <em>Servicesoffered By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicesofferedBy()
	 * @generated
	 * @ordered
	 */
	protected FinancialEntity servicesofferedBy;

	/**
	 * The default value of the '{@link #getTransctionID() <em>Transction ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransctionID()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSCTION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTransctionID() <em>Transction ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransctionID()
	 * @generated
	 * @ordered
	 */
	protected int transctionID = TRANSCTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransctiontype() <em>Transctiontype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransctiontype()
	 * @generated
	 * @ordered
	 */
	protected TransctionType transctiontype;

	/**
	 * The cached value of the '{@link #getTransctionmode() <em>Transctionmode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransctionmode()
	 * @generated
	 * @ordered
	 */
	protected TransctionMode transctionmode;

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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancePackage.Literals.SPECIFIC_ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.SPECIFIC_ATTRIBUTE__FIN_ENTITY_ID, oldFin_entityID, fin_entityID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.SPECIFIC_ATTRIBUTE__FIN_ENTITY_NAME, oldFin_entity_name, fin_entity_name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.SPECIFIC_ATTRIBUTE__FINANCIALENTITYTYPE, oldFinancialentitytype, financialentitytype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.SPECIFIC_ATTRIBUTE__ADDRESS, oldAddress, address));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.SPECIFIC_ATTRIBUTE__CONTACT, oldContact, contact));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.SPECIFIC_ATTRIBUTE__EMAIL, oldEmail, email));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinancePackage.SPECIFIC_ATTRIBUTE__REGULATORYENTITY, oldRegulatoryentity, regulatoryentity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.SPECIFIC_ATTRIBUTE__REGULATORYENTITY, oldRegulatoryentity, regulatoryentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getProduct_id() {
		return product_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct_id(int newProduct_id) {
		int oldProduct_id = product_id;
		product_id = newProduct_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.SPECIFIC_ATTRIBUTE__PRODUCT_ID, oldProduct_id, product_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProduct_name() {
		return product_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct_name(String newProduct_name) {
		String oldProduct_name = product_name;
		product_name = newProduct_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.SPECIFIC_ATTRIBUTE__PRODUCT_NAME, oldProduct_name, product_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinancialEntity getServicesofferedBy() {
		if (servicesofferedBy != null && servicesofferedBy.eIsProxy()) {
			InternalEObject oldServicesofferedBy = (InternalEObject)servicesofferedBy;
			servicesofferedBy = (FinancialEntity)eResolveProxy(oldServicesofferedBy);
			if (servicesofferedBy != oldServicesofferedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinancePackage.SPECIFIC_ATTRIBUTE__SERVICESOFFERED_BY, oldServicesofferedBy, servicesofferedBy));
			}
		}
		return servicesofferedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialEntity basicGetServicesofferedBy() {
		return servicesofferedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServicesofferedBy(FinancialEntity newServicesofferedBy) {
		FinancialEntity oldServicesofferedBy = servicesofferedBy;
		servicesofferedBy = newServicesofferedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.SPECIFIC_ATTRIBUTE__SERVICESOFFERED_BY, oldServicesofferedBy, servicesofferedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTransctionID() {
		return transctionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransctionID(int newTransctionID) {
		int oldTransctionID = transctionID;
		transctionID = newTransctionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTION_ID, oldTransctionID, transctionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(float newAmount) {
		float oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.SPECIFIC_ATTRIBUTE__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.SPECIFIC_ATTRIBUTE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransctionType getTransctiontype() {
		if (transctiontype != null && transctiontype.eIsProxy()) {
			InternalEObject oldTransctiontype = (InternalEObject)transctiontype;
			transctiontype = (TransctionType)eResolveProxy(oldTransctiontype);
			if (transctiontype != oldTransctiontype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTIONTYPE, oldTransctiontype, transctiontype));
			}
		}
		return transctiontype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransctionType basicGetTransctiontype() {
		return transctiontype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransctiontype(TransctionType newTransctiontype) {
		TransctionType oldTransctiontype = transctiontype;
		transctiontype = newTransctiontype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTIONTYPE, oldTransctiontype, transctiontype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransctionMode getTransctionmode() {
		if (transctionmode != null && transctionmode.eIsProxy()) {
			InternalEObject oldTransctionmode = (InternalEObject)transctionmode;
			transctionmode = (TransctionMode)eResolveProxy(oldTransctionmode);
			if (transctionmode != oldTransctionmode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTIONMODE, oldTransctionmode, transctionmode));
			}
		}
		return transctionmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransctionMode basicGetTransctionmode() {
		return transctionmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransctionmode(TransctionMode newTransctionmode) {
		TransctionMode oldTransctionmode = transctionmode;
		transctionmode = newTransctionmode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTIONMODE, oldTransctionmode, transctionmode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.SPECIFIC_ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.SPECIFIC_ATTRIBUTE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinancePackage.SPECIFIC_ATTRIBUTE__FIN_ENTITY_ID:
				return getFin_entityID();
			case FinancePackage.SPECIFIC_ATTRIBUTE__FIN_ENTITY_NAME:
				return getFin_entity_name();
			case FinancePackage.SPECIFIC_ATTRIBUTE__FINANCIALENTITYTYPE:
				return getFinancialentitytype();
			case FinancePackage.SPECIFIC_ATTRIBUTE__ADDRESS:
				return getAddress();
			case FinancePackage.SPECIFIC_ATTRIBUTE__CONTACT:
				return getContact();
			case FinancePackage.SPECIFIC_ATTRIBUTE__EMAIL:
				return getEmail();
			case FinancePackage.SPECIFIC_ATTRIBUTE__REGULATORYENTITY:
				if (resolve) return getRegulatoryentity();
				return basicGetRegulatoryentity();
			case FinancePackage.SPECIFIC_ATTRIBUTE__PRODUCT_ID:
				return getProduct_id();
			case FinancePackage.SPECIFIC_ATTRIBUTE__PRODUCT_NAME:
				return getProduct_name();
			case FinancePackage.SPECIFIC_ATTRIBUTE__SERVICESOFFERED_BY:
				if (resolve) return getServicesofferedBy();
				return basicGetServicesofferedBy();
			case FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTION_ID:
				return getTransctionID();
			case FinancePackage.SPECIFIC_ATTRIBUTE__AMOUNT:
				return getAmount();
			case FinancePackage.SPECIFIC_ATTRIBUTE__DATE:
				return getDate();
			case FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTIONTYPE:
				if (resolve) return getTransctiontype();
				return basicGetTransctiontype();
			case FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTIONMODE:
				if (resolve) return getTransctionmode();
				return basicGetTransctionmode();
			case FinancePackage.SPECIFIC_ATTRIBUTE__NAME:
				return getName();
			case FinancePackage.SPECIFIC_ATTRIBUTE__VALUE:
				return getValue();
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
			case FinancePackage.SPECIFIC_ATTRIBUTE__FIN_ENTITY_ID:
				setFin_entityID((Integer)newValue);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__FIN_ENTITY_NAME:
				setFin_entity_name((String)newValue);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__FINANCIALENTITYTYPE:
				setFinancialentitytype((FinancialEntityType)newValue);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__ADDRESS:
				setAddress((String)newValue);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__CONTACT:
				setContact((Integer)newValue);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__EMAIL:
				setEmail((String)newValue);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__REGULATORYENTITY:
				setRegulatoryentity((RegulatoryEntity)newValue);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__PRODUCT_ID:
				setProduct_id((Integer)newValue);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__PRODUCT_NAME:
				setProduct_name((String)newValue);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__SERVICESOFFERED_BY:
				setServicesofferedBy((FinancialEntity)newValue);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTION_ID:
				setTransctionID((Integer)newValue);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__AMOUNT:
				setAmount((Float)newValue);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__DATE:
				setDate((Date)newValue);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTIONTYPE:
				setTransctiontype((TransctionType)newValue);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTIONMODE:
				setTransctionmode((TransctionMode)newValue);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__VALUE:
				setValue((String)newValue);
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
			case FinancePackage.SPECIFIC_ATTRIBUTE__FIN_ENTITY_ID:
				setFin_entityID(FIN_ENTITY_ID_EDEFAULT);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__FIN_ENTITY_NAME:
				setFin_entity_name(FIN_ENTITY_NAME_EDEFAULT);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__FINANCIALENTITYTYPE:
				setFinancialentitytype(FINANCIALENTITYTYPE_EDEFAULT);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__CONTACT:
				setContact(CONTACT_EDEFAULT);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__REGULATORYENTITY:
				setRegulatoryentity((RegulatoryEntity)null);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__PRODUCT_ID:
				setProduct_id(PRODUCT_ID_EDEFAULT);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__PRODUCT_NAME:
				setProduct_name(PRODUCT_NAME_EDEFAULT);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__SERVICESOFFERED_BY:
				setServicesofferedBy((FinancialEntity)null);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTION_ID:
				setTransctionID(TRANSCTION_ID_EDEFAULT);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTIONTYPE:
				setTransctiontype((TransctionType)null);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTIONMODE:
				setTransctionmode((TransctionMode)null);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FinancePackage.SPECIFIC_ATTRIBUTE__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case FinancePackage.SPECIFIC_ATTRIBUTE__FIN_ENTITY_ID:
				return fin_entityID != FIN_ENTITY_ID_EDEFAULT;
			case FinancePackage.SPECIFIC_ATTRIBUTE__FIN_ENTITY_NAME:
				return FIN_ENTITY_NAME_EDEFAULT == null ? fin_entity_name != null : !FIN_ENTITY_NAME_EDEFAULT.equals(fin_entity_name);
			case FinancePackage.SPECIFIC_ATTRIBUTE__FINANCIALENTITYTYPE:
				return financialentitytype != FINANCIALENTITYTYPE_EDEFAULT;
			case FinancePackage.SPECIFIC_ATTRIBUTE__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case FinancePackage.SPECIFIC_ATTRIBUTE__CONTACT:
				return contact != CONTACT_EDEFAULT;
			case FinancePackage.SPECIFIC_ATTRIBUTE__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case FinancePackage.SPECIFIC_ATTRIBUTE__REGULATORYENTITY:
				return regulatoryentity != null;
			case FinancePackage.SPECIFIC_ATTRIBUTE__PRODUCT_ID:
				return product_id != PRODUCT_ID_EDEFAULT;
			case FinancePackage.SPECIFIC_ATTRIBUTE__PRODUCT_NAME:
				return PRODUCT_NAME_EDEFAULT == null ? product_name != null : !PRODUCT_NAME_EDEFAULT.equals(product_name);
			case FinancePackage.SPECIFIC_ATTRIBUTE__SERVICESOFFERED_BY:
				return servicesofferedBy != null;
			case FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTION_ID:
				return transctionID != TRANSCTION_ID_EDEFAULT;
			case FinancePackage.SPECIFIC_ATTRIBUTE__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case FinancePackage.SPECIFIC_ATTRIBUTE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTIONTYPE:
				return transctiontype != null;
			case FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTIONMODE:
				return transctionmode != null;
			case FinancePackage.SPECIFIC_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FinancePackage.SPECIFIC_ATTRIBUTE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FinancialEntity.class) {
			switch (derivedFeatureID) {
				case FinancePackage.SPECIFIC_ATTRIBUTE__FIN_ENTITY_ID: return FinancePackage.FINANCIAL_ENTITY__FIN_ENTITY_ID;
				case FinancePackage.SPECIFIC_ATTRIBUTE__FIN_ENTITY_NAME: return FinancePackage.FINANCIAL_ENTITY__FIN_ENTITY_NAME;
				case FinancePackage.SPECIFIC_ATTRIBUTE__FINANCIALENTITYTYPE: return FinancePackage.FINANCIAL_ENTITY__FINANCIALENTITYTYPE;
				case FinancePackage.SPECIFIC_ATTRIBUTE__ADDRESS: return FinancePackage.FINANCIAL_ENTITY__ADDRESS;
				case FinancePackage.SPECIFIC_ATTRIBUTE__CONTACT: return FinancePackage.FINANCIAL_ENTITY__CONTACT;
				case FinancePackage.SPECIFIC_ATTRIBUTE__EMAIL: return FinancePackage.FINANCIAL_ENTITY__EMAIL;
				case FinancePackage.SPECIFIC_ATTRIBUTE__REGULATORYENTITY: return FinancePackage.FINANCIAL_ENTITY__REGULATORYENTITY;
				default: return -1;
			}
		}
		if (baseClass == FinancialProduct.class) {
			switch (derivedFeatureID) {
				case FinancePackage.SPECIFIC_ATTRIBUTE__PRODUCT_ID: return FinancePackage.FINANCIAL_PRODUCT__PRODUCT_ID;
				case FinancePackage.SPECIFIC_ATTRIBUTE__PRODUCT_NAME: return FinancePackage.FINANCIAL_PRODUCT__PRODUCT_NAME;
				case FinancePackage.SPECIFIC_ATTRIBUTE__SERVICESOFFERED_BY: return FinancePackage.FINANCIAL_PRODUCT__SERVICESOFFERED_BY;
				default: return -1;
			}
		}
		if (baseClass == Transction.class) {
			switch (derivedFeatureID) {
				case FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTION_ID: return FinancePackage.TRANSCTION__TRANSCTION_ID;
				case FinancePackage.SPECIFIC_ATTRIBUTE__AMOUNT: return FinancePackage.TRANSCTION__AMOUNT;
				case FinancePackage.SPECIFIC_ATTRIBUTE__DATE: return FinancePackage.TRANSCTION__DATE;
				case FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTIONTYPE: return FinancePackage.TRANSCTION__TRANSCTIONTYPE;
				case FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTIONMODE: return FinancePackage.TRANSCTION__TRANSCTIONMODE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FinancialEntity.class) {
			switch (baseFeatureID) {
				case FinancePackage.FINANCIAL_ENTITY__FIN_ENTITY_ID: return FinancePackage.SPECIFIC_ATTRIBUTE__FIN_ENTITY_ID;
				case FinancePackage.FINANCIAL_ENTITY__FIN_ENTITY_NAME: return FinancePackage.SPECIFIC_ATTRIBUTE__FIN_ENTITY_NAME;
				case FinancePackage.FINANCIAL_ENTITY__FINANCIALENTITYTYPE: return FinancePackage.SPECIFIC_ATTRIBUTE__FINANCIALENTITYTYPE;
				case FinancePackage.FINANCIAL_ENTITY__ADDRESS: return FinancePackage.SPECIFIC_ATTRIBUTE__ADDRESS;
				case FinancePackage.FINANCIAL_ENTITY__CONTACT: return FinancePackage.SPECIFIC_ATTRIBUTE__CONTACT;
				case FinancePackage.FINANCIAL_ENTITY__EMAIL: return FinancePackage.SPECIFIC_ATTRIBUTE__EMAIL;
				case FinancePackage.FINANCIAL_ENTITY__REGULATORYENTITY: return FinancePackage.SPECIFIC_ATTRIBUTE__REGULATORYENTITY;
				default: return -1;
			}
		}
		if (baseClass == FinancialProduct.class) {
			switch (baseFeatureID) {
				case FinancePackage.FINANCIAL_PRODUCT__PRODUCT_ID: return FinancePackage.SPECIFIC_ATTRIBUTE__PRODUCT_ID;
				case FinancePackage.FINANCIAL_PRODUCT__PRODUCT_NAME: return FinancePackage.SPECIFIC_ATTRIBUTE__PRODUCT_NAME;
				case FinancePackage.FINANCIAL_PRODUCT__SERVICESOFFERED_BY: return FinancePackage.SPECIFIC_ATTRIBUTE__SERVICESOFFERED_BY;
				default: return -1;
			}
		}
		if (baseClass == Transction.class) {
			switch (baseFeatureID) {
				case FinancePackage.TRANSCTION__TRANSCTION_ID: return FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTION_ID;
				case FinancePackage.TRANSCTION__AMOUNT: return FinancePackage.SPECIFIC_ATTRIBUTE__AMOUNT;
				case FinancePackage.TRANSCTION__DATE: return FinancePackage.SPECIFIC_ATTRIBUTE__DATE;
				case FinancePackage.TRANSCTION__TRANSCTIONTYPE: return FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTIONTYPE;
				case FinancePackage.TRANSCTION__TRANSCTIONMODE: return FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTIONMODE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", product_id: ");
		result.append(product_id);
		result.append(", product_name: ");
		result.append(product_name);
		result.append(", transctionID: ");
		result.append(transctionID);
		result.append(", amount: ");
		result.append(amount);
		result.append(", date: ");
		result.append(date);
		result.append(", name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //SpecificAttributeImpl
