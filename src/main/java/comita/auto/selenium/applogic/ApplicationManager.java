package comita.auto.selenium.applogic;

import org.openqa.selenium.WebDriver;

import comita.auto.selenium.util.Browser;
import comita.auto.selenium.util.PropertyLoader;
import comita.auto.selenium.webdriver.WebDriverFactory;

public class ApplicationManager {
		
	public String siteUrl;
	private String gridHubUrl;
	private String username;
	private String password;	 
	private WebDriver driver;
	
	private ES_Helper es_Helper;
	private ES_443_1_Helper es_443_1_Helper;
	private ES_443_2_Helper es_443_2_Helper;
	private FES_1FM_Helper fes_1fm_Helper;
	private FES_1FM_POSTRF_Helper fes_1fm_postrf_Helper;
	private FES_2FM_Helper fes_2fm_Helper;
	private FES_3FM_Helper fes_3fm_Helper;
	private FES_4FM_Helper fes_4fm_Helper;
	private FES_DELFM_Helper fes_delfm_Helper;
	private FES_3484_010206_Helper fes_3484_010206_Helper;
	private FES_3484_03_Helper fes_3484_03_Helper;
	private FES_3484_04_Helper fes_3484_04_Helper;
	private FES_3484_08_Helper fes_3484_08_Helper;
	private FES_Helper fes_Helper;
	private NavigationHelper navigationHelper;
	private PrivateOfficeHelper privateOfficeHelper;
	private UserHelper userHelper;
	
	public ApplicationManager(){
		  siteUrl = PropertyLoader.loadProperty("site.url");
		  gridHubUrl = PropertyLoader.loadProperty("grid2.hub");

		  Browser browser = new Browser();
		  browser.setName(PropertyLoader.loadProperty("browser.name"));
		  browser.setVersion(PropertyLoader.loadProperty("browser.version"));
		  browser.setPlatform(PropertyLoader.loadProperty("browser.platform"));		  
		  username = PropertyLoader.loadProperty("user.username");
		  password = PropertyLoader.loadProperty("user.password");
		  		  
		  driver = WebDriverFactory.getInstance(gridHubUrl, browser, username, password);
		  driver.manage().window().maximize();
		  driver.switchTo().defaultContent();
		  
		  es_Helper = new ES_Helper(this);
		  es_443_1_Helper = new ES_443_1_Helper(this);
		  es_443_2_Helper = new ES_443_2_Helper(this);
		  fes_1fm_Helper = new FES_1FM_Helper(this);
		  fes_1fm_postrf_Helper = new FES_1FM_POSTRF_Helper(this);
		  fes_2fm_Helper = new FES_2FM_Helper(this);
		  fes_3fm_Helper = new FES_3FM_Helper(this);
		  fes_4fm_Helper = new FES_4FM_Helper(this);
		  fes_delfm_Helper = new FES_DELFM_Helper(this);
		  fes_3484_010206_Helper = new FES_3484_010206_Helper(this);
		  fes_3484_03_Helper = new FES_3484_03_Helper(this);
		  fes_3484_04_Helper = new FES_3484_04_Helper(this);
		  fes_3484_08_Helper = new FES_3484_08_Helper(this);
		  fes_Helper = new FES_Helper(this);
		  navigationHelper = new NavigationHelper(this);
		  privateOfficeHelper = new PrivateOfficeHelper(this);
		  userHelper = new UserHelper(this);
	}
	
	public void stop() {
		if (getWebDriver() != null) {
				getWebDriver().quit();
		}
    }

	public WebDriver getWebDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	protected String getSiteUrl() {
	    return siteUrl;
	}
	
	public ES_Helper getES_Helper() {
		return es_Helper;
	}
	
	public ES_443_1_Helper getES_443_1_Helper() {
		return es_443_1_Helper;
	}
	
	public ES_443_2_Helper getES_443_2_Helper() {
		return es_443_2_Helper;
	}
	
	public FES_Helper getFES_Helper() {
		return fes_Helper;
	}

	public NavigationHelper getNavigationHelper() {		
		return navigationHelper;
	}
	
	public PrivateOfficeHelper getPrivateOfficeHelper() {
		return privateOfficeHelper;
	}

	public UserHelper getUserHelper() {
		return userHelper;
	}
	
	public FES_1FM_Helper getFES_1FM_Helper() {
		return fes_1fm_Helper;
	}
	
	public FES_1FM_POSTRF_Helper getFES_1FM_POSTRF_Helper() {
		return fes_1fm_postrf_Helper;
	}
	
	public FES_2FM_Helper getFES_2FM_Helper() {
		return fes_2fm_Helper;
	}
	
	public FES_3FM_Helper getFES_3FM_Helper() {
		return fes_3fm_Helper;
	}

	public FES_4FM_Helper getFES_4FM_Helper() {
		return fes_4fm_Helper;
	}
	
	public FES_DELFM_Helper getFES_DELFM_Helper() {
		return fes_delfm_Helper;
	}

	public FES_3484_010206_Helper getFes_3484_010206_Helper() {
		return fes_3484_010206_Helper;
	}	
	
	public FES_3484_03_Helper getFes_3484_03_Helper() {
		return fes_3484_03_Helper;
	}
	
	public FES_3484_04_Helper getFes_3484_04_Helper() {
		return fes_3484_04_Helper;
	}
	
	public FES_3484_08_Helper getFes_3484_08_Helper() {
		return fes_3484_08_Helper;
	}
}
