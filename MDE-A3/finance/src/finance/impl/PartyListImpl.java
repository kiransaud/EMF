/**
 */
package finance.impl;

import finance.FinancePackage;
import finance.Party;
import finance.PartyList;

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
 * An implementation of the model object '<em><b>Party List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link finance.impl.PartyListImpl#getParties <em>Parties</em>}</li>
 *   <li>{@link finance.impl.PartyListImpl#getPartyListname <em>Party Listname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyListImpl extends MinimalEObjectImpl.Container implements PartyList {
	/**
	 * The cached value of the '{@link #getParties() <em>Parties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParties()
	 * @generated
	 * @ordered
	 */
	protected EList<Party> parties;

	/**
	 * The default value of the '{@link #getPartyListname() <em>Party Listname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyListname()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_LISTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyListname() <em>Party Listname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyListname()
	 * @generated
	 * @ordered
	 */
	protected String partyListname = PARTY_LISTNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancePackage.Literals.PARTY_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Party> getParties() {
		if (parties == null) {
			parties = new EObjectContainmentEList<Party>(Party.class, this, FinancePackage.PARTY_LIST__PARTIES);
		}
		return parties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyListname() {
		return partyListname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyListname(String newPartyListname) {
		String oldPartyListname = partyListname;
		partyListname = newPartyListname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.PARTY_LIST__PARTY_LISTNAME, oldPartyListname, partyListname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinancePackage.PARTY_LIST__PARTIES:
				return ((InternalEList<?>)getParties()).basicRemove(otherEnd, msgs);
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
			case FinancePackage.PARTY_LIST__PARTIES:
				return getParties();
			case FinancePackage.PARTY_LIST__PARTY_LISTNAME:
				return getPartyListname();
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
			case FinancePackage.PARTY_LIST__PARTIES:
				getParties().clear();
				getParties().addAll((Collection<? extends Party>)newValue);
				return;
			case FinancePackage.PARTY_LIST__PARTY_LISTNAME:
				setPartyListname((String)newValue);
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
			case FinancePackage.PARTY_LIST__PARTIES:
				getParties().clear();
				return;
			case FinancePackage.PARTY_LIST__PARTY_LISTNAME:
				setPartyListname(PARTY_LISTNAME_EDEFAULT);
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
			case FinancePackage.PARTY_LIST__PARTIES:
				return parties != null && !parties.isEmpty();
			case FinancePackage.PARTY_LIST__PARTY_LISTNAME:
				return PARTY_LISTNAME_EDEFAULT == null ? partyListname != null : !PARTY_LISTNAME_EDEFAULT.equals(partyListname);
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
		result.append(" (partyListname: ");
		result.append(partyListname);
		result.append(')');
		return result.toString();
	}

} //PartyListImpl
