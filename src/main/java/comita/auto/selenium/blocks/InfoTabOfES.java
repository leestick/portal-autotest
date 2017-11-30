package comita.auto.selenium.blocks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@Name("Info tab of ES")
@FindBy(css = "div.scrollUMW")

public class InfoTabOfES extends HtmlElement {
	
	@FindBy(css = "input[ng-model='profile.servicePartNfo.date']")
	public WebElement dateOfES;
	
	@FindBy(css = "input[ng-model='profile.servicePartNfo.inn']")
	public WebElement senderNfoINN;
	
	@FindBy(css = "input[ng-model='profile.servicePartNfo.kpp']")
	public WebElement senderNfoKPP;
	
	@FindBy(css = "input[ng-model='profile.servicePartNfo.people']")
	public WebElement authorizedPersonPosition;
	
	@FindBy(css = "input[ng-model='profile.servicePartNfo.fio.surName']")
	public WebElement authorizedPersonSurname;
	
	@FindBy(css = "input[ng-model='profile.servicePartNfo.fio.name']")
	public WebElement authorizedPersonName;
	
	@FindBy(css = "input[ng-model='profile.servicePartNfo.fio.patName']")
	public WebElement authorizedPersonPatronymic;
	
	@FindBy(css = "input[ng-model='profile.servicePartNfo.phone']")
	public WebElement authorizedPersonPhone;
	
	@FindBy(css = "div[ng-model='profile.infoPart.nfo.type']")
	public WebElement openedAccoutNfoType;
	
	@FindBy(css = "input[ng-model='profile.infoPart.nfo.person.legalPerson']")
	public WebElement openedAccountLegalPersonNfoName;
	
	@FindBy(css = "input[ng-model='profile.infoPart.nfo.inn']")
	public WebElement openedAccountNfoINN;
	
	@FindBy(css = "input[ng-model='profile.infoPart.nfo.kpp']")
	public WebElement openedAccountNfoKPP;
	
	@FindBy(css = "input[ng-model='profile.infoPart.nfo.ogrn']")
	public WebElement openedAccountNfoOGRN;
	
	@FindBy(css = "input[ng-model='profile.infoPart.nfo.person.privatePerson.surName']")
	public WebElement openedAccountPrivatePersonSurname;
	
	@FindBy(css = "input[ng-model='profile.infoPart.nfo.person.privatePerson.name']")
	public WebElement openedAccountPrivatePersonName;
	
	@FindBy(css = "input[ng-model='profile.infoPart.nfo.person.privatePerson.patName']")
	public WebElement openedAccountPrivatePersonPatronymic;

}
