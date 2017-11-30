package comita.auto.selenium.tests.scripts.create.nfo_docs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import comita.auto.selenium.base.TestBase;
import comita.auto.selenium.model.ES_443_2_DOC;

public class ES_443_2 extends TestBase {
	
	@BeforeMethod(groups = {"base.checks"})
	public void setUp(){		
		video.startRecording(app.getWebDriver());
	}
	
	@Test(groups = {"base.checks"})
	public void testCheckCreateES_443_2() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateES_443_2---");
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getES_Helper().create443_2();
			app.getES_Helper().close();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateES_443_2");
		}
	}
	
	@Test
	public void testCreateAndSaveAllFieldsES_443_2() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSaveAllFieldsES_443_2---");
			ES_443_2_DOC es_443_2 = new ES_443_2_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getES_Helper().create443_2();
			app.getES_443_2_Helper().inputAllValues443_2(es_443_2);
			app.getES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveAllFieldsES_443_2");
		}
	}
	
	@Test
	public void testCreateAndSaveRequiredFieldsES_443_2() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSaveRequiredFieldsES_443_2---");
			ES_443_2_DOC es_443_2 = new ES_443_2_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getES_Helper().create443_2();
			app.getES_443_2_Helper().inputRequiredValues443_2(es_443_2);
			app.getES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveRequiredFieldsES_443_2");
		}
	}

	@Test
	public void testCreateAndSendAllFieldsES_443_2() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSendAllFieldsES_443_2---");
			ES_443_2_DOC es_443_2 = new ES_443_2_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getES_Helper().create443_2();
			app.getES_443_2_Helper().inputAllValues443_2(es_443_2);
			app.getES_Helper().saveAndClose();
			app.getES_Helper().selectAndSend();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendAllFieldsES_443_2");
		}
	}
	
	@Test
	public void testCreateAndSendRequiredFieldsES_443_2() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSendRequiredFieldsES_443_2---");
			ES_443_2_DOC es_443_2 = new ES_443_2_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getES_Helper().create443_2();
			app.getES_443_2_Helper().inputRequiredValues443_2(es_443_2);
			app.getES_Helper().saveAndClose();
			app.getES_Helper().selectAndSend();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendRequiredFieldsES_443_2");
		}
	}
}
