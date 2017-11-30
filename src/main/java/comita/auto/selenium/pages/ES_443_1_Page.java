package comita.auto.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ES_443_1_Page extends ES_Page {
	
	public ES_443_1_Page(PageManager pages) {
		super(pages);		
	}
	
	public ES_443_1_Page ensurePageLoaded() {
	    super.ensurePageLoaded();
	    return this;
	}
	
	@FindBy(xpath = "(//span[@class='lefrMenuSpan'])[2]")
	WebElement infoAboutCompanyTabLink;
	
	@FindBy(xpath = "(//span[.='Добавить'])[1]")
	WebElement addCompanyButton;
	
	@FindBy(xpath = "(//span[.='Добавить'])[2]")
	WebElement addAccountButton;
		
	@FindBy(xpath = "//span[.='OK']")
	WebElement okButton;
	
	@FindBy(css = "tr.table-tr-attach")
	WebElement firstRecord;
	
	@FindBy(css = "input[ng-model='profile.informationCompany.name']")
	WebElement companyName;
	
	@FindBy(css = "input[ng-model='profile.informationCompany.inn']")
	WebElement companyINN;
	
	@FindBy(css = "input[ng-model='profile.informationCompany.kpp']")
	WebElement companyKPP;
	
	@FindBy(css = "input[ng-model='profile.informationCompany.ogrn']")
	WebElement companyOGRN;
	
	@FindBy(css = "input[ng-model='profile.informationCompany.regDate']")
	WebElement companyRegDate;

	@FindBy(css = "div[ng-model='profile.address.region']")
	WebElement companyRegion;
	
	@FindBy(css = "input[ng-model='profile.address.area']")
	WebElement companyArea;
	
	@FindBy(css = "input[ng-model='profile.address.city']")
	WebElement companyCity;
	
	@FindBy(css = "input[ng-model='profile.address.street']")
	WebElement companyStreet;
	
	@FindBy(css = "input[ng-model='profile.address.house']")
	WebElement companyHouse;

	@FindBy(css = "input[ng-model='profile.address.corp']")
	WebElement companyCorp;
	
	@FindBy(css = "input[ng-model='profile.address.apartment']")
	WebElement companyApartment;
	
	@FindBy(css = "textarea[ng-model='profile.comment']")
	WebElement comment;
	
	@FindBy(css = "input[ng-model='profile.idNfo']")
	WebElement accountID;
	
	@FindBy(css = "div[ng-model='profile.signInfo']")
	WebElement directionInfoSign;

	@FindBy(css = "input[ng-model='profile.bankAccInformation.dateContr']")
	WebElement contractDate;
	
	@FindBy(css = "input[ng-model='profile.bankAccInformation.numberContr']")
	WebElement contractNumber;

	@FindBy(css = "div[ng-model='profile.bankAccInformation.typeAcc']")
	WebElement accountType;
	
	@FindBy(css = "input[ng-model='profile.bankAccInformation.dateAcc']")
	WebElement accountOpenDate;
	
	@FindBy(css = "input[ng-model='profile.bankAccInformation.numberAcc']")
	WebElement accountNumber;
	
	public ES_443_1_Page selectInfoAboutCompanyTab() {
		clickElement(infoAboutCompanyTabLink);
		return this;
	}
	
	public ES_443_1_Page addCompany() {
		clickElement(addCompanyButton);
		return this;
	}
	
	public ES_443_1_Page addAccount() {
		clickElement(addAccountButton);
		return this;
	}
	
	public ES_443_1_Page selectFirstRecord() {
		if (!firstRecord.getAttribute("style").contains("background-color")) {
			clickElement(firstRecord);
		}
		return this;
	}
	
	public ES_443_1_Page clickOK() {
		clickElement(okButton);
		return this;
	}
	
	public ES_443_1_Page setCompanyName(String value) {
		setValue(companyName, value);
		return this;
	}
	
	public ES_443_1_Page setCompanyINN(String value) {
		setValue(companyINN, value);
		return this;
	}
	
	public ES_443_1_Page setCompanyKPP(String value) {
		setValue(companyKPP, value);
		return this;
	}
	
	public ES_443_1_Page setCompanyOGRN(String value) {
		setValue(companyOGRN, value);
		return this;
	}
	
	public ES_443_1_Page setCompanyRegDate(String value) {
		setValue(companyRegDate, value);
		return this;
	}
	
	public ES_443_1_Page selectCompanyRegion(String value) {
		selectOptionFromLongList(companyRegion, value);
		return this;
	}
	
	public ES_443_1_Page setCompanyArea(String value) {
		setValue(companyArea, value);
		return this;
	}
	
	public ES_443_1_Page setCompanyCity(String value) {
		setValue(companyCity, value);
		return this;
	}
	
	public ES_443_1_Page setCompanyStreet(String value) {
		setValue(companyStreet, value);
		return this;
	}
	
	public ES_443_1_Page setCompanyHouse(String value) {
		setValue(companyHouse, value);
		return this;
	}
	
	public ES_443_1_Page setCompanyCorp(String value) {
		setValue(companyCorp, value);
		return this;
	}
	
	public ES_443_1_Page setCompanyApartment(String value) {
		setValue(companyApartment, value);
		return this;
	}
	
	public ES_443_1_Page setComment(String value) {
		setValue(comment, value);
		return this;
	}
	
	public ES_443_1_Page setAccountID(String value) {
		setValue(accountID, value);
		return this;
	}
	
	public ES_443_1_Page selectDirectionInfoSign(String value) {
		selectOption(directionInfoSign, value);
		return this;
	}
	
	public ES_443_1_Page setContractDate(String value) {
		setValue(contractDate, value);
		return this;
	}
	
	public ES_443_1_Page setContractNumber(String value) {
		setValue(contractNumber, value);
		return this;
	}
	
	public ES_443_1_Page selectAccountType(String value) {
		selectOption(accountType, value);
		return this;
	}
	
	public ES_443_1_Page setAccountOpenDate(String value) {
		setValue(accountOpenDate, value);
		return this;
	}
	
	public ES_443_1_Page setAccountNumber(String value) {
		setValue(accountNumber, value);
		return this;
	}
}