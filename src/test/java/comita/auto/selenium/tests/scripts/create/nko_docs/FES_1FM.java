package comita.auto.selenium.tests.scripts.create.nko_docs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import comita.auto.selenium.base.TestBase;
import comita.auto.selenium.model.FES_1FM_DOC;

public class FES_1FM extends TestBase {
	
	@BeforeMethod(groups = {"base.checks"})
	public void setUp(){		
		video.startRecording(app.getWebDriver());
	}
	
	@Test(groups = {"base.checks"})
	public void testCheckCreateFES_1FM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateFES_1FM---");
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create1FM();
			app.getFES_Helper().close();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateFES_1FM");
		}
	}

	@Test
	public void testCreateAndSaveAllFieldsFES_1FM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSaveAllFieldsFES_1FM---");
			FES_1FM_DOC fes_1fm = new FES_1FM_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create1FM();
			app.getFES_1FM_Helper().inputAllValues1FM(fes_1fm);
			app.getFES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveAllFieldsFES_1FM");
		}
	}	
	
	@Test
	public void testCreateAndSaveRequiredFieldsFES_1FM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSaveRequiredFieldsFES_1FM---");
			FES_1FM_DOC fes_1fm = new FES_1FM_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create1FM();
			app.getFES_1FM_Helper().inputRequiredValues1FM(fes_1fm);
			app.getFES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveRequiredFieldsFES_1FM");
		}
	}
	
	@Test
	public void testCreateAndSendAllFieldsFES_1FM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSendAllFieldsFES_1FM---");
			FES_1FM_DOC fes_1fm = new FES_1FM_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create1FM();
			app.getFES_1FM_Helper().inputAllValues1FM(fes_1fm);
			app.getFES_Helper().saveAndClose();
			app.getFES_Helper().selectAndSend();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendAllFieldsFES_1FM");
		}
	}	
	
	@Test
	public void testCreateAndSendRequiredFieldsFES_1FM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSendRequiredFieldsFES_1FM---");
			FES_1FM_DOC fes_1fm = new FES_1FM_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create1FM();
			app.getFES_1FM_Helper().inputRequiredValues1FM(fes_1fm);
			app.getFES_Helper().saveAndClose();
			app.getFES_Helper().selectAndSend();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendRequiredFieldsFES_1FM");
		}
	}

}
