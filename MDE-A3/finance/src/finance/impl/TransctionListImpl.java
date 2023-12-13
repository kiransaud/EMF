/**
 */
package finance.impl;

import finance.FinancePackage;
import finance.Transction;
import finance.TransctionList;

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
 * An implementation of the model object '<em><b>Transction List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link finance.impl.TransctionListImpl#getTransctionlist <em>Transctionlist</em>}</li>
 *   <li>{@link finance.impl.TransctionListImpl#getListname <em>Listname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransctionListImpl extends MinimalEObjectImpl.Container implements TransctionList {
	/**
	 * The cached value of the '{@link #getTransctionlist() <em>Transctionlist</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransctionlist()
	 * @generated
	 * @ordered
	 */
	protected EList<Transction> transctionlist;

	/**
	 * The default value of the '{@link #getListname() <em>Listname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListname()
	 * @generated
	 * @ordered
	 */
	protected static final String LISTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListname() <em>Listname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListname()
	 * @generated
	 * @ordered
	 */
	protected String listname = LISTNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransctionListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancePackage.Literals.TRANSCTION_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transction> getTransctionlist() {
		if (transctionlist == null) {
			transctionlist = new EObjectContainmentEList<Transction>(Transction.class, this, FinancePackage.TRANSCTION_LIST__TRANSCTIONLIST);
		}
		return transctionlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getListname() {
		return listname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListname(String newListname) {
		String oldListname = listname;
		listname = newListname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.TRANSCTION_LIST__LISTNAME, oldListname, listname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinancePackage.TRANSCTION_LIST__TRANSCTIONLIST:
				return ((InternalEList<?>)getTransctionlist()).basicRemove(otherEnd, msgs);
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
			case FinancePackage.TRANSCTION_LIST__TRANSCTIONLIST:
				return getTransctionlist();
			case FinancePackage.TRANSCTION_LIST__LISTNAME:
				return getListname();
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
			case FinancePackage.TRANSCTION_LIST__TRANSCTIONLIST:
				getTransctionlist().clear();
				getTransctionlist().addAll((Collection<? extends Transction>)newValue);
				return;
			case FinancePackage.TRANSCTION_LIST__LISTNAME:
				setListname((String)newValue);
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
			case FinancePackage.TRANSCTION_LIST__TRANSCTIONLIST:
				getTransctionlist().clear();
				return;
			case FinancePackage.TRANSCTION_LIST__LISTNAME:
				setListname(LISTNAME_EDEFAULT);
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
			case FinancePackage.TRANSCTION_LIST__TRANSCTIONLIST:
				return transctionlist != null && !transctionlist.isEmpty();
			case FinancePackage.TRANSCTION_LIST__LISTNAME:
				return LISTNAME_EDEFAULT == null ? listname != null : !LISTNAME_EDEFAULT.equals(listname);
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
		result.append(" (listname: ");
		result.append(listname);
		result.append(')');
		return result.toString();
	}

} //TransctionListImpl
