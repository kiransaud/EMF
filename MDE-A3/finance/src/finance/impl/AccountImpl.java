/**
 */
package finance.impl;

import finance.Account;
import finance.AccountType;
import finance.Currency;
import finance.FinancePackage;
import finance.FinancialEntity;
import finance.Party;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link finance.impl.AccountImpl#getAccount_id <em>Account id</em>}</li>
 *   <li>{@link finance.impl.AccountImpl#getBalance <em>Balance</em>}</li>
 *   <li>{@link finance.impl.AccountImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link finance.impl.AccountImpl#getAccounttype <em>Accounttype</em>}</li>
 *   <li>{@link finance.impl.AccountImpl#getPartyassociatedwithaccount <em>Partyassociatedwithaccount</em>}</li>
 *   <li>{@link finance.impl.AccountImpl#getInstitutionWithAccount <em>Institution With Account</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountImpl extends MinimalEObjectImpl.Container implements Account {
	/**
	 * The default value of the '{@link #getAccount_id() <em>Account id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount_id()
	 * @generated
	 * @ordered
	 */
	protected static final int ACCOUNT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAccount_id() <em>Account id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount_id()
	 * @generated
	 * @ordered
	 */
	protected int account_id = ACCOUNT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected static final float BALANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected float balance = BALANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final Currency CURRENCY_EDEFAULT = Currency.EURO;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected Currency currency = CURRENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccounttype() <em>Accounttype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccounttype()
	 * @generated
	 * @ordered
	 */
	protected AccountType accounttype;

	/**
	 * The cached value of the '{@link #getPartyassociatedwithaccount() <em>Partyassociatedwithaccount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyassociatedwithaccount()
	 * @generated
	 * @ordered
	 */
	protected Party partyassociatedwithaccount;

	/**
	 * The cached value of the '{@link #getInstitutionWithAccount() <em>Institution With Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionWithAccount()
	 * @generated
	 * @ordered
	 */
	protected FinancialEntity institutionWithAccount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancePackage.Literals.ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAccount_id() {
		return account_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccount_id(int newAccount_id) {
		int oldAccount_id = account_id;
		account_id = newAccount_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.ACCOUNT__ACCOUNT_ID, oldAccount_id, account_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getBalance() {
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBalance(float newBalance) {
		float oldBalance = balance;
		balance = newBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.ACCOUNT__BALANCE, oldBalance, balance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Currency getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrency(Currency newCurrency) {
		Currency oldCurrency = currency;
		currency = newCurrency == null ? CURRENCY_EDEFAULT : newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.ACCOUNT__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccountType getAccounttype() {
		return accounttype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccounttype(AccountType newAccounttype, NotificationChain msgs) {
		AccountType oldAccounttype = accounttype;
		accounttype = newAccounttype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinancePackage.ACCOUNT__ACCOUNTTYPE, oldAccounttype, newAccounttype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccounttype(AccountType newAccounttype) {
		if (newAccounttype != accounttype) {
			NotificationChain msgs = null;
			if (accounttype != null)
				msgs = ((InternalEObject)accounttype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinancePackage.ACCOUNT__ACCOUNTTYPE, null, msgs);
			if (newAccounttype != null)
				msgs = ((InternalEObject)newAccounttype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinancePackage.ACCOUNT__ACCOUNTTYPE, null, msgs);
			msgs = basicSetAccounttype(newAccounttype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.ACCOUNT__ACCOUNTTYPE, newAccounttype, newAccounttype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyassociatedwithaccount() {
		if (partyassociatedwithaccount != null && partyassociatedwithaccount.eIsProxy()) {
			InternalEObject oldPartyassociatedwithaccount = (InternalEObject)partyassociatedwithaccount;
			partyassociatedwithaccount = (Party)eResolveProxy(oldPartyassociatedwithaccount);
			if (partyassociatedwithaccount != oldPartyassociatedwithaccount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinancePackage.ACCOUNT__PARTYASSOCIATEDWITHACCOUNT, oldPartyassociatedwithaccount, partyassociatedwithaccount));
			}
		}
		return partyassociatedwithaccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyassociatedwithaccount() {
		return partyassociatedwithaccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyassociatedwithaccount(Party newPartyassociatedwithaccount) {
		Party oldPartyassociatedwithaccount = partyassociatedwithaccount;
		partyassociatedwithaccount = newPartyassociatedwithaccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.ACCOUNT__PARTYASSOCIATEDWITHACCOUNT, oldPartyassociatedwithaccount, partyassociatedwithaccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinancialEntity getInstitutionWithAccount() {
		if (institutionWithAccount != null && institutionWithAccount.eIsProxy()) {
			InternalEObject oldInstitutionWithAccount = (InternalEObject)institutionWithAccount;
			institutionWithAccount = (FinancialEntity)eResolveProxy(oldInstitutionWithAccount);
			if (institutionWithAccount != oldInstitutionWithAccount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinancePackage.ACCOUNT__INSTITUTION_WITH_ACCOUNT, oldInstitutionWithAccount, institutionWithAccount));
			}
		}
		return institutionWithAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialEntity basicGetInstitutionWithAccount() {
		return institutionWithAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstitutionWithAccount(FinancialEntity newInstitutionWithAccount) {
		FinancialEntity oldInstitutionWithAccount = institutionWithAccount;
		institutionWithAccount = newInstitutionWithAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.ACCOUNT__INSTITUTION_WITH_ACCOUNT, oldInstitutionWithAccount, institutionWithAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinancePackage.ACCOUNT__ACCOUNTTYPE:
				return basicSetAccounttype(null, msgs);
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
			case FinancePackage.ACCOUNT__ACCOUNT_ID:
				return getAccount_id();
			case FinancePackage.ACCOUNT__BALANCE:
				return getBalance();
			case FinancePackage.ACCOUNT__CURRENCY:
				return getCurrency();
			case FinancePackage.ACCOUNT__ACCOUNTTYPE:
				return getAccounttype();
			case FinancePackage.ACCOUNT__PARTYASSOCIATEDWITHACCOUNT:
				if (resolve) return getPartyassociatedwithaccount();
				return basicGetPartyassociatedwithaccount();
			case FinancePackage.ACCOUNT__INSTITUTION_WITH_ACCOUNT:
				if (resolve) return getInstitutionWithAccount();
				return basicGetInstitutionWithAccount();
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
			case FinancePackage.ACCOUNT__ACCOUNT_ID:
				setAccount_id((Integer)newValue);
				return;
			case FinancePackage.ACCOUNT__BALANCE:
				setBalance((Float)newValue);
				return;
			case FinancePackage.ACCOUNT__CURRENCY:
				setCurrency((Currency)newValue);
				return;
			case FinancePackage.ACCOUNT__ACCOUNTTYPE:
				setAccounttype((AccountType)newValue);
				return;
			case FinancePackage.ACCOUNT__PARTYASSOCIATEDWITHACCOUNT:
				setPartyassociatedwithaccount((Party)newValue);
				return;
			case FinancePackage.ACCOUNT__INSTITUTION_WITH_ACCOUNT:
				setInstitutionWithAccount((FinancialEntity)newValue);
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
			case FinancePackage.ACCOUNT__ACCOUNT_ID:
				setAccount_id(ACCOUNT_ID_EDEFAULT);
				return;
			case FinancePackage.ACCOUNT__BALANCE:
				setBalance(BALANCE_EDEFAULT);
				return;
			case FinancePackage.ACCOUNT__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case FinancePackage.ACCOUNT__ACCOUNTTYPE:
				setAccounttype((AccountType)null);
				return;
			case FinancePackage.ACCOUNT__PARTYASSOCIATEDWITHACCOUNT:
				setPartyassociatedwithaccount((Party)null);
				return;
			case FinancePackage.ACCOUNT__INSTITUTION_WITH_ACCOUNT:
				setInstitutionWithAccount((FinancialEntity)null);
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
			case FinancePackage.ACCOUNT__ACCOUNT_ID:
				return account_id != ACCOUNT_ID_EDEFAULT;
			case FinancePackage.ACCOUNT__BALANCE:
				return balance != BALANCE_EDEFAULT;
			case FinancePackage.ACCOUNT__CURRENCY:
				return currency != CURRENCY_EDEFAULT;
			case FinancePackage.ACCOUNT__ACCOUNTTYPE:
				return accounttype != null;
			case FinancePackage.ACCOUNT__PARTYASSOCIATEDWITHACCOUNT:
				return partyassociatedwithaccount != null;
			case FinancePackage.ACCOUNT__INSTITUTION_WITH_ACCOUNT:
				return institutionWithAccount != null;
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
		result.append(" (account_id: ");
		result.append(account_id);
		result.append(", balance: ");
		result.append(balance);
		result.append(", currency: ");
		result.append(currency);
		result.append(')');
		return result.toString();
	}

} //AccountImpl
