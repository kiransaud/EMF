/**
 */
package finance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Financial Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link finance.FinancialEntity#getFin_entityID <em>Fin entity ID</em>}</li>
 *   <li>{@link finance.FinancialEntity#getFin_entity_name <em>Fin entity name</em>}</li>
 *   <li>{@link finance.FinancialEntity#getFinancialentitytype <em>Financialentitytype</em>}</li>
 *   <li>{@link finance.FinancialEntity#getAddress <em>Address</em>}</li>
 *   <li>{@link finance.FinancialEntity#getContact <em>Contact</em>}</li>
 *   <li>{@link finance.FinancialEntity#getEmail <em>Email</em>}</li>
 *   <li>{@link finance.FinancialEntity#getRegulatoryentity <em>Regulatoryentity</em>}</li>
 * </ul>
 *
 * @see finance.FinancePackage#getFinancialEntity()
 * @model
 * @generated
 */
public interface FinancialEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Fin entity ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin entity ID</em>' attribute.
	 * @see #setFin_entityID(int)
	 * @see finance.FinancePackage#getFinancialEntity_Fin_entityID()
	 * @model
	 * @generated
	 */
	int getFin_entityID();

	/**
	 * Sets the value of the '{@link finance.FinancialEntity#getFin_entityID <em>Fin entity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin entity ID</em>' attribute.
	 * @see #getFin_entityID()
	 * @generated
	 */
	void setFin_entityID(int value);

	/**
	 * Returns the value of the '<em><b>Fin entity name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin entity name</em>' attribute.
	 * @see #setFin_entity_name(String)
	 * @see finance.FinancePackage#getFinancialEntity_Fin_entity_name()
	 * @model
	 * @generated
	 */
	String getFin_entity_name();

	/**
	 * Sets the value of the '{@link finance.FinancialEntity#getFin_entity_name <em>Fin entity name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin entity name</em>' attribute.
	 * @see #getFin_entity_name()
	 * @generated
	 */
	void setFin_entity_name(String value);

	/**
	 * Returns the value of the '<em><b>Financialentitytype</b></em>' attribute.
	 * The literals are from the enumeration {@link finance.FinancialEntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Financialentitytype</em>' attribute.
	 * @see finance.FinancialEntityType
	 * @see #setFinancialentitytype(FinancialEntityType)
	 * @see finance.FinancePackage#getFinancialEntity_Financialentitytype()
	 * @model
	 * @generated
	 */
	FinancialEntityType getFinancialentitytype();

	/**
	 * Sets the value of the '{@link finance.FinancialEntity#getFinancialentitytype <em>Financialentitytype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Financialentitytype</em>' attribute.
	 * @see finance.FinancialEntityType
	 * @see #getFinancialentitytype()
	 * @generated
	 */
	void setFinancialentitytype(FinancialEntityType value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see finance.FinancePackage#getFinancialEntity_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link finance.FinancialEntity#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' attribute.
	 * @see #setContact(int)
	 * @see finance.FinancePackage#getFinancialEntity_Contact()
	 * @model
	 * @generated
	 */
	int getContact();

	/**
	 * Sets the value of the '{@link finance.FinancialEntity#getContact <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' attribute.
	 * @see #getContact()
	 * @generated
	 */
	void setContact(int value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see finance.FinancePackage#getFinancialEntity_Email()
	 * @model dataType="finance.EEmail"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link finance.FinancialEntity#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Regulatoryentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulatoryentity</em>' reference.
	 * @see #setRegulatoryentity(RegulatoryEntity)
	 * @see finance.FinancePackage#getFinancialEntity_Regulatoryentity()
	 * @model required="true"
	 * @generated
	 */
	RegulatoryEntity getRegulatoryentity();

	/**
	 * Sets the value of the '{@link finance.FinancialEntity#getRegulatoryentity <em>Regulatoryentity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulatoryentity</em>' reference.
	 * @see #getRegulatoryentity()
	 * @generated
	 */
	void setRegulatoryentity(RegulatoryEntity value);

} // FinancialEntity
