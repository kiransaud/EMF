/**
 */
package finance.impl;

import finance.FinancePackage;
import finance.Party;
import finance.PartyType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link finance.impl.PartyImpl#getParty_ID <em>Party ID</em>}</li>
 *   <li>{@link finance.impl.PartyImpl#getPartyname <em>Partyname</em>}</li>
 *   <li>{@link finance.impl.PartyImpl#getPartytype <em>Partytype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyImpl extends MinimalEObjectImpl.Container implements Party {
	/**
	 * The default value of the '{@link #getParty_ID() <em>Party ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParty_ID()
	 * @generated
	 * @ordered
	 */
	protected static final int PARTY_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getParty_ID() <em>Party ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParty_ID()
	 * @generated
	 * @ordered
	 */
	protected int party_ID = PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartyname() <em>Partyname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyname()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTYNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyname() <em>Partyname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyname()
	 * @generated
	 * @ordered
	 */
	protected String partyname = PARTYNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartytype() <em>Partytype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartytype()
	 * @generated
	 * @ordered
	 */
	protected static final PartyType PARTYTYPE_EDEFAULT = PartyType.INDIVIDUAL;

	/**
	 * The cached value of the '{@link #getPartytype() <em>Partytype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartytype()
	 * @generated
	 * @ordered
	 */
	protected PartyType partytype = PARTYTYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancePackage.Literals.PARTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getParty_ID() {
		return party_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParty_ID(int newParty_ID) {
		int oldParty_ID = party_ID;
		party_ID = newParty_ID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.PARTY__PARTY_ID, oldParty_ID, party_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyname() {
		return partyname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyname(String newPartyname) {
		String oldPartyname = partyname;
		partyname = newPartyname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.PARTY__PARTYNAME, oldPartyname, partyname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyType getPartytype() {
		return partytype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartytype(PartyType newPartytype) {
		PartyType oldPartytype = partytype;
		partytype = newPartytype == null ? PARTYTYPE_EDEFAULT : newPartytype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.PARTY__PARTYTYPE, oldPartytype, partytype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinancePackage.PARTY__PARTY_ID:
				return getParty_ID();
			case FinancePackage.PARTY__PARTYNAME:
				return getPartyname();
			case FinancePackage.PARTY__PARTYTYPE:
				return getPartytype();
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
			case FinancePackage.PARTY__PARTY_ID:
				setParty_ID((Integer)newValue);
				return;
			case FinancePackage.PARTY__PARTYNAME:
				setPartyname((String)newValue);
				return;
			case FinancePackage.PARTY__PARTYTYPE:
				setPartytype((PartyType)newValue);
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
			case FinancePackage.PARTY__PARTY_ID:
				setParty_ID(PARTY_ID_EDEFAULT);
				return;
			case FinancePackage.PARTY__PARTYNAME:
				setPartyname(PARTYNAME_EDEFAULT);
				return;
			case FinancePackage.PARTY__PARTYTYPE:
				setPartytype(PARTYTYPE_EDEFAULT);
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
			case FinancePackage.PARTY__PARTY_ID:
				return party_ID != PARTY_ID_EDEFAULT;
			case FinancePackage.PARTY__PARTYNAME:
				return PARTYNAME_EDEFAULT == null ? partyname != null : !PARTYNAME_EDEFAULT.equals(partyname);
			case FinancePackage.PARTY__PARTYTYPE:
				return partytype != PARTYTYPE_EDEFAULT;
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
		result.append(" (party_ID: ");
		result.append(party_ID);
		result.append(", partyname: ");
		result.append(partyname);
		result.append(", partytype: ");
		result.append(partytype);
		result.append(')');
		return result.toString();
	}

} //PartyImpl
