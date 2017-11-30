package comita.auto.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FES_4FM_Page extends FES_NKO_Page {

	public FES_4FM_Page(PageManager pages) {
		super(pages);		
	}
	
	public FES_4FM_Page ensurePageLoaded() {
	    super.ensurePageLoaded();
	    return this;
	}
	
	@FindBy(xpath = "(//span[@class='lefrMenuSpan'])[3]")
	WebElement infoAboutFactsOfObstaclesTabLink;
	
	@FindBy(xpath = "(//span[.='Добавить'])[1]")
	WebElement addRecordButton;
	
	@FindBy(css = "input[ng-model='profile.number']")
	WebElement id;
	
	@FindBy(css = "div[ng-model='profile.type']")
	WebElement recordTypeFES;	
	
	@FindBy(css = "input[ng-model='profile.date']")
	WebElement correctionDate;
	
	@FindBy(css = "div[ng-model='profile.codeOksm']")
	WebElement foreignCountryCode;
	
	@FindBy(css = "textarea[ng-model='profile.requirements']")
	WebElement requirementOfLegislation;
	
	@FindBy(css = "textarea[ng-model='profile.forma']")
	WebElement handicappingForm;
	
	@FindBy(css = "textarea[ng-model='profile.dopInfo']")
	WebElement additionalInfo;
	
	@FindBy(xpath = "//span[.='OK']")
	WebElement okButton;
	
	public FES_4FM_Page selectInfoAboutFactsOfObstaclesTab() {
		clickElement(infoAboutFactsOfObstaclesTabLink);
		return this;
	}
	
	public FES_4FM_Page addRecord() {
		clickElement(addRecordButton);
		return this;
	}
	
	public FES_4FM_Page setID(String value) {
		setValue(id, value);
		return this;
	}
	
	public FES_4FM_Page selectRecordTypeFES(String value) {
		selectOption(recordTypeFES, value);
		return this;
	}
	
	public FES_4FM_Page setCorrectionDate(String value) {
		if (!recordTypeFES.getText().contains("1")) {
			setValue(correctionDate, value);
		}
		return this;
	}
	
	public FES_4FM_Page selectForeignCountryCode(String value) {
		selectOption(foreignCountryCode, value);
		return this;
	}
	
	public FES_4FM_Page setRequirementOfLegislation(String value) {
		setValue(requirementOfLegislation, value);
		return this;
	}
	
	public FES_4FM_Page setHandicappingForm(String value) {
		setValue(handicappingForm, value);
		return this;
	}
	
	public FES_4FM_Page setAdditionalInfo(String value) {
		setValue(additionalInfo, value);
		return this;
	}
	
	public FES_4FM_Page clickOK() {
		clickElement(okButton);
		return this;
	}

}
