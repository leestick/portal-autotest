package comita.auto.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FES_DELFM_Page extends FES_NKO_Page {

	public FES_DELFM_Page(PageManager pages) {
		super(pages);		
	}
	
	public FES_DELFM_Page ensurePageLoaded() {
	    super.ensurePageLoaded();
	    return this;
	}
	
	@FindBy(xpath = "(//span[@class='lefrMenuSpan'])[3]")
	WebElement infoAboutFESToDeleteTabLink;
	
	@FindBy(css = "input[ng-model='profile.infoPart.delFES.numberFes']")
	WebElement numberFES;
	
	@FindBy(css = "input[ng-model='profile.infoPart.delFES.number']")
	WebElement idFES;
	
	@FindBy(css = "input[ng-model='profile.infoPart.delFES.date']")
	WebElement dateFES;
	
	@FindBy(css = "div[ng-model='profile.infoPart.delFES.type']")
	WebElement typeFES;
	
	@FindBy(css = "div[ng-model='profile.infoPart.delFES.state']")
	WebElement statusFES;
	
	@FindBy(css = "div[ng-model='profile.infoPart.delFES.spPredst']")
	WebElement provisionMethodFES;
	
	@FindBy(css = "textarea[ng-model='profile.infoPart.delFES.formPrep']")
	WebElement reasonsToDeleteFES;
	
	public FES_DELFM_Page selectInfoAboutFESToDeleteTab() {
		clickElement(infoAboutFESToDeleteTabLink);
		return this;
	}
	
	public FES_DELFM_Page setNumberFES(String value) {
		setValue(numberFES, value);
		return this;
	}
	
	public FES_DELFM_Page setIdFES(String value) {
		setValue(idFES, value);
		return this;
	}
	
	public FES_DELFM_Page setDateFES(String value) {
		setValue(dateFES, value);
		return this;
	}
	
	public FES_DELFM_Page setTypeFES(String value) {
		selectOptionFromLongList(typeFES, value);
		return this;
	}
	
	public FES_DELFM_Page setStatusFES(String value) {
		selectOption(statusFES, value);
		return this;
	}
	
	public FES_DELFM_Page setProvisionMethodFES(String value) {
		selectOption(provisionMethodFES, value);
		return this;
	}
	
	public FES_DELFM_Page setReasonsToDeleteFES(String value) {
		setValue(reasonsToDeleteFES, value);
		return this;
	}

}
