/**
 */
package finance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transction List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link finance.TransctionList#getTransctionlist <em>Transctionlist</em>}</li>
 *   <li>{@link finance.TransctionList#getListname <em>Listname</em>}</li>
 * </ul>
 *
 * @see finance.FinancePackage#getTransctionList()
 * @model
 * @generated
 */
public interface TransctionList extends EObject {
	/**
	 * Returns the value of the '<em><b>Transctionlist</b></em>' containment reference list.
	 * The list contents are of type {@link finance.Transction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transctionlist</em>' containment reference list.
	 * @see finance.FinancePackage#getTransctionList_Transctionlist()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transction> getTransctionlist();

	/**
	 * Returns the value of the '<em><b>Listname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listname</em>' attribute.
	 * @see #setListname(String)
	 * @see finance.FinancePackage#getTransctionList_Listname()
	 * @model
	 * @generated
	 */
	String getListname();

	/**
	 * Sets the value of the '{@link finance.TransctionList#getListname <em>Listname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listname</em>' attribute.
	 * @see #getListname()
	 * @generated
	 */
	void setListname(String value);

} // TransctionList
