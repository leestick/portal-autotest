package comita.auto.selenium.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import comita.auto.selenium.model.FES_1FM_DOC;

public class FES_1FM_POSTRF_Page extends FES_NKO_Page {

	public FES_1FM_POSTRF_Page(PageManager pages) {
		super(pages);		
	}
	
	public FES_1FM_POSTRF_Page ensurePageLoaded() {
	    super.ensurePageLoaded();
	    return this;
	}
	
	@FindBy(xpath = "(//span[@class='lefrMenuSpan'])[3]")
	WebElement infoAboutOperationTabLink;
	
	@FindBy(xpath = "(//span[.='Добавить'])[1]")
	WebElement addRecordButton;
	
	@FindBy(xpath = "(//span[.='Добавить'])[2]")
	WebElement addReasonButton;
	
	@FindBy(xpath = "(//span[.='Добавить'])[3]")
	WebElement addInfoAboutParticipantButton;	
	
	@FindBy(xpath = "//span[.='OK']")
	WebElement okButton;
	
	@FindBy(css = "tr.table-tr-attach")
	WebElement firstRecord;
	
	@FindBy(css = "input[ng-model='profile.number']")
	WebElement id;
	
	@FindBy(css = "div[ng-model='profile.type']")
	WebElement recordTypeFES;

	@FindBy(css = "input[ng-model='profile.dateChange']")
	WebElement dateOfChange;

	@FindBy(css = "div[ng-model='profile.signFinTerr']")
	WebElement signFinancingOfTerrorizm;

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
	WebElement codeTypeMoney;

	@FindBy(css = "textarea[ng-model='profile.charOper']")
	WebElement charOperation;

	@FindBy(css = "textarea[ng-model='profile.comm']")
	WebElement additionalInfo;

	@FindBy(css = "div[ng-model='profile.codeDoc']")
	WebElement codeTypeDoc;

	@FindBy(css = "input[ng-model='profile.dateDoc']")
	WebElement dateDoc;

	@FindBy(css = "input[ng-model='profile.numberDoc']")
	WebElement numberDoc;
	
	@FindBy(css = "textarea[ng-model='profile.docInfo']")
	WebElement summaryDoc;

	@FindBy(css = "div[ng-model='profile.role']")
	WebElement roleOfParticipantCode;

	@FindBy(css = "div[ng-model='profile.code']")
	WebElement typeOfParticipantCode;

	@FindBy(css = "div[ng-model='profile.prId']")
	WebElement signOfCommunionToTerrorism;

	@FindBy(css = "div[ng-model='profile.codeOsn']")
	WebElement baseApplyingMeasuresCode;

	@FindBy(css = "input[ng-model='profile.codeULFL']")
	WebElement codeULFL;

	@FindBy(css = "div[ng-model='profile.type']")
	WebElement typeOfParticipant;

	@FindBy(css = "input[ng-model='profile.sign']")
	WebElement residentSign;

	@FindBy(css = "input[ng-model='profile.client']")
	WebElement clientSign;

	@FindBy(css = "input[ng-model='profile.legalPerson.name']")
	WebElement nameLP;
	
	@FindBy(css = "div[ng-model='profile.legalPerson.code']")
	WebElement typeCodeLP;

	@FindBy(css = "input[ng-model='profile.legalPerson.inn']")
	WebElement innLP;

	@FindBy(css = "input[ng-model='profile.legalPerson.kpp']")
	WebElement kppLP;

	@FindBy(css = "input[ng-model='profile.legalPerson.okpo']")
	WebElement okpoLP;
	
	@FindBy(css = "input[ng-model='profile.legalPerson.okved']")
	WebElement okvedLP;
	
	@FindBy(css = "input[ng-model='profile.legalPerson.codeOtr']")
	WebElement industryCodeLP;

	@FindBy(css = "input[ng-model='profile.legalPerson.ogrn']")
	WebElement ogrnLP;

	@FindBy(css = "input[ng-model='profile.legalPerson.nameRegOrg']")
	WebElement regOrgNameLP;

	@FindBy(css = "input[ng-model='profile.legalPerson.dateReg']")
	WebElement regDateLP;

	@FindBy(css = "div[ng-model='profile.legalPerson.urAddress.oksm']")
	WebElement urAddressCountryCodeLP;

	@FindBy(css = "div[ng-model='profile.legalPerson.urAddress.region']")
	WebElement urAddressSubjectCodeLP;

	@FindBy(css = "input[ng-model='profile.legalPerson.urAddress.area']")
	WebElement urAddressAreaLP;
	
	@FindBy(css = "input[ng-model='profile.legalPerson.urAddress.city']")
	WebElement urAddressCityLP;

	@FindBy(css = "input[ng-model='profile.legalPerson.urAddress.street']")
	WebElement urAddressStreetLP;

