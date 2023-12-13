/**
 */
package finance.impl;

import finance.Account;
import finance.AccountList;
import finance.AccountType;
import finance.Currency;
import finance.FinanceFactory;
import finance.FinancePackage;
import finance.FinancialEntity;
import finance.FinancialEntityList;
import finance.FinancialEntityType;
import finance.FinancialProduct;
import finance.FinancialProductType;
import finance.FinancialProductTypeList;
import finance.Party;
import finance.PartyList;
import finance.PartyType;
import finance.Regulation;
import finance.RegulatoryEntity;
import finance.RegulatoryEntityList;
import finance.RegulatoryEntitytype;
import finance.SpecificAttribute;
import finance.Transction;
import finance.TransctionList;
import finance.TransctionMode;
import finance.TransctionModeList;
import finance.TransctionType;
import finance.TransctionTypeList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FinancePackageImpl extends EPackageImpl implements FinancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass financialEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass financialEntityListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass financialProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass financialProductTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass financialProductTypeListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regulatoryEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regulatoryEntitytypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regulatoryEntityListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transctionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transctionModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transctionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transctionTypeListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transctionModeListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum currencyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum financialEntityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum partyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eEmailEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see finance.FinancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FinancePackageImpl() {
		super(eNS_URI, FinanceFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FinancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FinancePackage init() {
		if (isInited) return (FinancePackage)EPackage.Registry.INSTANCE.getEPackage(FinancePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFinancePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FinancePackageImpl theFinancePackage = registeredFinancePackage instanceof FinancePackageImpl ? (FinancePackageImpl)registeredFinancePackage : new FinancePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theFinancePackage.createPackageContents();

		// Initialize created meta-data
		theFinancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFinancePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FinancePackage.eNS_URI, theFinancePackage);
		return theFinancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccount() {
		return accountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccount_Account_id() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccount_Balance() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccount_Currency() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccount_Accounttype() {
		return (EReference)accountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccount_Partyassociatedwithaccount() {
		return (EReference)accountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccount_InstitutionWithAccount() {
		return (EReference)accountEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccountType() {
		return accountTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccountType_Typename() {
		return (EAttribute)accountTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccountList() {
		return accountListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccountList_Accountlist() {
		return (EReference)accountListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccountList_Litsname() {
		return (EAttribute)accountListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinancialEntity() {
		return financialEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinancialEntity_Fin_entityID() {
		return (EAttribute)financialEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinancialEntity_Fin_entity_name() {
		return (EAttribute)financialEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinancialEntity_Financialentitytype() {
		return (EAttribute)financialEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinancialEntity_Address() {
		return (EAttribute)financialEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinancialEntity_Contact() {
		return (EAttribute)financialEntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinancialEntity_Email() {
		return (EAttribute)financialEntityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinancialEntity_Regulatoryentity() {
		return (EReference)financialEntityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinancialEntityList() {
		return financialEntityListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinancialEntityList_Financialentitylist() {
		return (EReference)financialEntityListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinancialEntityList_Entitylistname() {
		return (EAttribute)financialEntityListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinancialProduct() {
		return financialProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinancialProduct_Product_id() {
		return (EAttribute)financialProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinancialProduct_Product_name() {
		return (EAttribute)financialProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinancialProduct_ServicesofferedBy() {
		return (EReference)financialProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinancialProductType() {
		return financialProductTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinancialProductType_Type() {
		return (EAttribute)financialProductTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinancialProductTypeList() {
		return financialProductTypeListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinancialProductTypeList_FPtypeList() {
		return (EReference)financialProductTypeListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinancialProductTypeList_Typelistname() {
		return (EAttribute)financialProductTypeListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParty() {
		return partyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_Party_ID() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_Partyname() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_Partytype() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyList() {
		return partyListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyList_Parties() {
		return (EReference)partyListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyList_PartyListname() {
		return (EAttribute)partyListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegulatoryEntity() {
		return regulatoryEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegulatoryEntity_RegulatoryID() {
		return (EAttribute)regulatoryEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegulatoryEntity_Regulatoryname() {
		return (EAttribute)regulatoryEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegulatoryEntitytype() {
		return regulatoryEntitytypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegulatoryEntitytype_Type() {
		return (EAttribute)regulatoryEntitytypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegulatoryEntityList() {
		return regulatoryEntityListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegulatoryEntityList_Regulatoryentities() {
		return (EReference)regulatoryEntityListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegulation() {
		return regulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegulation_Regulation_ID() {
		return (EAttribute)regulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegulation_RegulationName() {
		return (EAttribute)regulationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegulation_RegulationDescription() {
		return (EAttribute)regulationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecificAttribute() {
		return specificAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecificAttribute_Name() {
		return (EAttribute)specificAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecificAttribute_Value() {
		return (EAttribute)specificAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransction() {
		return transctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransction_TransctionID() {
		return (EAttribute)transctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransction_Amount() {
		return (EAttribute)transctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransction_Date() {
		return (EAttribute)transctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransction_Transctiontype() {
		return (EReference)transctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransction_Transctionmode() {
		return (EReference)transctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransctionType() {
		return transctionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransctionType_Type() {
		return (EAttribute)transctionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransctionMode() {
		return transctionModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransctionMode_Mode() {
		return (EAttribute)transctionModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransctionList() {
		return transctionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransctionList_Transctionlist() {
		return (EReference)transctionListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransctionList_Listname() {
		return (EAttribute)transctionListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransctionTypeList() {
		return transctionTypeListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransctionTypeList_Typelist() {
		return (EReference)transctionTypeListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransctionTypeList_Typelistname() {
		return (EAttribute)transctionTypeListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransctionModeList() {
		return transctionModeListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransctionModeList_Modelist() {
		return (EReference)transctionModeListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransctionModeList_Modelistname() {
		return (EAttribute)transctionModeListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCurrency() {
		return currencyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFinancialEntityType() {
		return financialEntityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPartyType() {
		return partyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEEmail() {
		return eEmailEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinanceFactory getFinanceFactory() {
		return (FinanceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		accountEClass = createEClass(ACCOUNT);
		createEAttribute(accountEClass, ACCOUNT__ACCOUNT_ID);
		createEAttribute(accountEClass, ACCOUNT__BALANCE);
		createEAttribute(accountEClass, ACCOUNT__CURRENCY);
		createEReference(accountEClass, ACCOUNT__ACCOUNTTYPE);
		createEReference(accountEClass, ACCOUNT__PARTYASSOCIATEDWITHACCOUNT);
		createEReference(accountEClass, ACCOUNT__INSTITUTION_WITH_ACCOUNT);

		accountTypeEClass = createEClass(ACCOUNT_TYPE);
		createEAttribute(accountTypeEClass, ACCOUNT_TYPE__TYPENAME);

		accountListEClass = createEClass(ACCOUNT_LIST);
		createEReference(accountListEClass, ACCOUNT_LIST__ACCOUNTLIST);
		createEAttribute(accountListEClass, ACCOUNT_LIST__LITSNAME);

		financialEntityEClass = createEClass(FINANCIAL_ENTITY);
		createEAttribute(financialEntityEClass, FINANCIAL_ENTITY__FIN_ENTITY_ID);
		createEAttribute(financialEntityEClass, FINANCIAL_ENTITY__FIN_ENTITY_NAME);
		createEAttribute(financialEntityEClass, FINANCIAL_ENTITY__FINANCIALENTITYTYPE);
		createEAttribute(financialEntityEClass, FINANCIAL_ENTITY__ADDRESS);
		createEAttribute(financialEntityEClass, FINANCIAL_ENTITY__CONTACT);
		createEAttribute(financialEntityEClass, FINANCIAL_ENTITY__EMAIL);
		createEReference(financialEntityEClass, FINANCIAL_ENTITY__REGULATORYENTITY);

		financialEntityListEClass = createEClass(FINANCIAL_ENTITY_LIST);
		createEReference(financialEntityListEClass, FINANCIAL_ENTITY_LIST__FINANCIALENTITYLIST);
		createEAttribute(financialEntityListEClass, FINANCIAL_ENTITY_LIST__ENTITYLISTNAME);

		financialProductEClass = createEClass(FINANCIAL_PRODUCT);
		createEAttribute(financialProductEClass, FINANCIAL_PRODUCT__PRODUCT_ID);
		createEAttribute(financialProductEClass, FINANCIAL_PRODUCT__PRODUCT_NAME);
		createEReference(financialProductEClass, FINANCIAL_PRODUCT__SERVICESOFFERED_BY);

		financialProductTypeEClass = createEClass(FINANCIAL_PRODUCT_TYPE);
		createEAttribute(financialProductTypeEClass, FINANCIAL_PRODUCT_TYPE__TYPE);

		financialProductTypeListEClass = createEClass(FINANCIAL_PRODUCT_TYPE_LIST);
		createEReference(financialProductTypeListEClass, FINANCIAL_PRODUCT_TYPE_LIST__FPTYPE_LIST);
		createEAttribute(financialProductTypeListEClass, FINANCIAL_PRODUCT_TYPE_LIST__TYPELISTNAME);

		partyEClass = createEClass(PARTY);
		createEAttribute(partyEClass, PARTY__PARTY_ID);
		createEAttribute(partyEClass, PARTY__PARTYNAME);
		createEAttribute(partyEClass, PARTY__PARTYTYPE);

		partyListEClass = createEClass(PARTY_LIST);
		createEReference(partyListEClass, PARTY_LIST__PARTIES);
		createEAttribute(partyListEClass, PARTY_LIST__PARTY_LISTNAME);

		regulatoryEntityEClass = createEClass(REGULATORY_ENTITY);
		createEAttribute(regulatoryEntityEClass, REGULATORY_ENTITY__REGULATORY_ID);
		createEAttribute(regulatoryEntityEClass, REGULATORY_ENTITY__REGULATORYNAME);

		regulatoryEntitytypeEClass = createEClass(REGULATORY_ENTITYTYPE);
		createEAttribute(regulatoryEntitytypeEClass, REGULATORY_ENTITYTYPE__TYPE);

		regulatoryEntityListEClass = createEClass(REGULATORY_ENTITY_LIST);
		createEReference(regulatoryEntityListEClass, REGULATORY_ENTITY_LIST__REGULATORYENTITIES);

		regulationEClass = createEClass(REGULATION);
		createEAttribute(regulationEClass, REGULATION__REGULATION_ID);
		createEAttribute(regulationEClass, REGULATION__REGULATION_NAME);
		createEAttribute(regulationEClass, REGULATION__REGULATION_DESCRIPTION);

		specificAttributeEClass = createEClass(SPECIFIC_ATTRIBUTE);
		createEAttribute(specificAttributeEClass, SPECIFIC_ATTRIBUTE__NAME);
		createEAttribute(specificAttributeEClass, SPECIFIC_ATTRIBUTE__VALUE);

		transctionEClass = createEClass(TRANSCTION);
		createEAttribute(transctionEClass, TRANSCTION__TRANSCTION_ID);
		createEAttribute(transctionEClass, TRANSCTION__AMOUNT);
		createEAttribute(transctionEClass, TRANSCTION__DATE);
		createEReference(transctionEClass, TRANSCTION__TRANSCTIONTYPE);
		createEReference(transctionEClass, TRANSCTION__TRANSCTIONMODE);

		transctionTypeEClass = createEClass(TRANSCTION_TYPE);
		createEAttribute(transctionTypeEClass, TRANSCTION_TYPE__TYPE);

		transctionModeEClass = createEClass(TRANSCTION_MODE);
		createEAttribute(transctionModeEClass, TRANSCTION_MODE__MODE);

		transctionListEClass = createEClass(TRANSCTION_LIST);
		createEReference(transctionListEClass, TRANSCTION_LIST__TRANSCTIONLIST);
		createEAttribute(transctionListEClass, TRANSCTION_LIST__LISTNAME);

		transctionTypeListEClass = createEClass(TRANSCTION_TYPE_LIST);
		createEReference(transctionTypeListEClass, TRANSCTION_TYPE_LIST__TYPELIST);
		createEAttribute(transctionTypeListEClass, TRANSCTION_TYPE_LIST__TYPELISTNAME);

		transctionModeListEClass = createEClass(TRANSCTION_MODE_LIST);
		createEReference(transctionModeListEClass, TRANSCTION_MODE_LIST__MODELIST);
		createEAttribute(transctionModeListEClass, TRANSCTION_MODE_LIST__MODELISTNAME);

		// Create enums
		currencyEEnum = createEEnum(CURRENCY);
		financialEntityTypeEEnum = createEEnum(FINANCIAL_ENTITY_TYPE);
		partyTypeEEnum = createEEnum(PARTY_TYPE);

		// Create data types
		eEmailEDataType = createEDataType(EEMAIL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		financialProductTypeEClass.getESuperTypes().add(this.getFinancialProduct());
		regulatoryEntitytypeEClass.getESuperTypes().add(this.getRegulatoryEntity());
		regulationEClass.getESuperTypes().add(this.getRegulatoryEntity());
		specificAttributeEClass.getESuperTypes().add(this.getAccount());
		specificAttributeEClass.getESuperTypes().add(this.getFinancialEntity());
		specificAttributeEClass.getESuperTypes().add(this.getFinancialProduct());
		specificAttributeEClass.getESuperTypes().add(this.getTransction());

		// Initialize classes, features, and operations; add parameters
		initEClass(accountEClass, Account.class, "Account", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccount_Account_id(), ecorePackage.getEInt(), "account_id", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccount_Balance(), ecorePackage.getEFloat(), "balance", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccount_Currency(), this.getCurrency(), "currency", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccount_Accounttype(), this.getAccountType(), null, "accounttype", null, 1, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccount_Partyassociatedwithaccount(), this.getParty(), null, "partyassociatedwithaccount", null, 1, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccount_InstitutionWithAccount(), this.getFinancialEntity(), null, "InstitutionWithAccount", null, 1, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accountTypeEClass, AccountType.class, "AccountType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccountType_Typename(), ecorePackage.getEString(), "typename", null, 0, 1, AccountType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accountListEClass, AccountList.class, "AccountList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccountList_Accountlist(), this.getAccount(), null, "accountlist", null, 0, -1, AccountList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccountList_Litsname(), ecorePackage.getEString(), "litsname", null, 0, 1, AccountList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(financialEntityEClass, FinancialEntity.class, "FinancialEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFinancialEntity_Fin_entityID(), ecorePackage.getEInt(), "fin_entityID", null, 0, 1, FinancialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinancialEntity_Fin_entity_name(), ecorePackage.getEString(), "fin_entity_name", null, 0, 1, FinancialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinancialEntity_Financialentitytype(), this.getFinancialEntityType(), "financialentitytype", null, 0, 1, FinancialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinancialEntity_Address(), ecorePackage.getEString(), "address", null, 0, 1, FinancialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinancialEntity_Contact(), ecorePackage.getEInt(), "contact", null, 0, 1, FinancialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinancialEntity_Email(), this.getEEmail(), "email", null, 0, 1, FinancialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinancialEntity_Regulatoryentity(), this.getRegulatoryEntity(), null, "regulatoryentity", null, 1, 1, FinancialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(financialEntityListEClass, FinancialEntityList.class, "FinancialEntityList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinancialEntityList_Financialentitylist(), this.getFinancialEntity(), null, "financialentitylist", null, 0, -1, FinancialEntityList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinancialEntityList_Entitylistname(), ecorePackage.getEString(), "entitylistname", null, 0, 1, FinancialEntityList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(financialProductEClass, FinancialProduct.class, "FinancialProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFinancialProduct_Product_id(), ecorePackage.getEInt(), "product_id", null, 0, 1, FinancialProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinancialProduct_Product_name(), ecorePackage.getEString(), "product_name", null, 0, 1, FinancialProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinancialProduct_ServicesofferedBy(), this.getFinancialEntity(), null, "servicesofferedBy", null, 1, 1, FinancialProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(financialProductTypeEClass, FinancialProductType.class, "FinancialProductType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFinancialProductType_Type(), ecorePackage.getEString(), "type", null, 0, 1, FinancialProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(financialProductTypeListEClass, FinancialProductTypeList.class, "FinancialProductTypeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinancialProductTypeList_FPtypeList(), this.getFinancialProductType(), null, "FPtypeList", null, 0, -1, FinancialProductTypeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinancialProductTypeList_Typelistname(), ecorePackage.getEString(), "typelistname", null, 0, 1, FinancialProductTypeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyEClass, Party.class, "Party", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParty_Party_ID(), ecorePackage.getEInt(), "party_ID", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_Partyname(), ecorePackage.getEString(), "partyname", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_Partytype(), this.getPartyType(), "partytype", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyListEClass, PartyList.class, "PartyList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyList_Parties(), this.getParty(), null, "parties", null, 0, -1, PartyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyList_PartyListname(), ecorePackage.getEString(), "partyListname", null, 0, 1, PartyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regulatoryEntityEClass, RegulatoryEntity.class, "RegulatoryEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegulatoryEntity_RegulatoryID(), ecorePackage.getEInt(), "regulatoryID", null, 0, 1, RegulatoryEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegulatoryEntity_Regulatoryname(), ecorePackage.getEString(), "regulatoryname", null, 0, 1, RegulatoryEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regulatoryEntitytypeEClass, RegulatoryEntitytype.class, "RegulatoryEntitytype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegulatoryEntitytype_Type(), ecorePackage.getEString(), "type", null, 0, 1, RegulatoryEntitytype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regulatoryEntityListEClass, RegulatoryEntityList.class, "RegulatoryEntityList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegulatoryEntityList_Regulatoryentities(), this.getRegulatoryEntity(), null, "regulatoryentities", null, 0, -1, RegulatoryEntityList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regulationEClass, Regulation.class, "Regulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegulation_Regulation_ID(), ecorePackage.getEInt(), "regulation_ID", null, 0, 1, Regulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegulation_RegulationName(), ecorePackage.getEString(), "RegulationName", null, 0, 1, Regulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegulation_RegulationDescription(), ecorePackage.getEString(), "RegulationDescription", null, 0, 1, Regulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificAttributeEClass, SpecificAttribute.class, "SpecificAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecificAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, SpecificAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecificAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, SpecificAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transctionEClass, Transction.class, "Transction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransction_TransctionID(), ecorePackage.getEInt(), "transctionID", null, 0, 1, Transction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransction_Amount(), ecorePackage.getEFloat(), "amount", null, 0, 1, Transction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransction_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Transction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransction_Transctiontype(), this.getTransctionType(), null, "transctiontype", null, 1, 1, Transction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransction_Transctionmode(), this.getTransctionMode(), null, "transctionmode", null, 1, 1, Transction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transctionTypeEClass, TransctionType.class, "TransctionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransctionType_Type(), ecorePackage.getEString(), "type", null, 0, 1, TransctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transctionModeEClass, TransctionMode.class, "TransctionMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransctionMode_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, TransctionMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transctionListEClass, TransctionList.class, "TransctionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransctionList_Transctionlist(), this.getTransction(), null, "transctionlist", null, 0, -1, TransctionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransctionList_Listname(), ecorePackage.getEString(), "listname", null, 0, 1, TransctionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transctionTypeListEClass, TransctionTypeList.class, "TransctionTypeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransctionTypeList_Typelist(), this.getTransctionType(), null, "typelist", null, 0, -1, TransctionTypeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransctionTypeList_Typelistname(), ecorePackage.getEString(), "typelistname", null, 0, 1, TransctionTypeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transctionModeListEClass, TransctionModeList.class, "TransctionModeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransctionModeList_Modelist(), this.getTransctionMode(), null, "modelist", null, 0, -1, TransctionModeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransctionModeList_Modelistname(), ecorePackage.getEString(), "modelistname", null, 0, 1, TransctionModeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(currencyEEnum, Currency.class, "Currency");
		addEEnumLiteral(currencyEEnum, Currency.EURO);
		addEEnumLiteral(currencyEEnum, Currency.YEN);
		addEEnumLiteral(currencyEEnum, Currency.GBP);
		addEEnumLiteral(currencyEEnum, Currency.USD3);

		initEEnum(financialEntityTypeEEnum, FinancialEntityType.class, "FinancialEntityType");
		addEEnumLiteral(financialEntityTypeEEnum, FinancialEntityType.BANK);
		addEEnumLiteral(financialEntityTypeEEnum, FinancialEntityType.INVESTFIRM);
		addEEnumLiteral(financialEntityTypeEEnum, FinancialEntityType.CREDITUNION);
		addEEnumLiteral(financialEntityTypeEEnum, FinancialEntityType.INSURANCE);
		addEEnumLiteral(financialEntityTypeEEnum, FinancialEntityType.COOPERATIVE);
		addEEnumLiteral(financialEntityTypeEEnum, FinancialEntityType.OTHERS);

		initEEnum(partyTypeEEnum, PartyType.class, "PartyType");
		addEEnumLiteral(partyTypeEEnum, PartyType.INDIVIDUAL);
		addEEnumLiteral(partyTypeEEnum, PartyType.ORGANIZATION);

		// Initialize data types
		initEDataType(eEmailEDataType, String.class, "EEmail", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //FinancePackageImpl
