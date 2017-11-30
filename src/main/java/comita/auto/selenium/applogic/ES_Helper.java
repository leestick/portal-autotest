package comita.auto.selenium.applogic;

public class ES_Helper extends DriverBasedHelper {
	
	public ES_Helper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	public void create443_2() {
		pages.privateOfficePage.ensurePageLoaded()
			.createES_443_2().ensurePageLoaded();
	}
	
	public void create443_1() {
		pages.privateOfficePage.ensurePageLoaded()
			.createES_443_1().ensurePageLoaded();
	}
	
	public void close() {
		pages.es_Page.ensurePageLoaded()
			.close();
	}	
	
	public void saveAndClose() throws InterruptedException {   
		pages.es_Page.ensurePageLoaded()
			.saveAndClose();
	}
	
	public void selectAndSend() throws InterruptedException {
		pages.privateOfficePage.ensurePageLoaded()
			.selectFirstDocument()
			.signAndSend();
	}
}
