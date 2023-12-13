/**
 */
package finance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link finance.AccountType#getTypename <em>Typename</em>}</li>
 * </ul>
 *
 * @see finance.FinancePackage#getAccountType()
 * @model
 * @generated
 */
public interface AccountType extends EObject {
	/**
	 * Returns the value of the '<em><b>Typename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typename</em>' attribute.
	 * @see #setTypename(String)
	 * @see finance.FinancePackage#getAccountType_Typename()
	 * @model
	 * @generated
	 */
	String getTypename();

	/**
	 * Sets the value of the '{@link finance.AccountType#getTypename <em>Typename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typename</em>' attribute.
	 * @see #getTypename()
	 * @generated
	 */
	void setTypename(String value);

} // AccountType
