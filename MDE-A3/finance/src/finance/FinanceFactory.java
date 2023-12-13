/**
 */
package finance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see finance.FinancePackage
 * @generated
 */
public interface FinanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FinanceFactory eINSTANCE = finance.impl.FinanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account</em>'.
	 * @generated
	 */
	Account createAccount();

	/**
	 * Returns a new object of class '<em>Account Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account Type</em>'.
	 * @generated
	 */
	AccountType createAccountType();

	/**
	 * Returns a new object of class '<em>Account List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account List</em>'.
	 * @generated
	 */
	AccountList createAccountList();

	/**
	 * Returns a new object of class '<em>Financial Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Financial Entity</em>'.
	 * @generated
	 */
	FinancialEntity createFinancialEntity();

	/**
	 * Returns a new object of class '<em>Financial Entity List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Financial Entity List</em>'.
	 * @generated
	 */
	FinancialEntityList createFinancialEntityList();

	/**
	 * Returns a new object of class '<em>Financial Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Financial Product</em>'.
	 * @generated
	 */
	FinancialProduct createFinancialProduct();

	/**
	 * Returns a new object of class '<em>Financial Product Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Financial Product Type</em>'.
	 * @generated
	 */
	FinancialProductType createFinancialProductType();

	/**
	 * Returns a new object of class '<em>Financial Product Type List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Financial Product Type List</em>'.
	 * @generated
	 */
	FinancialProductTypeList createFinancialProductTypeList();

	/**
	 * Returns a new object of class '<em>Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Party</em>'.
	 * @generated
	 */
	Party createParty();

	/**
	 * Returns a new object of class '<em>Party List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Party List</em>'.
	 * @generated
	 */
	PartyList createPartyList();

	/**
	 * Returns a new object of class '<em>Regulatory Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regulatory Entity</em>'.
	 * @generated
	 */
	RegulatoryEntity createRegulatoryEntity();

	/**
	 * Returns a new object of class '<em>Regulatory Entitytype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regulatory Entitytype</em>'.
	 * @generated
	 */
	RegulatoryEntitytype createRegulatoryEntitytype();

	/**
	 * Returns a new object of class '<em>Regulatory Entity List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regulatory Entity List</em>'.
	 * @generated
	 */
	RegulatoryEntityList createRegulatoryEntityList();

	/**
	 * Returns a new object of class '<em>Regulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regulation</em>'.
	 * @generated
	 */
	Regulation createRegulation();

	/**
	 * Returns a new object of class '<em>Specific Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specific Attribute</em>'.
	 * @generated
	 */
	SpecificAttribute createSpecificAttribute();

	/**
	 * Returns a new object of class '<em>Transction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transction</em>'.
	 * @generated
	 */
	Transction createTransction();

	/**
	 * Returns a new object of class '<em>Transction Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transction Type</em>'.
	 * @generated
	 */
	TransctionType createTransctionType();

	/**
	 * Returns a new object of class '<em>Transction Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transction Mode</em>'.
	 * @generated
	 */
	TransctionMode createTransctionMode();

	/**
	 * Returns a new object of class '<em>Transction List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transction List</em>'.
	 * @generated
	 */
	TransctionList createTransctionList();

	/**
	 * Returns a new object of class '<em>Transction Type List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transction Type List</em>'.
	 * @generated
	 */
	TransctionTypeList createTransctionTypeList();

	/**
	 * Returns a new object of class '<em>Transction Mode List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transction Mode List</em>'.
	 * @generated
	 */
	TransctionModeList createTransctionModeList();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FinancePackage getFinancePackage();

} //FinanceFactory
