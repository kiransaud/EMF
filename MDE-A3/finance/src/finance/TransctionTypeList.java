/**
 */
package finance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transction Type List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link finance.TransctionTypeList#getTypelist <em>Typelist</em>}</li>
 *   <li>{@link finance.TransctionTypeList#getTypelistname <em>Typelistname</em>}</li>
 * </ul>
 *
 * @see finance.FinancePackage#getTransctionTypeList()
 * @model
 * @generated
 */
public interface TransctionTypeList extends EObject {
	/**
	 * Returns the value of the '<em><b>Typelist</b></em>' containment reference list.
	 * The list contents are of type {@link finance.TransctionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typelist</em>' containment reference list.
	 * @see finance.FinancePackage#getTransctionTypeList_Typelist()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransctionType> getTypelist();

	/**
	 * Returns the value of the '<em><b>Typelistname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typelistname</em>' attribute.
	 * @see #setTypelistname(String)
	 * @see finance.FinancePackage#getTransctionTypeList_Typelistname()
	 * @model
	 * @generated
	 */
	String getTypelistname();

	/**
	 * Sets the value of the '{@link finance.TransctionTypeList#getTypelistname <em>Typelistname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typelistname</em>' attribute.
	 * @see #getTypelistname()
	 * @generated
	 */
	void setTypelistname(String value);

} // TransctionTypeList
