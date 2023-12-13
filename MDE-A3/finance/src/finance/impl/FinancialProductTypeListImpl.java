/**
 */
package finance.impl;

import finance.FinancePackage;
import finance.FinancialProductType;
import finance.FinancialProductTypeList;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Financial Product Type List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link finance.impl.FinancialProductTypeListImpl#getFPtypeList <em>FPtype List</em>}</li>
 *   <li>{@link finance.impl.FinancialProductTypeListImpl#getTypelistname <em>Typelistname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinancialProductTypeListImpl extends MinimalEObjectImpl.Container implements FinancialProductTypeList {
	/**
	 * The cached value of the '{@link #getFPtypeList() <em>FPtype List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFPtypeList()
	 * @generated
	 * @ordered
	 */
	protected EList<FinancialProductType> fPtypeList;

	/**
	 * The default value of the '{@link #getTypelistname() <em>Typelistname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypelistname()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPELISTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypelistname() <em>Typelistname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypelistname()
	 * @generated
	 * @ordered
	 */
	protected String typelistname = TYPELISTNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinancialProductTypeListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancePackage.Literals.FINANCIAL_PRODUCT_TYPE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinancialProductType> getFPtypeList() {
		if (fPtypeList == null) {
			fPtypeList = new EObjectContainmentEList<FinancialProductType>(FinancialProductType.class, this, FinancePackage.FINANCIAL_PRODUCT_TYPE_LIST__FPTYPE_LIST);
		}
		return fPtypeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypelistname() {
		return typelistname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypelistname(String newTypelistname) {
		String oldTypelistname = typelistname;
		typelistname = newTypelistname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.FINANCIAL_PRODUCT_TYPE_LIST__TYPELISTNAME, oldTypelistname, typelistname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinancePackage.FINANCIAL_PRODUCT_TYPE_LIST__FPTYPE_LIST:
				return ((InternalEList<?>)getFPtypeList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinancePackage.FINANCIAL_PRODUCT_TYPE_LIST__FPTYPE_LIST:
				return getFPtypeList();
			case FinancePackage.FINANCIAL_PRODUCT_TYPE_LIST__TYPELISTNAME:
				return getTypelistname();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FinancePackage.FINANCIAL_PRODUCT_TYPE_LIST__FPTYPE_LIST:
				getFPtypeList().clear();
				getFPtypeList().addAll((Collection<? extends FinancialProductType>)newValue);
				return;
			case FinancePackage.FINANCIAL_PRODUCT_TYPE_LIST__TYPELISTNAME:
				setTypelistname((String)newValue);
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
			case FinancePackage.FINANCIAL_PRODUCT_TYPE_LIST__FPTYPE_LIST:
				getFPtypeList().clear();
				return;
			case FinancePackage.FINANCIAL_PRODUCT_TYPE_LIST__TYPELISTNAME:
				setTypelistname(TYPELISTNAME_EDEFAULT);
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
			case FinancePackage.FINANCIAL_PRODUCT_TYPE_LIST__FPTYPE_LIST:
				return fPtypeList != null && !fPtypeList.isEmpty();
			case FinancePackage.FINANCIAL_PRODUCT_TYPE_LIST__TYPELISTNAME:
				return TYPELISTNAME_EDEFAULT == null ? typelistname != null : !TYPELISTNAME_EDEFAULT.equals(typelistname);
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
		result.append(" (typelistname: ");
		result.append(typelistname);
		result.append(')');
		return result.toString();
	}

} //FinancialProductTypeListImpl
