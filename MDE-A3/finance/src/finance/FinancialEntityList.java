/**
 */
package finance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Financial Entity List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link finance.FinancialEntityList#getFinancialentitylist <em>Financialentitylist</em>}</li>
 *   <li>{@link finance.FinancialEntityList#getEntitylistname <em>Entitylistname</em>}</li>
 * </ul>
 *
 * @see finance.FinancePackage#getFinancialEntityList()
 * @model
 * @generated
 */
public interface FinancialEntityList extends EObject {
	/**
	 * Returns the value of the '<em><b>Financialentitylist</b></em>' containment reference list.
	 * The list contents are of type {@link finance.FinancialEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Financialentitylist</em>' containment reference list.
	 * @see finance.FinancePackage#getFinancialEntityList_Financialentitylist()
	 * @model containment="true"
	 * @generated
	 */
	EList<FinancialEntity> getFinancialentitylist();

	/**
	 * Returns the value of the '<em><b>Entitylistname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entitylistname</em>' attribute.
	 * @see #setEntitylistname(String)
	 * @see finance.FinancePackage#getFinancialEntityList_Entitylistname()
	 * @model
	 * @generated
	 */
	String getEntitylistname();

	/**
	 * Sets the value of the '{@link finance.FinancialEntityList#getEntitylistname <em>Entitylistname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entitylistname</em>' attribute.
	 * @see #getEntitylistname()
	 * @generated
	 */
	void setEntitylistname(String value);

} // FinancialEntityList
