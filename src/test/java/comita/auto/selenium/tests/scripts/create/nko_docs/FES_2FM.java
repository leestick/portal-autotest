package comita.auto.selenium.tests.scripts.create.nko_docs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import comita.auto.selenium.base.TestBase;
import comita.auto.selenium.model.FES_2FM_DOC;

public class FES_2FM extends TestBase {

	@BeforeMethod(groups = {"base.checks"})
	public void setUp(){		
		video.startRecording(app.getWebDriver());
	}
	
	@Test(groups = {"base.checks"})
	public void testCheckCreateFES_2FM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateFES_2FM---");
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create2FM();
			app.getFES_Helper().close();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateFES_2FM");
		}
	}

	@Test
	public void testCreateAndSaveAllFieldsFES_2FM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSaveAllFieldsFES_2FM---");
			FES_2FM_DOC fes_2FM = new FES_2FM_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create2FM();
			app.getFES_2FM_Helper().inputAllValues2FM(fes_2FM);
			app.getFES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveAllFieldsFES_2FM");
		}
	}
	
	@Test
	public void testCreateAndSaveRequiredFieldsFES_2FM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSaveRequiredFieldsFES_2FM---");
			FES_2FM_DOC fes_2FM = new FES_2FM_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create2FM();
			app.getFES_2FM_Helper().inputRequiredValues2FM(fes_2FM);
			app.getFES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveRequiredFieldsFES_2FM");
		}
	}
	
	@Test
	public void testCreateAndSendAllFieldsFES_2FM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSendAllFieldsFES_2FM---");
			FES_2FM_DOC fes_2FM = new FES_2FM_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create2FM();
			app.getFES_2FM_Helper().inputAllValues2FM(fes_2FM);
			app.getFES_Helper().saveAndClose();
			app.getFES_Helper().selectAndSend();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendAllFieldsFES_2FM");
		}
	}
	
	@Test
	public void testCreateAndSendRequiredFieldsFES_2FM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSendRequiredFieldsFES_2FM---");
			FES_2FM_DOC fes_2FM = new FES_2FM_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create2FM();
			app.getFES_2FM_Helper().inputRequiredValues2FM(fes_2FM);
			app.getFES_Helper().saveAndClose();
			app.getFES_Helper().selectAndSend();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendRequiredFieldsFES_2FM");
		}
	}
	
}
