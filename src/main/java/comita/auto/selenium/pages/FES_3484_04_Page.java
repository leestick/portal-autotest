package comita.auto.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FES_3484_04_Page extends FES_NFO_Page {

	public FES_3484_04_Page(PageManager pages) {
		super(pages);		
	}
	
	public FES_3484_04_Page ensurePageLoaded() {
	    super.ensurePageLoaded();
	    return this;
	}
	
	@FindBy(xpath = "(//span[@class='lefrMenuSpan'])[3]")
	WebElement infoAboutResultsOfInspectionTabLink;
	
	@FindBy(xpath = "(//span[.='Добавить'])[1]")
	WebElement addRecordButton;

	@FindBy(id = "number")
	WebElement id;
	
	@FindBy(id = "snfoCheckType")
	WebElement recordTypeFES;
	
	@FindBy(id = "datePrevInsp")
	WebElement datePrevInspection;	
	
	@FindBy(id = "dateCurrInsp")
	WebElement dateCurrInspection;
	
	@FindBy(id = "col11")
	WebElement numberOfCustomersOrg;
	
	@FindBy(id = "col12")
	WebElement numberOfCustomersInd;
	
	@FindBy(id = "col20")
	WebElement totalNumberOfCustomers;
	
	@FindBy(id = "col21")
	WebElement numberOfBlockedOrg;
	
	@FindBy(id = "col22")
	WebElement numberOfBlockedInd;
	
	@FindBy(id = "col30")
	WebElement numberOfFESForBlocked;
	
	@FindBy(id = "col41")
	WebElement numberOfNonBlockedOrg;
	
	@FindBy(id = "col42")
	WebElement numberOfNonBlockedInd;
	
	@FindBy(id = "col40")
	WebElement totalNumberOfNonBlocked;
	
	@FindBy(id = "col50")
	WebElement numberOfFESForNonBlocked;
	
	@FindBy(id = "comment")
	WebElement additionalInfo;
	
	@FindBy(xpath = "//span[.='OK']")
	WebElement buttonOK;
	
	public FES_3484_04_Page selectInfoAboutResultsOfInspectionTab() {
		clickElement(infoAboutResultsOfInspectionTabLink);
		return this;
	}
	
	public FES_3484_04_Page addRecord() {
		clickElement(addRecordButton);
		return this;
	}
	
	public FES_3484_04_Page setID(String value) {
		String new_value =  id.getAttribute("value").substring(0, 18) + value + id.getAttribute("value").substring(27);
		setValue(id, new_value);
		return this;
	}
	
	public FES_3484_04_Page selectRecordTypeFES(String value) {
		selectOption(recordTypeFES, value);
		return this;
	}
	
	public FES_3484_04_Page setDatePrevInspection(String value) {
		setValue(datePrevInspection, value);
		return this;
	}
	
	public FES_3484_04_Page setDateCurrInspection(String value) {
		setValue(dateCurrInspection, value);
		return this;
	}
	
	public FES_3484_04_Page setNumberOfCustomersOrg(String value) {
		setValue(numberOfCustomersOrg, value);
		return this;
	}
	
	public FES_3484_04_Page setNumberOfCustomersInd(String value) {
		setValue(numberOfCustomersInd, value);
		return this;
	}
	
	public FES_3484_04_Page setTotalNumberOfCustomers(String value) {
		setValue(totalNumberOfCustomers, value);
		return this;
	}
	
	public FES_3484_04_Page setNumberOfBlockedOrg(String value) {
		setValue(numberOfBlockedOrg, value);
		return this;
	}
	
	public FES_3484_04_Page setNumberOfBlockedInd(String value) {
		setValue(numberOfBlockedInd, value);
		return this;
	}
	
	public FES_3484_04_Page setNumberOfFESForBlocked(String value) {
		setValue(numberOfFESForBlocked, value);
		return this;
	}	
	
	public FES_3484_04_Page setNumberOfNonBlockedOrg(String value) {
		setValue(numberOfNonBlockedOrg, value);
		return this;
	}
	
	public FES_3484_04_Page setNumberOfNonBlockedInd(String value) {
		setValue(numberOfNonBlockedInd, value);
		return this;
	}
	
	public FES_3484_04_Page setTotalNumberOfNonBlocked(String value) {
		setValue(totalNumberOfNonBlocked, value);
		return this;
	}
	
	public FES_3484_04_Page setNumberOfFESForNonBlocked(String value) {
		setValue(numberOfFESForNonBlocked, value);
		return this;
	}	
	
	public FES_3484_04_Page setAdditionalInfo(String value) {
		setValue(additionalInfo, value);
		return this;
	}	
	
	public FES_3484_04_Page clickOK() {
		clickElement(okButton);
		return this;
	}
}
