package comita.auto.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FES_2FM_Page extends FES_NKO_Page {

	public FES_2FM_Page(PageManager pages) {
		super(pages);		
	}
	
	public FES_2FM_Page ensurePageLoaded() {
	    super.ensurePageLoaded();
	    return this;
	}
	
	@FindBy(xpath = "(//span[@class='lefrMenuSpan'])[3]")
	WebElement infoAboutMeasuresToFreezeTabLink;
	
	@FindBy(xpath = "(//span[.='Добавить'])[1]")
	WebElement addRecordButton;

	@FindBy(css = "input[ng-model='profile.number']")
	WebElement id;
	
	@FindBy(css = "div[ng-model='profile.type']")
	WebElement recordTypeFES;
	
	@FindBy(css = "input[ng-model='profile.dateChange']")
	WebElement dateOfChange;
	
	@FindBy(css = "div[ng-model='profile.code']")
	WebElement codeReasonApplyingMeasures;
	
	@FindBy(css = "input[ng-model='profile.codePerson']")
	WebElement codeOfOrganization;
	
	@FindBy(css = "input[ng-model='profile.dateBlock']")
	WebElement dateToFreeze;
	
	@FindBy(css = "input[ng-model='profile.timeBlock']")
	WebElement timeToFreeze;
	
	@FindBy(css = "div[ng-model='profile.typeProp']")
	WebElement typeOfFundsToFreeze;
	
	@FindBy(css = "div[ng-model='profile.codeVal']")
	WebElement currencyCode;
	
	@FindBy(css = "input[ng-model='profile.summ']")
	WebElement sum;
	
	@FindBy(css = "input[ng-model='profile.summRub']")
	WebElement sumRUR;
	
	@FindBy(css = "textarea[ng-model='profile.comment']")
	WebElement additionalInfo;
	
	@FindBy(css = "div[ng-model='profile.paper']")
	WebElement securitiesInfo;
	
	@FindBy(css = "input[ng-model='profile.pricePaper']")
	WebElement securitiesNominalPrice;
	
	@FindBy(css = "input[ng-model='profile.marketPrPaper']")
	WebElement securitiesMarketPrice;
	
	@FindBy(xpath = "//span[.='OK']")
	WebElement okButton;
	
	public FES_2FM_Page selectInfoAboutMeasuresToFreezeTab() {
		clickElement(infoAboutMeasuresToFreezeTabLink);
		return this;
	}
	
	public FES_2FM_Page addRecord() {
		clickElement(addRecordButton);
		return this;
	}
	
	public FES_2FM_Page setID(String value) {
		setValue(id, value);
		return this;
	}
	
	public FES_2FM_Page selectRecordTypeFES(String value) {
		selectOption(recordTypeFES, value);
		return this;
	}
	
	public FES_2FM_Page setDateOfChange(String value) {
		if (!recordTypeFES.getText().contains("1")) {
			setValue(dateOfChange, value);
		}		
		return this;
	}
	
	public FES_2FM_Page selectCodeReasonApplyingMeasures(String value) {
		selectOption(codeReasonApplyingMeasures, value);
		return this;
	}
	
	public FES_2FM_Page setCodeOfOrganization(String value) {
		setValue(codeOfOrganization, value);
		return this;
	}
	
	public FES_2FM_Page setDateToFreeze(String value) {
		setValue(dateToFreeze, value);
		return this;
	}
	
	public FES_2FM_Page setTimeToFreeze(String value) {
		setValue(timeToFreeze, value);
		return this;
	}
	
	public FES_2FM_Page selectTypeOfFundsToFreeze(String value) {
		selectOption(typeOfFundsToFreeze, value);
		return this;
	}
	
	public FES_2FM_Page selectCurrencyCode(String value) {
		String type = typeOfFundsToFreeze.getText();
		if (type.contains("1") || type.contains("2") || type.contains("3")) {
			selectOption(currencyCode, value);
		}		
		return this;
	}
	
	public FES_2FM_Page setSum(String value) {
		String type = typeOfFundsToFreeze.getText();
		if (type.contains("1") || type.contains("2") || type.contains("3")) {
			setValue(sum, value);
		}		
		return this;
	}
	
	public FES_2FM_Page setSumRUR(String value) {
		String type = typeOfFundsToFreeze.getText();
		if (!type.contains("4")) {
			setValue(sumRUR, value);
		}		
		return this;
	}
	
	public FES_2FM_Page setAdditionalInfo(String value) {
		setValue(additionalInfo, value);
		return this;
	}
	
	public FES_2FM_Page selectSecuritiesInfo(String value) {
		String type = typeOfFundsToFreeze.getText();
		if (type.contains("4")) {
			selectOption(securitiesInfo, value);
		}		
		return this;
	}
	
	public FES_2FM_Page setSecuritiesNominalPrice(String value) {
		String type = typeOfFundsToFreeze.getText();
		if (type.contains("4")) {
			setValue(securitiesNominalPrice, value);
		}		
		return this;
	}
	
	public FES_2FM_Page setSecuritiesMarketPrice(String value) {
		String type = typeOfFundsToFreeze.getText();
		if (type.contains("4")) {
			setValue(securitiesMarketPrice, value);
		}		
		return this;
	}
	
	public FES_2FM_Page clickOK() {
		clickElement(okButton);
		return this;
	}
	
	
	
	
}
