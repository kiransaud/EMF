/**
 */
package finance.impl;

import finance.FinancePackage;
import finance.FinancialEntity;
import finance.FinancialEntityList;

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
 * An implementation of the model object '<em><b>Financial Entity List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link finance.impl.FinancialEntityListImpl#getFinancialentitylist <em>Financialentitylist</em>}</li>
 *   <li>{@link finance.impl.FinancialEntityListImpl#getEntitylistname <em>Entitylistname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinancialEntityListImpl extends MinimalEObjectImpl.Container implements FinancialEntityList {
	/**
	 * The cached value of the '{@link #getFinancialentitylist() <em>Financialentitylist</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinancialentitylist()
	 * @generated
	 * @ordered
	 */
	protected EList<FinancialEntity> financialentitylist;

	/**
	 * The default value of the '{@link #getEntitylistname() <em>Entitylistname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitylistname()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITYLISTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntitylistname() <em>Entitylistname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitylistname()
	 * @generated
	 * @ordered
	 */
	protected String entitylistname = ENTITYLISTNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinancialEntityListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancePackage.Literals.FINANCIAL_ENTITY_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinancialEntity> getFinancialentitylist() {
		if (financialentitylist == null) {
			financialentitylist = new EObjectContainmentEList<FinancialEntity>(FinancialEntity.class, this, FinancePackage.FINANCIAL_ENTITY_LIST__FINANCIALENTITYLIST);
		}
		return financialentitylist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntitylistname() {
		return entitylistname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntitylistname(String newEntitylistname) {
		String oldEntitylistname = entitylistname;
		entitylistname = newEntitylistname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.FINANCIAL_ENTITY_LIST__ENTITYLISTNAME, oldEntitylistname, entitylistname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinancePackage.FINANCIAL_ENTITY_LIST__FINANCIALENTITYLIST:
				return ((InternalEList<?>)getFinancialentitylist()).basicRemove(otherEnd, msgs);
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
			case FinancePackage.FINANCIAL_ENTITY_LIST__FINANCIALENTITYLIST:
				return getFinancialentitylist();
			case FinancePackage.FINANCIAL_ENTITY_LIST__ENTITYLISTNAME:
				return getEntitylistname();
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
			case FinancePackage.FINANCIAL_ENTITY_LIST__FINANCIALENTITYLIST:
				getFinancialentitylist().clear();
				getFinancialentitylist().addAll((Collection<? extends FinancialEntity>)newValue);
				return;
			case FinancePackage.FINANCIAL_ENTITY_LIST__ENTITYLISTNAME:
				setEntitylistname((String)newValue);
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
			case FinancePackage.FINANCIAL_ENTITY_LIST__FINANCIALENTITYLIST:
				getFinancialentitylist().clear();
				return;
			case FinancePackage.FINANCIAL_ENTITY_LIST__ENTITYLISTNAME:
				setEntitylistname(ENTITYLISTNAME_EDEFAULT);
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
			case FinancePackage.FINANCIAL_ENTITY_LIST__FINANCIALENTITYLIST:
				return financialentitylist != null && !financialentitylist.isEmpty();
			case FinancePackage.FINANCIAL_ENTITY_LIST__ENTITYLISTNAME:
				return ENTITYLISTNAME_EDEFAULT == null ? entitylistname != null : !ENTITYLISTNAME_EDEFAULT.equals(entitylistname);
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
		result.append(" (entitylistname: ");
		result.append(entitylistname);
		result.append(')');
		return result.toString();
	}

} //FinancialEntityListImpl
