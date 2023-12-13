/**
 */
package finance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link finance.Regulation#getRegulation_ID <em>Regulation ID</em>}</li>
 *   <li>{@link finance.Regulation#getRegulationName <em>Regulation Name</em>}</li>
 *   <li>{@link finance.Regulation#getRegulationDescription <em>Regulation Description</em>}</li>
 * </ul>
 *
 * @see finance.FinancePackage#getRegulation()
 * @model
 * @generated
 */
public interface Regulation extends RegulatoryEntity {
	/**
	 * Returns the value of the '<em><b>Regulation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulation ID</em>' attribute.
	 * @see #setRegulation_ID(int)
	 * @see finance.FinancePackage#getRegulation_Regulation_ID()
	 * @model
	 * @generated
	 */
	int getRegulation_ID();

	/**
	 * Sets the value of the '{@link finance.Regulation#getRegulation_ID <em>Regulation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulation ID</em>' attribute.
	 * @see #getRegulation_ID()
	 * @generated
	 */
	void setRegulation_ID(int value);

	/**
	 * Returns the value of the '<em><b>Regulation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulation Name</em>' attribute.
	 * @see #setRegulationName(String)
	 * @see finance.FinancePackage#getRegulation_RegulationName()
	 * @model
	 * @generated
	 */
	String getRegulationName();

	/**
	 * Sets the value of the '{@link finance.Regulation#getRegulationName <em>Regulation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulation Name</em>' attribute.
	 * @see #getRegulationName()
	 * @generated
	 */
	void setRegulationName(String value);

	/**
	 * Returns the value of the '<em><b>Regulation Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulation Description</em>' attribute.
	 * @see #setRegulationDescription(String)
	 * @see finance.FinancePackage#getRegulation_RegulationDescription()
	 * @model
	 * @generated
	 */
	String getRegulationDescription();

	/**
	 * Sets the value of the '{@link finance.Regulation#getRegulationDescription <em>Regulation Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulation Description</em>' attribute.
	 * @see #getRegulationDescription()
	 * @generated
	 */
	void setRegulationDescription(String value);

} // Regulation
