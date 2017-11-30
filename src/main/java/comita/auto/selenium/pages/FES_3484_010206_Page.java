package comita.auto.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FES_3484_010206_Page extends FES_NFO_Page {

	public FES_3484_010206_Page(PageManager pages) {
		super(pages);		
	}
	
	public FES_3484_010206_Page ensurePageLoaded() {
	    super.ensurePageLoaded();
	    return this;
	}
	
	@FindBy(xpath = "(//span[@class='lefrMenuSpan'])[3]")
	WebElement infoAboutOperationTabLink;
	
	@FindBy(xpath = "(//span[.='Добавить'])[1]")
	WebElement addRecordButton;
	
	@FindBy(xpath = "(//span[.='Добавить'])[2]")
	WebElement addBaseOfOperationButton;
	
	@FindBy(xpath = "(//span[.='Добавить'])[3]")
	WebElement addInfoAboutParticipantButton;
	
	@FindBy(css = "input[ng-model='profile.number']")
	WebElement id;
	
	@FindBy(css = "div[ng-model='profile.type']")
	WebElement recordTypeFES;
	
	@FindBy(css = "div[ng-model='profile.signFinTerr']")
	WebElement signOperationFinancingOfTerrorizm;
	
	@FindBy(css = "input[ng-model='profile.dateOper']")
	WebElement dateOperation;

	@FindBy(css = "input[ng-model='profile.dateDetectOper']")
	WebElement dateDetectOperation;
	
	@FindBy(css = "div[ng-model='profile.code']")
	WebElement operationTypeCode;
	
	@FindBy(css = "div[ng-model='profile.dopCode']")
	WebElement operationTypeAddCode;
	
	@FindBy(css = "div[ng-model='profile.signCodeUnOper']")
	WebElement codeOfUnusualOperation;
	
	@FindBy(css = "div[ng-model='profile.codeVal']")
	WebElement currencyCode;
	
	@FindBy(css = "input[ng-model='profile.summOper']")
	WebElement sum;
	
	@FindBy(css = "input[ng-model='profile.summRub']")
	WebElement sumRUR;
	
	@FindBy(css = "div[ng-model='profile.codeDragMet']")
	WebElement codePreciousMetals;
	
	@FindBy(css = "textarea[ng-model='profile.purposePay']")
	WebElement purposePay;
	
	@FindBy(css = "div[ng-model='profile.codeSignOper']")
	WebElement signOperationCode;
	
	@FindBy(css = "div[ng-model='profile.codeTypeMoney']")
	WebElement signFeatureCashCode;	
	
	@FindBy(css = "textarea[ng-model='profile.charOper']")
	WebElement charOper;
	
	@FindBy(css = "textarea[ng-model='profile.comment']")
	WebElement additionalInfo;
	
	@FindBy(xpath = "//span[.='OK']")
	WebElement buttonOK;
	
	@FindBy(css = "tr.table-tr-attach")
	WebElement firstRecord;
	
	@FindBy(css = "div[ng-model='profile.codeDoc']")
	WebElement kindOfDocumentCode;
		
	@FindBy(css = "input[ng-model='profile.dateDoc']")
	WebElement dateOfDocument;
	
	@FindBy(css = "input[ng-model='profile.numberDoc']")
	WebElement numberOfDocument;
	
	@FindBy(css = "textarea[ng-model='profile.docInfo']")
	WebElement documentSummary;
	
	@FindBy(css = "div[ng-model='profile.status']")
	WebElement participantStatusCode;
	
	@FindBy(css = "div[ng-model='profile.code']")
	WebElement participantTypeCode;
	
	@FindBy(css = "div[ng-model='profile.type']")
	WebElement participantType;
	
	@FindBy(css = "input[ng-model='profile.sign']")
	WebElement residentSign;
	
	//юрлицо
	@FindBy(css = "input[ng-model='profile.legalPerson.name']")
	WebElement legalPersonName;
	//юрлицо
	@FindBy(css = "input[ng-model='profile.legalPerson.inn']")
	WebElement legalPersonINN;
	//юрлицо
	@FindBy(css = "input[ng-model='profile.legalPerson.kpp']")
	WebElement legalPersonKPP;
	//юрлицо
	@FindBy(css = "input[ng-model='profile.legalPerson.okpo']")
	WebElement legalPersonOKPO;
	//юрлицо
	@FindBy(css = "div[ng-model='profile.legalPerson.okved']")
	WebElement legalPersonOKVED;
	//юрлицо
	@FindBy(css = "input[ng-model='profile.legalPerson.ogrn']")
	WebElement legalPersonOGRN;
	//юрлицо
	@FindBy(css = "input[ng-model='profile.legalPerson.nameRegOrg']")
	WebElement legalPersonRegistrationAuthority;
	//юрлицо
	@FindBy(css = "input[ng-model='profile.legalPerson.dateReg']")
	WebElement legalPersonRegistrationDate;
	
	//физлицо, ип
	@FindBy(css = "input[ng-model='profile.privatePerson.fio.surName']")//xpath = "(//input[@id='infoPartFioSurName'])[2]")
	WebElement privatePersonSurname;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.fio.name']")
	WebElement privatePersonName;

	@FindBy(css = "input[ng-model='profile.privatePerson.fio.patName']")
	WebElement privatePersonPatronymic;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.inn']")
	WebElement privatePersonINN;

	@FindBy(css = "div[ng-model='profile.privatePerson.okved']")
	WebElement privatePersonOKVED;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.ogrn']")
	WebElement privatePersonOGRN;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.nameRegOrg']")
	WebElement privatePersonRegistrationAuthority;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.dateReg']")
	WebElement privatePersonRegistrationDate;
	
	@FindBy(css = "div[ng-model='profile.privatePerson.passport.vidDoc']")
	WebElement privatePersonIdentityDocType;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.passport.docCode']")
	WebElement privatePersonIdentityDocSerie;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.passport.docNumber']")
	WebElement privatePersonIdentityDocNumber;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.passport.issuanceDate']")
	WebElement privatePersonIdentityDocIssueDate;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.passport.issuer']")
	WebElement privatePersonIdentityDocIssuer;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.passport.codeSubDiv']")
	WebElement privatePersonIdentityDocCodeDivision;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.birthDate']")
	WebElement privatePersonIdentityDocBirthDate;
	
	@FindBy(css = "div[ng-model='profile.privatePerson.birthPlace.oksm']")
	WebElement privatePersonBirthCountryCode;
	
	@FindBy(css = "div[ng-model='profile.privatePerson.birthPlace.region']")
	WebElement privatePersonBirthSubjectCode;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.birthPlace.area']")
	WebElement privatePersonBirthArea;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.birthPlace.city']")
	WebElement privatePersonBirthCity;
	
	@FindBy(css = "div[ng-model='profile.privatePerson.oksm']")
	WebElement privatePersonBirthCountryCitizenshipCode;
	
	@FindBy(css = "div[ng-model='profile.privatePerson.publicFace']")
	WebElement privatePersonBirthPublicEntitiesSign;
	
	@FindBy(css = "div[ng-model='profile.privatePerson.address.oksm']")
	WebElement privatePersonAddressCountryCode;
	
	@FindBy(css = "div[ng-model='profile.privatePerson.address.region']")
	WebElement privatePersonAddressSubjectCode;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.address.area']")
	WebElement privatePersonAddressArea;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.address.city']")
	WebElement privatePersonAddressCity;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.address.street']")
	WebElement privatePersonAddressStreet;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.address.house']")
	WebElement privatePersonAddressHouse;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.address.corp']")
	WebElement privatePersonAddressCorp;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.address.apartment']")
	WebElement privatePersonAddressApartment;
	
	@FindBy(css = "input[ng-model='profile.infoKO.bik']")
	WebElement BIK;
	
	@FindBy(css = "input[ng-model='profile.infoKO.number']")
	WebElement bankAccountNumber;

	@FindBy(css = "input[ng-model='profile.infoKO.infoBank']")
	WebElement bankName;
	
	public FES_3484_010206_Page selectInfoAboutOperationTab() {
		clickElement(infoAboutOperationTabLink);
		return this;
	}
	
	public FES_3484_010206_Page addRecord(){
		clickElement(addRecordButton);
		return this;
	}
	
	public FES_3484_010206_Page addBaseOfOperation(){
		clickElement(addBaseOfOperationButton);
		return this;
	}
	
	public FES_3484_010206_Page addInfoAboutParticipant() throws InterruptedException{
		Thread.sleep(1000);
		clickElement(addInfoAboutParticipantButton);
		return this;
	}
	
	public FES_3484_010206_Page setID(String value) {
		String new_value =  id.getAttribute("value").substring(0, 18) + value + id.getAttribute("value").substring(27);
		setValue(id, new_value);
		return this;
	}
	
	public FES_3484_010206_Page selectRecordTypeFES(String value) {
		selectOption(recordTypeFES, value);
		return this;
	}
	
	public FES_3484_010206_Page selectSignOperationFinancingOfTerrorizm(String value) {
		selectOption(signOperationFinancingOfTerrorizm, value);
		return this;
	}
	
	public FES_3484_010206_Page setDateOperation(String value) {
		setValue(dateOperation, value);
		return this;
	}
	
	public FES_3484_010206_Page setDateDetectOperation(String value) {
		setValue(dateDetectOperation, value);
		return this;
	}
	
	public FES_3484_010206_Page selectOperationTypeCode(String value) {
		selectOptionFromLongList(operationTypeCode, value);
		return this;
	}
	
	public FES_3484_010206_Page selectOperationTypeAddCode(String value) {
		selectOptionFromLongList(operationTypeAddCode, value);
		return this;
	}
	
	public FES_3484_010206_Page selectCodeOfUnusualOperation(String value) {
		selectOptionFromLongList(codeOfUnusualOperation, value);
		return this;
	}
	
	public FES_3484_010206_Page selectCurrencyCode(String value) {
		selectOptionFromLongList(currencyCode, value);
		return this;
	}
	
	public FES_3484_010206_Page setSum(String value) {
		setValue(sum, value);
		return this;
	}
	
	public FES_3484_010206_Page setSumRUR(String value) {
		setValue(sumRUR, value);
		return this;
	}
	
	public FES_3484_010206_Page selectCodePreciousMetals(String value) {
		selectOptionFromLongList(codePreciousMetals, value);
		return this;
	}
	
	public FES_3484_010206_Page setPurposePay(String value) {
		setValue(purposePay, value);
		return this;
	}
	
	public FES_3484_010206_Page selectSignOperationCode(String value) {
		selectOption(signOperationCode, value);
		return this;
	}
	
	public FES_3484_010206_Page selectSignFeatureCashCode(String value) {
		if (signOperationCode.getText().contains("операции с денежными средствами")) {
			selectOption(signFeatureCashCode, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setCharOper(String value) {
		setValue(charOper, value);
		return this;
	}
	
	public FES_3484_010206_Page setAdditionalInfo(String value) {
		setValue(additionalInfo, value);		
		return this;
	}
	
	public FES_3484_010206_Page selectKindOfDocumentCode(String value) {
		selectOptionFromLongList(kindOfDocumentCode, value);
		return this;
	}
	
	public FES_3484_010206_Page setDateOfDocument(String value) {
		setValue(dateOfDocument, value);
		return this;
	}
	
	public FES_3484_010206_Page setNumberOfDocument(String value) {
		setValue(numberOfDocument, value);
		return this;
	}
	
	public FES_3484_010206_Page setDocumentSummary(String value) {
		setValue(documentSummary, value);
		return this;
	}
	
	public FES_3484_010206_Page selectParticipantStatusCode(String value) {
		selectOption(participantStatusCode, value);
		return this;
	}
	
	public FES_3484_010206_Page selectParticipantTypeCode(String value) {
		selectOptionFromLongList(participantTypeCode, value);
		return this;
	}
	
	public FES_3484_010206_Page selectParticipantType(String value) {
		selectOption(participantType, value);
		return this;
	}
	
	public FES_3484_010206_Page setResidentSign(String value) {
		if (value.equals("1")) {
			clickElement(residentSign);
		}
		return this;
	}
		
	public FES_3484_010206_Page setLegalPersonName(String value) {
		if (participantType.getText().contains("юридическое лицо")) {
			setValue(legalPersonName, value);
		}		
		return this;
	}
	
	public FES_3484_010206_Page setLegalPersonINN(String value) {
		if (participantType.getText().contains("юридическое лицо")) {
			setValue(legalPersonINN, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setLegalPersonKPP(String value) {
		if (participantType.getText().contains("юридическое лицо")) {
			setValue(legalPersonKPP, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setLegalPersonOKPO(String value) {
		if (participantType.getText().contains("юридическое лицо")) {
			setValue(legalPersonOKPO, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page selectLegalPersonOKVED(String value) {
		if (participantType.getText().contains("юридическое лицо")) {
			selectOptionFromLongList(legalPersonOKVED, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setLegalPersonOGRN(String value) {
		if (participantType.getText().contains("юридическое лицо")) {
			setValue(legalPersonOGRN, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setLegalPersonRegistrationAuthority(String value) {
		if (participantType.getText().contains("юридическое лицо")) {
			setValue(legalPersonRegistrationAuthority, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setLegalPersonRegistrationDate(String value) {
		if (participantType.getText().contains("юридическое лицо")) {
			setValue(legalPersonRegistrationDate, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonSurname(String value) throws InterruptedException {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonSurname, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonName(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonName, value);			
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonPatronymic(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonPatronymic, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonINN(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonINN, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page selectPrivatePersonOKVED(String value) {
		if (participantType.getText().contains("индивидуальный предприниматель")) {
			selectOptionFromLongList(privatePersonOKVED, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonOGRN(String value) {
		if (participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonOGRN, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonRegistrationAuthority(String value) {
		if (participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonRegistrationAuthority, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonRegistrationDate(String value) {
		if (participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonRegistrationDate, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page selectPrivatePersonIdentityDocType(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			selectOptionFromLongList(privatePersonIdentityDocType, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonIdentityDocSerie(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonIdentityDocSerie, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonIdentityDocNumber(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonIdentityDocNumber, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonIdentityDocIssueDate(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonIdentityDocIssueDate, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonIdentityDocIssuer(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonIdentityDocIssuer, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonIdentityDocCodeDivision(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonIdentityDocCodeDivision, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonIdentityDocBirthDate(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonIdentityDocBirthDate, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page selectPrivatePersonBirthCountryCode(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			selectOptionFromLongList(privatePersonBirthCountryCode, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page selectPrivatePersonBirthSubjectCode(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			selectOptionFromLongList(privatePersonBirthSubjectCode, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonBirthArea(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonBirthArea, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonBirthCity(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonBirthCity, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page selectPrivatePersonBirthCountryCitizenshipCode(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			selectOptionFromLongList(privatePersonBirthCountryCitizenshipCode, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page selectPrivatePersonBirthPublicEntitiesSign(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			selectOption(privatePersonBirthPublicEntitiesSign, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page selectPrivatePersonAddressCountryCode(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			selectOptionFromLongList(privatePersonAddressCountryCode, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page selectPrivatePersonAddressSubjectCode(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			selectOptionFromLongList(privatePersonAddressSubjectCode, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonAddressArea(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonAddressArea, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonAddressCity(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonAddressCity, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonAddressStreet(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonAddressStreet, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonAddressHouse(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonAddressHouse, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonAddressCorp(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonAddressCorp, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setPrivatePersonAddressApartment(String value) {
		if (participantType.getText().contains("физическое лицо") || participantType.getText().contains("индивидуальный предприниматель")) {
			setValue(privatePersonAddressApartment, value);
		}
		return this;
	}
	
	public FES_3484_010206_Page setBIK(String value) {
		setValue(BIK, value);		
		return this;
	}
	
	public FES_3484_010206_Page setBankAccountNumber(String value) {
		setValue(bankAccountNumber, value);		
		return this;
	}
	
	public FES_3484_010206_Page setBankName(String value) {
		setValue(bankName, value);		
		return this;
	}	
}