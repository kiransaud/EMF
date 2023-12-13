/**
 */
package finance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Financial Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link finance.FinancialProduct#getProduct_id <em>Product id</em>}</li>
 *   <li>{@link finance.FinancialProduct#getProduct_name <em>Product name</em>}</li>
 *   <li>{@link finance.FinancialProduct#getServicesofferedBy <em>Servicesoffered By</em>}</li>
 * </ul>
 *
 * @see finance.FinancePackage#getFinancialProduct()
 * @model
 * @generated
 */
public interface FinancialProduct extends EObject {
	/**
	 * Returns the value of the '<em><b>Product id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product id</em>' attribute.
	 * @see #setProduct_id(int)
	 * @see finance.FinancePackage#getFinancialProduct_Product_id()
	 * @model
	 * @generated
	 */
	int getProduct_id();

	/**
	 * Sets the value of the '{@link finance.FinancialProduct#getProduct_id <em>Product id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product id</em>' attribute.
	 * @see #getProduct_id()
	 * @generated
	 */
	void setProduct_id(int value);

	/**
	 * Returns the value of the '<em><b>Product name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product name</em>' attribute.
	 * @see #setProduct_name(String)
	 * @see finance.FinancePackage#getFinancialProduct_Product_name()
	 * @model
	 * @generated
	 */
	String getProduct_name();

	/**
	 * Sets the value of the '{@link finance.FinancialProduct#getProduct_name <em>Product name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product name</em>' attribute.
	 * @see #getProduct_name()
	 * @generated
	 */
	void setProduct_name(String value);

	/**
	 * Returns the value of the '<em><b>Servicesoffered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicesoffered By</em>' reference.
	 * @see #setServicesofferedBy(FinancialEntity)
	 * @see finance.FinancePackage#getFinancialProduct_ServicesofferedBy()
	 * @model required="true"
	 * @generated
	 */
	FinancialEntity getServicesofferedBy();

	/**
	 * Sets the value of the '{@link finance.FinancialProduct#getServicesofferedBy <em>Servicesoffered By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicesoffered By</em>' reference.
	 * @see #getServicesofferedBy()
	 * @generated
	 */
	void setServicesofferedBy(FinancialEntity value);

} // FinancialProduct
