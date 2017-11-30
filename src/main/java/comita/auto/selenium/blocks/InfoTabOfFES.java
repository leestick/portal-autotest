package comita.auto.selenium.blocks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@Name("Info tab of Fes NFO")
@FindBy(css = "div.scrollUMW")

public class InfoTabOfFES extends HtmlElement {

	//3484 - все, 
		
	@FindBy(css = "input[ng-model='profile.servicePart.idKorr']")
	public WebElement correspondentID;
	
	@FindBy(css = "div[ng-model='profile.servicePart.typeInfo']")
	public WebElement typeInfo;
	
	@FindBy(css = "input[ng-model='profile.servicePart.date']")
	public WebElement dateOfFES;
	
	@FindBy(css = "div[ng-model='profile.subStatus']")
	public WebElement formID;
	
	@FindBy(css = "input[ng-model='profile.servicePart.people']")
	public WebElement authorizedPosition;
	
	@FindBy(css = "input[ng-model='profile.servicePart.fio.surName']")
	public WebElement authorizedSurname;
	
	@FindBy(css = "input[ng-model='profile.servicePart.fio.name']")
	public WebElement authorizedName;
	
	@FindBy(css = "input[ng-model='profile.servicePart.fio.patName']")
	public WebElement authorizedPatronymic;
	
	@FindBy(css = "input[ng-model='profile.servicePart.phone']")
	public WebElement authorizedCodeAndPhone;
	
	@FindBy(css = "input[ng-model='profile.servicePart.email']")
	public WebElement authorizedEmail;

	//1, 2, 3, 4 - ФМ, Запрос на удаление
	
	@FindBy(css = "div[ng-model='profile.servicePart.type']")
	public WebElement infoAboutPersonType;
	
	@FindBy(css = "input[ng-model='profile.servicePart.inn']")
	public WebElement infoAboutPersonINN;
	
	@FindBy(css = "input[ng-model='profile.servicePart.personType.fizPrivate.surName']")
	public WebElement infoAboutPersonSurname;
	
	@FindBy(css = "input[ng-model='profile.servicePart.personType.fizPrivate.name']")
	public WebElement infoAboutPersonName;
	
	@FindBy(css = "input[ng-model='profile.servicePart.personType.fizPrivate.patName']")
	public WebElement infoAboutPersonPatronymic;
	
	@FindBy(css = "input[ng-model='profile.servicePart.personType.legal']")
	public WebElement infoAboutPersonLegalName;	
	
}
