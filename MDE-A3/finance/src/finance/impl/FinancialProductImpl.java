/**
 */
package finance.impl;

import finance.FinancePackage;
import finance.FinancialEntity;
import finance.FinancialProduct;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Financial Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link finance.impl.FinancialProductImpl#getProduct_id <em>Product id</em>}</li>
 *   <li>{@link finance.impl.FinancialProductImpl#getProduct_name <em>Product name</em>}</li>
 *   <li>{@link finance.impl.FinancialProductImpl#getServicesofferedBy <em>Servicesoffered By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinancialProductImpl extends MinimalEObjectImpl.Container implements FinancialProduct {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinancialProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancePackage.Literals.FINANCIAL_PRODUCT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.FINANCIAL_PRODUCT__PRODUCT_ID, oldProduct_id, product_id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.FINANCIAL_PRODUCT__PRODUCT_NAME, oldProduct_name, product_name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinancePackage.FINANCIAL_PRODUCT__SERVICESOFFERED_BY, oldServicesofferedBy, servicesofferedBy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.FINANCIAL_PRODUCT__SERVICESOFFERED_BY, oldServicesofferedBy, servicesofferedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinancePackage.FINANCIAL_PRODUCT__PRODUCT_ID:
				return getProduct_id();
			case FinancePackage.FINANCIAL_PRODUCT__PRODUCT_NAME:
				return getProduct_name();
			case FinancePackage.FINANCIAL_PRODUCT__SERVICESOFFERED_BY:
				if (resolve) return getServicesofferedBy();
				return basicGetServicesofferedBy();
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
			case FinancePackage.FINANCIAL_PRODUCT__PRODUCT_ID:
				setProduct_id((Integer)newValue);
				return;
			case FinancePackage.FINANCIAL_PRODUCT__PRODUCT_NAME:
				setProduct_name((String)newValue);
				return;
			case FinancePackage.FINANCIAL_PRODUCT__SERVICESOFFERED_BY:
				setServicesofferedBy((FinancialEntity)newValue);
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
			case FinancePackage.FINANCIAL_PRODUCT__PRODUCT_ID:
				setProduct_id(PRODUCT_ID_EDEFAULT);
				return;
			case FinancePackage.FINANCIAL_PRODUCT__PRODUCT_NAME:
				setProduct_name(PRODUCT_NAME_EDEFAULT);
				return;
			case FinancePackage.FINANCIAL_PRODUCT__SERVICESOFFERED_BY:
				setServicesofferedBy((FinancialEntity)null);
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
			case FinancePackage.FINANCIAL_PRODUCT__PRODUCT_ID:
				return product_id != PRODUCT_ID_EDEFAULT;
			case FinancePackage.FINANCIAL_PRODUCT__PRODUCT_NAME:
				return PRODUCT_NAME_EDEFAULT == null ? product_name != null : !PRODUCT_NAME_EDEFAULT.equals(product_name);
			case FinancePackage.FINANCIAL_PRODUCT__SERVICESOFFERED_BY:
				return servicesofferedBy != null;
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
		result.append(" (product_id: ");
		result.append(product_id);
		result.append(", product_name: ");
		result.append(product_name);
		result.append(')');
		return result.toString();
	}

} //FinancialProductImpl
