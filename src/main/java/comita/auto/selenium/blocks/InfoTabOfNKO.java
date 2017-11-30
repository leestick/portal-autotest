package comita.auto.selenium.blocks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@Name("Info tab of NKO")
@FindBy(css = "div.scrollUMW")

public class InfoTabOfNKO extends HtmlElement {

	@FindBy(css = "div[ng-model='profile.infoPart.nko.code']")
	public WebElement representativeTypeCode;
	
	@FindBys({
		@FindBy(css = "div[ng-model='profile.infoPart.nko.code']"),
		@FindBy(css = "div.del-selectcustom")
	})
	public WebElement deleteRepresentativeTypeCode;

	@FindBy(css = "div[ng-model='profile.infoPart.nko.type']")
	public WebElement representativeType;

	@FindBy(css = "input[ng-model='profile.infoPart.nko.sign']")
	public WebElement residentSign;

	@FindBy(css = "input[ng-model='profile.infoPart.nko.personType.legal']")
	public WebElement nkoName;

	@FindBy(css = "input[ng-model='profile.infoPart.nko.inn']")
	public WebElement nkoINN;

	@FindBy(css = "input[ng-model='profile.infoPart.nko.kpp']")
	public WebElement nkoKPP;

	@FindBy(css = "input[ng-model='profile.infoPart.nko.okpo']")
	public WebElement nkoOKPO;
	
	@FindBy(css = "div[ng-model='profile.infoPart.nko.okved']")
	public WebElement nkoOKVED;

	@FindBy(css = "input[ng-model='profile.infoPart.nko.ogrn']")
	public WebElement nkoOGRN;
	
	@FindBy(css = "div[ng-model='profile.infoPart.nko.otrCode']")
	public WebElement industrySectorCode;

	@FindBy(css = "input[ng-model='profile.infoPart.nko.personType.fizPrivate.surName']")
	public WebElement nkoPersonSurname;

	@FindBy(css = "input[ng-model='profile.infoPart.nko.personType.fizPrivate.name']")
	public WebElement nkoPersonName;
	
	@FindBy(css = "input[ng-model='profile.infoPart.nko.personType.fizPrivate.patName']")
	public WebElement nkoPersonPatronymic;
	
	@FindBy(css = "div[ng-model='profile.infoPart.nko.address.oksm']")
	public WebElement nkoAddressCountryCode;

	@FindBy(css = "div[ng-model='profile.infoPart.nko.address.region']")
	public WebElement nkoAddressSubjectCode;

	@FindBy(css = "input[ng-model='profile.infoPart.nko.address.area']")
	public WebElement nkoAddressArea;

	@FindBy(css = "input[ng-model='profile.infoPart.nko.address.city']")
	public WebElement nkoAddressCity;

	@FindBy(css = "input[ng-model='profile.infoPart.nko.address.street']")
	public WebElement nkoAddressStreet;
	
	@FindBy(css = "input[ng-model='profile.infoPart.nko.address.house']")
	public WebElement nkoAddressHouse;

	@FindBy(css = "input[ng-model='profile.infoPart.nko.address.corp']")
	public WebElement nkoAddressCorp;

	@FindBy(css = "input[ng-model='profile.infoPart.nko.address.apartment']")
	public WebElement nkoAddressApartment;

	@FindBy(css = "div[ng-model='profile.infoPart.nko.passport.vidDoc']")
	public WebElement nkoIdentityDocType;

	@FindBy(css = "input[ng-model='profile.infoPart.nko.passport.docCode']")
	public WebElement nkoIdentityDocSerie;

	@FindBy(css = "input[ng-model='profile.infoPart.nko.passport.docNumber']")
	public WebElement nkoIdentityDocNumber;

	@FindBy(css = "input[ng-model='profile.infoPart.nko.passport.issuanceDate']")
	public WebElement nkoIdentityDocIssueDate;
	
	@FindBy(css = "input[ng-model='profile.infoPart.nko.passport.issuer']")
	public WebElement nkoIdentityDocIssuer;
	
	@FindBy(css = "input[ng-model='profile.infoPart.nko.passport.codeSubDiv']")
	public WebElement nkoIdentityDocCodeSubDivision;
	
	@FindBy(css = "input[ng-model='profile.infoPart.nko.birthDate']")
	public WebElement nkoIdentityDocBirthDate;
	
	@FindBy(css = "div[ng-model='profile.infoPart.nko.birthPlace.oksm']")
	public WebElement nkoBirthCountryCode;
	
	@FindBy(css = "div[ng-model='profile.infoPart.nko.birthPlace.region']")
	public WebElement nkoBirthSubjectCode;
		
	@FindBy(css = "input[ng-model='profile.infoPart.nko.birthPlace.area']")
	public WebElement nkoBirthArea;
		
	@FindBy(css = "input[ng-model='profile.infoPart.nko.birthPlace.city']")
	public WebElement nkoBirthCity;
	
	@FindBy(css = "input[ng-model='profile.infoPart.nko.address.ipadd']")
	public WebElement ipAddress;
	
	@FindBy(css = "input[ng-model='profile.infoPart.indexPerson']")
	public WebElement postalCode;
	
	@FindBy(css = "div[ng-model='profile.infoPart.postAddressPerson.oksm']")
	public WebElement postalCountryCode;
	
	@FindBy(css = "div[ng-model='profile.infoPart.postAddressPerson.region']")
	public WebElement postalSubjectCode;
	
	@FindBy(css = "input[ng-model='profile.infoPart.postAddressPerson.area']")
	public WebElement postalArea;
	
	@FindBy(css = "input[ng-model='profile.infoPart.postAddressPerson.city']")
	public WebElement postalCity;
	
	@FindBy(css = "input[ng-model='profile.infoPart.postAddressPerson.street']")
	public WebElement postalStreet;
	
	@FindBy(css = "input[ng-model='profile.infoPart.postAddressPerson.house']")
	public WebElement postalHouse;
	
	@FindBy(css = "input[ng-model='profile.infoPart.postAddressPerson.corp']")
	public WebElement postalCorp;
	
	@FindBy(css = "input[ng-model='profile.infoPart.postAddressPerson.apartment']")
	public WebElement postalApartment;
		
}
