/**
 */
package finance.impl;

import finance.FinancePackage;
import finance.TransctionMode;
import finance.TransctionModeList;

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
 * An implementation of the model object '<em><b>Transction Mode List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link finance.impl.TransctionModeListImpl#getModelist <em>Modelist</em>}</li>
 *   <li>{@link finance.impl.TransctionModeListImpl#getModelistname <em>Modelistname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransctionModeListImpl extends MinimalEObjectImpl.Container implements TransctionModeList {
	/**
	 * The cached value of the '{@link #getModelist() <em>Modelist</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelist()
	 * @generated
	 * @ordered
	 */
	protected EList<TransctionMode> modelist;

	/**
	 * The default value of the '{@link #getModelistname() <em>Modelistname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelistname()
	 * @generated
	 * @ordered
	 */
	protected static final String MODELISTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelistname() <em>Modelistname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelistname()
	 * @generated
	 * @ordered
	 */
	protected String modelistname = MODELISTNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransctionModeListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancePackage.Literals.TRANSCTION_MODE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransctionMode> getModelist() {
		if (modelist == null) {
			modelist = new EObjectContainmentEList<TransctionMode>(TransctionMode.class, this, FinancePackage.TRANSCTION_MODE_LIST__MODELIST);
		}
		return modelist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelistname() {
		return modelistname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelistname(String newModelistname) {
		String oldModelistname = modelistname;
		modelistname = newModelistname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.TRANSCTION_MODE_LIST__MODELISTNAME, oldModelistname, modelistname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinancePackage.TRANSCTION_MODE_LIST__MODELIST:
				return ((InternalEList<?>)getModelist()).basicRemove(otherEnd, msgs);
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
			case FinancePackage.TRANSCTION_MODE_LIST__MODELIST:
				return getModelist();
			case FinancePackage.TRANSCTION_MODE_LIST__MODELISTNAME:
				return getModelistname();
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
			case FinancePackage.TRANSCTION_MODE_LIST__MODELIST:
				getModelist().clear();
				getModelist().addAll((Collection<? extends TransctionMode>)newValue);
				return;
			case FinancePackage.TRANSCTION_MODE_LIST__MODELISTNAME:
				setModelistname((String)newValue);
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
			case FinancePackage.TRANSCTION_MODE_LIST__MODELIST:
				getModelist().clear();
				return;
			case FinancePackage.TRANSCTION_MODE_LIST__MODELISTNAME:
				setModelistname(MODELISTNAME_EDEFAULT);
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
			case FinancePackage.TRANSCTION_MODE_LIST__MODELIST:
				return modelist != null && !modelist.isEmpty();
			case FinancePackage.TRANSCTION_MODE_LIST__MODELISTNAME:
				return MODELISTNAME_EDEFAULT == null ? modelistname != null : !MODELISTNAME_EDEFAULT.equals(modelistname);
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
		result.append(" (modelistname: ");
		result.append(modelistname);
		result.append(')');
		return result.toString();
	}

} //TransctionModeListImpl
