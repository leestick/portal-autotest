package comita.auto.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FES_3484_08_Page extends FES_NFO_Page {

	public FES_3484_08_Page(PageManager pages) {
		super(pages);		
	}
	
	public FES_3484_08_Page ensurePageLoaded() {
	    super.ensurePageLoaded();
	    return this;
	}
	
	@FindBy(xpath = "(//span[@class='lefrMenuSpan'])[3]")
	WebElement infoAboutCasesOfRefusingTabLink;

	@FindBy(css = "tr.table-tr-attach")
	WebElement firstRecord;
	
	@FindBy(xpath = "(//span[.='Добавить'])[1]")
	WebElement addRecordButton;
	
	@FindBy(xpath = "(//span[.='Добавить'])[2]")
	WebElement addReasonButton;
	
	@FindBy(xpath = "(//span[.='Добавить'])[3]")
	WebElement addInfoButton;
	
	@FindBy(xpath = "//span[.='OK']")
	WebElement okButton;
	
	@FindBy(css = "input[ng-model='profile.number']")
	WebElement id;

	@FindBy(css = "div[ng-model='profile.type']")
	WebElement recordTypeFES;

	@FindBy(css = "div[ng-model='profile.codeFail']")
	WebElement refusalCode;

	@FindBy(css = "input[ng-model='profile.dateFail']")
	WebElement refusalDate;

	@FindBy(css = "div[ng-model='profile.codeVal']")
	WebElement currencyCode;

	@FindBy(css = "input[ng-model='profile.summOper']")
	WebElement sum;

	@FindBy(css = "input[ng-model='profile.summRub']")
	WebElement sumRUR;

	@FindBy(css = "textarea[ng-model='profile.purposePay']")
	WebElement purposePay;

	@FindBy(css = "div[ng-model='profile.codeSignOper']")
	WebElement operationSignCode;

	@FindBy(css = "div[ng-model='profile.codeTypeMoney']")
	WebElement codeTypeMoney;
	
	@FindBy(css = "textarea[ng-model='profile.charOper']")
	WebElement charOper;

	@FindBy(css = "textarea[ng-model='profile.comment']")
	WebElement comment;
	
	@FindBy(css = "div[ng-model='profile.codeDoc']")
	WebElement docTypeCode;

	@FindBy(css = "input[ng-model='profile.dateDoc']")
	WebElement docDate;

	@FindBy(css = "input[ng-model='profile.numberDoc']")
	WebElement docNumber;

	@FindBy(css = "textarea[ng-model='profile.docInfo']")
	WebElement docInfo;

	@FindBy(css = "div[ng-model='profile.status']")
	WebElement statusOfParticipantCode;

	@FindBy(css = "div[ng-model='profile.code']")
	WebElement typeOfParticipantCode;

	@FindBy(css = "div[ng-model='profile.type']")
	WebElement typeOfParticipant;

	@FindBy(css = "input[ng-model='profile.sign']")
	WebElement residentSign;
	
	@FindBy(css = "input[ng-model='profile.legalPerson.name']")
	WebElement legalPersonName;

	@FindBy(css = "input[ng-model='profile.legalPerson.inn']")
	WebElement legalPersonINN;

	@FindBy(css = "input[ng-model='profile.legalPerson.kpp']")
	WebElement legalPersonKPP;

	@FindBy(css = "input[ng-model='profile.legalPerson.okpo']")
	WebElement legalPersonOKPO;

	@FindBy(css = "div[ng-model='profile.legalPerson.okved']")
	WebElement legalPersonOKVED;

	@FindBy(css = "input[ng-model='profile.legalPerson.ogrn']")
	WebElement legalPersonOGRN;

	@FindBy(css = "input[ng-model='profile.legalPerson.nameRegOrg']")
	WebElement nameRegOrg;

	@FindBy(css = "input[ng-model='profile.legalPerson.dateReg']")
	WebElement dateReg;

	@FindBy(css = "input[ng-model='profile.privatePerson.fio.surName']")
	WebElement privatePersonSurname;

	@FindBy(css = "input[ng-model='profile.privatePerson.fio.name']")
	WebElement privatePersonName;

	@FindBy(css = "input[ng-model='profile.privatePerson.fio.patName']")
	WebElement privatePersonPatronymic;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.inn']")
	WebElement privatePersonINN;

	@FindBy(css = "div[ng-model='profile.privatePerson.okved']")
	WebElement privatePersonOKVED;

	@FindBy(css = "div[ng-model='profile.privatePerson.passport.vidDoc']")
	WebElement identityDocType;

	@FindBy(css = "input[ng-model='profile.privatePerson.passport.docCode']")
	WebElement identityDocSerie;
	
	@FindBy(css = "input[ng-model='profile.privatePerson.passport.docNumber']")
	WebElement identityDocNumber;

	@FindBy(css = "input[ng-model='profile.privatePerson.passport.issuanceDate']")
	WebElement identityIssueDate;

	@FindBy(css = "input[ng-model='profile.privatePerson.passport.issuer']")
	WebElement identityIssuer;

	@FindBy(css = "input[ng-model='profile.privatePerson.passport.codeSubDiv']")
	WebElement identityCodeSubDivision;

	@FindBy(css = "input[ng-model='profile.privatePerson.birthDate']")
	WebElement identityBirthDate;

	@FindBy(css = "div[ng-model='profile.privatePerson.birthPlace.oksm']")
	WebElement birthCountryCode;

	@FindBy(css = "div[ng-model='profile.privatePerson.birthPlace.region']")
	WebElement birthSubjectCode;

	@FindBy(css = "input[ng-model='profile.privatePerson.birthPlace.area']")
	WebElement birthArea;

	@FindBy(css = "input[ng-model='profile.privatePerson.birthPlace.city']")
	WebElement birthCity;

	@FindBy(css = "div[ng-model='profile.privatePerson.oksm']")
	WebElement birthCitizenshipCode;

	@FindBy(css = "div[ng-model='profile.privatePerson.publicFace']")
	WebElement birthPublicFacesSign;

	@FindBy(css = "div[ng-model='profile.privatePerson.address.oksm']")
	WebElement addressCountryCode;

	@FindBy(css = "div[ng-model='profile.privatePerson.address.region']")
	WebElement addressSubjectCode;

	@FindBy(css = "input[ng-model='profile.privatePerson.address.area']")
	WebElement addressArea;

	@FindBy(css = "input[ng-model='profile.privatePerson.address.city']")
	WebElement addressCity;

	@FindBy(css = "input[ng-model='profile.privatePerson.address.street']")
	WebElement addressStreet;

	@FindBy(css = "input[ng-model='profile.privatePerson.address.house']")
	WebElement addressHouse;

	@FindBy(css = "input[ng-model='profile.privatePerson.address.corp']")
	WebElement addressCorp;

	@FindBy(css = "input[ng-model='profile.privatePerson.address.apartment']")
	WebElement addressApartment;
	
	public FES_3484_08_Page selectInfoAboutCasesOfRefusingTab() {
		clickElement(infoAboutCasesOfRefusingTabLink);
		return this;
	}
	
	public FES_3484_08_Page addRecord() {
		clickElement(addRecordButton);
		return this;
	}
	
	public FES_3484_08_Page selectFirstRecord() {
		if (!firstRecord.getAttribute("style").contains("background-color")) {
			clickElement(firstRecord);
		}		
		return this;
	}
	
	public FES_3484_08_Page addReason() throws InterruptedException {
		Thread.sleep(2000);
		clickElement(addReasonButton);
		return this;
	}
	
	public FES_3484_08_Page addInfo() throws InterruptedException {
		Thread.sleep(2000);
		clickElement(addInfoButton);
		return this;
	}
	
	public FES_3484_08_Page clickOK() {
		clickElement(okButton);
		return this;
	}
	
	public FES_3484_08_Page setId(String value) {
		String new_value =  id.getAttribute("value").substring(0, 18) + value + id.getAttribute("value").substring(27);
		setValue(id, new_value);
		return this;
	}
	
	public FES_3484_08_Page selectRecordTypeFES(String value) {
		selectOption(recordTypeFES, value);
		return this;
	}
	
	public FES_3484_08_Page selectRefusalCode(String value) {
		selectOption(refusalCode, value);
		return this;
	}
	
	public FES_3484_08_Page setRefusalDate(String value) {
		setValue(refusalDate, value);
		return this;
	}
	
	public FES_3484_08_Page selectCurrencyCode(String value) {
		selectOption(currencyCode, value);
		return this;
	}
	
	public FES_3484_08_Page setSum(String value) {
		setValue(sum, value);
		return this;
	}
	
	public FES_3484_08_Page setSumRUR(String value) {
		setValue(sumRUR, value);
		return this;
	}
	
	public FES_3484_08_Page setPurposePay(String value) {
		setValue(purposePay, value);
		return this;
	}
	
	public FES_3484_08_Page selectOperationSignCode(String value) {
		selectOption(operationSignCode, value);
		return this;
	}
	
	public FES_3484_08_Page selectCodeTypeMoney(String value) {
		selectOption(codeTypeMoney, value);
		return this;
	}
	
	public FES_3484_08_Page setCharOper(String value) {
		setValue(charOper, value);
		return this;
	}
	
	public FES_3484_08_Page setComment(String value) {
		setValue(comment, value);
		return this;
	}
	
	public FES_3484_08_Page selectDocTypeCode(String value) {
		selectOption(docTypeCode, value);
		return this;
	}
	
	public FES_3484_08_Page setDocDate(String value) {
		setValue(docDate, value);
		return this;
	}

	public FES_3484_08_Page setDocNumber(String value) {
		setValue(docNumber, value);
		return this;
	}
	
	public FES_3484_08_Page setDocInfo(String value) {
		setValue(docInfo, value);
		return this;
	}
	
	public FES_3484_08_Page selectStatusOfParticipantCode(String value) {
		selectOption(statusOfParticipantCode, value);
		return this;
	}
	
	public FES_3484_08_Page selectTypeOfParticipantCode(String value) {
		selectOption(typeOfParticipantCode, value);
		return this;
	}
	
	public FES_3484_08_Page selectTypeOfParticipant(String value) {
		selectOption(typeOfParticipant, value);
		return this;
	}
	
	public FES_3484_08_Page setResidentSign(String value) {
		if (value.equals("1")) {
			clickElement(residentSign);
		}
		return this;
	}
	
	public FES_3484_08_Page setLegalPersonName(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(legalPersonName, value);
		}		
		return this;
	}
	
	public FES_3484_08_Page setLegalPersonINN(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(legalPersonINN, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setLegalPersonKPP(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(legalPersonKPP, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setLegalPersonOKPO(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			if (residentSign.isSelected()) {
				setValue(legalPersonOKPO, value);
			}			
		}
		return this;
	}
	
	public FES_3484_08_Page selectLegalPersonOKVED(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			selectOptionFromLongList(legalPersonOKVED, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setLegalPersonOGRN(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(legalPersonOGRN, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setLegalPersonNameRegOrg(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(nameRegOrg, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setLegalPersonDateReg(String value) {
		if (typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(dateReg, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setPrivatePersonSurname(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(privatePersonSurname, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setPrivatePersonName(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(privatePersonName, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setPrivatePersonPatronymic(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(privatePersonPatronymic, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setPrivatePersonINN(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(privatePersonINN, value);
		}
		return this;
	}
	
	public FES_3484_08_Page selectPrivatePersonOKVED(String value) {
		if (typeOfParticipant.getText().contains("для индивидуального предпринимателя")) {
			selectOptionFromLongList(privatePersonOKVED, value);
		}
		return this;
	}
	
	public FES_3484_08_Page selectPrivatePersonIdentityDocType(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			selectOptionFromLongList(identityDocType, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setPrivatePersonIdentityDocSerie(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(identityDocSerie, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setPrivatePersonIdentityDocNumber(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(identityDocNumber, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setPrivatePersonIdentityIssueDate(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(identityIssueDate, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setPrivatePersonIdentityIssuer(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(identityIssuer, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setPrivatePersonIdentityCodeSubDivision(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(identityCodeSubDivision, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setPrivatePersonIdentityBirthDate(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(identityBirthDate, value);
		}
		return this;
	}
	
	public FES_3484_08_Page selectPrivatePersonBirthCountryCode(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			selectOptionFromLongList(birthCountryCode, value);
		}
		return this;
	}
	
	public FES_3484_08_Page selectPrivatePersonBirthSubjectCode(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			selectOptionFromLongList(birthSubjectCode, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setPrivatePersonBirthArea(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(birthArea, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setPrivatePersonBirthCity(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(birthCity, value);
		}
		return this;
	}
	
	public FES_3484_08_Page selectPrivatePersonBirthCitizenshipCode(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			selectOptionFromLongList(birthCitizenshipCode, value);
		}
		return this;
	}
	
	public FES_3484_08_Page selectPrivatePersonBirthPublicFacesSign(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			selectOption(birthPublicFacesSign, value);
		}
		return this;
	}
	
	public FES_3484_08_Page selectPrivatePersonAddressCountryCode(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			selectOptionFromLongList(addressCountryCode, value);
		}
		return this;
	}
	
	public FES_3484_08_Page selectPrivatePersonAddressSubjectCode(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			selectOptionFromLongList(addressSubjectCode, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setPrivatePersonAddressArea(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(addressArea, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setPrivatePersonAddressCity(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(addressCity, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setPrivatePersonAddressStreet(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(addressStreet, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setPrivatePersonAddressHouse(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(addressHouse, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setPrivatePersonAddressCorp(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(addressCorp, value);
		}
		return this;
	}
	
	public FES_3484_08_Page setPrivatePersonAddressApartment(String value) {
		if (!typeOfParticipant.getText().contains("для юридического лица")) {
			setValue(addressApartment, value);
		}
		return this;
	}
	
}
