package comita.auto.selenium.applogic;

public class FES_Helper extends DriverBasedHelper {
	
	public FES_Helper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	public void create1FM() {
		pages.privateOfficePage.ensurePageLoaded()
			.createFES_1FM().ensurePageLoaded();
	}
	
	public void create1FM_POSTRF() {
		pages.privateOfficePage.ensurePageLoaded()
			.createFES_1FM_POSTRF().ensurePageLoaded();
	}
	
	public void create2FM() {
		pages.privateOfficePage.ensurePageLoaded()
			.createFES_2FM().ensurePageLoaded();
	}
	
	public void create3FM() {
		pages.privateOfficePage.ensurePageLoaded()
			.createFES_3FM().ensurePageLoaded();
	}
	
	public void create4FM() {
		pages.privateOfficePage.ensurePageLoaded()
			.createFES_4FM().ensurePageLoaded();
	}
	
	public void createDELFM() {
		pages.privateOfficePage.ensurePageLoaded()
			.createDELFM().ensurePageLoaded();
	}
	
	public void create3484_010206() {
		pages.privateOfficePage.ensurePageLoaded()
			.createFES_3484_010206().ensurePageLoaded();		
	}
	
	public void create3484_03() {
		pages.privateOfficePage.ensurePageLoaded()
			.createFES_3484_03().ensurePageLoaded();		
	}
	
	public void create3484_04(){
		pages.privateOfficePage.ensurePageLoaded()
			.createFES_3484_04().ensurePageLoaded();
	}
	
	public void create3484_08() {
		pages.privateOfficePage.ensurePageLoaded()
			.createFES_3484_08().ensurePageLoaded();		
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