	@FindBy(css = "input[ng-model='profile.legalPerson.urAddress.house']")
	WebElement urAddressHouseLP;

	@FindBy(css = "input[ng-model='profile.legalPerson.urAddress.corp']")
	WebElement urAddressCorpLP;

	@FindBy(css = "input[ng-model='profile.legalPerson.urAddress.apartment']")
	WebElement urAddressApartmentLP;

	@FindBy(css = "div[ng-model='profile.legalPerson.regAddress.oksm']")
	WebElement regAddressCountryCodeLP;

	@FindBy(css = "div[ng-model='profile.legalPerson.regAddress.region']")
	WebElement regAddressSubjectCodeLP;

	@FindBy(css = "input[ng-model='profile.legalPerson.regAddress.area']")
	WebElement regAddressAreaLP;

	@FindBy(css = "input[ng-model='profile.legalPerson.regAddress.city']")
	WebElement regAddressCityLP;
	
	@FindBy(css = "input[ng-model='profile.legalPerson.regAddress.street']")
	WebElement regAddressStreetLP;

	@FindBy(css = "input[ng-model='profile.legalPerson.regAddress.house']")
	WebElement regAddressHouseLP;
	
	@FindBy(css = "input[ng-model='profile.legalPerson.regAddress.corp']")
	WebElement regAddressCorpLP;

	@FindBy(css = "input[ng-model='profile.legalPerson.regAddress.apartment']")
	WebElement regAddressApartmentLP;

	@FindBy(css = "input[ng-model='profile.legalPerson.regAddress.ipadd']")
	WebElement regAddressIPLP;

	@FindBy(css = "div[ng-model='profile.privatePerson.code']")
	WebElement codePP;

	@FindBy(css = "input[ng-model='profile.privatePerson.fio.surName']")
	WebElement surnamePP;

	@FindBy(css = "input[ng-model='profile.privatePerson.fio.name']")
	WebElement namePP;

	@FindBy(css = "input[ng-model='profile.privatePerson.fio.patName']")
	WebElement patronymicPP;

	@FindBy(css = "input[ng-model='profile.privatePerson.inn']")
	WebElement innPP;

	@FindBy(css = "div[ng-model='profile.privatePerson.otrCode']")
	WebElement industryCodePP;

	@FindBy(css = "div[ng-model='profile.privatePerson.passport.vidDoc']")
	WebElement identityDocTypePP;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.passport.docCode']")
	WebElement identityDocSeriePP;

	@FindBy(css = "input[ng-model='profile.privatePerson.passport.docNumber']")
	WebElement identityDocNumberPP;

	@FindBy(css = "input[ng-model='profile.privatePerson.passport.issuanceDate']")
	WebElement identityDocIssueDatePP;

	@FindBy(css = "input[ng-model='profile.privatePerson.passport.issuer']")
	WebElement identityDocIssuerPP;

	@FindBy(css = "input[ng-model='profile.privatePerson.passport.codeSubDiv']")
	WebElement identityDocCodeSubDivisionPP;

	@FindBy(css = "input[ng-model='profile.privatePerson.birthDate']")
	WebElement birthDatePP;

	@FindBy(css = "div[ng-model='profile.privatePerson.birthPlace.oksm']")
	WebElement birthPlaceCountryCodePP;

	@FindBy(css = "div[ng-model='profile.privatePerson.birthPlace.region']")
	WebElement birthPlaceSubjectCodePP;

	@FindBy(css = "input[ng-model='profile.privatePerson.birthPlace.area']")
	WebElement birthPlaceAreaPP;

	@FindBy(css = "input[ng-model='profile.privatePerson.birthPlace.city']")
	WebElement birthPlaceCityPP;

	@FindBy(css = "div[ng-model='profile.privatePerson.oksm']")
	WebElement birthPlaceCitizenshipCodePP;

	@FindBy(css = "div[ng-model='profile.privatePerson.publicFace']")
	WebElement publicFacesSignPP;
	
	@FindBy(css = "div[ng-model='profile.privatePerson.regAddress.oksm']")
	WebElement regAddressCountryCodePP;

	@FindBy(css = "div[ng-model='profile.privatePerson.regAddress.region']")
	WebElement regAddressSubjectCodePP;

	@FindBy(css = "input[ng-model='profile.privatePerson.regAddress.area']")
	WebElement regAddressAreaPP;

	@FindBy(css = "input[ng-model='profile.privatePerson.regAddress.city']")
	WebElement regAddressCityPP;

	@FindBy(css = "input[ng-model='profile.privatePerson.regAddress.street']")
	WebElement regAddressStreetPP;

	@FindBy(css = "input[ng-model='profile.privatePerson.regAddress.house']")
	WebElement regAddressHousePP;

