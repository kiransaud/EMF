/**
 */
package finance.impl;

import finance.Account;
import finance.AccountList;
import finance.FinancePackage;

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
 * An implementation of the model object '<em><b>Account List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link finance.impl.AccountListImpl#getAccountlist <em>Accountlist</em>}</li>
 *   <li>{@link finance.impl.AccountListImpl#getLitsname <em>Litsname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountListImpl extends MinimalEObjectImpl.Container implements AccountList {
	/**
	 * The cached value of the '{@link #getAccountlist() <em>Accountlist</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountlist()
	 * @generated
	 * @ordered
	 */
	protected EList<Account> accountlist;

	/**
	 * The default value of the '{@link #getLitsname() <em>Litsname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLitsname()
	 * @generated
	 * @ordered
	 */
	protected static final String LITSNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLitsname() <em>Litsname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLitsname()
	 * @generated
	 * @ordered
	 */
	protected String litsname = LITSNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancePackage.Literals.ACCOUNT_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Account> getAccountlist() {
		if (accountlist == null) {
			accountlist = new EObjectContainmentEList<Account>(Account.class, this, FinancePackage.ACCOUNT_LIST__ACCOUNTLIST);
		}
		return accountlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLitsname() {
		return litsname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLitsname(String newLitsname) {
		String oldLitsname = litsname;
		litsname = newLitsname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.ACCOUNT_LIST__LITSNAME, oldLitsname, litsname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinancePackage.ACCOUNT_LIST__ACCOUNTLIST:
				return ((InternalEList<?>)getAccountlist()).basicRemove(otherEnd, msgs);
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
			case FinancePackage.ACCOUNT_LIST__ACCOUNTLIST:
				return getAccountlist();
			case FinancePackage.ACCOUNT_LIST__LITSNAME:
				return getLitsname();
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
			case FinancePackage.ACCOUNT_LIST__ACCOUNTLIST:
				getAccountlist().clear();
				getAccountlist().addAll((Collection<? extends Account>)newValue);
				return;
			case FinancePackage.ACCOUNT_LIST__LITSNAME:
				setLitsname((String)newValue);
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
			case FinancePackage.ACCOUNT_LIST__ACCOUNTLIST:
				getAccountlist().clear();
				return;
			case FinancePackage.ACCOUNT_LIST__LITSNAME:
				setLitsname(LITSNAME_EDEFAULT);
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
			case FinancePackage.ACCOUNT_LIST__ACCOUNTLIST:
				return accountlist != null && !accountlist.isEmpty();
			case FinancePackage.ACCOUNT_LIST__LITSNAME:
				return LITSNAME_EDEFAULT == null ? litsname != null : !LITSNAME_EDEFAULT.equals(litsname);
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
		result.append(" (litsname: ");
		result.append(litsname);
		result.append(')');
		return result.toString();
	}

} //AccountListImpl
