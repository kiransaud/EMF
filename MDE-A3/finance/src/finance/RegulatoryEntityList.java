/**
 */
package finance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regulatory Entity List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link finance.RegulatoryEntityList#getRegulatoryentities <em>Regulatoryentities</em>}</li>
 * </ul>
 *
 * @see finance.FinancePackage#getRegulatoryEntityList()
 * @model
 * @generated
 */
public interface RegulatoryEntityList extends EObject {
	/**
	 * Returns the value of the '<em><b>Regulatoryentities</b></em>' containment reference list.
	 * The list contents are of type {@link finance.RegulatoryEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulatoryentities</em>' containment reference list.
	 * @see finance.FinancePackage#getRegulatoryEntityList_Regulatoryentities()
	 * @model containment="true"
	 * @generated
	 */
	EList<RegulatoryEntity> getRegulatoryentities();

} // RegulatoryEntityList
