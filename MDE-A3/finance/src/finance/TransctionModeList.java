/**
 */
package finance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transction Mode List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link finance.TransctionModeList#getModelist <em>Modelist</em>}</li>
 *   <li>{@link finance.TransctionModeList#getModelistname <em>Modelistname</em>}</li>
 * </ul>
 *
 * @see finance.FinancePackage#getTransctionModeList()
 * @model
 * @generated
 */
public interface TransctionModeList extends EObject {
	/**
	 * Returns the value of the '<em><b>Modelist</b></em>' containment reference list.
	 * The list contents are of type {@link finance.TransctionMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelist</em>' containment reference list.
	 * @see finance.FinancePackage#getTransctionModeList_Modelist()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransctionMode> getModelist();

	/**
	 * Returns the value of the '<em><b>Modelistname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelistname</em>' attribute.
	 * @see #setModelistname(String)
	 * @see finance.FinancePackage#getTransctionModeList_Modelistname()
	 * @model
	 * @generated
	 */
	String getModelistname();

	/**
	 * Sets the value of the '{@link finance.TransctionModeList#getModelistname <em>Modelistname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modelistname</em>' attribute.
	 * @see #getModelistname()
	 * @generated
	 */
	void setModelistname(String value);

} // TransctionModeList
