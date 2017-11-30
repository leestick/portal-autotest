package comita.auto.selenium.tests.scripts.create.nfo_docs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import comita.auto.selenium.base.TestBase;
import comita.auto.selenium.model.FES_3484_04_DOC;
import comita.auto.selenium.model.FES_3484_08_DOC;

public class FES_3484_08 extends TestBase {
	
	@BeforeMethod(groups = {"base.checks"})
	public void setUp(){		
		video.startRecording(app.getWebDriver());
	}
	
	@Test(groups = {"base.checks"})
	public void testCheckCreateFES_3484_08() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateFES_3484_08---");
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getFES_Helper().create3484_08();
			app.getFES_Helper().close();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateFES_3484_08");
		}
	}
	
	@Test
	public void testCreateAndSaveRequiredFieldsFES_3484_08() throws InterruptedException {
		try{
			log.AppendToFile("---testCreateAndSaveRequiredFieldsFES_3484_08---");
			FES_3484_08_DOC fes_3484_08 = new FES_3484_08_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getFES_Helper().create3484_08();
			app.getFes_3484_08_Helper().inputRequiredValues3484_08(fes_3484_08);
			app.getFES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveRequiredFieldsFES_3484_08");
		}
	}
		
	@Test
	public void testCreateAndSaveAllFields3484_08() throws InterruptedException {
		try{
			log.AppendToFile("---testCreateAndSaveAllFieldsFES_3484_08---");
			FES_3484_08_DOC fes_3484_08 = new FES_3484_08_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getFES_Helper().create3484_08();
			app.getFes_3484_08_Helper().inputAllValues3484_08(fes_3484_08);
			app.getFES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveAllFieldsFES_3484_08");
		}
	}
	
	@Test
	public void testCreateAndSendRequiredFieldsFES_3484_08() throws InterruptedException {
		try{
			log.AppendToFile("---testCreateAndSendRequiredFieldsFES_3484_08---");
			FES_3484_08_DOC fes_3484_08 = new FES_3484_08_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getFES_Helper().create3484_08();
			app.getFes_3484_08_Helper().inputRequiredValues3484_08(fes_3484_08);
			app.getFES_Helper().saveAndClose();
			app.getFES_Helper().selectAndSend();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendRequiredFieldsFES_3484_08");
		}
	}
		
	@Test
	public void testCreateAndSendAllFields3484_08() throws InterruptedException {
		try{
			log.AppendToFile("---testCreateAndSendAllFieldsFES_3484_08---");
			FES_3484_08_DOC fes_3484_08 = new FES_3484_08_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getFES_Helper().create3484_08();
			app.getFes_3484_08_Helper().inputAllValues3484_08(fes_3484_08);
			app.getFES_Helper().saveAndClose();
			app.getFES_Helper().selectAndSend();			
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendAllFieldsFES_3484_08");
		}
	}

}
