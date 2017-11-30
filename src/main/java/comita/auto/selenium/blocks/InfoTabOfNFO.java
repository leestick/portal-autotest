package comita.auto.selenium.blocks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@Name("Info tab of NFO")
@FindBy(css = "div.scrollUMW")

public class InfoTabOfNFO extends HtmlElement {

	@FindBy(css = "div[ng-model='profile.infoPart.nfo.code']")
	public WebElement nfoTypeCode;

	@FindBy(css = "div[ng-model='profile.infoPart.nfo.type']")
	public WebElement nfoType;

	@FindBy(css = "input[ng-model='profile.infoPart.nfo.sign']")
	public WebElement nfoResidentSign;

	@FindBy(css = "input[ng-model='profile.infoPart.nfo.person.legalPerson']")
	public WebElement nfoName;

	@FindBy(css = "input[ng-model='profile.infoPart.nfo.titleNfo']")
	public WebElement nfoTransmittingInfoName;
	
	@FindBy(css = "input[ng-model='profile.infoPart.nfo.inn']")
	public WebElement nfoINN;

	@FindBy(css = "input[ng-model='profile.infoPart.nfo.kpp']")
	public WebElement nfoKPP;

	@FindBy(css = "input[ng-model='profile.infoPart.nfo.okpo']")
	public WebElement nfoOKPO;

	@FindBy(css = "div[ng-model='profile.infoPart.nfo.okved']")
	public WebElement nfoOKVED;

	@FindBy(css = "input[ng-model='profile.infoPart.nfo.ogrn']")
	public WebElement nfoOGRN;

	@FindBy(css = "input[ng-model='profile.infoPart.nfo.person.privatePerson.surName']")
	public WebElement nfoPersonSurname;

	@FindBy(css = "input[ng-model='profile.infoPart.nfo.person.privatePerson.name']")
	public WebElement nfoPersonName;
	
	@FindBy(css = "input[ng-model='profile.infoPart.nfo.person.privatePerson.patName']")
	public WebElement nfoPersonPatronymic;
	
	@FindBy(css = "div[ng-model='profile.infoPart.nfo.address.oksm']")
	public WebElement nfoAddressCountryCode;

	@FindBy(css = "div[ng-model='profile.infoPart.nfo.address.region']")
	public WebElement nfoAddressSubjectCode;

	@FindBy(css = "input[ng-model='profile.infoPart.nfo.address.area']")
	public WebElement nfoAddressArea;

	@FindBy(css = "input[ng-model='profile.infoPart.nfo.address.city']")
	public WebElement nfoAddressCity;

	@FindBy(css = "input[ng-model='profile.infoPart.nfo.address.street']")
	public WebElement nfoAddressStreet;
	
	@FindBy(css = "input[ng-model='profile.infoPart.nfo.address.house']")
	public WebElement nfoAddressHouse;

	@FindBy(css = "input[ng-model='profile.infoPart.nfo.address.corp']")
	public WebElement nfoAddressCorp;

	@FindBy(css = "input[ng-model='profile.infoPart.nfo.address.apartment']")
	public WebElement nfoAddressApartment;

	@FindBy(css = "div[ng-model='profile.infoPart.nfo.passport.vidDoc']")
	public WebElement nfoIdentityDocType;

	@FindBy(css = "input[ng-model='profile.infoPart.nfo.passport.docCode']")
	public WebElement nfoIdentityDocSerie;

	@FindBy(css = "input[ng-model='profile.infoPart.nfo.passport.docNumber']")
	public WebElement nfoIdentityDocNumber;

	@FindBy(css = "input[ng-model='profile.infoPart.nfo.passport.issuanceDate']")
	public WebElement nfoIdentityDocIssueDate;
	
	@FindBy(css = "input[ng-model='profile.infoPart.nfo.passport.issuer']")
	public WebElement nfoIdentityDocIssuer;
	
	@FindBy(css = "input[ng-model='profile.infoPart.nfo.passport.codeSubDiv']")
	public WebElement nfoIdentityDocCodeSubDivision;
	
	@FindBy(css = "input[ng-model='profile.infoPart.nfo.birthDate']")
	public WebElement nfoIdentityDocBirthDate;
	
	@FindBy(css = "div[ng-model='profile.infoPart.nfo.birthPlace.oksm']")
	public WebElement nfoBirthCountryCode;
	
	@FindBy(css = "div[ng-model='profile.infoPart.nfo.birthPlace.region']")
	public WebElement nfoBirthSubjectCode;
		
	@FindBy(css = "input[ng-model='profile.infoPart.nfo.birthPlace.area']")
	public WebElement nfoBirthArea;
		
	@FindBy(css = "input[ng-model='profile.infoPart.nfo.birthPlace.city']")
	public WebElement nfoBirthCity;
	
}
