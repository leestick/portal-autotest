package comita.auto.selenium.tests.scripts.create.nko_docs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import comita.auto.selenium.base.TestBase;
import comita.auto.selenium.model.FES_DELFM_DOC;

public class FES_DELFM extends TestBase {

	@BeforeMethod(groups = {"base.checks"})
	public void setUp(){		
		video.startRecording(app.getWebDriver());
	}
	
	@Test(groups = {"base.checks"})
	public void testCheckCreateFES_DELFM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateFES_DELFM---");
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().createDELFM();
			app.getFES_Helper().close();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateFES_DELFM");
		}
	}

	@Test
	public void testCreateAndSaveAllFieldsFES_DELFM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSaveAllFieldsFES_DELFM---");
			FES_DELFM_DOC fes_DELFM = new FES_DELFM_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().createDELFM();
			app.getFES_DELFM_Helper().inputAllValuesDELFM(fes_DELFM);
			app.getFES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveAllFieldsFES_DELFM");
		}
	}
	
	@Test
	public void testCreateAndSaveRequiredFieldsFES_DELFM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSaveRequiredFieldsFES_DELFM---");
			FES_DELFM_DOC fes_DELFM = new FES_DELFM_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().createDELFM();
			app.getFES_DELFM_Helper().inputRequiredValuesDELFM(fes_DELFM);
			app.getFES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveRequiredFieldsFES_DELFM");
		}
	}
	
	@Test
	public void testCreateAndSendAllFieldsFES_DELFM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSendAllFieldsFES_DELFM---");
			FES_DELFM_DOC fes_DELFM = new FES_DELFM_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().createDELFM();
			app.getFES_DELFM_Helper().inputAllValuesDELFM(fes_DELFM);
			app.getFES_Helper().saveAndClose();
			app.getFES_Helper().selectAndSend();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendAllFieldsFES_DELFM");
		}
	}
	
	@Test
	public void testCreateAndSendRequiredFieldsFES_DELFM() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSendRequiredFieldsFES_DELFM---");
			FES_DELFM_DOC fes_DELFM = new FES_DELFM_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().createDELFM();
			app.getFES_DELFM_Helper().inputRequiredValuesDELFM(fes_DELFM);
			app.getFES_Helper().saveAndClose();
			app.getFES_Helper().selectAndSend();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendRequiredFieldsFES_DELFM");
		}
	}


	
}
