package comita.auto.selenium.tests.scripts.create.nfo_docs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import comita.auto.selenium.base.TestBase;
import comita.auto.selenium.model.ES_443_1_DOC;

public class ES_443_1 extends TestBase {
	
	@BeforeMethod(groups = {"base.checks"})
	public void setUp(){		
		video.startRecording(app.getWebDriver());
	}
	
	@Test(groups = {"base.checks"})
	public void testCheckCreateES_443_1() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateES_443_1---");
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getES_Helper().create443_1();
			app.getES_Helper().close();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateES_443_1");
		}
	}

	@Test
	public void testCreateAndSaveAllFieldsES_443_1() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSaveAllFieldsES_443_1---");
			ES_443_1_DOC es_443_1 = new ES_443_1_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getES_Helper().create443_1();
			app.getES_443_1_Helper().inputAllValues443_1(es_443_1);
			app.getES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveAllFieldsES_443_1");
		}
	}	
	
	@Test
	public void testCreateAndSaveRequiredFieldsES_443_1() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSaveRequiredFieldsES_443_1---");
			ES_443_1_DOC es_443_1 = new ES_443_1_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getES_Helper().create443_1();
			app.getES_443_1_Helper().inputRequiredValues443_1(es_443_1);
			app.getES_Helper().saveAndClose();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSaveRequiredFieldsES_443_1");
		}
	}	
	
	
	@Test
	public void testCreateAndSendAllFieldsES_443_1() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSendAllFieldsES_443_1---");
			ES_443_1_DOC es_443_1 = new ES_443_1_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getES_Helper().create443_1();
			app.getES_443_1_Helper().inputAllValues443_1(es_443_1);
			app.getES_Helper().saveAndClose();
			app.getES_Helper().selectAndSend();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendAllFieldsES_443_1");
		}
	}	
	
	@Test
	public void testCreateAndSendRequiredFieldsES_443_1() throws InterruptedException{
		try{
			log.AppendToFile("---testCreateAndSendRequiredFieldsES_443_1---");
			ES_443_1_DOC es_443_1 = new ES_443_1_DOC().writeData();
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(USER_NFO);
			app.getES_Helper().create443_1();
			app.getES_443_1_Helper().inputRequiredValues443_1(es_443_1);
			app.getES_Helper().saveAndClose();
			app.getES_Helper().selectAndSend();
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testCreateAndSendRequiredFieldsES_443_1");
		}
	}
	
}
