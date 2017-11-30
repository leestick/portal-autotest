package comita.auto.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

public class PageManager {
	private WebDriver driver;
	
	public LoginPage loginPage;
	public PrivateOfficePage privateOfficePage;
	public ES_Page es_Page;
	public FES_NKO_Page fes_nko_Page;
	public FES_NFO_Page fes_nfo_Page;
	public FES_1FM_Page fes_1fm_Page;
	public FES_1FM_POSTRF_Page fes_1fm_postrf_Page;
	public FES_2FM_Page fes_2fm_Page;
	public FES_3FM_Page fes_3fm_Page;
	public FES_4FM_Page fes_4fm_Page;
	public FES_DELFM_Page delfm_Page;
	public FES_3484_010206_Page fes_3484_010206_Page;
	public FES_3484_03_Page fes_3484_03_Page;
	public FES_3484_04_Page fes_3484_04_Page;
	public FES_3484_08_Page fes_3484_08_Page;
	public ES_443_1_Page es_443_1_Page;
	public ES_443_2_Page es_443_2_Page;
	  
    public PageManager(WebDriver driver) {
	    this.driver = driver;
	    loginPage = initElements(new LoginPage(this));
	    privateOfficePage = initElements(new PrivateOfficePage(this));
	    es_Page = initElements(new ES_Page(this));
	    fes_nko_Page = initElements(new FES_NKO_Page(this));
	    fes_nfo_Page = initElements(new FES_NFO_Page(this));
	    fes_1fm_Page = initElements(new FES_1FM_Page(this));
	    fes_1fm_postrf_Page = initElements(new FES_1FM_POSTRF_Page(this));
	    fes_2fm_Page = initElements(new FES_2FM_Page(this));
	    fes_3fm_Page = initElements(new FES_3FM_Page(this));
	    fes_4fm_Page = initElements(new FES_4FM_Page(this));
	    delfm_Page = initElements(new FES_DELFM_Page(this));
	    fes_3484_010206_Page = initElements(new FES_3484_010206_Page(this));
	    fes_3484_03_Page = initElements(new FES_3484_03_Page(this));
	    fes_3484_04_Page = initElements(new FES_3484_04_Page(this));
	    fes_3484_08_Page = initElements(new FES_3484_08_Page(this));
	    es_443_1_Page = initElements(new ES_443_1_Page(this));
	    es_443_2_Page = initElements(new ES_443_2_Page(this));
    }
	  
	  private <T extends Page> T initElements(T page) {		  
		PageFactory.initElements( new HtmlElementDecorator(driver), page);
	    return page;
	  }
	  
	  public WebDriver getWebDriver() {
	    return driver;
	  }
}
