package comita.auto.selenium.tests.scripts.create.nfo_docs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import comita.auto.selenium.base.TestBase;
import comita.auto.selenium.model.FES_3484_010206_DOC;

public class FES_3484_010206 extends TestBase {
	
	@BeforeMethod(groups = {"base.checks"})
	public void setUp(){		
		video.startRecording(app.getWebDriver());
	}
	
	@Test(groups = {"base.checks"})
	public void testCheckCreateFES_3484_010206() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateFES_3484_010206---");
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getFES_Helper().create3484_010206();
			app.getFES_Helper().close();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateFES_3484_010206");
		}
	}
			
	@Test
	public void testCreateAndSaveAllFieldsFES_3484_010206() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSaveAllFieldsFES_3484_010206---");
			FES_3484_010206_DOC fes_3484_010206 = new FES_3484_010206_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getFES_Helper().create3484_010206();
			app.getFes_3484_010206_Helper().inputAllValues3484_010206(fes_3484_010206);
			app.getFES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveAllFieldsFES_3484_010206");
		}
	}
		
	@Test
	public void testCreateAndSendAllFieldsFES_3484_010206() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSendAllFieldsFES_3484_010206---");
			FES_3484_010206_DOC fes_3484_010206 = new FES_3484_010206_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getFES_Helper().create3484_010206();
			app.getFes_3484_010206_Helper().inputAllValues3484_010206(fes_3484_010206);
			app.getFES_Helper().saveAndClose();
			app.getFES_Helper().selectAndSend();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendAllFieldsFES_3484_010206");
		}
	}
}
