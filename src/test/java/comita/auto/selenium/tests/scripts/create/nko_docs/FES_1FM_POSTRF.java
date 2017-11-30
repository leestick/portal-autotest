package comita.auto.selenium.tests.scripts.create.nko_docs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import comita.auto.selenium.base.TestBase;
import comita.auto.selenium.model.FES_1FM_POSTRF_DOC;

public class FES_1FM_POSTRF extends TestBase {
	
	@BeforeMethod(groups = {"base.checks"})
	public void setUp(){		
		video.startRecording(app.getWebDriver());
	}
	
	@Test(groups = {"base.checks"})
	public void testCheckCreateFES_1FM_POSTRF() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateFES_1FM_POSTRF---");
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create1FM_POSTRF();
			app.getFES_Helper().close();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateFES_1FM_POSTRF");
		}
	}

	@Test
	public void testCreateAndSaveAllFieldsFES_1FM_POSTRF() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSaveAllFieldsFES_1FM_POSTRF---");
			FES_1FM_POSTRF_DOC fes_1fm_postrf = new FES_1FM_POSTRF_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create1FM_POSTRF();
			app.getFES_1FM_POSTRF_Helper().inputAllValues1FM_POSTRF(fes_1fm_postrf);
			app.getFES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveAllFieldsFES_1FM_POSTRF");
		}
	}	
	
	@Test
	public void testCreateAndSaveRequiredFieldsFES_1FM_POSTRF() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSaveRequiredFieldsFES_1FM_POSTRF---");
			FES_1FM_POSTRF_DOC fes_1fm_postrf = new FES_1FM_POSTRF_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create1FM_POSTRF();
			app.getFES_1FM_POSTRF_Helper().inputRequiredValues1FM_POSTRF(fes_1fm_postrf);
			app.getFES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveRequiredFieldsFES_1FM_POSTRF");
		}
	}
	
	@Test
	public void testCreateAndSendAllFieldsFES_1FM_POSTRF() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSendAllFieldsFES_1FM_POSTRF---");
			FES_1FM_POSTRF_DOC fes_1fm_postrf = new FES_1FM_POSTRF_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create1FM_POSTRF();
			app.getFES_1FM_POSTRF_Helper().inputAllValues1FM_POSTRF(fes_1fm_postrf);
			app.getFES_Helper().saveAndClose();
			app.getFES_Helper().selectAndSend();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendAllFieldsFES_1FM_POSTRF");
		}
	}	
	
	@Test
	public void testCreateAndSendRequiredFieldsFES_1FM_POSTRF() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSendRequiredFieldsFES_1FM_POSTRF---");
			FES_1FM_POSTRF_DOC fes_1fm_postrf = new FES_1FM_POSTRF_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NKO);
			app.getFES_Helper().create1FM_POSTRF();
			app.getFES_1FM_POSTRF_Helper().inputRequiredValues1FM_POSTRF(fes_1fm_postrf);
			app.getFES_Helper().saveAndClose();
			app.getFES_Helper().selectAndSend();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendRequiredFieldsFES_1FM_POSTRF");
		}
	}

}