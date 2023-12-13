/**
 */
package finance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regulatory Entitytype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link finance.RegulatoryEntitytype#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see finance.FinancePackage#getRegulatoryEntitytype()
 * @model
 * @generated
 */
public interface RegulatoryEntitytype extends RegulatoryEntity {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see finance.FinancePackage#getRegulatoryEntitytype_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link finance.RegulatoryEntitytype#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // RegulatoryEntitytype
