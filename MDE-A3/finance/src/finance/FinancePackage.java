/**
 */
package finance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see finance.FinanceFactory
 * @model kind="package"
 * @generated
 */
public interface FinancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "finance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/financialsystem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FinancePackage eINSTANCE = finance.impl.FinancePackageImpl.init();

	/**
	 * The meta object id for the '{@link finance.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.AccountImpl
	 * @see finance.impl.FinancePackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 0;

	/**
	 * The feature id for the '<em><b>Account id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__ACCOUNT_ID = 0;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__BALANCE = 1;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__CURRENCY = 2;

	/**
	 * The feature id for the '<em><b>Accounttype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__ACCOUNTTYPE = 3;

	/**
	 * The feature id for the '<em><b>Partyassociatedwithaccount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__PARTYASSOCIATEDWITHACCOUNT = 4;

	/**
	 * The feature id for the '<em><b>Institution With Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__INSTITUTION_WITH_ACCOUNT = 5;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finance.impl.AccountTypeImpl <em>Account Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.AccountTypeImpl
	 * @see finance.impl.FinancePackageImpl#getAccountType()
	 * @generated
	 */
	int ACCOUNT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Typename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_TYPE__TYPENAME = 0;

	/**
	 * The number of structural features of the '<em>Account Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Account Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finance.impl.AccountListImpl <em>Account List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.AccountListImpl
	 * @see finance.impl.FinancePackageImpl#getAccountList()
	 * @generated
	 */
	int ACCOUNT_LIST = 2;

	/**
	 * The feature id for the '<em><b>Accountlist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_LIST__ACCOUNTLIST = 0;

	/**
	 * The feature id for the '<em><b>Litsname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_LIST__LITSNAME = 1;

	/**
	 * The number of structural features of the '<em>Account List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Account List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finance.impl.FinancialEntityImpl <em>Financial Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.FinancialEntityImpl
	 * @see finance.impl.FinancePackageImpl#getFinancialEntity()
	 * @generated
	 */
	int FINANCIAL_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Fin entity ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_ENTITY__FIN_ENTITY_ID = 0;

	/**
	 * The feature id for the '<em><b>Fin entity name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_ENTITY__FIN_ENTITY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Financialentitytype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_ENTITY__FINANCIALENTITYTYPE = 2;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_ENTITY__ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_ENTITY__CONTACT = 4;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_ENTITY__EMAIL = 5;

	/**
	 * The feature id for the '<em><b>Regulatoryentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_ENTITY__REGULATORYENTITY = 6;

	/**
	 * The number of structural features of the '<em>Financial Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_ENTITY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Financial Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finance.impl.FinancialEntityListImpl <em>Financial Entity List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.FinancialEntityListImpl
	 * @see finance.impl.FinancePackageImpl#getFinancialEntityList()
	 * @generated
	 */
	int FINANCIAL_ENTITY_LIST = 4;

	/**
	 * The feature id for the '<em><b>Financialentitylist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_ENTITY_LIST__FINANCIALENTITYLIST = 0;

	/**
	 * The feature id for the '<em><b>Entitylistname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_ENTITY_LIST__ENTITYLISTNAME = 1;

	/**
	 * The number of structural features of the '<em>Financial Entity List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_ENTITY_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Financial Entity List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_ENTITY_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finance.impl.FinancialProductImpl <em>Financial Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.FinancialProductImpl
	 * @see finance.impl.FinancePackageImpl#getFinancialProduct()
	 * @generated
	 */
	int FINANCIAL_PRODUCT = 5;

	/**
	 * The feature id for the '<em><b>Product id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT__PRODUCT_ID = 0;

	/**
	 * The feature id for the '<em><b>Product name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT__PRODUCT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Servicesoffered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT__SERVICESOFFERED_BY = 2;

	/**
	 * The number of structural features of the '<em>Financial Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Financial Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finance.impl.FinancialProductTypeImpl <em>Financial Product Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.FinancialProductTypeImpl
	 * @see finance.impl.FinancePackageImpl#getFinancialProductType()
	 * @generated
	 */
	int FINANCIAL_PRODUCT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Product id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT_TYPE__PRODUCT_ID = FINANCIAL_PRODUCT__PRODUCT_ID;

	/**
	 * The feature id for the '<em><b>Product name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT_TYPE__PRODUCT_NAME = FINANCIAL_PRODUCT__PRODUCT_NAME;

	/**
	 * The feature id for the '<em><b>Servicesoffered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT_TYPE__SERVICESOFFERED_BY = FINANCIAL_PRODUCT__SERVICESOFFERED_BY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT_TYPE__TYPE = FINANCIAL_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Financial Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT_TYPE_FEATURE_COUNT = FINANCIAL_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Financial Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT_TYPE_OPERATION_COUNT = FINANCIAL_PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link finance.impl.FinancialProductTypeListImpl <em>Financial Product Type List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.FinancialProductTypeListImpl
	 * @see finance.impl.FinancePackageImpl#getFinancialProductTypeList()
	 * @generated
	 */
	int FINANCIAL_PRODUCT_TYPE_LIST = 7;

	/**
	 * The feature id for the '<em><b>FPtype List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT_TYPE_LIST__FPTYPE_LIST = 0;

	/**
	 * The feature id for the '<em><b>Typelistname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT_TYPE_LIST__TYPELISTNAME = 1;

	/**
	 * The number of structural features of the '<em>Financial Product Type List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT_TYPE_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Financial Product Type List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_PRODUCT_TYPE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finance.impl.PartyImpl <em>Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.PartyImpl
	 * @see finance.impl.FinancePackageImpl#getParty()
	 * @generated
	 */
	int PARTY = 8;

	/**
	 * The feature id for the '<em><b>Party ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_ID = 0;

	/**
	 * The feature id for the '<em><b>Partyname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTYNAME = 1;

	/**
	 * The feature id for the '<em><b>Partytype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTYTYPE = 2;

	/**
	 * The number of structural features of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finance.impl.PartyListImpl <em>Party List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.PartyListImpl
	 * @see finance.impl.FinancePackageImpl#getPartyList()
	 * @generated
	 */
	int PARTY_LIST = 9;

	/**
	 * The feature id for the '<em><b>Parties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_LIST__PARTIES = 0;

	/**
	 * The feature id for the '<em><b>Party Listname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_LIST__PARTY_LISTNAME = 1;

	/**
	 * The number of structural features of the '<em>Party List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Party List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finance.impl.RegulatoryEntityImpl <em>Regulatory Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.RegulatoryEntityImpl
	 * @see finance.impl.FinancePackageImpl#getRegulatoryEntity()
	 * @generated
	 */
	int REGULATORY_ENTITY = 10;

	/**
	 * The feature id for the '<em><b>Regulatory ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_ENTITY__REGULATORY_ID = 0;

	/**
	 * The feature id for the '<em><b>Regulatoryname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_ENTITY__REGULATORYNAME = 1;

	/**
	 * The number of structural features of the '<em>Regulatory Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Regulatory Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finance.impl.RegulatoryEntitytypeImpl <em>Regulatory Entitytype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.RegulatoryEntitytypeImpl
	 * @see finance.impl.FinancePackageImpl#getRegulatoryEntitytype()
	 * @generated
	 */
	int REGULATORY_ENTITYTYPE = 11;

	/**
	 * The feature id for the '<em><b>Regulatory ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_ENTITYTYPE__REGULATORY_ID = REGULATORY_ENTITY__REGULATORY_ID;

	/**
	 * The feature id for the '<em><b>Regulatoryname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_ENTITYTYPE__REGULATORYNAME = REGULATORY_ENTITY__REGULATORYNAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_ENTITYTYPE__TYPE = REGULATORY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regulatory Entitytype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_ENTITYTYPE_FEATURE_COUNT = REGULATORY_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Regulatory Entitytype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_ENTITYTYPE_OPERATION_COUNT = REGULATORY_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link finance.impl.RegulatoryEntityListImpl <em>Regulatory Entity List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.RegulatoryEntityListImpl
	 * @see finance.impl.FinancePackageImpl#getRegulatoryEntityList()
	 * @generated
	 */
	int REGULATORY_ENTITY_LIST = 12;

	/**
	 * The feature id for the '<em><b>Regulatoryentities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_ENTITY_LIST__REGULATORYENTITIES = 0;

	/**
	 * The number of structural features of the '<em>Regulatory Entity List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_ENTITY_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Regulatory Entity List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_ENTITY_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finance.impl.RegulationImpl <em>Regulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.RegulationImpl
	 * @see finance.impl.FinancePackageImpl#getRegulation()
	 * @generated
	 */
	int REGULATION = 13;

	/**
	 * The feature id for the '<em><b>Regulatory ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__REGULATORY_ID = REGULATORY_ENTITY__REGULATORY_ID;

	/**
	 * The feature id for the '<em><b>Regulatoryname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__REGULATORYNAME = REGULATORY_ENTITY__REGULATORYNAME;

	/**
	 * The feature id for the '<em><b>Regulation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__REGULATION_ID = REGULATORY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regulation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__REGULATION_NAME = REGULATORY_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Regulation Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__REGULATION_DESCRIPTION = REGULATORY_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Regulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_FEATURE_COUNT = REGULATORY_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Regulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_OPERATION_COUNT = REGULATORY_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link finance.impl.SpecificAttributeImpl <em>Specific Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.SpecificAttributeImpl
	 * @see finance.impl.FinancePackageImpl#getSpecificAttribute()
	 * @generated
	 */
	int SPECIFIC_ATTRIBUTE = 14;

	/**
	 * The feature id for the '<em><b>Account id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__ACCOUNT_ID = ACCOUNT__ACCOUNT_ID;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__BALANCE = ACCOUNT__BALANCE;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__CURRENCY = ACCOUNT__CURRENCY;

	/**
	 * The feature id for the '<em><b>Accounttype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__ACCOUNTTYPE = ACCOUNT__ACCOUNTTYPE;

	/**
	 * The feature id for the '<em><b>Partyassociatedwithaccount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__PARTYASSOCIATEDWITHACCOUNT = ACCOUNT__PARTYASSOCIATEDWITHACCOUNT;

	/**
	 * The feature id for the '<em><b>Institution With Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__INSTITUTION_WITH_ACCOUNT = ACCOUNT__INSTITUTION_WITH_ACCOUNT;

	/**
	 * The feature id for the '<em><b>Fin entity ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__FIN_ENTITY_ID = ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fin entity name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__FIN_ENTITY_NAME = ACCOUNT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Financialentitytype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__FINANCIALENTITYTYPE = ACCOUNT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__ADDRESS = ACCOUNT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__CONTACT = ACCOUNT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__EMAIL = ACCOUNT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Regulatoryentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__REGULATORYENTITY = ACCOUNT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Product id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__PRODUCT_ID = ACCOUNT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Product name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__PRODUCT_NAME = ACCOUNT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Servicesoffered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__SERVICESOFFERED_BY = ACCOUNT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Transction ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__TRANSCTION_ID = ACCOUNT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__AMOUNT = ACCOUNT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__DATE = ACCOUNT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Transctiontype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__TRANSCTIONTYPE = ACCOUNT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Transctionmode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__TRANSCTIONMODE = ACCOUNT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__NAME = ACCOUNT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE__VALUE = ACCOUNT_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Specific Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE_FEATURE_COUNT = ACCOUNT_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Specific Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE_OPERATION_COUNT = ACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link finance.impl.TransctionImpl <em>Transction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.TransctionImpl
	 * @see finance.impl.FinancePackageImpl#getTransction()
	 * @generated
	 */
	int TRANSCTION = 15;

	/**
	 * The feature id for the '<em><b>Transction ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION__TRANSCTION_ID = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION__AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION__DATE = 2;

	/**
	 * The feature id for the '<em><b>Transctiontype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION__TRANSCTIONTYPE = 3;

	/**
	 * The feature id for the '<em><b>Transctionmode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION__TRANSCTIONMODE = 4;

	/**
	 * The number of structural features of the '<em>Transction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finance.impl.TransctionTypeImpl <em>Transction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.TransctionTypeImpl
	 * @see finance.impl.FinancePackageImpl#getTransctionType()
	 * @generated
	 */
	int TRANSCTION_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION_TYPE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Transction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finance.impl.TransctionModeImpl <em>Transction Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.TransctionModeImpl
	 * @see finance.impl.FinancePackageImpl#getTransctionMode()
	 * @generated
	 */
	int TRANSCTION_MODE = 17;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION_MODE__MODE = 0;

	/**
	 * The number of structural features of the '<em>Transction Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION_MODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transction Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION_MODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finance.impl.TransctionListImpl <em>Transction List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.TransctionListImpl
	 * @see finance.impl.FinancePackageImpl#getTransctionList()
	 * @generated
	 */
	int TRANSCTION_LIST = 18;

	/**
	 * The feature id for the '<em><b>Transctionlist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION_LIST__TRANSCTIONLIST = 0;

	/**
	 * The feature id for the '<em><b>Listname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION_LIST__LISTNAME = 1;

	/**
	 * The number of structural features of the '<em>Transction List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transction List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finance.impl.TransctionTypeListImpl <em>Transction Type List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.TransctionTypeListImpl
	 * @see finance.impl.FinancePackageImpl#getTransctionTypeList()
	 * @generated
	 */
	int TRANSCTION_TYPE_LIST = 19;

	/**
	 * The feature id for the '<em><b>Typelist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION_TYPE_LIST__TYPELIST = 0;

	/**
	 * The feature id for the '<em><b>Typelistname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION_TYPE_LIST__TYPELISTNAME = 1;

	/**
	 * The number of structural features of the '<em>Transction Type List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION_TYPE_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transction Type List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION_TYPE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finance.impl.TransctionModeListImpl <em>Transction Mode List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.impl.TransctionModeListImpl
	 * @see finance.impl.FinancePackageImpl#getTransctionModeList()
	 * @generated
	 */
	int TRANSCTION_MODE_LIST = 20;

	/**
	 * The feature id for the '<em><b>Modelist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION_MODE_LIST__MODELIST = 0;

	/**
	 * The feature id for the '<em><b>Modelistname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION_MODE_LIST__MODELISTNAME = 1;

	/**
	 * The number of structural features of the '<em>Transction Mode List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION_MODE_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transction Mode List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCTION_MODE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finance.Currency <em>Currency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.Currency
	 * @see finance.impl.FinancePackageImpl#getCurrency()
	 * @generated
	 */
	int CURRENCY = 21;

	/**
	 * The meta object id for the '{@link finance.FinancialEntityType <em>Financial Entity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.FinancialEntityType
	 * @see finance.impl.FinancePackageImpl#getFinancialEntityType()
	 * @generated
	 */
	int FINANCIAL_ENTITY_TYPE = 22;

	/**
	 * The meta object id for the '{@link finance.PartyType <em>Party Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finance.PartyType
	 * @see finance.impl.FinancePackageImpl#getPartyType()
	 * @generated
	 */
	int PARTY_TYPE = 23;

	/**
	 * The meta object id for the '<em>EEmail</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see finance.impl.FinancePackageImpl#getEEmail()
	 * @generated
	 */
	int EEMAIL = 24;


	/**
	 * Returns the meta object for class '{@link finance.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see finance.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the attribute '{@link finance.Account#getAccount_id <em>Account id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account id</em>'.
	 * @see finance.Account#getAccount_id()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Account_id();

	/**
	 * Returns the meta object for the attribute '{@link finance.Account#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balance</em>'.
	 * @see finance.Account#getBalance()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Balance();

	/**
	 * Returns the meta object for the attribute '{@link finance.Account#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see finance.Account#getCurrency()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Currency();

	/**
	 * Returns the meta object for the containment reference '{@link finance.Account#getAccounttype <em>Accounttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accounttype</em>'.
	 * @see finance.Account#getAccounttype()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_Accounttype();

	/**
	 * Returns the meta object for the reference '{@link finance.Account#getPartyassociatedwithaccount <em>Partyassociatedwithaccount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partyassociatedwithaccount</em>'.
	 * @see finance.Account#getPartyassociatedwithaccount()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_Partyassociatedwithaccount();

	/**
	 * Returns the meta object for the reference '{@link finance.Account#getInstitutionWithAccount <em>Institution With Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Institution With Account</em>'.
	 * @see finance.Account#getInstitutionWithAccount()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_InstitutionWithAccount();

	/**
	 * Returns the meta object for class '{@link finance.AccountType <em>Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account Type</em>'.
	 * @see finance.AccountType
	 * @generated
	 */
	EClass getAccountType();

	/**
	 * Returns the meta object for the attribute '{@link finance.AccountType#getTypename <em>Typename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typename</em>'.
	 * @see finance.AccountType#getTypename()
	 * @see #getAccountType()
	 * @generated
	 */
	EAttribute getAccountType_Typename();

	/**
	 * Returns the meta object for class '{@link finance.AccountList <em>Account List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account List</em>'.
	 * @see finance.AccountList
	 * @generated
	 */
	EClass getAccountList();

	/**
	 * Returns the meta object for the containment reference list '{@link finance.AccountList#getAccountlist <em>Accountlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accountlist</em>'.
	 * @see finance.AccountList#getAccountlist()
	 * @see #getAccountList()
	 * @generated
	 */
	EReference getAccountList_Accountlist();

	/**
	 * Returns the meta object for the attribute '{@link finance.AccountList#getLitsname <em>Litsname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Litsname</em>'.
	 * @see finance.AccountList#getLitsname()
	 * @see #getAccountList()
	 * @generated
	 */
	EAttribute getAccountList_Litsname();

	/**
	 * Returns the meta object for class '{@link finance.FinancialEntity <em>Financial Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Financial Entity</em>'.
	 * @see finance.FinancialEntity
	 * @generated
	 */
	EClass getFinancialEntity();

	/**
	 * Returns the meta object for the attribute '{@link finance.FinancialEntity#getFin_entityID <em>Fin entity ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin entity ID</em>'.
	 * @see finance.FinancialEntity#getFin_entityID()
	 * @see #getFinancialEntity()
	 * @generated
	 */
	EAttribute getFinancialEntity_Fin_entityID();

	/**
	 * Returns the meta object for the attribute '{@link finance.FinancialEntity#getFin_entity_name <em>Fin entity name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin entity name</em>'.
	 * @see finance.FinancialEntity#getFin_entity_name()
	 * @see #getFinancialEntity()
	 * @generated
	 */
	EAttribute getFinancialEntity_Fin_entity_name();

	/**
	 * Returns the meta object for the attribute '{@link finance.FinancialEntity#getFinancialentitytype <em>Financialentitytype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Financialentitytype</em>'.
	 * @see finance.FinancialEntity#getFinancialentitytype()
	 * @see #getFinancialEntity()
	 * @generated
	 */
	EAttribute getFinancialEntity_Financialentitytype();

	/**
	 * Returns the meta object for the attribute '{@link finance.FinancialEntity#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see finance.FinancialEntity#getAddress()
	 * @see #getFinancialEntity()
	 * @generated
	 */
	EAttribute getFinancialEntity_Address();

	/**
	 * Returns the meta object for the attribute '{@link finance.FinancialEntity#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact</em>'.
	 * @see finance.FinancialEntity#getContact()
	 * @see #getFinancialEntity()
	 * @generated
	 */
	EAttribute getFinancialEntity_Contact();

	/**
	 * Returns the meta object for the attribute '{@link finance.FinancialEntity#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see finance.FinancialEntity#getEmail()
	 * @see #getFinancialEntity()
	 * @generated
	 */
	EAttribute getFinancialEntity_Email();

	/**
	 * Returns the meta object for the reference '{@link finance.FinancialEntity#getRegulatoryentity <em>Regulatoryentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regulatoryentity</em>'.
	 * @see finance.FinancialEntity#getRegulatoryentity()
	 * @see #getFinancialEntity()
	 * @generated
	 */
	EReference getFinancialEntity_Regulatoryentity();

	/**
	 * Returns the meta object for class '{@link finance.FinancialEntityList <em>Financial Entity List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Financial Entity List</em>'.
	 * @see finance.FinancialEntityList
	 * @generated
	 */
	EClass getFinancialEntityList();

	/**
	 * Returns the meta object for the containment reference list '{@link finance.FinancialEntityList#getFinancialentitylist <em>Financialentitylist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Financialentitylist</em>'.
	 * @see finance.FinancialEntityList#getFinancialentitylist()
	 * @see #getFinancialEntityList()
	 * @generated
	 */
	EReference getFinancialEntityList_Financialentitylist();

	/**
	 * Returns the meta object for the attribute '{@link finance.FinancialEntityList#getEntitylistname <em>Entitylistname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entitylistname</em>'.
	 * @see finance.FinancialEntityList#getEntitylistname()
	 * @see #getFinancialEntityList()
	 * @generated
	 */
	EAttribute getFinancialEntityList_Entitylistname();

	/**
	 * Returns the meta object for class '{@link finance.FinancialProduct <em>Financial Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Financial Product</em>'.
	 * @see finance.FinancialProduct
	 * @generated
	 */
	EClass getFinancialProduct();

	/**
	 * Returns the meta object for the attribute '{@link finance.FinancialProduct#getProduct_id <em>Product id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product id</em>'.
	 * @see finance.FinancialProduct#getProduct_id()
	 * @see #getFinancialProduct()
	 * @generated
	 */
	EAttribute getFinancialProduct_Product_id();

	/**
	 * Returns the meta object for the attribute '{@link finance.FinancialProduct#getProduct_name <em>Product name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product name</em>'.
	 * @see finance.FinancialProduct#getProduct_name()
	 * @see #getFinancialProduct()
	 * @generated
	 */
	EAttribute getFinancialProduct_Product_name();

	/**
	 * Returns the meta object for the reference '{@link finance.FinancialProduct#getServicesofferedBy <em>Servicesoffered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servicesoffered By</em>'.
	 * @see finance.FinancialProduct#getServicesofferedBy()
	 * @see #getFinancialProduct()
	 * @generated
	 */
	EReference getFinancialProduct_ServicesofferedBy();

	/**
	 * Returns the meta object for class '{@link finance.FinancialProductType <em>Financial Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Financial Product Type</em>'.
	 * @see finance.FinancialProductType
	 * @generated
	 */
	EClass getFinancialProductType();

	/**
	 * Returns the meta object for the attribute '{@link finance.FinancialProductType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see finance.FinancialProductType#getType()
	 * @see #getFinancialProductType()
	 * @generated
	 */
	EAttribute getFinancialProductType_Type();

	/**
	 * Returns the meta object for class '{@link finance.FinancialProductTypeList <em>Financial Product Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Financial Product Type List</em>'.
	 * @see finance.FinancialProductTypeList
	 * @generated
	 */
	EClass getFinancialProductTypeList();

	/**
	 * Returns the meta object for the containment reference list '{@link finance.FinancialProductTypeList#getFPtypeList <em>FPtype List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>FPtype List</em>'.
	 * @see finance.FinancialProductTypeList#getFPtypeList()
	 * @see #getFinancialProductTypeList()
	 * @generated
	 */
	EReference getFinancialProductTypeList_FPtypeList();

	/**
	 * Returns the meta object for the attribute '{@link finance.FinancialProductTypeList#getTypelistname <em>Typelistname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typelistname</em>'.
	 * @see finance.FinancialProductTypeList#getTypelistname()
	 * @see #getFinancialProductTypeList()
	 * @generated
	 */
	EAttribute getFinancialProductTypeList_Typelistname();

	/**
	 * Returns the meta object for class '{@link finance.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party</em>'.
	 * @see finance.Party
	 * @generated
	 */
	EClass getParty();

	/**
	 * Returns the meta object for the attribute '{@link finance.Party#getParty_ID <em>Party ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party ID</em>'.
	 * @see finance.Party#getParty_ID()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_Party_ID();

	/**
	 * Returns the meta object for the attribute '{@link finance.Party#getPartyname <em>Partyname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partyname</em>'.
	 * @see finance.Party#getPartyname()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_Partyname();

	/**
	 * Returns the meta object for the attribute '{@link finance.Party#getPartytype <em>Partytype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partytype</em>'.
	 * @see finance.Party#getPartytype()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_Partytype();

	/**
	 * Returns the meta object for class '{@link finance.PartyList <em>Party List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party List</em>'.
	 * @see finance.PartyList
	 * @generated
	 */
	EClass getPartyList();

	/**
	 * Returns the meta object for the containment reference list '{@link finance.PartyList#getParties <em>Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parties</em>'.
	 * @see finance.PartyList#getParties()
	 * @see #getPartyList()
	 * @generated
	 */
	EReference getPartyList_Parties();

	/**
	 * Returns the meta object for the attribute '{@link finance.PartyList#getPartyListname <em>Party Listname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Listname</em>'.
	 * @see finance.PartyList#getPartyListname()
	 * @see #getPartyList()
	 * @generated
	 */
	EAttribute getPartyList_PartyListname();

	/**
	 * Returns the meta object for class '{@link finance.RegulatoryEntity <em>Regulatory Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulatory Entity</em>'.
	 * @see finance.RegulatoryEntity
	 * @generated
	 */
	EClass getRegulatoryEntity();

	/**
	 * Returns the meta object for the attribute '{@link finance.RegulatoryEntity#getRegulatoryID <em>Regulatory ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regulatory ID</em>'.
	 * @see finance.RegulatoryEntity#getRegulatoryID()
	 * @see #getRegulatoryEntity()
	 * @generated
	 */
	EAttribute getRegulatoryEntity_RegulatoryID();

	/**
	 * Returns the meta object for the attribute '{@link finance.RegulatoryEntity#getRegulatoryname <em>Regulatoryname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regulatoryname</em>'.
	 * @see finance.RegulatoryEntity#getRegulatoryname()
	 * @see #getRegulatoryEntity()
	 * @generated
	 */
	EAttribute getRegulatoryEntity_Regulatoryname();

	/**
	 * Returns the meta object for class '{@link finance.RegulatoryEntitytype <em>Regulatory Entitytype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulatory Entitytype</em>'.
	 * @see finance.RegulatoryEntitytype
	 * @generated
	 */
	EClass getRegulatoryEntitytype();

	/**
	 * Returns the meta object for the attribute '{@link finance.RegulatoryEntitytype#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see finance.RegulatoryEntitytype#getType()
	 * @see #getRegulatoryEntitytype()
	 * @generated
	 */
	EAttribute getRegulatoryEntitytype_Type();

	/**
	 * Returns the meta object for class '{@link finance.RegulatoryEntityList <em>Regulatory Entity List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulatory Entity List</em>'.
	 * @see finance.RegulatoryEntityList
	 * @generated
	 */
	EClass getRegulatoryEntityList();

	/**
	 * Returns the meta object for the containment reference list '{@link finance.RegulatoryEntityList#getRegulatoryentities <em>Regulatoryentities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regulatoryentities</em>'.
	 * @see finance.RegulatoryEntityList#getRegulatoryentities()
	 * @see #getRegulatoryEntityList()
	 * @generated
	 */
	EReference getRegulatoryEntityList_Regulatoryentities();

	/**
	 * Returns the meta object for class '{@link finance.Regulation <em>Regulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulation</em>'.
	 * @see finance.Regulation
	 * @generated
	 */
	EClass getRegulation();

	/**
	 * Returns the meta object for the attribute '{@link finance.Regulation#getRegulation_ID <em>Regulation ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regulation ID</em>'.
	 * @see finance.Regulation#getRegulation_ID()
	 * @see #getRegulation()
	 * @generated
	 */
	EAttribute getRegulation_Regulation_ID();

	/**
	 * Returns the meta object for the attribute '{@link finance.Regulation#getRegulationName <em>Regulation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regulation Name</em>'.
	 * @see finance.Regulation#getRegulationName()
	 * @see #getRegulation()
	 * @generated
	 */
	EAttribute getRegulation_RegulationName();

	/**
	 * Returns the meta object for the attribute '{@link finance.Regulation#getRegulationDescription <em>Regulation Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regulation Description</em>'.
	 * @see finance.Regulation#getRegulationDescription()
	 * @see #getRegulation()
	 * @generated
	 */
	EAttribute getRegulation_RegulationDescription();

	/**
	 * Returns the meta object for class '{@link finance.SpecificAttribute <em>Specific Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Attribute</em>'.
	 * @see finance.SpecificAttribute
	 * @generated
	 */
	EClass getSpecificAttribute();

	/**
	 * Returns the meta object for the attribute '{@link finance.SpecificAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see finance.SpecificAttribute#getName()
	 * @see #getSpecificAttribute()
	 * @generated
	 */
	EAttribute getSpecificAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link finance.SpecificAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see finance.SpecificAttribute#getValue()
	 * @see #getSpecificAttribute()
	 * @generated
	 */
	EAttribute getSpecificAttribute_Value();

	/**
	 * Returns the meta object for class '{@link finance.Transction <em>Transction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transction</em>'.
	 * @see finance.Transction
	 * @generated
	 */
	EClass getTransction();

	/**
	 * Returns the meta object for the attribute '{@link finance.Transction#getTransctionID <em>Transction ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transction ID</em>'.
	 * @see finance.Transction#getTransctionID()
	 * @see #getTransction()
	 * @generated
	 */
	EAttribute getTransction_TransctionID();

	/**
	 * Returns the meta object for the attribute '{@link finance.Transction#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see finance.Transction#getAmount()
	 * @see #getTransction()
	 * @generated
	 */
	EAttribute getTransction_Amount();

	/**
	 * Returns the meta object for the attribute '{@link finance.Transction#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see finance.Transction#getDate()
	 * @see #getTransction()
	 * @generated
	 */
	EAttribute getTransction_Date();

	/**
	 * Returns the meta object for the reference '{@link finance.Transction#getTransctiontype <em>Transctiontype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transctiontype</em>'.
	 * @see finance.Transction#getTransctiontype()
	 * @see #getTransction()
	 * @generated
	 */
	EReference getTransction_Transctiontype();

	/**
	 * Returns the meta object for the reference '{@link finance.Transction#getTransctionmode <em>Transctionmode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transctionmode</em>'.
	 * @see finance.Transction#getTransctionmode()
	 * @see #getTransction()
	 * @generated
	 */
	EReference getTransction_Transctionmode();

	/**
	 * Returns the meta object for class '{@link finance.TransctionType <em>Transction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transction Type</em>'.
	 * @see finance.TransctionType
	 * @generated
	 */
	EClass getTransctionType();

	/**
	 * Returns the meta object for the attribute '{@link finance.TransctionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see finance.TransctionType#getType()
	 * @see #getTransctionType()
	 * @generated
	 */
	EAttribute getTransctionType_Type();

	/**
	 * Returns the meta object for class '{@link finance.TransctionMode <em>Transction Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transction Mode</em>'.
	 * @see finance.TransctionMode
	 * @generated
	 */
	EClass getTransctionMode();

	/**
	 * Returns the meta object for the attribute '{@link finance.TransctionMode#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see finance.TransctionMode#getMode()
	 * @see #getTransctionMode()
	 * @generated
	 */
	EAttribute getTransctionMode_Mode();

	/**
	 * Returns the meta object for class '{@link finance.TransctionList <em>Transction List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transction List</em>'.
	 * @see finance.TransctionList
	 * @generated
	 */
	EClass getTransctionList();

	/**
	 * Returns the meta object for the containment reference list '{@link finance.TransctionList#getTransctionlist <em>Transctionlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transctionlist</em>'.
	 * @see finance.TransctionList#getTransctionlist()
	 * @see #getTransctionList()
	 * @generated
	 */
	EReference getTransctionList_Transctionlist();

	/**
	 * Returns the meta object for the attribute '{@link finance.TransctionList#getListname <em>Listname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listname</em>'.
	 * @see finance.TransctionList#getListname()
	 * @see #getTransctionList()
	 * @generated
	 */
	EAttribute getTransctionList_Listname();

	/**
	 * Returns the meta object for class '{@link finance.TransctionTypeList <em>Transction Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transction Type List</em>'.
	 * @see finance.TransctionTypeList
	 * @generated
	 */
	EClass getTransctionTypeList();

	/**
	 * Returns the meta object for the containment reference list '{@link finance.TransctionTypeList#getTypelist <em>Typelist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Typelist</em>'.
	 * @see finance.TransctionTypeList#getTypelist()
	 * @see #getTransctionTypeList()
	 * @generated
	 */
	EReference getTransctionTypeList_Typelist();

	/**
	 * Returns the meta object for the attribute '{@link finance.TransctionTypeList#getTypelistname <em>Typelistname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typelistname</em>'.
	 * @see finance.TransctionTypeList#getTypelistname()
	 * @see #getTransctionTypeList()
	 * @generated
	 */
	EAttribute getTransctionTypeList_Typelistname();

	/**
	 * Returns the meta object for class '{@link finance.TransctionModeList <em>Transction Mode List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transction Mode List</em>'.
	 * @see finance.TransctionModeList
	 * @generated
	 */
	EClass getTransctionModeList();

	/**
	 * Returns the meta object for the containment reference list '{@link finance.TransctionModeList#getModelist <em>Modelist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modelist</em>'.
	 * @see finance.TransctionModeList#getModelist()
	 * @see #getTransctionModeList()
	 * @generated
	 */
	EReference getTransctionModeList_Modelist();

	/**
	 * Returns the meta object for the attribute '{@link finance.TransctionModeList#getModelistname <em>Modelistname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modelistname</em>'.
	 * @see finance.TransctionModeList#getModelistname()
	 * @see #getTransctionModeList()
	 * @generated
	 */
	EAttribute getTransctionModeList_Modelistname();

	/**
	 * Returns the meta object for enum '{@link finance.Currency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Currency</em>'.
	 * @see finance.Currency
	 * @generated
	 */
	EEnum getCurrency();

	/**
	 * Returns the meta object for enum '{@link finance.FinancialEntityType <em>Financial Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Financial Entity Type</em>'.
	 * @see finance.FinancialEntityType
	 * @generated
	 */
	EEnum getFinancialEntityType();

	/**
	 * Returns the meta object for enum '{@link finance.PartyType <em>Party Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Party Type</em>'.
	 * @see finance.PartyType
	 * @generated
	 */
	EEnum getPartyType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>EEmail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EEmail</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getEEmail();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FinanceFactory getFinanceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link finance.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.AccountImpl
		 * @see finance.impl.FinancePackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>Account id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__ACCOUNT_ID = eINSTANCE.getAccount_Account_id();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__BALANCE = eINSTANCE.getAccount_Balance();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__CURRENCY = eINSTANCE.getAccount_Currency();

		/**
		 * The meta object literal for the '<em><b>Accounttype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__ACCOUNTTYPE = eINSTANCE.getAccount_Accounttype();

		/**
		 * The meta object literal for the '<em><b>Partyassociatedwithaccount</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__PARTYASSOCIATEDWITHACCOUNT = eINSTANCE.getAccount_Partyassociatedwithaccount();

		/**
		 * The meta object literal for the '<em><b>Institution With Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__INSTITUTION_WITH_ACCOUNT = eINSTANCE.getAccount_InstitutionWithAccount();

		/**
		 * The meta object literal for the '{@link finance.impl.AccountTypeImpl <em>Account Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.AccountTypeImpl
		 * @see finance.impl.FinancePackageImpl#getAccountType()
		 * @generated
		 */
		EClass ACCOUNT_TYPE = eINSTANCE.getAccountType();

		/**
		 * The meta object literal for the '<em><b>Typename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT_TYPE__TYPENAME = eINSTANCE.getAccountType_Typename();

		/**
		 * The meta object literal for the '{@link finance.impl.AccountListImpl <em>Account List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.AccountListImpl
		 * @see finance.impl.FinancePackageImpl#getAccountList()
		 * @generated
		 */
		EClass ACCOUNT_LIST = eINSTANCE.getAccountList();

		/**
		 * The meta object literal for the '<em><b>Accountlist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT_LIST__ACCOUNTLIST = eINSTANCE.getAccountList_Accountlist();

		/**
		 * The meta object literal for the '<em><b>Litsname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT_LIST__LITSNAME = eINSTANCE.getAccountList_Litsname();

		/**
		 * The meta object literal for the '{@link finance.impl.FinancialEntityImpl <em>Financial Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.FinancialEntityImpl
		 * @see finance.impl.FinancePackageImpl#getFinancialEntity()
		 * @generated
		 */
		EClass FINANCIAL_ENTITY = eINSTANCE.getFinancialEntity();

		/**
		 * The meta object literal for the '<em><b>Fin entity ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINANCIAL_ENTITY__FIN_ENTITY_ID = eINSTANCE.getFinancialEntity_Fin_entityID();

		/**
		 * The meta object literal for the '<em><b>Fin entity name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINANCIAL_ENTITY__FIN_ENTITY_NAME = eINSTANCE.getFinancialEntity_Fin_entity_name();

		/**
		 * The meta object literal for the '<em><b>Financialentitytype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINANCIAL_ENTITY__FINANCIALENTITYTYPE = eINSTANCE.getFinancialEntity_Financialentitytype();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINANCIAL_ENTITY__ADDRESS = eINSTANCE.getFinancialEntity_Address();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINANCIAL_ENTITY__CONTACT = eINSTANCE.getFinancialEntity_Contact();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINANCIAL_ENTITY__EMAIL = eINSTANCE.getFinancialEntity_Email();

		/**
		 * The meta object literal for the '<em><b>Regulatoryentity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINANCIAL_ENTITY__REGULATORYENTITY = eINSTANCE.getFinancialEntity_Regulatoryentity();

		/**
		 * The meta object literal for the '{@link finance.impl.FinancialEntityListImpl <em>Financial Entity List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.FinancialEntityListImpl
		 * @see finance.impl.FinancePackageImpl#getFinancialEntityList()
		 * @generated
		 */
		EClass FINANCIAL_ENTITY_LIST = eINSTANCE.getFinancialEntityList();

		/**
		 * The meta object literal for the '<em><b>Financialentitylist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINANCIAL_ENTITY_LIST__FINANCIALENTITYLIST = eINSTANCE.getFinancialEntityList_Financialentitylist();

		/**
		 * The meta object literal for the '<em><b>Entitylistname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINANCIAL_ENTITY_LIST__ENTITYLISTNAME = eINSTANCE.getFinancialEntityList_Entitylistname();

		/**
		 * The meta object literal for the '{@link finance.impl.FinancialProductImpl <em>Financial Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.FinancialProductImpl
		 * @see finance.impl.FinancePackageImpl#getFinancialProduct()
		 * @generated
		 */
		EClass FINANCIAL_PRODUCT = eINSTANCE.getFinancialProduct();

		/**
		 * The meta object literal for the '<em><b>Product id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINANCIAL_PRODUCT__PRODUCT_ID = eINSTANCE.getFinancialProduct_Product_id();

		/**
		 * The meta object literal for the '<em><b>Product name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINANCIAL_PRODUCT__PRODUCT_NAME = eINSTANCE.getFinancialProduct_Product_name();

		/**
		 * The meta object literal for the '<em><b>Servicesoffered By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINANCIAL_PRODUCT__SERVICESOFFERED_BY = eINSTANCE.getFinancialProduct_ServicesofferedBy();

		/**
		 * The meta object literal for the '{@link finance.impl.FinancialProductTypeImpl <em>Financial Product Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.FinancialProductTypeImpl
		 * @see finance.impl.FinancePackageImpl#getFinancialProductType()
		 * @generated
		 */
		EClass FINANCIAL_PRODUCT_TYPE = eINSTANCE.getFinancialProductType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINANCIAL_PRODUCT_TYPE__TYPE = eINSTANCE.getFinancialProductType_Type();

		/**
		 * The meta object literal for the '{@link finance.impl.FinancialProductTypeListImpl <em>Financial Product Type List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.FinancialProductTypeListImpl
		 * @see finance.impl.FinancePackageImpl#getFinancialProductTypeList()
		 * @generated
		 */
		EClass FINANCIAL_PRODUCT_TYPE_LIST = eINSTANCE.getFinancialProductTypeList();

		/**
		 * The meta object literal for the '<em><b>FPtype List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINANCIAL_PRODUCT_TYPE_LIST__FPTYPE_LIST = eINSTANCE.getFinancialProductTypeList_FPtypeList();

		/**
		 * The meta object literal for the '<em><b>Typelistname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINANCIAL_PRODUCT_TYPE_LIST__TYPELISTNAME = eINSTANCE.getFinancialProductTypeList_Typelistname();

		/**
		 * The meta object literal for the '{@link finance.impl.PartyImpl <em>Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.PartyImpl
		 * @see finance.impl.FinancePackageImpl#getParty()
		 * @generated
		 */
		EClass PARTY = eINSTANCE.getParty();

		/**
		 * The meta object literal for the '<em><b>Party ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__PARTY_ID = eINSTANCE.getParty_Party_ID();

		/**
		 * The meta object literal for the '<em><b>Partyname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__PARTYNAME = eINSTANCE.getParty_Partyname();

		/**
		 * The meta object literal for the '<em><b>Partytype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__PARTYTYPE = eINSTANCE.getParty_Partytype();

		/**
		 * The meta object literal for the '{@link finance.impl.PartyListImpl <em>Party List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.PartyListImpl
		 * @see finance.impl.FinancePackageImpl#getPartyList()
		 * @generated
		 */
		EClass PARTY_LIST = eINSTANCE.getPartyList();

		/**
		 * The meta object literal for the '<em><b>Parties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_LIST__PARTIES = eINSTANCE.getPartyList_Parties();

		/**
		 * The meta object literal for the '<em><b>Party Listname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_LIST__PARTY_LISTNAME = eINSTANCE.getPartyList_PartyListname();

		/**
		 * The meta object literal for the '{@link finance.impl.RegulatoryEntityImpl <em>Regulatory Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.RegulatoryEntityImpl
		 * @see finance.impl.FinancePackageImpl#getRegulatoryEntity()
		 * @generated
		 */
		EClass REGULATORY_ENTITY = eINSTANCE.getRegulatoryEntity();

		/**
		 * The meta object literal for the '<em><b>Regulatory ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATORY_ENTITY__REGULATORY_ID = eINSTANCE.getRegulatoryEntity_RegulatoryID();

		/**
		 * The meta object literal for the '<em><b>Regulatoryname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATORY_ENTITY__REGULATORYNAME = eINSTANCE.getRegulatoryEntity_Regulatoryname();

		/**
		 * The meta object literal for the '{@link finance.impl.RegulatoryEntitytypeImpl <em>Regulatory Entitytype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.RegulatoryEntitytypeImpl
		 * @see finance.impl.FinancePackageImpl#getRegulatoryEntitytype()
		 * @generated
		 */
		EClass REGULATORY_ENTITYTYPE = eINSTANCE.getRegulatoryEntitytype();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATORY_ENTITYTYPE__TYPE = eINSTANCE.getRegulatoryEntitytype_Type();

		/**
		 * The meta object literal for the '{@link finance.impl.RegulatoryEntityListImpl <em>Regulatory Entity List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.RegulatoryEntityListImpl
		 * @see finance.impl.FinancePackageImpl#getRegulatoryEntityList()
		 * @generated
		 */
		EClass REGULATORY_ENTITY_LIST = eINSTANCE.getRegulatoryEntityList();

		/**
		 * The meta object literal for the '<em><b>Regulatoryentities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULATORY_ENTITY_LIST__REGULATORYENTITIES = eINSTANCE.getRegulatoryEntityList_Regulatoryentities();

		/**
		 * The meta object literal for the '{@link finance.impl.RegulationImpl <em>Regulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.RegulationImpl
		 * @see finance.impl.FinancePackageImpl#getRegulation()
		 * @generated
		 */
		EClass REGULATION = eINSTANCE.getRegulation();

		/**
		 * The meta object literal for the '<em><b>Regulation ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATION__REGULATION_ID = eINSTANCE.getRegulation_Regulation_ID();

		/**
		 * The meta object literal for the '<em><b>Regulation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATION__REGULATION_NAME = eINSTANCE.getRegulation_RegulationName();

		/**
		 * The meta object literal for the '<em><b>Regulation Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATION__REGULATION_DESCRIPTION = eINSTANCE.getRegulation_RegulationDescription();

		/**
		 * The meta object literal for the '{@link finance.impl.SpecificAttributeImpl <em>Specific Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.SpecificAttributeImpl
		 * @see finance.impl.FinancePackageImpl#getSpecificAttribute()
		 * @generated
		 */
		EClass SPECIFIC_ATTRIBUTE = eINSTANCE.getSpecificAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFIC_ATTRIBUTE__NAME = eINSTANCE.getSpecificAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFIC_ATTRIBUTE__VALUE = eINSTANCE.getSpecificAttribute_Value();

		/**
		 * The meta object literal for the '{@link finance.impl.TransctionImpl <em>Transction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.TransctionImpl
		 * @see finance.impl.FinancePackageImpl#getTransction()
		 * @generated
		 */
		EClass TRANSCTION = eINSTANCE.getTransction();

		/**
		 * The meta object literal for the '<em><b>Transction ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSCTION__TRANSCTION_ID = eINSTANCE.getTransction_TransctionID();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSCTION__AMOUNT = eINSTANCE.getTransction_Amount();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSCTION__DATE = eINSTANCE.getTransction_Date();

		/**
		 * The meta object literal for the '<em><b>Transctiontype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSCTION__TRANSCTIONTYPE = eINSTANCE.getTransction_Transctiontype();

		/**
		 * The meta object literal for the '<em><b>Transctionmode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSCTION__TRANSCTIONMODE = eINSTANCE.getTransction_Transctionmode();

		/**
		 * The meta object literal for the '{@link finance.impl.TransctionTypeImpl <em>Transction Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.TransctionTypeImpl
		 * @see finance.impl.FinancePackageImpl#getTransctionType()
		 * @generated
		 */
		EClass TRANSCTION_TYPE = eINSTANCE.getTransctionType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSCTION_TYPE__TYPE = eINSTANCE.getTransctionType_Type();

		/**
		 * The meta object literal for the '{@link finance.impl.TransctionModeImpl <em>Transction Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.TransctionModeImpl
		 * @see finance.impl.FinancePackageImpl#getTransctionMode()
		 * @generated
		 */
		EClass TRANSCTION_MODE = eINSTANCE.getTransctionMode();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSCTION_MODE__MODE = eINSTANCE.getTransctionMode_Mode();

		/**
		 * The meta object literal for the '{@link finance.impl.TransctionListImpl <em>Transction List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.TransctionListImpl
		 * @see finance.impl.FinancePackageImpl#getTransctionList()
		 * @generated
		 */
		EClass TRANSCTION_LIST = eINSTANCE.getTransctionList();

		/**
		 * The meta object literal for the '<em><b>Transctionlist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSCTION_LIST__TRANSCTIONLIST = eINSTANCE.getTransctionList_Transctionlist();

		/**
		 * The meta object literal for the '<em><b>Listname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSCTION_LIST__LISTNAME = eINSTANCE.getTransctionList_Listname();

		/**
		 * The meta object literal for the '{@link finance.impl.TransctionTypeListImpl <em>Transction Type List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.TransctionTypeListImpl
		 * @see finance.impl.FinancePackageImpl#getTransctionTypeList()
		 * @generated
		 */
		EClass TRANSCTION_TYPE_LIST = eINSTANCE.getTransctionTypeList();

		/**
		 * The meta object literal for the '<em><b>Typelist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSCTION_TYPE_LIST__TYPELIST = eINSTANCE.getTransctionTypeList_Typelist();

		/**
		 * The meta object literal for the '<em><b>Typelistname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSCTION_TYPE_LIST__TYPELISTNAME = eINSTANCE.getTransctionTypeList_Typelistname();

		/**
		 * The meta object literal for the '{@link finance.impl.TransctionModeListImpl <em>Transction Mode List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.impl.TransctionModeListImpl
		 * @see finance.impl.FinancePackageImpl#getTransctionModeList()
		 * @generated
		 */
		EClass TRANSCTION_MODE_LIST = eINSTANCE.getTransctionModeList();

		/**
		 * The meta object literal for the '<em><b>Modelist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSCTION_MODE_LIST__MODELIST = eINSTANCE.getTransctionModeList_Modelist();

		/**
		 * The meta object literal for the '<em><b>Modelistname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSCTION_MODE_LIST__MODELISTNAME = eINSTANCE.getTransctionModeList_Modelistname();

		/**
		 * The meta object literal for the '{@link finance.Currency <em>Currency</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.Currency
		 * @see finance.impl.FinancePackageImpl#getCurrency()
		 * @generated
		 */
		EEnum CURRENCY = eINSTANCE.getCurrency();

		/**
		 * The meta object literal for the '{@link finance.FinancialEntityType <em>Financial Entity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.FinancialEntityType
		 * @see finance.impl.FinancePackageImpl#getFinancialEntityType()
		 * @generated
		 */
		EEnum FINANCIAL_ENTITY_TYPE = eINSTANCE.getFinancialEntityType();

		/**
		 * The meta object literal for the '{@link finance.PartyType <em>Party Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finance.PartyType
		 * @see finance.impl.FinancePackageImpl#getPartyType()
		 * @generated
		 */
		EEnum PARTY_TYPE = eINSTANCE.getPartyType();

		/**
		 * The meta object literal for the '<em>EEmail</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see finance.impl.FinancePackageImpl#getEEmail()
		 * @generated
		 */
		EDataType EEMAIL = eINSTANCE.getEEmail();

	}

} //FinancePackage