	@FindBy(css = "input[ng-model='profile.privatePerson.regAddress.corp']")
	WebElement regAddressCorpPP;

	@FindBy(css = "input[ng-model='profile.privatePerson.regAddress.apartment']")
	WebElement regAddressApartmentPP;

	@FindBy(css = "input[ng-model='profile.privatePerson.regAddress.ipadd']")
	WebElement regAddressIPPP;

	@FindBy(css = "div[ng-model='profile.privatePerson.actualAddress.oksm']")
	WebElement actualAddressCountryCodePP;
	
	@FindBy(css = "div[ng-model='profile.privatePerson.actualAddress.region']")
	WebElement actualAddressSubjectCodePP;

	@FindBy(css = "input[ng-model='profile.privatePerson.actualAddress.area']")
	WebElement actualAddressAreaPP;

	@FindBy(css = "input[ng-model='profile.privatePerson.actualAddress.city']")
	WebElement actualAddressCityPP;

	@FindBy(css = "input[ng-model='profile.privatePerson.actualAddress.street']")
	WebElement actualAddressStreetPP;

	@FindBy(css = "input[ng-model='profile.privatePerson.actualAddress.house']")
	WebElement actualAddressHousePP;

	@FindBy(css = "input[ng-model='profile.privatePerson.actualAddress.corp']")
	WebElement actualAddressCorpPP;

	@FindBy(css = "input[ng-model='profile.privatePerson.actualAddress.apartment']")
	WebElement actualAddressApartmentPP;

	@FindBy(css = "input[ng-model='profile.privatePerson.actualAddress.ipadd']")
	WebElement actualAddressIPPP;

	@FindBy(css = "div[ng-model='profile.privatePerson.okved']")
	WebElement okvedPP;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.ogrn']")
	WebElement ogrnPP;

	@FindBy(css = "input[ng-model='profile.privatePerson.nameRegOrg']")
	WebElement regOrgNamePP;

	@FindBy(css = "input[ng-model='profile.privatePerson.dateReg']")
	WebElement regDatePP;

	@FindBy(css = "input[ng-model='profile.infoKo.bik']")
	WebElement bik;

	@FindBy(css = "input[ng-model='profile.infoKo.number']")
	WebElement bankAccountNumber;

	@FindBy(css = "input[ng-model='profile.infoKo.infoBank']")
	WebElement bankName;

	public FES_1FM_POSTRF_Page selectInfoAboutOperationTab() {
		clickElement(infoAboutOperationTabLink);
		return this;
	}
	
	public FES_1FM_POSTRF_Page addRecord() {
		clickElement(addRecordButton);
		return this;
	}
	
	public FES_1FM_POSTRF_Page addReason() {
		clickElement(addReasonButton);
		return this;
	}
	
