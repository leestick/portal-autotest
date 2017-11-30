package comita.auto.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FES_3FM_Page extends FES_NKO_Page {

	public FES_3FM_Page(PageManager pages) {
		super(pages);		
	}
	
	public FES_3FM_Page ensurePageLoaded() {
	    super.ensurePageLoaded();
	    return this;
	}
	
	@FindBy(xpath = "(//span[@class='lefrMenuSpan'])[3]")
	WebElement infoAboutResultsOfInspectionTabLink;
	
	@FindBy(xpath = "(//span[.='Добавить'])[1]")
	WebElement addRecordButton;
	
	@FindBy(css = "input[ng-model='profile.infoPart.check.number']")
	WebElement id;
	
	@FindBy(css = "div[ng-model='profile.infoPart.check.type']")
	WebElement recordTypeFES;
	
	@FindBy(css = "input[ng-model='profile.infoPart.check.dateChange']")
	WebElement dateOfChange;
	
	@FindBy(css = "input[ng-model='profile.infoPart.check.datePrevInsp']")
	WebElement dateOfPrevInspection;
	
	@FindBy(css = "input[ng-model='profile.infoPart.check.datePerStart']")
	WebElement startOfPeriodDate;
	
	@FindBy(css = "input[ng-model='profile.infoPart.check.datePerEnd']")
	WebElement endOfPeriodDate;
	
	@FindBy(css = "input[ng-model='profile.infoPart.check.dateCheckStart']")
	WebElement startOfInspectionDate;
	
	@FindBy(css = "input[ng-model='profile.infoPart.check.dateCheckEnd']")
	WebElement endOfInspectionDate;
	
	@FindBy(css = "input[ng-model='profile.infoPart.check.k10']")
	WebElement totalNumberOfCustomers;	
	
	@FindBy(css = "input[ng-model='profile.infoPart.check.k11']")
	WebElement numberOfCustomersOrg;
	
	@FindBy(css = "input[ng-model='profile.infoPart.check.k12']")
	WebElement numberOfCustomersInd;
	
	@FindBy(css = "input[ng-model='profile.infoPart.check.k20']")
	WebElement totalNumberOfBlocked;
	
	@FindBy(css = "input[ng-model='profile.infoPart.check.k21']")
	WebElement numberOfBlockedOrg;
	
	@FindBy(css = "input[ng-model='profile.infoPart.check.k22']")
	WebElement numberOfBlockedInd;
	
	@FindBy(css = "input[ng-model='profile.infoPart.check.k30']")
	WebElement totalNumberOfFESForBlocked;
	
	@FindBy(css = "input[ng-model='profile.infoPart.check.k40']")
	WebElement totalNumberOfNonBlocked;
	
	@FindBy(css = "input[ng-model='profile.infoPart.check.k41']")
	WebElement numberOfNonBlockedOrg;
	
	@FindBy(css = "input[ng-model='profile.infoPart.check.k42']")
	WebElement numberOfNonBlockedInd;
	
	@FindBy(css = "input[ng-model='profile.infoPart.check.k50']")
	WebElement numberOfFESForNonBlocked;
	
	@FindBy(css = "div[ng-model='profile.codeOsn']")
	WebElement baseApplyingMeasuresCode;	
	
	@FindBy(css = "input[ng-model='profile.codeLegPr']")
	WebElement organizationCode;
	
	@FindBy(css = "textarea[ng-model='profile.info']")
	WebElement additionalInfo;
	
	@FindBy(xpath = "//span[.='OK']")
	WebElement okButton;
	
	public FES_3FM_Page selectInfoAboutResultsOfInspectionTab() {
		clickElement(infoAboutResultsOfInspectionTabLink);
		return this;
	}
	
	public FES_3FM_Page addRecord() {
		clickElement(addRecordButton);
		return this;
	}
	
	public FES_3FM_Page setID(String value) {
		setValue(id, value);
		return this;
	}
	
	public FES_3FM_Page selectRecordTypeFES(String value) {
		selectOption(recordTypeFES, value);
		return this;
	}
	
	public FES_3FM_Page setDateOfChange(String value) {
		if (!recordTypeFES.getText().contains("1")) {
			setValue(dateOfChange, value);
		}		
		return this;
	}
	
	public FES_3FM_Page setDateOfPrevInspection(String value) {
		setValue(dateOfPrevInspection, value);
		return this;
	}
	
	public FES_3FM_Page setStartOfPeriodDate(String value) {
		setValue(startOfPeriodDate, value);
		return this;
	}
	
	public FES_3FM_Page setEndOfPeriodDate(String value) {
		setValue(endOfPeriodDate, value);
		return this;
	}
		
	public FES_3FM_Page setStartOfInspectionDate(String value) {
		setValue(startOfInspectionDate, value);
		return this;
	}
	
	public FES_3FM_Page setEndOfInspectionDate(String value) {
		setValue(endOfInspectionDate, value);
		return this;
	}
	
	public FES_3FM_Page setTotalNumberOfCustomers(String value) {
		setValue(totalNumberOfCustomers, value);
		return this;
	}
	
	public FES_3FM_Page setNumberOfCustomersOrg(String value) {
		setValue(numberOfCustomersOrg, value);
		return this;
	}
		
	public FES_3FM_Page setNumberOfCustomersInd(String value) {
		setValue(numberOfCustomersInd, value);
		return this;
	}
		
	public FES_3FM_Page setTotalNumberOfBlocked(String value) {
		setValue(totalNumberOfBlocked, value);
		return this;
	}
	
	public FES_3FM_Page setNumberOfBlockedOrg(String value) {
		setValue(numberOfBlockedOrg, value);
		return this;
	}
	
	public FES_3FM_Page setNumberOfBlockedInd(String value) {
		setValue(numberOfBlockedInd, value);
		return this;
	}
	
	public FES_3FM_Page setTotalNumberOfFESForBlocked(String value) {
		setValue(totalNumberOfFESForBlocked, value);
		return this;
	}
	
	public FES_3FM_Page setTotalNumberOfNonBlocked(String value) {
		setValue(totalNumberOfNonBlocked, value);
		return this;
	}
		
	public FES_3FM_Page setNumberOfNonBlockedOrg(String value) {
		setValue(numberOfNonBlockedOrg, value);
		return this;
	}
		
	public FES_3FM_Page setNumberOfNonBlockedInd(String value) {
		setValue(numberOfNonBlockedInd, value);
		return this;
	}
	
	public FES_3FM_Page setNumberOfFESForNonBlocked(String value) {
		setValue(numberOfFESForNonBlocked, value);
		return this;
	}
	
	public FES_3FM_Page selectBaseApplyingMeasuresCode(String value) {
		selectOption(baseApplyingMeasuresCode, value);
		return this;
	}
	
	public FES_3FM_Page setOrganizationCode(String value) {
		setValue(organizationCode, value);
		return this;
	}
	
	public FES_3FM_Page setAdditionalInfo(String value) {
		setValue(additionalInfo, value);
		return this;
	}
		
	public FES_3FM_Page clickOK() {
		clickElement(okButton);
		return this;
	}	
 
}
