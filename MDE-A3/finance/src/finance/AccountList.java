/**
 */
package finance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link finance.AccountList#getAccountlist <em>Accountlist</em>}</li>
 *   <li>{@link finance.AccountList#getLitsname <em>Litsname</em>}</li>
 * </ul>
 *
 * @see finance.FinancePackage#getAccountList()
 * @model
 * @generated
 */
public interface AccountList extends EObject {
	/**
	 * Returns the value of the '<em><b>Accountlist</b></em>' containment reference list.
	 * The list contents are of type {@link finance.Account}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accountlist</em>' containment reference list.
	 * @see finance.FinancePackage#getAccountList_Accountlist()
	 * @model containment="true"
	 * @generated
	 */
	EList<Account> getAccountlist();

	/**
	 * Returns the value of the '<em><b>Litsname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Litsname</em>' attribute.
	 * @see #setLitsname(String)
	 * @see finance.FinancePackage#getAccountList_Litsname()
	 * @model
	 * @generated
	 */
	String getLitsname();

	/**
	 * Sets the value of the '{@link finance.AccountList#getLitsname <em>Litsname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Litsname</em>' attribute.
	 * @see #getLitsname()
	 * @generated
	 */
	void setLitsname(String value);

} // AccountList
