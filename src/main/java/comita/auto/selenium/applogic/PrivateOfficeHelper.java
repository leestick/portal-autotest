package comita.auto.selenium.applogic;

public class PrivateOfficeHelper extends DriverBasedHelper {
	
	public PrivateOfficeHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}

	public void selectDocument(int i) {
		pages.privateOfficePage.ensurePageLoaded();
		//	.selectDocument(i);
	}

	public void goToFolder(String folderName) {
		pages.privateOfficePage.ensurePageLoaded()
			.selectFolder(folderName);		
	}
	
	public void uploadFile(String filePath) {
		pages.privateOfficePage.ensurePageLoaded()
			.uploadFile(filePath);
	}
	
	
}
