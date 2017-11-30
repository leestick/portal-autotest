package comita.auto.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import comita.auto.selenium.blocks.ActionButtons;
import comita.auto.selenium.blocks.InfoTabOfFES;
import comita.auto.selenium.blocks.InfoTabOfNFO;

public class FES_NFO_Page extends AnyPage {
	
	public FES_NFO_Page(PageManager pages) {
		super(pages);		
	}
	
	public FES_NFO_Page ensurePageLoaded() {
	    super.ensurePageLoaded();
	    return this;
	}
	
	private ActionButtons actionButtons;
	private InfoTabOfFES infoTabOfFES;
	private InfoTabOfNFO infoTabOfNFO;
	
	@FindBy(xpath = "(//span[@class='lefrMenuSpan'])[1]")
	WebElement infoTabOfFESLink;
	
	@FindBy(xpath = "(//span[@class='lefrMenuSpan'])[2]")
	WebElement infoTabOfNFOLink;
	
	@FindBy(xpath = "//span[.='OK']")
	WebElement okButton;
	
	@FindBy(css = "tr.table-tr-attach")
	WebElement firstRecord;
	
	//Кнопки действий
	
	public PrivateOfficePage close() {
		clickElement(actionButtons.closeButton);
		return pages.privateOfficePage;
	}
	
