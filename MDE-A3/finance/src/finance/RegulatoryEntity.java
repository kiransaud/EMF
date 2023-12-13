/**
 */
package finance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regulatory Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link finance.RegulatoryEntity#getRegulatoryID <em>Regulatory ID</em>}</li>
 *   <li>{@link finance.RegulatoryEntity#getRegulatoryname <em>Regulatoryname</em>}</li>
 * </ul>
 *
 * @see finance.FinancePackage#getRegulatoryEntity()
 * @model
 * @generated
 */
public interface RegulatoryEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Regulatory ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulatory ID</em>' attribute.
	 * @see #setRegulatoryID(int)
	 * @see finance.FinancePackage#getRegulatoryEntity_RegulatoryID()
	 * @model
	 * @generated
	 */
	int getRegulatoryID();

	/**
	 * Sets the value of the '{@link finance.RegulatoryEntity#getRegulatoryID <em>Regulatory ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulatory ID</em>' attribute.
	 * @see #getRegulatoryID()
	 * @generated
	 */
	void setRegulatoryID(int value);

	/**
	 * Returns the value of the '<em><b>Regulatoryname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulatoryname</em>' attribute.
	 * @see #setRegulatoryname(String)
	 * @see finance.FinancePackage#getRegulatoryEntity_Regulatoryname()
	 * @model
	 * @generated
	 */
	String getRegulatoryname();

	/**
	 * Sets the value of the '{@link finance.RegulatoryEntity#getRegulatoryname <em>Regulatoryname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulatoryname</em>' attribute.
	 * @see #getRegulatoryname()
	 * @generated
	 */
	void setRegulatoryname(String value);

} // RegulatoryEntity
