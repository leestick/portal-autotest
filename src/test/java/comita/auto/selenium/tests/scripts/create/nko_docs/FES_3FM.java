package comita.auto.selenium.tests.scripts.create.nko_docs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import comita.auto.selenium.base.TestBase;
import comita.auto.selenium.model.FES_3FM_DOC;

public class FES_3FM extends TestBase {
	
	@BeforeMethod(groups = {"base.checks"})
	public void setUp(){		
		video.startRecording(app.getWebDriver());
	}
	
	@Test(groups = {"base.checks"})
	public void testCheckCreateFES_3FM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateFES_3FM---");
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create3FM();
			app.getFES_Helper().close();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateFES_3FM");
		}
	}

	@Test
	public void testCreateAndSaveAllFieldsFES_3FM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSaveAllFieldsFES_3FM---");
			FES_3FM_DOC fes_3FM = new FES_3FM_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create3FM();
			app.getFES_3FM_Helper().inputAllValues3FM(fes_3FM);
			app.getFES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveAllFieldsFES_3FM");
		}
	}
	
	@Test
	public void testCreateAndSaveRequiredFieldsFES_3FM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSaveRequiredFieldsFES_3FM---");
			FES_3FM_DOC fes_3FM = new FES_3FM_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create3FM();
			app.getFES_3FM_Helper().inputRequiredValues3FM(fes_3FM);
			app.getFES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveRequiredFieldsFES_3FM");
		}
	}
	
	@Test
	public void testCreateAndSendAllFieldsFES_3FM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSendAllFieldsFES_3FM---");
			FES_3FM_DOC fes_3FM = new FES_3FM_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create3FM();
			app.getFES_3FM_Helper().inputAllValues3FM(fes_3FM);
			app.getFES_Helper().saveAndClose();
			app.getFES_Helper().selectAndSend();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendAllFieldsFES_3FM");
		}
	}
	
	@Test
	public void testCreateAndSendRequiredFieldsFES_3FM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSendRequiredFieldsFES_3FM---");
			FES_3FM_DOC fes_3FM = new FES_3FM_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create3FM();
			app.getFES_3FM_Helper().inputRequiredValues3FM(fes_3FM);
			app.getFES_Helper().saveAndClose();
			app.getFES_Helper().selectAndSend();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendRequiredFieldsFES_3FM");
		}
	}
}