	public FES_NFO_Page save() throws InterruptedException {
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
	
	public FES_NFO_Page setCorrespondentID(String value) {
		setValue(infoTabOfFES.correspondentID, value);
		return this;
	}
	
	public FES_NFO_Page selectTypeInfo(String value) {
		selectOption(infoTabOfFES.typeInfo, value);
		return this;
	}
	
	public FES_NFO_Page setDateOfFES(String value) {
		setValue(infoTabOfFES.dateOfFES, value);
		return this;
	}
	
	public FES_NFO_Page setAuthorizedPosition(String value) {
		setValue(infoTabOfFES.authorizedPosition, value);
		return this;
	}
	
	public FES_NFO_Page setAuthorizedSurname(String value) {
		setValue(infoTabOfFES.authorizedSurname, value);
		return this;
	}
	
	public FES_NFO_Page setAuthorizedName(String value) {
		setValue(infoTabOfFES.authorizedName, value);
		return this;
	}
	
	public FES_NFO_Page setAuthorizedPatronymic(String value) {
		setValue(infoTabOfFES.authorizedPatronymic, value);
		return this;
	}
	
	public FES_NFO_Page setAuthorizedCodeAndPhone(String value) {
		setValue(infoTabOfFES.authorizedCodeAndPhone, value);
		return this;
	}
	
	public FES_NFO_Page setAuthorizedEmail(String value) {
		setValue(infoTabOfFES.authorizedEmail, value);
		return this;
	}
	
	public FES_NFO_Page selectInfoAboutPersonType(String value) {
		selectOption(infoTabOfFES.infoAboutPersonType, value);
		return this;
	}
	
	public FES_NFO_Page setInfoAboutPersonSurname(String value) {
		setValue(infoTabOfFES.infoAboutPersonSurname, value);
		return this;
	}
	
	public FES_NFO_Page setInfoAboutPersonName(String value) {
		setValue(infoTabOfFES.infoAboutPersonName, value);
		return this;
	}
	
	public FES_NFO_Page setInfoAboutPersonPatronymic(String value) {
		setValue(infoTabOfFES.infoAboutPersonPatronymic, value);
		return this;
	}
	
	public FES_NFO_Page setInfoAboutPersonINN(String value) {
		setValue(infoTabOfFES.infoAboutPersonINN, value);
		return this;
	}
	
	public FES_NFO_Page setInfoAboutPersonLegalName(String value) {
		setValue(infoTabOfFES.infoAboutPersonLegalName, value);
		return this;
	}
	
	//Вкладка 'Информация об НФО (филиале НФО)'
	
	public FES_NFO_Page selectNfoTypeCode(String value) {
		selectOptionFromLongList(infoTabOfNFO.nfoTypeCode, value);
		return this;
	}
	
	public FES_NFO_Page selectNfoType(String value) {
		selectOption(infoTabOfNFO.nfoType, value);
		return this;
	}
	
	public FES_NFO_Page setNfoResidentSign(String value) {
		if (value.equals("1")) {
			infoTabOfNFO.nfoResidentSign.click();
		}
		return this;
	}
		
	public FES_NFO_Page setNfoName(String value) {
		if (infoTabOfNFO.nfoType.getText().contains("юридическое лицо")){
			setValue(infoTabOfNFO.nfoName, value);
		}
		return this;
	}
	
	public FES_NFO_Page setNfoTransmittingInfoName(String value) {
		if (infoTabOfNFO.nfoType.getText().contains("юридическое лицо")){
			setValue(infoTabOfNFO.nfoTransmittingInfoName, value);
		}
		return this;
	}
	
	public FES_NFO_Page setNfoINN(String value1, String value2) {
		if (infoTabOfNFO.nfoType.getText().contains("юридическое лицо")) {
			setValue(infoTabOfNFO.nfoINN, value1);	
		}
		else {
			setValue(infoTabOfNFO.nfoINN, value2);
		}
		return this;
	}
	
	public FES_NFO_Page setNfoKPP(String value) {
		if (infoTabOfNFO.nfoType.getText().contains("юридическое лицо")){
			setValue(infoTabOfNFO.nfoKPP, value);
		}
		return this;
	}
	
	public FES_NFO_Page setNfoOKPO(String value) {
		if (infoTabOfNFO.nfoType.getText().contains("юридическое лицо")){
			setValue(infoTabOfNFO.nfoOKPO, value);
		}
		return this;
	}
	
	public FES_NFO_Page setNfoOKVED(String value) {
		selectOptionFromLongList(infoTabOfNFO.nfoOKVED, value);
		return this;
	}
	
	public FES_NFO_Page setNfoOGRN(String value1, String value2) {
		if (infoTabOfNFO.nfoType.getText().contains("юридическое лицо")) {
			setValue(infoTabOfNFO.nfoOGRN, value1);
		}
		else {
			setValue(infoTabOfNFO.nfoOGRN, value2);
		}
		return this;
	}
	
	public FES_NFO_Page setNfoPersonSurname(String value) {
		if (infoTabOfNFO.nfoType.getText().contains("индивидуальный предприниматель")){
			setValue(infoTabOfNFO.nfoPersonSurname, value);
		}
		return this;
	}
	
	public FES_NFO_Page setNfoPersonName(String value) {
		if (infoTabOfNFO.nfoType.getText().contains("индивидуальный предприниматель")){
			setValue(infoTabOfNFO.nfoPersonName, value);
		}
		return this;
	}
	
	public FES_NFO_Page setNfoPersonPatronymic(String value) {
		if (infoTabOfNFO.nfoType.getText().contains("индивидуальный предприниматель")){
			setValue(infoTabOfNFO.nfoPersonPatronymic, value);
		}
		return this;
	}
	
	public FES_NFO_Page selectNfoIdentityDocType(String value) {
		if (infoTabOfNFO.nfoType.getText().contains("индивидуальный предприниматель")){
			selectOptionFromLongList(infoTabOfNFO.nfoIdentityDocType, value);
		}
		return this;
	}
	
	public FES_NFO_Page setNfoIdentityDocSerie(String value) {
		if (infoTabOfNFO.nfoType.getText().contains("индивидуальный предприниматель")){
			setValue(infoTabOfNFO.nfoIdentityDocSerie, value);
		}
		return this;
	}
	
	public FES_NFO_Page setNfoIdentityDocNumber(String value) {
		if (infoTabOfNFO.nfoType.getText().contains("индивидуальный предприниматель")){
			setValue(infoTabOfNFO.nfoIdentityDocNumber, value);
		}
		return this;
	}
	
	public FES_NFO_Page setNfoIdentityDocIssueDate(String value) {
		if (infoTabOfNFO.nfoType.getText().contains("индивидуальный предприниматель")){
			setValue(infoTabOfNFO.nfoIdentityDocIssueDate, value);
		}
		return this;
	}
	
	public FES_NFO_Page setNfoIdentityDocIssuer(String value) {
		if (infoTabOfNFO.nfoType.getText().contains("индивидуальный предприниматель")){
			setValue(infoTabOfNFO.nfoIdentityDocIssuer, value);
		}
		return this;
	}
	
	public FES_NFO_Page setNfoIdentityDocCodeDivision(String value) {
		if (infoTabOfNFO.nfoType.getText().contains("индивидуальный предприниматель")){
			setValue(infoTabOfNFO.nfoIdentityDocCodeSubDivision, value);
		}
		return this;
	}
	
	public FES_NFO_Page setNfoIdentityDocBirthDate(String value) {
		if (infoTabOfNFO.nfoType.getText().contains("индивидуальный предприниматель")){
			setValue(infoTabOfNFO.nfoIdentityDocBirthDate, value);
		}
		return this;
	}
	
	public FES_NFO_Page selectNfoBirthCountryCode(String value) {
		if (infoTabOfNFO.nfoType.getText().contains("индивидуальный предприниматель")){
			selectOptionFromLongList(infoTabOfNFO.nfoBirthCountryCode, value);
		}
		return this;
	}
	
	public FES_NFO_Page selectNfoBirthSubjectCode(String value) {
		if (infoTabOfNFO.nfoType.getText().contains("индивидуальный предприниматель")){
			selectOptionFromLongList(infoTabOfNFO.nfoBirthSubjectCode, value);
		}
		return this;
	}
	
	public FES_NFO_Page setNfoBirthArea(String value) {
		if (infoTabOfNFO.nfoType.getText().contains("индивидуальный предприниматель")){
			setValue(infoTabOfNFO.nfoBirthArea, value);
		}
		return this;
	}
	
	public FES_NFO_Page setNfoBirthCity(String value) {
		if (infoTabOfNFO.nfoType.getText().contains("индивидуальный предприниматель")){
			setValue(infoTabOfNFO.nfoBirthCity, value);
		}
		return this;
	}
	
	public FES_NFO_Page selectNfoAddressCountryCode(String value) {
		selectOptionFromLongList(infoTabOfNFO.nfoAddressCountryCode, value);
		return this;
	}
	
	public FES_NFO_Page selectNfoAddressSubjectCode(String value) {
		selectOptionFromLongList(infoTabOfNFO.nfoAddressSubjectCode, value);
		return this;
	}
	
	public FES_NFO_Page setNfoAddressArea(String value) {
		setValue(infoTabOfNFO.nfoAddressArea, value);
		return this;
	}
	
	public FES_NFO_Page setNfoAddressCity(String value) {
		setValue(infoTabOfNFO.nfoAddressCity, value);
		return this;
	}
	
	public FES_NFO_Page setNfoAddressStreet(String value) {
		setValue(infoTabOfNFO.nfoAddressStreet, value);
		return this;
	}
	
	public FES_NFO_Page setNfoAddressHouse(String value) {
		setValue(infoTabOfNFO.nfoAddressHouse, value);
		return this;
	}
	
	public FES_NFO_Page setNfoAddressCorp(String value) {
		setValue(infoTabOfNFO.nfoAddressCorp, value);
		return this;
	}
	
	public FES_NFO_Page setNfoAddressApartment(String value) {
		setValue(infoTabOfNFO.nfoAddressApartment, value);
		return this;
	}
	
	public FES_NFO_Page selectInfoTabOfFES() {
		clickElement(infoTabOfFESLink);
		return this;
	}
	
	public FES_NFO_Page selectInfoTabOfNFO() {
		clickElement(infoTabOfNFOLink);
		return this;
	}

	public FES_NFO_Page clickOK() {
		clickElement(okButton);
		return this;
	}
	
	public FES_NFO_Page selectFirstRecord() {
		if (!firstRecord.getAttribute("style").contains("background-color")) {
			clickElement(firstRecord);
		}
		return this;
	}
}
