package comita.auto.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FES_3484_03_Page extends FES_NFO_Page {

	public FES_3484_03_Page(PageManager pages) {
		super(pages);		
	}
	
	public FES_3484_03_Page ensurePageLoaded() {
	    super.ensurePageLoaded();
	    return this;
	}
	
	@FindBy(xpath = "(//span[@class='lefrMenuSpan'])[3]")
	WebElement infoAboutMeasuresTabLink;
	
	@FindBy(xpath = "(//span[.='Добавить'])[1]")
	WebElement addRecordButton;
	
	@FindBy(id = "number")
	WebElement id;
	
	@FindBy(id = "snfoMeasureType")
	WebElement recordTypeFES;
	
	@FindBy(id = "snfoMeasureCode")
	WebElement baseApplyMeasuresCode;
	
	@FindBy(id = "snfoMeasureCodePerson")
	WebElement organizationCode;
	
	@FindBy(id = "dateInsp")
	WebElement dateOfBlocking;
	
	@FindBy(id = "timeInsp")
	WebElement timeOfBlocking;
	
	@FindBy(id = "snfoTypeProp")
	WebElement typeOfFundsOrPropertyToBlock;
	
	@FindBy(id = "snfoCodeVal")
	WebElement currencyCode;
	
	@FindBy(id = "snfoSumm")
	WebElement sum;
	
	@FindBy(id = "snfoSummRub")
	WebElement sumRUR;
	
	@FindBy(id = "snfoPaper")
	WebElement infoAboutSecurities;
	
	@FindBy(id = "snfoPricePaper")
	WebElement nominalValueOfSecurities;
	
	@FindBy(id = "snfoMarketPrPaper")
	WebElement marketValueOfSecurities;
	
	@FindBy(id = "purposePay")
	WebElement purposePay;
	
	@FindBy(xpath = "//span[.='OK']")
	WebElement buttonOK;
	
	public FES_3484_03_Page selectInfoAboutMeasuresTab() {
		clickElement(infoAboutMeasuresTabLink);
		return this;
	}
	
	public FES_3484_03_Page addRecord() {
		clickElement(addRecordButton);
		return this;
	}
	
	public FES_3484_03_Page setId(String value) {
		String new_value =  id.getAttribute("value").substring(0, 18) + value + id.getAttribute("value").substring(27);
		setValue(id, new_value);
		return this;
	}
	
	public FES_3484_03_Page selectRecordTypeFES(String value) {
		selectOption(recordTypeFES, value);
		return this;
	}
	
	public FES_3484_03_Page selectBaseApplyMeasuresCode(String value) {
		selectOption(baseApplyMeasuresCode, value);
		return this;
	}
	
	public FES_3484_03_Page setOrganizationCode(String value) {
		setValue(organizationCode, value);
		return this;
	}
	
	public FES_3484_03_Page setDateOfBlocking(String value) {
		setValue(dateOfBlocking, value);
		return this;
	}
	
	public FES_3484_03_Page setTimeOfBlocking(String value) {
		setValue(timeOfBlocking, value);
		return this;
	}
	
	public FES_3484_03_Page selectTypeOfFundsOrPropertyToBlock(String value) {
		selectOption(typeOfFundsOrPropertyToBlock, value);
		return this;
	}
	
	public FES_3484_03_Page selectCurrencyCode(String value) {
		if (typeOfFundsOrPropertyToBlock.getText().contains("для безналичных денежных средств") ||
				typeOfFundsOrPropertyToBlock.getText().contains("для наличных денежных средств") ||
				typeOfFundsOrPropertyToBlock.getText().contains("для электронных денежных средств")) {
			selectOption(currencyCode, value);
		}
		return this;
	}
	
	public FES_3484_03_Page setSum(String value) {
		if (typeOfFundsOrPropertyToBlock.getText().contains("для безналичных денежных средств") ||
				typeOfFundsOrPropertyToBlock.getText().contains("для наличных денежных средств") ||
				typeOfFundsOrPropertyToBlock.getText().contains("для электронных денежных средств")) {
			setValue(sum, value);
		}
		return this;
	}
	
	public FES_3484_03_Page setSumRUR(String value) {
		if (typeOfFundsOrPropertyToBlock.getText().contains("для безналичных денежных средств") ||
				typeOfFundsOrPropertyToBlock.getText().contains("для наличных денежных средств") ||
				typeOfFundsOrPropertyToBlock.getText().contains("для электронных денежных средств")) {
			setValue(sumRUR, value);
		}
		return this;
	}
	
	public FES_3484_03_Page selectInfoAboutSecurities(String value) {
		if (typeOfFundsOrPropertyToBlock.getText().contains("для ценных бумаг")) {
			selectOption(infoAboutSecurities, value);
		}
		return this;
	}
	
	public FES_3484_03_Page setNominalValueOfSecurities(String value) {
		if (typeOfFundsOrPropertyToBlock.getText().contains("для ценных бумаг")) {
			setValue(nominalValueOfSecurities, value);
		}
		return this;
	}
	
	public FES_3484_03_Page setMarketValueOfSecurities(String value) {
		if (typeOfFundsOrPropertyToBlock.getText().contains("для ценных бумаг") ||
				typeOfFundsOrPropertyToBlock.getText().contains("для драгоценных металлов") ||
				typeOfFundsOrPropertyToBlock.getText().contains("для иного имущества")) {
			setValue(marketValueOfSecurities, value);
		}
		return this;
	}
	
	public FES_3484_03_Page setPurposePay(String value) {
		setValue(purposePay, value);
		return this;
	}
	
	public FES_3484_03_Page clickOK() {
		clickElement(okButton);
		return this;
	}
}