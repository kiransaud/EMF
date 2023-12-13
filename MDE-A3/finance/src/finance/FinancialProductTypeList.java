/**
 */
package finance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Financial Product Type List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link finance.FinancialProductTypeList#getFPtypeList <em>FPtype List</em>}</li>
 *   <li>{@link finance.FinancialProductTypeList#getTypelistname <em>Typelistname</em>}</li>
 * </ul>
 *
 * @see finance.FinancePackage#getFinancialProductTypeList()
 * @model
 * @generated
 */
public interface FinancialProductTypeList extends EObject {
	/**
	 * Returns the value of the '<em><b>FPtype List</b></em>' containment reference list.
	 * The list contents are of type {@link finance.FinancialProductType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FPtype List</em>' containment reference list.
	 * @see finance.FinancePackage#getFinancialProductTypeList_FPtypeList()
	 * @model containment="true"
	 * @generated
	 */
	EList<FinancialProductType> getFPtypeList();

	/**
	 * Returns the value of the '<em><b>Typelistname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typelistname</em>' attribute.
	 * @see #setTypelistname(String)
	 * @see finance.FinancePackage#getFinancialProductTypeList_Typelistname()
	 * @model
	 * @generated
	 */
	String getTypelistname();

	/**
	 * Sets the value of the '{@link finance.FinancialProductTypeList#getTypelistname <em>Typelistname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typelistname</em>' attribute.
	 * @see #getTypelistname()
	 * @generated
	 */
	void setTypelistname(String value);

} // FinancialProductTypeList
