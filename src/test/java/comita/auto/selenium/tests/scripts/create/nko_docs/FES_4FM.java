package comita.auto.selenium.tests.scripts.create.nko_docs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import comita.auto.selenium.base.TestBase;
import comita.auto.selenium.model.FES_4FM_DOC;

public class FES_4FM extends TestBase {
	
	@BeforeMethod(groups = {"base.checks"})
	public void setUp(){		
		video.startRecording(app.getWebDriver());
	}
	
	@Test(groups = {"base.checks"})
	public void testCheckCreateFES_4FM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateFES_4FM---");
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create4FM();
			app.getFES_Helper().close();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateFES_4FM");
		}
	}

	@Test
	public void testCreateAndSaveAllFieldsFES_4FM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSaveAllFieldsFES_4FM---");
			FES_4FM_DOC fes_4FM = new FES_4FM_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create4FM();
			app.getFES_4FM_Helper().inputAllValues4FM(fes_4FM);
			app.getFES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveAllFieldsFES_4FM");
		}
	}
	
	@Test
	public void testCreateAndSaveRequiredFieldsFES_4FM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSaveRequiredFieldsFES_4FM---");
			FES_4FM_DOC fes_4FM = new FES_4FM_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create4FM();
			app.getFES_4FM_Helper().inputRequiredValues4FM(fes_4FM);
			app.getFES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveRequiredFieldsFES_4FM");
		}
	}
	
	@Test
	public void testCreateAndSendAllFieldsFES_4FM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSendAllFieldsFES_4FM---");
			FES_4FM_DOC fes_4FM = new FES_4FM_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create4FM();
			app.getFES_4FM_Helper().inputAllValues4FM(fes_4FM);
			app.getFES_Helper().saveAndClose();
			app.getFES_Helper().selectAndSend();			
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendAllFieldsFES_4FM");
		}
	}
	
	@Test
	public void testCreateAndSendRequiredFieldsFES_4FM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSendRequiredFieldsFES_4FM---");
			FES_4FM_DOC fes_4FM = new FES_4FM_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create4FM();
			app.getFES_4FM_Helper().inputRequiredValues4FM(fes_4FM);
			app.getFES_Helper().saveAndClose();
			app.getFES_Helper().selectAndSend();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendRequiredFieldsFES_4FM");
		}
	}

}
