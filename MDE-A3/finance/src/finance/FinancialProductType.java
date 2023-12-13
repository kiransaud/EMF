/**
 */
package finance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Financial Product Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link finance.FinancialProductType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see finance.FinancePackage#getFinancialProductType()
 * @model
 * @generated
 */
public interface FinancialProductType extends FinancialProduct {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see finance.FinancePackage#getFinancialProductType_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link finance.FinancialProductType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // FinancialProductType
