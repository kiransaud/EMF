/**
 */
package finance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link finance.Account#getAccount_id <em>Account id</em>}</li>
 *   <li>{@link finance.Account#getBalance <em>Balance</em>}</li>
 *   <li>{@link finance.Account#getCurrency <em>Currency</em>}</li>
 *   <li>{@link finance.Account#getAccounttype <em>Accounttype</em>}</li>
 *   <li>{@link finance.Account#getPartyassociatedwithaccount <em>Partyassociatedwithaccount</em>}</li>
 *   <li>{@link finance.Account#getInstitutionWithAccount <em>Institution With Account</em>}</li>
 * </ul>
 *
 * @see finance.FinancePackage#getAccount()
 * @model
 * @generated
 */
public interface Account extends EObject {
	/**
	 * Returns the value of the '<em><b>Account id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account id</em>' attribute.
	 * @see #setAccount_id(int)
	 * @see finance.FinancePackage#getAccount_Account_id()
	 * @model
	 * @generated
	 */
	int getAccount_id();

	/**
	 * Sets the value of the '{@link finance.Account#getAccount_id <em>Account id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account id</em>' attribute.
	 * @see #getAccount_id()
	 * @generated
	 */
	void setAccount_id(int value);

	/**
	 * Returns the value of the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance</em>' attribute.
	 * @see #setBalance(float)
	 * @see finance.FinancePackage#getAccount_Balance()
	 * @model
	 * @generated
	 */
	float getBalance();

	/**
	 * Sets the value of the '{@link finance.Account#getBalance <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' attribute.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(float value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * The literals are from the enumeration {@link finance.Currency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see finance.Currency
	 * @see #setCurrency(Currency)
	 * @see finance.FinancePackage#getAccount_Currency()
	 * @model
	 * @generated
	 */
	Currency getCurrency();

	/**
	 * Sets the value of the '{@link finance.Account#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see finance.Currency
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(Currency value);

	/**
	 * Returns the value of the '<em><b>Accounttype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounttype</em>' containment reference.
	 * @see #setAccounttype(AccountType)
	 * @see finance.FinancePackage#getAccount_Accounttype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AccountType getAccounttype();

	/**
	 * Sets the value of the '{@link finance.Account#getAccounttype <em>Accounttype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounttype</em>' containment reference.
	 * @see #getAccounttype()
	 * @generated
	 */
	void setAccounttype(AccountType value);

	/**
	 * Returns the value of the '<em><b>Partyassociatedwithaccount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partyassociatedwithaccount</em>' reference.
	 * @see #setPartyassociatedwithaccount(Party)
	 * @see finance.FinancePackage#getAccount_Partyassociatedwithaccount()
	 * @model required="true"
	 * @generated
	 */
	Party getPartyassociatedwithaccount();

	/**
	 * Sets the value of the '{@link finance.Account#getPartyassociatedwithaccount <em>Partyassociatedwithaccount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partyassociatedwithaccount</em>' reference.
	 * @see #getPartyassociatedwithaccount()
	 * @generated
	 */
	void setPartyassociatedwithaccount(Party value);

	/**
	 * Returns the value of the '<em><b>Institution With Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Institution With Account</em>' reference.
	 * @see #setInstitutionWithAccount(FinancialEntity)
	 * @see finance.FinancePackage#getAccount_InstitutionWithAccount()
	 * @model required="true"
	 * @generated
	 */
	FinancialEntity getInstitutionWithAccount();

	/**
	 * Sets the value of the '{@link finance.Account#getInstitutionWithAccount <em>Institution With Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution With Account</em>' reference.
	 * @see #getInstitutionWithAccount()
	 * @generated
	 */
	void setInstitutionWithAccount(FinancialEntity value);

} // Account
