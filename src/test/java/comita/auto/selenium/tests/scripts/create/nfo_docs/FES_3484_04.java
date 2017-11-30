package comita.auto.selenium.tests.scripts.create.nfo_docs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import comita.auto.selenium.base.TestBase;
import comita.auto.selenium.model.FES_3484_03_DOC;
import comita.auto.selenium.model.FES_3484_04_DOC;

public class FES_3484_04 extends TestBase {
	
	@BeforeMethod(groups = {"base.checks"})
	public void setUp(){		
		video.startRecording(app.getWebDriver());
	}
	
	@Test(groups = {"base.checks"})
	public void testCheckCreateFES_3484_04() throws InterruptedException{
		try{
			log.AppendToFile("---testCheckCreateFES_3484_04---");
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getFES_Helper().create3484_04();
			app.getFES_Helper().close();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCheckCreateFES_3484_04");
		}
	}
	
	@Test
	public void testCreateAndSaveRequiredFieldsFES_3484_04() throws InterruptedException {
		try{
			log.AppendToFile("---testCreateAndSaveRequiredFieldsFES_3484_04---");
			FES_3484_04_DOC fes_3484_04 = new FES_3484_04_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getFES_Helper().create3484_04();
			app.getFes_3484_04_Helper().inputRequiredValues3484_04(fes_3484_04);
			app.getFES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveRequiredFieldsFES_3484_04");
		}
	}
		
	@Test
	public void testCreateAndSaveAllFieldsFES_3484_04() throws InterruptedException {
		try{
			log.AppendToFile("---testCreateAndSaveAllFieldsFES_3484_04---");
			FES_3484_04_DOC fes_3484_04 = new FES_3484_04_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getFES_Helper().create3484_04();
			app.getFes_3484_04_Helper().inputAllValues3484_04(fes_3484_04);
			app.getFES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveAllFieldsFES_3484_04");
		}
	}
	
	@Test
	public void testCreateAndSendRequiredFieldsFES_3484_04() throws InterruptedException {
		try{
			log.AppendToFile("---testCreateAndSendRequiredFieldsFES_3484_04---");
			FES_3484_04_DOC fes_3484_04 = new FES_3484_04_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getFES_Helper().create3484_04();
			app.getFes_3484_04_Helper().inputRequiredValues3484_04(fes_3484_04);
			app.getFES_Helper().saveAndClose();
			app.getFES_Helper().selectAndSend();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendRequiredFieldsFES_3484_04");
		}
	}
		
	@Test
	public void testCreateAndSendAllFieldsFES_3484_04() throws InterruptedException {
		try{
			log.AppendToFile("---testCreateAndSendAllFieldsFES_3484_04---");
			FES_3484_04_DOC fes_3484_04 = new FES_3484_04_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getFES_Helper().create3484_04();
			app.getFes_3484_04_Helper().inputAllValues3484_04(fes_3484_04);
			app.getFES_Helper().saveAndClose();
			app.getFES_Helper().selectAndSend();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendAllFieldsFES_3484_04");
		}
	}

}
