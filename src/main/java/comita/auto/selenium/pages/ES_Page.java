package comita.auto.selenium.pages;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import comita.auto.selenium.blocks.ActionButtons;
import comita.auto.selenium.blocks.InfoTabOfES;

public class ES_Page extends AnyPage {
	
	public ES_Page(PageManager pages) {
		super(pages);		
	}
	
	public ES_Page ensurePageLoaded() {
	    super.ensurePageLoaded();
	    return this;
	}
	
	private ActionButtons actionButtons;
	private InfoTabOfES infoTabOfES;
	
	//Кнопки действий
	
	public PrivateOfficePage close() {
		clickElement(actionButtons.closeButton);
		return pages.privateOfficePage;
	}
	
	public ES_Page save() throws InterruptedException {
		Actions action = new Actions(driver);
		wait.until(ExpectedConditions.elementToBeClickable(actionButtons.saveButton));
		action.moveToElement(actionButtons.saveButton).perform();
		Thread.sleep(2000);		
		action.click().build().perform();
		return this;
	}
		
	public PrivateOfficePage saveAndClose() throws InterruptedException {
		save();
		clickElement(actionButtons.closeAfterSaveButton);
		return pages.privateOfficePage;
	}
		
	//Вкладка 'Информация о сообщении'
	
	public ES_Page setDateOfES(String value) {
		setValue(infoTabOfES.dateOfES, value);
		return this;
	}
	
	public ES_Page setSenderNfoINN(String value) {
		setValue(infoTabOfES.senderNfoINN, value);
		return this;
	}
	
	public ES_Page setSenderNfoKPP(String value) {
		setValue(infoTabOfES.senderNfoKPP, value);
		return this;
	}
	
	public ES_Page setAuthorizedPersonPosition(String value) {
		setValue(infoTabOfES.authorizedPersonPosition, value);
		return this;
	}
	
	public ES_Page setAuthorizedPersonSurname(String value) {
		setValue(infoTabOfES.authorizedPersonSurname, value);
		return this;
	}
	
	public ES_Page setAuthorizedPersonName(String value) {
		setValue(infoTabOfES.authorizedPersonName, value);
		return this;
	}
	
	public ES_Page setAuthorizedPersonPatronymic(String value) {
		setValue(infoTabOfES.authorizedPersonPatronymic, value);
		return this;
	}
	
	public ES_Page setAuthorizedPersonPhone(String value) {
		setValue(infoTabOfES.authorizedPersonPhone, value);
		return this;
	}
	
	public ES_Page selectOpenedAccoutNfoType(String value) {
		selectOption(infoTabOfES.openedAccoutNfoType, value);
		return this;
	}
	
	public ES_Page setOpenedAccountLegalPersonNfoName(String value) {
		if (infoTabOfES.openedAccoutNfoType.getText().contains("юридическое лицо")) {
			setValue(infoTabOfES.openedAccountLegalPersonNfoName, value);
		}	
		return this;
	}
	
	public ES_Page setOpenedAccountNfoINN(String innLP, String innIP) {
		if (infoTabOfES.openedAccoutNfoType.getText().contains("юридическое лицо")) {
			setValue(infoTabOfES.openedAccountNfoINN, innLP);
		}
		else if (infoTabOfES.openedAccoutNfoType.getText().contains("индивидуальный предприниматель")) {
			setValue(infoTabOfES.openedAccountNfoINN, innIP);
		}
		return this;
	}
	
	public ES_Page setOpenedAccountNfoKPP(String value) {
		if (infoTabOfES.openedAccoutNfoType.getText().contains("юридическое лицо")) {
			setValue(infoTabOfES.openedAccountNfoKPP, value);
		}	
		return this;
	}
	
	public ES_Page setOpenedAccountNfoOGRN(String ogrnLP, String ogrnIP) {
		if (infoTabOfES.openedAccoutNfoType.getText().contains("юридическое лицо")) {
			setValue(infoTabOfES.openedAccountNfoOGRN, ogrnLP);
		}
		else if (infoTabOfES.openedAccoutNfoType.getText().contains("индивидуальный предприниматель")) {
			setValue(infoTabOfES.openedAccountNfoOGRN, ogrnIP);
		}
		return this;
	}
	
	public ES_Page setOpenedAccountPrivatePersonSurname(String value) {
		if (!infoTabOfES.openedAccoutNfoType.getText().contains("юридическое лицо")) {
			setValue(infoTabOfES.openedAccountPrivatePersonSurname, value);
		}	
		return this;
	}
	
	public ES_Page setOpenedAccountPrivatePersonName(String value) {
		if (!infoTabOfES.openedAccoutNfoType.getText().contains("юридическое лицо")) {
			setValue(infoTabOfES.openedAccountPrivatePersonName, value);
		}	
		return this;
	}
	
	public ES_Page setOpenedAccountPrivatePersonPatronymic(String value) {
		if (!infoTabOfES.openedAccoutNfoType.getText().contains("юридическое лицо")) {
			setValue(infoTabOfES.openedAccountPrivatePersonPatronymic, value);
		}	
		return this;
	}
	

}
