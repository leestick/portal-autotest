package comita.auto.selenium.applogic;

public class NavigationHelper extends DriverBasedHelper{

	private String siteUrl;
	
	public NavigationHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
		this.siteUrl = manager.getSiteUrl();
	}  
	
	public void openMainPage() {
		log.AppendToFile(dates.getTimeForLog() + " - Открытие главной страницы Портала ФМ ...");
		driver.get(siteUrl + "index.jsp#/freepage");
		log.AppendToFile(dates.getTimeForLog() + " - Главная страница Портала ФМ открыта.");
	}
	  
	public void openLoginPage() {
		log.AppendToFile(dates.getTimeForLog() + " - Открытие страницы авторизации в ЛК ...");
		driver.get(siteUrl + "index.jsp#/login");	
		log.AppendToFile(dates.getTimeForLog() + " - Страница авторизации в ЛК открыта.");
	}
	
	public void openUrl(String url) {
		log.AppendToFile(dates.getTimeForLog() + " - Открытие страницы " + url + " ...");
		driver.get(url);	
		log.AppendToFile(dates.getTimeForLog() + " - Страница " + url + " открыта.");	
	} 
  
}
