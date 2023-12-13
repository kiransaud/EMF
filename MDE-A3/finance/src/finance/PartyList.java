/**
 */
package finance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link finance.PartyList#getParties <em>Parties</em>}</li>
 *   <li>{@link finance.PartyList#getPartyListname <em>Party Listname</em>}</li>
 * </ul>
 *
 * @see finance.FinancePackage#getPartyList()
 * @model
 * @generated
 */
public interface PartyList extends EObject {
	/**
	 * Returns the value of the '<em><b>Parties</b></em>' containment reference list.
	 * The list contents are of type {@link finance.Party}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parties</em>' containment reference list.
	 * @see finance.FinancePackage#getPartyList_Parties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Party> getParties();

	/**
	 * Returns the value of the '<em><b>Party Listname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Listname</em>' attribute.
	 * @see #setPartyListname(String)
	 * @see finance.FinancePackage#getPartyList_PartyListname()
	 * @model
	 * @generated
	 */
	String getPartyListname();

	/**
	 * Sets the value of the '{@link finance.PartyList#getPartyListname <em>Party Listname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Listname</em>' attribute.
	 * @see #getPartyListname()
	 * @generated
	 */
	void setPartyListname(String value);

} // PartyList
