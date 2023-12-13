/**
 */
package finance.impl;

import finance.FinancePackage;
import finance.TransctionType;
import finance.TransctionTypeList;

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
 * An implementation of the model object '<em><b>Transction Type List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link finance.impl.TransctionTypeListImpl#getTypelist <em>Typelist</em>}</li>
 *   <li>{@link finance.impl.TransctionTypeListImpl#getTypelistname <em>Typelistname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransctionTypeListImpl extends MinimalEObjectImpl.Container implements TransctionTypeList {
	/**
	 * The cached value of the '{@link #getTypelist() <em>Typelist</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypelist()
	 * @generated
	 * @ordered
	 */
	protected EList<TransctionType> typelist;

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
	protected TransctionTypeListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancePackage.Literals.TRANSCTION_TYPE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransctionType> getTypelist() {
		if (typelist == null) {
			typelist = new EObjectContainmentEList<TransctionType>(TransctionType.class, this, FinancePackage.TRANSCTION_TYPE_LIST__TYPELIST);
		}
		return typelist;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.TRANSCTION_TYPE_LIST__TYPELISTNAME, oldTypelistname, typelistname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinancePackage.TRANSCTION_TYPE_LIST__TYPELIST:
				return ((InternalEList<?>)getTypelist()).basicRemove(otherEnd, msgs);
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
			case FinancePackage.TRANSCTION_TYPE_LIST__TYPELIST:
				return getTypelist();
			case FinancePackage.TRANSCTION_TYPE_LIST__TYPELISTNAME:
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
			case FinancePackage.TRANSCTION_TYPE_LIST__TYPELIST:
				getTypelist().clear();
				getTypelist().addAll((Collection<? extends TransctionType>)newValue);
				return;
			case FinancePackage.TRANSCTION_TYPE_LIST__TYPELISTNAME:
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
			case FinancePackage.TRANSCTION_TYPE_LIST__TYPELIST:
				getTypelist().clear();
				return;
			case FinancePackage.TRANSCTION_TYPE_LIST__TYPELISTNAME:
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
			case FinancePackage.TRANSCTION_TYPE_LIST__TYPELIST:
				return typelist != null && !typelist.isEmpty();
			case FinancePackage.TRANSCTION_TYPE_LIST__TYPELISTNAME:
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

} //TransctionTypeListImpl
