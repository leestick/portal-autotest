package comita.auto.selenium.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import comita.auto.selenium.blocks.ActionButtons;
import comita.auto.selenium.blocks.InfoTabOfFES;
import comita.auto.selenium.blocks.InfoTabOfNKO;

public class FES_NKO_Page extends AnyPage {
	
	public FES_NKO_Page(PageManager pages) {
		super(pages);		
	}
	
	public FES_NKO_Page ensurePageLoaded() {
	    super.ensurePageLoaded();
	    return this;
	}
	
	private ActionButtons actionButtons;
	private InfoTabOfFES infoTabOfFES;
	private InfoTabOfNKO infoTabOfNKO;
	
	@FindBy(xpath = "(//span[@class='lefrMenuSpan'])[1]")
	WebElement infoTabOfFESLink;
	
	@FindBy(xpath = "(//span[@class='lefrMenuSpan'])[2]")
	WebElement infoTabOfNKOLink;
	
	@FindBy(xpath = "//span[.='OK']")
	WebElement okButton;
	
	@FindBy(css = "tr.table-tr-attach")
	WebElement firstRecord;

	//Кнопки действий
	
	public PrivateOfficePage close() {
		clickElement(actionButtons.closeButton);
		return pages.privateOfficePage;
	}
	
	public FES_NKO_Page save() throws InterruptedException {
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
	
	public FES_NKO_Page setCorrespondentID(String value) {
		setValue(infoTabOfFES.correspondentID, value);
		return this;
	}
	
	public FES_NKO_Page selectTypeInfo(String value) {
		selectOption(infoTabOfFES.typeInfo, value);
		return this;
	}
	
	public FES_NKO_Page setDateOfFES(String value) {
		setValue(infoTabOfFES.dateOfFES, value);
		return this;
	}
	
	public FES_NKO_Page selectFormID(String value) {
		selectOption(infoTabOfFES.formID, value);
		return this;
	}
	
	public FES_NKO_Page setAuthorizedPosition(String value) {
		setValue(infoTabOfFES.authorizedPosition, value);
		return this;
	}
	
	public FES_NKO_Page setAuthorizedSurname(String value) {
		setValue(infoTabOfFES.authorizedSurname, value);
		return this;
	}
	
	public FES_NKO_Page setAuthorizedName(String value) {
		setValue(infoTabOfFES.authorizedName, value);
		return this;
	}
	
	public FES_NKO_Page setAuthorizedPatronymic(String value) {
		setValue(infoTabOfFES.authorizedPatronymic, value);
		return this;
	}
	
	public FES_NKO_Page setAuthorizedCodeAndPhone(String value) {
		setValue(infoTabOfFES.authorizedCodeAndPhone, value);
		return this;
	}
	
	public FES_NKO_Page setAuthorizedEmail(String value) {
		setValue(infoTabOfFES.authorizedEmail, value);
		return this;
	}
	
	public FES_NKO_Page selectInfoAboutPersonType(String value) {
		selectOption(infoTabOfFES.infoAboutPersonType, value);
		return this;
	}
	
	public FES_NKO_Page setInfoAboutPersonSurname(String value) {
		if (infoTabOfFES.infoAboutPersonType.getText().contains("2")){
			setValue(infoTabOfFES.infoAboutPersonSurname, value);
		}
		return this;
	}
	
	public FES_NKO_Page setInfoAboutPersonName(String value) {
		if (infoTabOfFES.infoAboutPersonType.getText().contains("2")){
			setValue(infoTabOfFES.infoAboutPersonName, value);
		}
		return this;
	}
	
	public FES_NKO_Page setInfoAboutPersonPatronymic(String value) {
		if (infoTabOfFES.infoAboutPersonType.getText().contains("2")){
			setValue(infoTabOfFES.infoAboutPersonPatronymic, value);
		}
		return this;
	}
	
	public FES_NKO_Page setInfoAboutPersonINN(String value) {
		setValue(infoTabOfFES.infoAboutPersonINN, value);
		return this;
	}
	
	public FES_NKO_Page setInfoAboutPersonLegalName(String value) {
		if (infoTabOfFES.infoAboutPersonType.getText().contains("юридическое лицо")) {
			setValue(infoTabOfFES.infoAboutPersonLegalName, value);
		}
		return this;
	}
	
	//Вкладка 'Информация об организации (филиале, ИП), представляющей (представляющем) сведения'
	
	public FES_NKO_Page selectRepresentativeTypeCode(String value) {
		clickElement(infoTabOfNKO.deleteRepresentativeTypeCode);
		selectOptionFromLongList(infoTabOfNKO.representativeTypeCode, value);
		return this;
	}
	
	public FES_NKO_Page selectRepresentativeType(String value) {
		selectOption(infoTabOfNKO.representativeType, value);
		return this;
	}
	
	public FES_NKO_Page setResidentSign(String value) {
		if (value.equals("1")) {
			infoTabOfNKO.residentSign.click();
		}
		return this;
	}
		
	public FES_NKO_Page setNkoName(String value) {
		if (infoTabOfNKO.representativeType.getText().contains("юридическое лицо")){
			setValue(infoTabOfNKO.nkoName, value);
		}
		return this;
	}
	
	public FES_NKO_Page setNkoINN(String value1, String value2) {
		if (infoTabOfNKO.representativeType.getText().contains("юридическое лицо")) {
			setValue(infoTabOfNKO.nkoINN, value1);	
		}
		else {
			setValue(infoTabOfNKO.nkoINN, value2);
		}
		return this;
	}
	
	public FES_NKO_Page setNkoKPP(String value) {
		if (infoTabOfNKO.representativeType.getText().contains("юридическое лицо")){
			setValue(infoTabOfNKO.nkoKPP, value);
		}
		return this;
	}
	
	public FES_NKO_Page setNkoOKPO(String value) {
		if (infoTabOfNKO.representativeType.getText().contains("юридическое лицо")){
			setValue(infoTabOfNKO.nkoOKPO, value);
		}
		return this;
	}
	
	public FES_NKO_Page selectNkoOKVED(String value) {
		try {
			if (infoTabOfNKO.nkoOKVED.isDisplayed()) {		
				selectOptionFromLongList(infoTabOfNKO.nkoOKVED, value);
			}
		}	
		catch (NoSuchElementException e){			
		}
		return this;
	}
	
	public FES_NKO_Page selectIndustrySectorCode(String value) {
		selectOptionFromLongList(infoTabOfNKO.industrySectorCode, value);
		return this;
	}
	
	public FES_NKO_Page setNkoOGRN(String value1, String value2) {
		if (infoTabOfNKO.representativeType.getText().contains("юридическое лицо")) {
			setValue(infoTabOfNKO.nkoOGRN, value1);
		}
		else {
			setValue(infoTabOfNKO.nkoOGRN, value2);
		}
		return this;
	}
	
	public FES_NKO_Page setNkoPersonSurname(String value) {
		if (!infoTabOfNKO.representativeType.getText().contains("юридическое лицо")){
			setValue(infoTabOfNKO.nkoPersonSurname, value);
		}
		return this;
	}
	
	public FES_NKO_Page setNkoPersonName(String value) {
		if (!infoTabOfNKO.representativeType.getText().contains("юридическое лицо")){
			setValue(infoTabOfNKO.nkoPersonName, value);
		}
		return this;
	}
	
	public FES_NKO_Page setNkoPersonPatronymic(String value) {
		if (!infoTabOfNKO.representativeType.getText().contains("юридическое лицо")){
			setValue(infoTabOfNKO.nkoPersonPatronymic, value);
		}
		return this;
	}
	
	public FES_NKO_Page selectNkoIdentityDocType(String value) {
		if (!infoTabOfNKO.representativeType.getText().contains("юридическое лицо")){
			selectOptionFromLongList(infoTabOfNKO.nkoIdentityDocType, value);
		}
		return this;
	}
	
	public FES_NKO_Page setNkoIdentityDocSerie(String value) {
		if (!infoTabOfNKO.representativeType.getText().contains("юридическое лицо")){
			setValue(infoTabOfNKO.nkoIdentityDocSerie, value);
		}
		return this;
	}
	
	public FES_NKO_Page setNkoIdentityDocNumber(String value) {
		if (!infoTabOfNKO.representativeType.getText().contains("юридическое лицо")){
			setValue(infoTabOfNKO.nkoIdentityDocNumber, value);
		}
		return this;
	}
	
	public FES_NKO_Page setNkoIdentityDocIssueDate(String value) {
		if (!infoTabOfNKO.representativeType.getText().contains("юридическое лицо")){
			setValue(infoTabOfNKO.nkoIdentityDocIssueDate, value);
		}
		return this;
	}
	
	public FES_NKO_Page setNkoIdentityDocIssuer(String value) {
		if (!infoTabOfNKO.representativeType.getText().contains("юридическое лицо")){
			setValue(infoTabOfNKO.nkoIdentityDocIssuer, value);
		}
		return this;
	}
	
	public FES_NKO_Page setNkoIdentityDocCodeDivision(String value) {
		if (!infoTabOfNKO.representativeType.getText().contains("юридическое лицо")){
			setValue(infoTabOfNKO.nkoIdentityDocCodeSubDivision, value);
		}
		return this;
	}
	
	public FES_NKO_Page setNkoIdentityDocBirthDate(String value) {
		if (!infoTabOfNKO.representativeType.getText().contains("юридическое лицо")){
			setValue(infoTabOfNKO.nkoIdentityDocBirthDate, value);
		}
		return this;
	}
	
	public FES_NKO_Page selectNkoBirthCountryCode(String value) {
		if (!infoTabOfNKO.representativeType.getText().contains("юридическое лицо")){
			selectOptionFromLongList(infoTabOfNKO.nkoBirthCountryCode, value);
		}
		return this;
	}
	
	public FES_NKO_Page selectNkoBirthSubjectCode(String value) {
		if (!infoTabOfNKO.representativeType.getText().contains("юридическое лицо")){
			selectOptionFromLongList(infoTabOfNKO.nkoBirthSubjectCode, value);
		}
		return this;
	}
	
	public FES_NKO_Page setNkoBirthArea(String value) {
		if (!infoTabOfNKO.representativeType.getText().contains("юридическое лицо")){
			setValue(infoTabOfNKO.nkoBirthArea, value);
		}
		return this;
	}
	
	public FES_NKO_Page setNkoBirthCity(String value) {
		if (!infoTabOfNKO.representativeType.getText().contains("юридическое лицо")){
			setValue(infoTabOfNKO.nkoBirthCity, value);
		}
		return this;
	}
	
	public FES_NKO_Page selectNkoAddressCountryCode(String value) {
		selectOptionFromLongList(infoTabOfNKO.nkoAddressCountryCode, value);
		return this;
	}
	
	public FES_NKO_Page selectNkoAddressSubjectCode(String value) {
		selectOptionFromLongList(infoTabOfNKO.nkoAddressSubjectCode, value);
		return this;
	}
	
	public FES_NKO_Page setNkoAddressArea(String value) {
		setValue(infoTabOfNKO.nkoAddressArea, value);
		return this;
	}
	
	public FES_NKO_Page setNkoAddressCity(String value) {
		setValue(infoTabOfNKO.nkoAddressCity, value);
		return this;
	}
	
	public FES_NKO_Page setNkoAddressStreet(String value) {
		setValue(infoTabOfNKO.nkoAddressStreet, value);
		return this;
	}
	
	public FES_NKO_Page setNkoAddressHouse(String value) {
		setValue(infoTabOfNKO.nkoAddressHouse, value);
		return this;
	}
	
	public FES_NKO_Page setNkoAddressCorp(String value) {
		setValue(infoTabOfNKO.nkoAddressCorp, value);
		return this;
	}
	
	public FES_NKO_Page setNkoAddressApartment(String value) {
		setValue(infoTabOfNKO.nkoAddressApartment, value);
		return this;
	}
	
	public FES_NKO_Page setPostalCode(String value) {
		setValue(infoTabOfNKO.postalCode, value);
		return this;
	}
	
	public FES_NKO_Page selectPostalCountryCode(String value) {
		selectOptionFromLongList(infoTabOfNKO.postalCountryCode, value);
		return this;
	}
	
	public FES_NKO_Page selectPostalSubjectCode(String value) {
		selectOptionFromLongList(infoTabOfNKO.postalSubjectCode, value);
		return this;
	}
	
	public FES_NKO_Page setPostalArea(String value) {
		setValue(infoTabOfNKO.postalArea, value);
		return this;
	}
	
	public FES_NKO_Page setPostalCity(String value) {
		setValue(infoTabOfNKO.postalCity, value);
		return this;
	}
	
	public FES_NKO_Page setPostalStreet(String value) {
		setValue(infoTabOfNKO.postalStreet, value);
		return this;
	}
	
	public FES_NKO_Page setPostalHouse(String value) {
		setValue(infoTabOfNKO.postalHouse, value);
		return this;
	}
	
	public FES_NKO_Page setPostalCorp(String value) {
		setValue(infoTabOfNKO.postalCorp, value);
		return this;
	}
	
	public FES_NKO_Page setPostalApartment(String value) {
		setValue(infoTabOfNKO.postalApartment, value);
		return this;
	}
	
	public FES_NKO_Page setIPAddress(String value) {
		clearField(infoTabOfNKO.ipAddress);
		setValue(infoTabOfNKO.ipAddress, value);
		return this;
	}
	
	public FES_NKO_Page selectInfoTabOfFES() {
		clickElement(infoTabOfFESLink);
		return this;
	}
	
	public FES_NKO_Page selectinfoTabOfNKO() {
		clickElement(infoTabOfNKOLink);
		return this;
	}

	public FES_NKO_Page clickOK() {
		clickElement(okButton);
		return this;
	}
	
	public FES_NKO_Page selectFirstRecord() {
		clickElement(firstRecord);
		return this;
	}
}