	public FES_1FM_POSTRF_Page addInfoAboutParticipant() throws InterruptedException {
		Thread.sleep(2000);
		clickElement(addInfoAboutParticipantButton);
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectFirstRecord() {
		if (!firstRecord.getAttribute("style").contains("background-color")) {
			clickElement(firstRecord);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page clickOK() {
		clickElement(okButton);
		return this;
	}
	
	public FES_1FM_POSTRF_Page setID(String value) {
		setValue(id, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectRecordTypeFES(String value) {
		selectOption(recordTypeFES, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page setDateOfChange(String value) {
		if (!recordTypeFES.getText().contains("1")) {
			setValue(dateOfChange, value);
		}		
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectSignFinancingOfTerrorizm(String value) {
		selectOptionFromLongList(signFinancingOfTerrorizm, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page setDateOperation(String value) {
		setValue(dateOperation, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page setDateDetectOperation(String value) {
		setValue(dateDetectOperation, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectOperationTypeCode(String value) {
		selectOptionFromLongList(operationTypeCode, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectOperationTypeAddCode(String value) {
		selectOptionFromLongList(operationTypeAddCode, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectCodeOfUnusualOperation(String value) {
		selectOptionFromLongList(codeOfUnusualOperation, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectCurrencyCode(String value) {
		selectOptionFromLongList(currencyCode, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page setSum(String value) {
		setValue(sum, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page setSumRUR(String value) {
		setValue(sumRUR, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectCodePreciousMetals(String value) {
		selectOptionFromLongList(codePreciousMetals, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page setPurposePay(String value) {
		setValue(purposePay, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectSignOperationCode(String value) {
		selectOptionFromLongList(signOperationCode, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectCodeTypeMoney(String value) {
		if (signOperationCode.getText().contains("0")) {
			selectOptionFromLongList(codeTypeMoney, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setCharOperation(String value) {
		setValue(charOperation, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page setAdditionalInfo(String value) {
		setValue(additionalInfo, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectCodeTypeDoc(String value) {
		selectOptionFromLongList(codeTypeDoc, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page setDateDoc(String value) {
		setValue(dateDoc, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page setNumberDoc(String value) {
		setValue(numberDoc, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page setSummaryDoc(String value) {
		setValue(summaryDoc, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectRoleOfParticipantCode(String value) {
		selectOptionFromLongList(roleOfParticipantCode, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectTypeOfParticipantCode(String value) {
		selectOptionFromLongList(typeOfParticipantCode, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectSignOfCommunionToTerrorism(String value) {
		selectOption(signOfCommunionToTerrorism, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectBaseApplyingMeasuresCode(String value) {
		if (!signOfCommunionToTerrorism.getText().contains("0")) {
			selectOption(baseApplyingMeasuresCode, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setCodeULFL(String value) {
		if (!signOfCommunionToTerrorism.getText().contains("0")) {
			setValue(codeULFL, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectTypeOfParticipant(String value) {
		selectOption(typeOfParticipant, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page setResidentSign(String value) {
		if (value.equals("1")) {
			clickElement(residentSign);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setClientSign(String value) {
		if (value.equals("1")) {
			clickElement(clientSign);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setNameLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(nameLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectTypeCodeLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			selectOptionFromLongList(typeCodeLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setINNLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(innLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setKPPLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(kppLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setOKPOLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(okpoLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectOKVEDLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			try {
				if (okvedLP.isDisplayed()) {
					selectOptionFromLongList(okvedLP, value);
				}
			}
				catch (NoSuchElementException e) {}	
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectIndustryCodeLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			try {
				if (industryCodeLP.isDisplayed()) {
					selectOptionFromLongList(industryCodeLP, value);
				}
			}
				catch (NoSuchElementException e) {}	
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setOGRNLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(ogrnLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setRegOrgNameLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(regOrgNameLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setRegDateLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(regDateLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectUrAddressCountryCodeLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			selectOption(urAddressCountryCodeLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectUrAddressSubjectCodeLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			selectOption(urAddressSubjectCodeLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setUrAddressAreaLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(urAddressAreaLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setUrAddressCityLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(urAddressCityLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setUrAddressStreetLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(urAddressStreetLP, value);
		}
		return this;
	}	
	
	public FES_1FM_POSTRF_Page setUrAddressHouseLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(urAddressHouseLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setUrAddressCorpLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(urAddressCorpLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setUrAddressApartmentLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(urAddressApartmentLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectRegAddressCountryCodeLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			selectOption(regAddressCountryCodeLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectRegAddressSubjectCodeLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			selectOption(regAddressSubjectCodeLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setRegAddressAreaLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(regAddressAreaLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setRegAddressCityLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(regAddressCityLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setRegAddressStreetLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(regAddressStreetLP, value);
		}
		return this;
	}	
	
	public FES_1FM_POSTRF_Page setRegAddressHouseLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(regAddressHouseLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setRegAddressCorpLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(regAddressCorpLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setRegAddressApartmentLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(regAddressApartmentLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setRegAddressIPLP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			clearField(regAddressIPLP);
			setValue(regAddressIPLP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectCodePP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			selectOptionFromLongList(codePP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setSurnamePP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(surnamePP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setNamePP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(namePP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setPatronymicPP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(patronymicPP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setINNPP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(innPP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectIndustryCodePP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			selectOptionFromLongList(industryCodePP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectOKVEDPP(String value) {
		if (typeOfParticipant.getText().contains("для индивидуального предпринимателя")) {
			selectOptionFromLongList(okvedPP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setOGRNPP(String value) {
		if (typeOfParticipant.getText().contains("для индивидуального предпринимателя")) {
			setValue(ogrnPP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setRegOrgNamePP(String value) {
		if (typeOfParticipant.getText().contains("для индивидуального предпринимателя")) {
			setValue(regOrgNamePP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setRegDatePP(String value) {
		if (typeOfParticipant.getText().contains("для индивидуального предпринимателя")) {
			setValue(regDatePP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectIdentityDocTypePP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			selectOptionFromLongList(identityDocTypePP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setIdentityDocSeriePP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(identityDocSeriePP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setIdentityDocNumberPP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(identityDocNumberPP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setIdentityDocIssueDatePP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(identityDocIssueDatePP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setIdentityDocIssuerPP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(identityDocIssuerPP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setIdentityDocCodeSubDivisionPP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(identityDocCodeSubDivisionPP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setBirthDatePP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(birthDatePP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectBirthPlaceCountryCodePP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			selectOptionFromLongList(birthPlaceCountryCodePP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectBirthPlaceSubjectCodePP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			selectOptionFromLongList(birthPlaceSubjectCodePP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setBirthPlaceAreaPP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(birthPlaceAreaPP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setBirthPlaceCityPP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(birthPlaceCityPP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectBirthPlaceCitizenshipCodePP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			selectOptionFromLongList(birthPlaceCitizenshipCodePP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectPublicFacesSignPP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			selectOption(publicFacesSignPP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectRegAddressCountryCodePP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			selectOptionFromLongList(regAddressCountryCodePP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectRegAddressSubjectCodePP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			selectOptionFromLongList(regAddressSubjectCodePP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setRegAddressAreaPP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(regAddressAreaPP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setRegAddressCityPP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(regAddressCityPP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setRegAddressStreetPP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(regAddressStreetPP, value);
		}
		return this;
	}	
	
	public FES_1FM_POSTRF_Page setRegAddressHousePP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(regAddressHousePP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setRegAddressCorpPP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(regAddressCorpPP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setRegAddressApartmentPP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(regAddressApartmentPP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setRegAddressIPPP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			clearField(regAddressIPPP);
			setValue(regAddressIPPP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectActualAddressCountryCodePP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			selectOptionFromLongList(actualAddressCountryCodePP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page selectActualAddressSubjectCodePP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			selectOptionFromLongList(actualAddressSubjectCodePP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setActualAddressAreaPP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(actualAddressAreaPP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setActualAddressCityPP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(actualAddressCityPP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setActualAddressStreetPP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(actualAddressStreetPP, value);
		}
		return this;
	}	
	
	public FES_1FM_POSTRF_Page setActualAddressHousePP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(actualAddressHousePP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setActualAddressCorpPP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(actualAddressCorpPP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setActualAddressApartmentPP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(actualAddressApartmentPP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setActualAddressIPPP(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			clearField(actualAddressIPPP);
			setValue(actualAddressIPPP, value);
		}
		return this;
	}
	
	public FES_1FM_POSTRF_Page setBIK(String value) {
		setValue(bik, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page setBankAccountNumber(String value) {
		setValue(bankAccountNumber, value);
		return this;
	}
	
	public FES_1FM_POSTRF_Page setBankName(String value) {
		setValue(bankName, value);
		return this;
	}
	
	
	
	public void inputAllValues1FM(FES_1FM_DOC fes) throws InterruptedException {		
		pages.fes_nko_Page.ensurePageLoaded()
		    .setCorrespondentID(fes.getCorrespondentID())	
		    .selectTypeInfo(fes.getTypeInfo())
			.setDateOfFES(fes.getDateOfFES())
			.selectInfoAboutPersonType(fes.getInfoAboutPersonType())
			.setInfoAboutPersonSurname(fes.getInfoAboutPersonSurname())
			.setInfoAboutPersonName(fes.getInfoAboutPersonName())
			.setInfoAboutPersonPatronymic(fes.getInfoAboutPersonPatronymic())
			.setInfoAboutPersonINN(fes.getInfoAboutPersonINN())
			.setInfoAboutPersonLegalName(fes.getInfoAboutPersonLegalName())
			.setAuthorizedPosition(fes.getAuthorizedPosition())
			.setAuthorizedSurname(fes.getAuthorizedSurname())
			.setAuthorizedName(fes.getAuthorizedName())
			.setAuthorizedPatronymic(fes.getAuthorizedPatronymic())
			.setAuthorizedCodeAndPhone(fes.getAuthorizedCodeAndPhone())
			.setAuthorizedEmail(fes.getAuthorizedEmail())
			.selectinfoTabOfNKO()
			.selectRepresentativeTypeCode(fes.getNfoTypeCode())
			.selectRepresentativeType(fes.getNfoType())
			.setResidentSign(fes.getNfoResidentSign())
			.setNkoName(fes.getNfoName())
			.setNkoINN(fes.getNfoINN(), fes.getNfoINNIP())
			.setNkoKPP(fes.getNfoKPP())
			.setNkoOKPO(fes.getNfoOKPO())
			.selectNkoOKVED(fes.getNfoOKVED())
			.setNkoOGRN(fes.getNfoOGRN(), fes.getNfoOGRNIP())
			.selectIndustrySectorCode(fes.getNfoOKVED())
			.setNkoPersonSurname(fes.getNfoPersonSurname())
			.setNkoPersonName(fes.getNfoPersonName())
			.setNkoPersonPatronymic(fes.getNfoPersonPatronymic())
			.selectNkoIdentityDocType(fes.getNfoIdentityDocType())
			.setNkoIdentityDocSerie(fes.getNfoIdentityDocSerie())
			.setNkoIdentityDocNumber(fes.getNfoIdentityDocNumber())
			.setNkoIdentityDocIssueDate(fes.getNfoIdentityDocIssueDate())
			.setNkoIdentityDocIssuer(fes.getNfoIdentityDocIssuer())
			.setNkoIdentityDocCodeDivision(fes.getNfoIdentityDocCodeDivision())
			.setNkoIdentityDocBirthDate(fes.getNfoIdentityDocBirthDate())
			.selectNkoBirthCountryCode(fes.getNfoBirthCountryCode())
			.selectNkoBirthSubjectCode(fes.getNfoBirthSubjectCode())
			.setNkoBirthArea(fes.getNfoBirthArea())
			.setNkoBirthCity(fes.getNfoBirthCity())
			.selectNkoAddressCountryCode(fes.getNfoAddressCountryCode())
			.selectNkoAddressSubjectCode(fes.getNfoAddressSubjectCode())
			.setNkoAddressArea(fes.getNfoAddressArea())
			.setNkoAddressCity(fes.getNfoAddressCity())
			.setNkoAddressStreet(fes.getNfoAddressStreet())
			.setNkoAddressHouse(fes.getNfoAddressHouse())
			.setNkoAddressCorp(fes.getNfoAddressCorp())
			.setNkoAddressApartment(fes.getNfoAddressApartment())
			.setIPAddress(fes.getIpAddress());
		pages.fes_1fm_postrf_Page.ensurePageLoaded()
			.selectInfoAboutOperationTab()
			.addRecord()
			.selectRecordTypeFES(fes.getRecordTypeFES())
			.setDateOfChange(fes.getDateOfChange())
			.selectSignFinancingOfTerrorizm(fes.getSignFinancingOfTerrorizm())
			.setDateOperation(fes.getDateOperation())
			.setDateDetectOperation(fes.getDateDetectOperation())
			.selectOperationTypeCode(fes.getOperationTypeCode())
			.selectOperationTypeAddCode(fes.getOperationTypeAddCode())
			.selectCodeOfUnusualOperation(fes.getCodeOfUnusualOperation())
			.selectCurrencyCode(fes.getCurrencyCode())
			.setSum(fes.getSum())
			.setSumRUR(fes.getSumRUR())
			.selectCodePreciousMetals(fes.getCodePreciousMetals())
			.setPurposePay(fes.getPurposePay())
			.selectSignOperationCode(fes.getSignOperationCode())
			.selectCodeTypeMoney(fes.getCodeTypeMoney())
			.setCharOperation(fes.getCharOperation())
			.setAdditionalInfo(fes.getAdditionalInfo())
			.clickOK()
			.selectFirstRecord()
			.addReason()
			.selectCodeTypeDoc(fes.getCodeTypeDoc())
			.setDateDoc(fes.getDateDoc())
			.setNumberDoc(fes.getNumberDoc())
			.setSummaryDoc(fes.getSummaryDoc())
			.clickOK()
			.addInfoAboutParticipant()
			.selectRoleOfParticipantCode(fes.getRoleOfParticipantCode())
			.selectTypeOfParticipantCode(fes.getTypeOfParticipantCode())
			.selectSignOfCommunionToTerrorism(fes.getSignOfCommunionToTerrorism())
			.selectBaseApplyingMeasuresCode(fes.getBaseApplyingMeasuresCode())
			.setCodeULFL(fes.getCodeULFL())
			.selectTypeOfParticipant(fes.getTypeOfParticipant())
			.setResidentSign(fes.getResidentSign())
			.setClientSign(fes.getClientSign())
			.setNameLP(fes.getNameLP())
			.selectTypeCodeLP(fes.getTypeCodeLP())
			.setINNLP(fes.getInnLP())
			.setKPPLP(fes.getKppLP())
			.setOKPOLP(fes.getOkpoLP())
			.selectOKVEDLP(fes.getOkvedLP())
			.selectIndustryCodeLP(fes.getIndustryCodeLP())
			.setOGRNLP(fes.getOgrnLP())
			.setRegOrgNameLP(fes.getRegOrgNameLP())
			.setRegDateLP(fes.getRegDateLP())
			.selectUrAddressCountryCodeLP(fes.getUrAddressCountryCodeLP())
			.selectUrAddressSubjectCodeLP(fes.getUrAddressSubjectCodeLP())
			.setUrAddressAreaLP(fes.getUrAddressAreaLP())
			.setUrAddressCityLP(fes.getUrAddressCityLP())
			.setUrAddressStreetLP(fes.getUrAddressStreetLP())
			.setUrAddressHouseLP(fes.getUrAddressHouseLP())
			.setUrAddressCorpLP(fes.getUrAddressCorpLP())
			.setUrAddressApartmentLP(fes.getUrAddressApartmentLP())
			.selectRegAddressCountryCodeLP(fes.getRegAddressCountryCodeLP())
			.selectRegAddressSubjectCodeLP(fes.getRegAddressSubjectCodeLP())
			.setRegAddressAreaLP(fes.getRegAddressAreaLP())
			.setRegAddressCityLP(fes.getRegAddressCityLP())
			.setRegAddressStreetLP(fes.getRegAddressStreetLP())
			.setRegAddressHouseLP(fes.getRegAddressHouseLP())
			.setRegAddressCorpLP(fes.getRegAddressCorpLP())
			.setRegAddressApartmentLP(fes.getRegAddressApartmentLP())
			.setRegAddressIPLP(fes.getRegAddressIPLP())
			.selectCodePP(fes.getCodePP())
			.setSurnamePP(fes.getSurnamePP())
			.setNamePP(fes.getNamePP())
			.setPatronymicPP(fes.getPatronymicPP())
			.setINNPP(fes.getInnPP())
			.selectIndustryCodePP(fes.getIndustryCodePP())
			.selectOKVEDPP(fes.getOkvedPP())
			.setOGRNPP(fes.getOgrnPP())
			.setRegOrgNamePP(fes.getRegOrgNamePP())
			.setRegDatePP(fes.getRegDatePP())
			.selectIdentityDocTypePP(fes.getIdentityDocTypePP())
			.setIdentityDocSeriePP(fes.getIdentityDocSeriePP())
			.setIdentityDocNumberPP(fes.getIdentityDocNumberPP())
			.setIdentityDocIssueDatePP(fes.getIdentityDocIssueDatePP())
			.setIdentityDocIssuerPP(fes.getIdentityDocIssuerPP())
			.setIdentityDocCodeSubDivisionPP(fes.getIdentityDocCodeSubDivisionPP())
			.setBirthDatePP(fes.getBirthDatePP())
			.selectBirthPlaceCountryCodePP(fes.getBirthPlaceCountryCodePP())
			.selectBirthPlaceSubjectCodePP(fes.getBirthPlaceSubjectCodePP())
			.setBirthPlaceAreaPP(fes.getBirthPlaceAreaPP())
			.setBirthPlaceCityPP(fes.getBirthPlaceCityPP())
			.selectBirthPlaceCitizenshipCodePP(fes.getBirthPlaceCitizenshipCodePP())
			.selectPublicFacesSignPP(fes.getPublicFacesSignPP())
			.selectRegAddressCountryCodePP(fes.getRegAddressCountryCodePP())
			.selectRegAddressSubjectCodePP(fes.getRegAddressSubjectCodePP())
			.setRegAddressAreaPP(fes.getRegAddressAreaPP())
			.setRegAddressCityPP(fes.getRegAddressCityPP())
			.setRegAddressStreetPP(fes.getRegAddressStreetPP())
			.setRegAddressHousePP(fes.getRegAddressHousePP())
			.setRegAddressCorpPP(fes.getRegAddressCorpPP())
			.setRegAddressApartmentPP(fes.getRegAddressApartmentPP())
			.setRegAddressIPPP(fes.getRegAddressIPPP())
			.selectActualAddressCountryCodePP(fes.getActualAddressCountryCodePP())
			.selectActualAddressSubjectCodePP(fes.getActualAddressSubjectCodePP())
			.setActualAddressAreaPP(fes.getActualAddressAreaPP())
			.setActualAddressCityPP(fes.getActualAddressCityPP())
			.setActualAddressStreetPP(fes.getActualAddressStreetPP())
			.setActualAddressHousePP(fes.getActualAddressHousePP())
			.setActualAddressCorpPP(fes.getActualAddressCorpPP())
			.setActualAddressApartmentPP(fes.getActualAddressApartmentPP())
			.setActualAddressIPPP(fes.getActualAddressIPPP())
			.setBIK(fes.getBik())
			.setBankAccountNumber(fes.getBankAccountNumber())
			.setBankName(fes.getBankName())
			.clickOK()	
			.addInfoAboutParticipant()
			.selectRoleOfParticipantCode(fes.getRoleOfParticipant2Code())
			.selectTypeOfParticipantCode(fes.getTypeOfParticipantCode())
			.selectSignOfCommunionToTerrorism(fes.getSignOfCommunionToTerrorism())
			.selectBaseApplyingMeasuresCode(fes.getBaseApplyingMeasuresCode())
			.setCodeULFL(fes.getCodeULFL())
			.selectTypeOfParticipant(fes.getTypeOfParticipant())
			.setResidentSign(fes.getResidentSign())
			.setClientSign(fes.getClientSign())
			.setNameLP(fes.getNameLP())
			.selectTypeCodeLP(fes.getTypeCodeLP())
			.setINNLP(fes.getInnLP())
			.setKPPLP(fes.getKppLP())
			.setOKPOLP(fes.getOkpoLP())
			.selectOKVEDLP(fes.getOkvedLP())
			.selectIndustryCodeLP(fes.getIndustryCodeLP())
			.setOGRNLP(fes.getOgrnLP())
			.setRegOrgNameLP(fes.getRegOrgNameLP())
			.setRegDateLP(fes.getRegDateLP())
			.selectUrAddressCountryCodeLP(fes.getUrAddressCountryCodeLP())
			.selectUrAddressSubjectCodeLP(fes.getUrAddressSubjectCodeLP())
			.setUrAddressAreaLP(fes.getUrAddressAreaLP())
			.setUrAddressCityLP(fes.getUrAddressCityLP())
			.setUrAddressStreetLP(fes.getUrAddressStreetLP())
			.setUrAddressHouseLP(fes.getUrAddressHouseLP())
			.setUrAddressCorpLP(fes.getUrAddressCorpLP())
			.setUrAddressApartmentLP(fes.getUrAddressApartmentLP())
			.selectRegAddressCountryCodeLP(fes.getRegAddressCountryCodeLP())
			.selectRegAddressSubjectCodeLP(fes.getRegAddressSubjectCodeLP())
			.setRegAddressAreaLP(fes.getRegAddressAreaLP())
			.setRegAddressCityLP(fes.getRegAddressCityLP())
			.setRegAddressStreetLP(fes.getRegAddressStreetLP())
			.setRegAddressHouseLP(fes.getRegAddressHouseLP())
			.setRegAddressCorpLP(fes.getRegAddressCorpLP())
			.setRegAddressApartmentLP(fes.getRegAddressApartmentLP())
			.setRegAddressIPLP(fes.getRegAddressIPLP())
			.selectCodePP(fes.getCodePP())
			.setSurnamePP(fes.getSurnamePP())
			.setNamePP(fes.getNamePP())
			.setPatronymicPP(fes.getPatronymicPP())
			.setINNPP(fes.getInnPP())
			.selectIndustryCodePP(fes.getIndustryCodePP())
			.selectOKVEDPP(fes.getOkvedPP())
			.setOGRNPP(fes.getOgrnPP())
			.setRegOrgNamePP(fes.getRegOrgNamePP())
			.setRegDatePP(fes.getRegDatePP())
			.selectIdentityDocTypePP(fes.getIdentityDocTypePP())
			.setIdentityDocSeriePP(fes.getIdentityDocSeriePP())
			.setIdentityDocNumberPP(fes.getIdentityDocNumberPP())
			.setIdentityDocIssueDatePP(fes.getIdentityDocIssueDatePP())
			.setIdentityDocIssuerPP(fes.getIdentityDocIssuerPP())
			.setIdentityDocCodeSubDivisionPP(fes.getIdentityDocCodeSubDivisionPP())
			.setBirthDatePP(fes.getBirthDatePP())
			.selectBirthPlaceCountryCodePP(fes.getBirthPlaceCountryCodePP())
			.selectBirthPlaceSubjectCodePP(fes.getBirthPlaceSubjectCodePP())
			.setBirthPlaceAreaPP(fes.getBirthPlaceAreaPP())
			.setBirthPlaceCityPP(fes.getBirthPlaceCityPP())
			.selectBirthPlaceCitizenshipCodePP(fes.getBirthPlaceCitizenshipCodePP())
			.selectPublicFacesSignPP(fes.getPublicFacesSignPP())
			.selectRegAddressCountryCodePP(fes.getRegAddressCountryCodePP())
			.selectRegAddressSubjectCodePP(fes.getRegAddressSubjectCodePP())
			.setRegAddressAreaPP(fes.getRegAddressAreaPP())
			.setRegAddressCityPP(fes.getRegAddressCityPP())
			.setRegAddressStreetPP(fes.getRegAddressStreetPP())
			.setRegAddressHousePP(fes.getRegAddressHousePP())
			.setRegAddressCorpPP(fes.getRegAddressCorpPP())
			.setRegAddressApartmentPP(fes.getRegAddressApartmentPP())
			.setRegAddressIPPP(fes.getRegAddressIPPP())
			.selectActualAddressCountryCodePP(fes.getActualAddressCountryCodePP())
			.selectActualAddressSubjectCodePP(fes.getActualAddressSubjectCodePP())
			.setActualAddressAreaPP(fes.getActualAddressAreaPP())
			.setActualAddressCityPP(fes.getActualAddressCityPP())
			.setActualAddressStreetPP(fes.getActualAddressStreetPP())
			.setActualAddressHousePP(fes.getActualAddressHousePP())
			.setActualAddressCorpPP(fes.getActualAddressCorpPP())
			.setActualAddressApartmentPP(fes.getActualAddressApartmentPP())
			.setActualAddressIPPP(fes.getActualAddressIPPP())
			.setBIK(fes.getBik())
			.setBankAccountNumber(fes.getBankAccountNumber())
			.setBankName(fes.getBankName())
			.clickOK();		
	}
		
}
