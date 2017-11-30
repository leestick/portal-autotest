package comita.auto.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ES_443_2_Page extends ES_Page {
	
	public ES_443_2_Page(PageManager pages) {
		super(pages);		
	}
	
	public ES_443_2_Page ensurePageLoaded() {
	    super.ensurePageLoaded();
	    return this;
	}

	@FindBy(xpath = "(//span[@class='lefrMenuSpan'])[2]")
	WebElement infoAboutCompanyTabLink;

	@FindBy(xpath = "(//span[.='Добавить'])[1]")
	WebElement addCompanyButton;
	
	@FindBy(xpath = "(//span[.='Добавить'])[2]")
	WebElement addInfoAboutIssuerButton;
	
	@FindBy(xpath = "(//span[.='Добавить'])[3]")
	WebElement addInfoAboutSecuritiesButton;
		
	@FindBy(xpath = "//span[.='OK']")
	WebElement okButton;
	
	@FindBy(css = "tr.table-tr-attach")
	WebElement firstRecord;
	
	@FindBy(xpath = "(//tr[@class='table-tr-attach'])[2]")
	WebElement firstIssuer;
	
	@FindBy(css = "table[data-attach-doc='profile.infoPart.companies']")
	WebElement tableCompanies;
	
	@FindBy(css = "table[data-attach-doc='issuesInformation']")
	WebElement tableIssuers;
		
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
	
	@FindBy(css = "input[ng-model='profile.nfoId']")
	WebElement recordID;
	
	@FindBy(css = "div[ng-model='profile.signInfo']")
	WebElement infoDirectionSign;
	
	@FindBy(css = "div[ng-model='profile.infoPaper.type']")
	WebElement issuerType;
	
	@FindBy(css = "input[ng-model='profile.infoPaper.code']")
	WebElement issuerCode;
	
	@FindBy(css = "input[ng-model='profile.infoPaper.name']")
	WebElement issuerName;

	@FindBy(css = "input[ng-model='profile.datePaper']")
	WebElement purchaseSecuritiesDate;
	
	@FindBy(css = "div[ng-model='profile.code']")
	WebElement securitiesTypeCode;
	
	@FindBy(css = "input[ng-model='profile.numberReg']")
	WebElement numberISIN;
	
	@FindBy(css = "div[ng-model='profile.currency']")
	WebElement securitiesCurrencyCode;
	
	@FindBy(css = "input[ng-model='profile.countPaper']")
	WebElement securitiesCount;

	@FindBy(css = "div[ng-model='profile.codeCurPrice']")
	WebElement securitiesPriceCurrencyCode;
	
	@FindBy(css = "input[ng-model='profile.price']")
	WebElement securitiesPrice;
	
	@FindBy(css = "input[ng-model='profile.priceRub']")
	WebElement securitiesPriceRUR;
	
	public ES_443_2_Page selectInfoAboutCompanyTab() {
		clickElement(infoAboutCompanyTabLink);
		return this;
	}
	
	public ES_443_2_Page addCompany() {
		clickElement(addCompanyButton);
		return this;
	}
	
	public ES_443_2_Page addIssuer() {
		clickElement(addInfoAboutIssuerButton);
		return this;
	}
	
	public ES_443_2_Page addSecurities() {
		clickElement(addInfoAboutSecuritiesButton);
		return this;
	}
	
	public ES_443_2_Page selectFirstCompany() {
		if (!firstRecord.getAttribute("style").contains("background-color")) {
			clickElement(firstRecord);			
		}
		return this;
	}
	
	public ES_443_2_Page selectFirstIssuer() {
		if (!firstIssuer.getAttribute("style").contains("background-color")) {
			clickElement(firstIssuer);
		}
		return this;
	}
	
	public ES_443_2_Page clickOK() {
		clickElement(okButton);
		return this;
	}
	
	public ES_443_2_Page setCompanyName(String value) {
		setValue(companyName, value);
		return this;
	}
	
	public ES_443_2_Page setCompanyINN(String value) {
		setValue(companyINN, value);
		return this;
	}
	
	public ES_443_2_Page setCompanyKPP(String value) {
		setValue(companyKPP, value);
		return this;
	}
	
	public ES_443_2_Page setCompanyOGRN(String value) {
		setValue(companyOGRN, value);
		return this;
	}
	
	public ES_443_2_Page setCompanyRegDate(String value) {
		setValue(companyRegDate, value);
		return this;
	}
	
	public ES_443_2_Page selectCompanyRegion(String value) {
		selectOptionFromLongList(companyRegion, value);
		return this;
	}
	
	public ES_443_2_Page setCompanyArea(String value) {
		setValue(companyArea, value);
		return this;
	}
	
	public ES_443_2_Page setCompanyCity(String value) {
		setValue(companyCity, value);
		return this;
	}
	
	public ES_443_2_Page setCompanyStreet(String value) {
		setValue(companyStreet, value);
		return this;
	}
	
	public ES_443_2_Page setCompanyHouse(String value) {
		setValue(companyHouse, value);
		return this;
	}
	
	public ES_443_2_Page setCompanyCorp(String value) {
		setValue(companyCorp, value);
		return this;
	}
	
	public ES_443_2_Page setCompanyApartment(String value) {
		setValue(companyApartment, value);
		return this;
	}
	
	public ES_443_2_Page setComment(String value) {
		setValue(comment, value);
		return this;
	}
	
	public ES_443_2_Page setRecordID(String value) {
		setValue(recordID, value);
		return this;
	}
	
	public ES_443_2_Page selectInfoDirectionSign(String value) {
		selectOption(infoDirectionSign, value);
		return this;
	}
	
	public ES_443_2_Page selectIssuerType(String value) {
		selectOption(issuerType, value);
		return this;
	}
	
	public ES_443_2_Page setIssuerCode(String value) {
		setValue(issuerCode, value);
		return this;
	}
	
	public ES_443_2_Page setIssuerName(String value) {
		setValue(issuerName, value);
		return this;
	}
	
	public ES_443_2_Page setPurchaseSecuritiesDate(String value) {
		setValue(purchaseSecuritiesDate, value);
		return this;
	}
	
	public ES_443_2_Page selectSecuritiesTypeCode(String value) {
		selectOptionFromLongList(securitiesTypeCode, value);
		return this;
	}
	
	public ES_443_2_Page setNumberISIN(String value) {
		setValue(numberISIN, value);
		return this;
	}
	
	public ES_443_2_Page selectSecuritiesCurrencyCode(String value) {
		selectOptionFromLongList(securitiesCurrencyCode, value);
		return this;
	}
	
	public ES_443_2_Page setSecuritiesCount(String value) {
		setValue(securitiesCount, value);
		return this;
	}
	
	public ES_443_2_Page selectSecuritiesPriceCurrencyCode(String value) {
		selectOptionFromLongList(securitiesPriceCurrencyCode, value);
		return this;
	}
	
	public ES_443_2_Page setSecuritiesPrice(String value) {
		setValue(securitiesPrice, value);
		return this;
	}
	
	public ES_443_2_Page setSecuritiesPriceRUR(String value) {
		setValue(securitiesPriceRUR, value);
		return this;
	}	
}