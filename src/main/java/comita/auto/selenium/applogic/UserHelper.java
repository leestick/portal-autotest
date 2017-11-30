package comita.auto.selenium.applogic;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.support.ui.ExpectedConditions;

import comita.auto.selenium.model.User;
import comita.auto.selenium.util.Dates;

public class UserHelper extends DriverBasedHelper{	
	
	public UserHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}

	//авторизация в ЛК 
	public void loginAs(User user) throws InterruptedException {
		log.AppendToFile(dates.getTimeForLog() + " - Авторизация пользователя " + user.getLogin() + " в ЛК ...");
		
		pages.loginPage.ensurePageLoaded()
			.setLoginField(user.getLogin())
			.setPasswordField(user.getPassword())
			.clickLoginButton();
		
		log.AppendToFile(dates.getTimeForLog() + " - Авторизация пользователя " + user.getLogin() + " выполнена!");	
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[.='Закрыть']")));
		//driver.findElement(By.xpath("//span[.='Закрыть']")).click();
	}   
  
	//выход из ЛК
	public void logout() {
		log.AppendToFile(dates.getTimeForLog() + " - Выход из ЛК... ");
		
		pages.privateOfficePage.ensurePageLoaded()
			.clickLogoutButton()
			.clickConfirmationButton();
				
		log.AppendToFile(dates.getTimeForLog() + " - Выход из ЛК осуществлен!");
	}  

	public boolean isLoggedIn() {	  
		return pages.privateOfficePage.waitPageLoaded();
	}
  
	public boolean isIncorrectLoginPass() {
		return pages.loginPage.ensurePageLoaded()
					.isIncorrectLoginPassMessage();
	}
	  
	public boolean isOutLoginPass(){
		return pages.loginPage.ensurePageLoaded()
					.isOutLoginPassMessage();
	}
  
	public boolean isNotLoggedIn() {
		return pages.loginPage.waitPageLoaded();
	}	
}
