package comita.auto.selenium.applogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import comita.auto.selenium.pages.PageManager;
import comita.auto.selenium.util.Dates;
import comita.auto.selenium.util.PropertyLoader;
import comita.auto.selenium.util.WriteToFile;

public class DriverBasedHelper {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected PageManager pages;
	protected WriteToFile log;
	protected Dates dates;

	public DriverBasedHelper(WebDriver driver) {
		this.driver = driver;
	    wait = new WebDriverWait(driver, 20);
	    pages = new PageManager(driver);
	    log = new WriteToFile(PropertyLoader.loadProperty("log.path"));
	    dates = new Dates();
	}	
}
