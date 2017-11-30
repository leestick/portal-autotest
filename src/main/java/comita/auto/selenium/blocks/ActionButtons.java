package comita.auto.selenium.blocks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@Name("Action buttons")
@FindBy(css = "div.actionUMWbuttons")

public class ActionButtons extends HtmlElement {

	@FindBy(xpath = "//span[.='Проверить']")
	public WebElement checkButton;
	
	@FindBy(xpath = "//span[.='Сохранить']")
	public WebElement saveButton;
	
	@FindBy(xpath = "//span[.='Закрыть']")
	public WebElement closeButton;
	
	@FindBy(xpath = "//span[.='Закрыть документ']")
	public WebElement closeAfterSaveButton;
	
}
