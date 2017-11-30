package comita.auto.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Страница Личного Кабинета
 * @author dmitryd
 *
 */
public class PrivateOfficePage extends AnyPage {

	public PrivateOfficePage(PageManager pages) {
		super(pages);
	}
	
	public PrivateOfficePage ensurePageLoaded() {
	    super.ensurePageLoaded();	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tab2cells"))); 
	    wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
	    return this;
	}
	
	//@FindBy(id = "logoutButton")
	@FindBy(xpath = "//img[contains(@src,'img/icon_exit.png')]")
	WebElement logoutButton;
	
	//Ссылка "Выход"
	@FindBy(xpath = "//button[.='Выход']")
	WebElement confirmationCloseButton;
	
	//Кнопка "Создать документ"
	@FindBy(id = "actionNewItem")
	WebElement createDocButton;
	
	//Пункт меню "3484 ФЭС о замораживании (блокировании)"
	@FindBy(xpath = "//p[contains(@ng-click,'3484_03')]")
	WebElement create3484_03;
	
	//Пункт меню "3484 ФЭС о результатах проверки"
	@FindBy(xpath = "//p[contains(@ng-click,'3484_04')]")
	WebElement create3484_04;
	
	//Пункт меню "443 ЭС об открытии счета"
	@FindBy(xpath = "//p[contains(@ng-click,'443_1')]")
	WebElement create443_1;
	
	//Пункт меню "443 ЭС о приобретении ценных бумаг"
	@FindBy(xpath = "//p[contains(@ng-click,'443_2')]")
	WebElement create443_2;	
	
	//Пункт меню "3484 ФЭС о случаях отказа"
	@FindBy(xpath = "//p[contains(@ng-click,'3484_08')]")
	WebElement create3484_08;
	
	//Пункт меню "3484 ФЭС об операциях"
	@FindBy(xpath = "//p[contains(@ng-click,'3484_010206')]")
	WebElement create3484_010206;
	
	//Пункт меню "1-ФМ - ФЭС об операции"
	@FindBy(xpath = "//p[contains(@ng-click,'1FM')]")
	WebElement create1FM;
	
	//Пункт меню "1-ФМ - ФЭС об операции (Почта РФ)"
	@FindBy(xpath = "//p[contains(@ng-click,'1FM_7')]")
	WebElement create1FM_POSTRF;
	
	//Пункт меню "2-ФМ - ФЭС о принятых мерах"
	@FindBy(xpath = "//p[contains(@ng-click,'2FM')]")
	WebElement create2FM;
	
	//Пункт меню "3-ФМ - ФЭС о результатах проверки"
	@FindBy(xpath = "//p[contains(@ng-click,'3FM')]")
	WebElement create3FM;
	
	//Пункт меню "4-ФМ - ФЭС о фактах препятствия"
	@FindBy(xpath = "//p[contains(@ng-click,'4FM')]")
	WebElement create4FM;
	
	//Пункт меню "Запрос на удаление ФЭС"
	@FindBy(xpath = "//p[contains(@ng-click,'DELFM')]")
	WebElement createDELFM;
	
	//Первый элемент в списке
	@FindBy(xpath = "//input[@value='0']")
	WebElement firstDocInList;
	
	//Кнопка в окне подписи "Подписать и отправить"
	@FindBy(id = "docSignaction_sign")
	WebElement signAndSendButton;
	
	//Кнопка на панели инструментов "Подписать и отправить"
	@FindBy(css = "img[data-tooltipfm='Подписать и отправить']")
	WebElement signAndSendIcon;
	
	//Кнопка закрыть диалога
	@FindBy(id = "docSignaction_cancel")
	WebElement closeButton;
	
	//Папка "Реестр УЦ"
	@FindBy(id = "reestrUC")
	WebElement folderReestrUC;
	
	//Кнопка "Загрузить"
	@FindBy(id = "uploadFileUCBtn")
	WebElement uploadButton;
	
	//Кнопка "Загрузить"
	@FindBy(id = "uploadFileIdundefinedFile")
	WebElement uploadField;
	
	//Кнопка "ОК" окна "Загрузка реестра"
	@FindBy(id = "submitUD")
	WebElement submitUD;
	
	//Кнопка "ОК" окна "Загрузка реестра"
	@FindBy(xpath = "//span[.='Закрыть']")
	WebElement closeUD;
	
	public PrivateOfficePage clickLogoutButton(){
		clickElement(logoutButton);
		return this;
	}
	
	public LoginPage clickConfirmationButton(){
		clickElement(confirmationCloseButton);
		return pages.loginPage;
	}

	public PrivateOfficePage openCreateDocMenu() {
		Actions action = new Actions(driver);
		wait.until(ExpectedConditions.elementToBeClickable(createDocButton));
		action.moveToElement(createDocButton).perform();
		action.click().perform();
		return this;
	}
	
	public void createDoc(WebElement element) {
		openCreateDocMenu();
		Actions action = new Actions(driver);		
		action.moveToElement(element);
		action.click().perform();
	}
	
	public FES_1FM_Page createFES_1FM() {
		createDoc(create1FM);
		return pages.fes_1fm_Page;
	}
	
	public FES_1FM_POSTRF_Page createFES_1FM_POSTRF() {
		createDoc(create1FM_POSTRF);
		return pages.fes_1fm_postrf_Page;
	}
	
	public FES_2FM_Page createFES_2FM() {
		createDoc(create2FM);
		return pages.fes_2fm_Page;
	}
	
	public FES_3FM_Page createFES_3FM() {
		createDoc(create3FM);
		return pages.fes_3fm_Page;
	}
	
	public FES_4FM_Page createFES_4FM() {
		createDoc(create4FM);
		return pages.fes_4fm_Page;
	}
	
	public FES_DELFM_Page createDELFM() {
		createDoc(createDELFM);
		return pages.delfm_Page;
	}
	
	public FES_3484_03_Page createFES_3484_03() {
		createDoc(create3484_03);
		return pages.fes_3484_03_Page;
	}

	public FES_3484_04_Page createFES_3484_04() {
		createDoc(create3484_04);
		return pages.fes_3484_04_Page;
	}

	public ES_443_2_Page createES_443_2() {
		createDoc(create443_2);
		return pages.es_443_2_Page;
	}

	public ES_443_1_Page createES_443_1() {
		createDoc(create443_1);
		return pages.es_443_1_Page;
	}

	public FES_3484_08_Page createFES_3484_08() {
		createDoc(create3484_08);
		return pages.fes_3484_08_Page;
	}

	public FES_3484_010206_Page createFES_3484_010206() {
		createDoc(create3484_010206);
		return pages.fes_3484_010206_Page;
	}

	public PrivateOfficePage selectFirstDocument() {
		clickElement(firstDocInList);
		return this;
	}
	
	public PrivateOfficePage signAndSend() throws InterruptedException{		
		clickElement(signAndSendIcon);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td.docCheckStatus")));
		clickElement(signAndSendButton);
		clickElement(closeButton);
		return this;
	}
	
	public PrivateOfficePage selectFolder(String folderName){
		switch (folderName) {
		case "Реестр УЦ":
			clickElement(folderReestrUC);
			break;
		}
		return this;
	}

	public PrivateOfficePage uploadFile(String filePath) {
		wait.until(ExpectedConditions.elementToBeClickable(uploadButton));
		//uploadButton.click();
		/*Actions action = new Actions(driver);
		action.sendKeys("");
		action.sendKeys(uploadField, filePath).build().perform();*/
		uploadField.sendKeys(filePath);
		clickElement(submitUD);
		clickElement(closeUD);
		return this;
	}
	
	
}
