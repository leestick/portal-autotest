package comita.auto.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public abstract class AnyPage extends Page {

	public AnyPage(PageManager pages) {
		super(pages);
		HtmlElementLoader.populatePageObject(this, driver);	
	}
	
	public String getShortString(String string) {
		int index = string.indexOf("-");
		String result = string.substring(0,index - 1);
		return result;
	}
	
	//вспомогательный метод по очистке поля
	public void clearField(WebElement element){
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		element.clear();
	}
	
	//вспомогательный метод для клика по элементу
	public void clickElement(WebElement element){
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	//вспомогательный метод для заполнения текстовых полей
	public void setValue(WebElement element, String value){		
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.clear();
		element.sendKeys(value);
	}
	
	//вспомогательный метод для выбора значения из обычного списка (все значения которого сразу видны)
	public void selectOption(WebElement element, String value){
		clickElement(element);
		clickElement(element.findElement(By.cssSelector("div > div > ui > li[title*='" + value + "']")));
	}
	
	//вспомогательный метод для выбора значения из длинного списка
	public void selectOptionFromLongList(WebElement element, String value){
		clickElement(element);		
		setValue(element.findElement(By.cssSelector("div.list-selectcustom > input[type='text']")), getShortString(value));
		//clickElement(element.findElement(By.cssSelector("div.list-selectcustom > div.uiscroll-selectcustom > ui.ul-selectcustom > li[title='" + value + "']")));
	}
	
	
	
	
	
	
}
