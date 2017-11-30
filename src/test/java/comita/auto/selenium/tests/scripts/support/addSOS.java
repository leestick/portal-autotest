package comita.auto.selenium.tests.scripts.support;

import java.io.IOException;
import org.testng.annotations.Test;

import comita.auto.selenium.base.TestBase;

public class addSOS extends TestBase {	
	
	@Test(groups = {"base.support"})
	public void testDownloadAndAddNewSOS() throws InterruptedException, IOException{			
		String filePath = "\\\\dmitrydn\\Temp\\nwudcca7.crl";
					
		app.getNavigationHelper().openLoginPage();
		app.getUserHelper().loginAs(USER_ZOLSUP);
		app.getPrivateOfficeHelper().goToFolder("Реестр УЦ");
		app.getPrivateOfficeHelper().uploadFile(filePath);
		app.getUserHelper().logout();
	}

}
