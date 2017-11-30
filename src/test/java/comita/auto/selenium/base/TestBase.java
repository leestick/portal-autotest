package comita.auto.selenium.base;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import comita.auto.selenium.applogic.ApplicationManager;
import comita.auto.selenium.model.User;
import comita.auto.selenium.util.Dates;
import comita.auto.selenium.util.PropertyLoader;
import comita.auto.selenium.util.ReadFromFile;
import comita.auto.selenium.util.VideoRecorder;
import comita.auto.selenium.util.WriteToFile;

/**
 * Base class for all the TestNG-based test classes
 */
public class TestBase {
	protected static ApplicationManager app;
	protected String logPath = PropertyLoader.loadProperty("log.path");
	protected WriteToFile log = new WriteToFile(logPath);
	protected Dates dates = new Dates();
	protected ReadFromFile file = new ReadFromFile();
	protected VideoRecorder video = new VideoRecorder();
	
	protected User USER_NFO = new User().setLogin("bumaga").setPassword("12345678");
	protected User USER_NKO = new User().setLogin("bumaga11").setPassword("12345678");
	protected User USER_ZOLSUP = new User().setLogin("zolsup").setPassword("12345678");
	
	@BeforeClass(groups = {"base.support", "base.checks"})
	public void init() {
		app = new ApplicationManager();	
	}

	@AfterClass(groups = {"base.support", "base.checks"})
	public void stop() {
		app.stop();
	}
}
