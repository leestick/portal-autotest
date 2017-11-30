package comita.auto.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

/**
 * Окно авторизации в ЛК
 * @author dmitryd
 *
 */
public class LoginPage extends AnyPage {

	private String incorrectLoginPassMessage = "Неверный логин либо пароль";
	private String outLoginPassMessage = "Неверный логин либо пароль";
	
	public LoginPage(PageManager pages) {
		super(pages);		
	}
	
	public LoginPage ensurePageLoaded() {
	    super.ensurePageLoaded();
	    wait.until(ExpectedConditions.elementToBeClickable(loginButton));
	    return this;
	}
	
	@FindBy(name = "login")
	WebElement loginField;
	
	@FindBy(name = "password")
	WebElement passwordField;
	
	@FindBy(id = "loginButton")
	WebElement loginButton;
	  
	public LoginPage setLoginField(String value) {
		setValue(loginField, value);
		return this;
	}

	public LoginPage setPasswordField(String value) {
		setValue(passwordField, value);
	    return this;
	}
	
	public PrivateOfficePage clickLoginButton() throws InterruptedException {
	    clickElement(loginButton);
	    return pages.privateOfficePage;
	}

	public boolean isIncorrectLoginPassMessage() {
		if (driver.findElements(By.xpath("//p[contains(text(),'" + incorrectLoginPassMessage + "')]")).size() != 0){
			return true;
		}
		else return false;
	}
	
	public boolean isOutLoginPassMessage() {
		if (driver.findElements(By.xpath("//p[contains(text(),'" + outLoginPassMessage + "')]")).size() != 0){
			return true;
		}
		else return false;
	}
    
}
