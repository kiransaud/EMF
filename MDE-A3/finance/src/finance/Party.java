/**
 */
package finance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link finance.Party#getParty_ID <em>Party ID</em>}</li>
 *   <li>{@link finance.Party#getPartyname <em>Partyname</em>}</li>
 *   <li>{@link finance.Party#getPartytype <em>Partytype</em>}</li>
 * </ul>
 *
 * @see finance.FinancePackage#getParty()
 * @model
 * @generated
 */
public interface Party extends EObject {
	/**
	 * Returns the value of the '<em><b>Party ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party ID</em>' attribute.
	 * @see #setParty_ID(int)
	 * @see finance.FinancePackage#getParty_Party_ID()
	 * @model
	 * @generated
	 */
	int getParty_ID();

	/**
	 * Sets the value of the '{@link finance.Party#getParty_ID <em>Party ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party ID</em>' attribute.
	 * @see #getParty_ID()
	 * @generated
	 */
	void setParty_ID(int value);

	/**
	 * Returns the value of the '<em><b>Partyname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partyname</em>' attribute.
	 * @see #setPartyname(String)
	 * @see finance.FinancePackage#getParty_Partyname()
	 * @model
	 * @generated
	 */
	String getPartyname();

	/**
	 * Sets the value of the '{@link finance.Party#getPartyname <em>Partyname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partyname</em>' attribute.
	 * @see #getPartyname()
	 * @generated
	 */
	void setPartyname(String value);

	/**
	 * Returns the value of the '<em><b>Partytype</b></em>' attribute.
	 * The literals are from the enumeration {@link finance.PartyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partytype</em>' attribute.
	 * @see finance.PartyType
	 * @see #setPartytype(PartyType)
	 * @see finance.FinancePackage#getParty_Partytype()
	 * @model
	 * @generated
	 */
	PartyType getPartytype();

	/**
	 * Sets the value of the '{@link finance.Party#getPartytype <em>Partytype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partytype</em>' attribute.
	 * @see finance.PartyType
	 * @see #getPartytype()
	 * @generated
	 */
	void setPartytype(PartyType value);

} // Party
