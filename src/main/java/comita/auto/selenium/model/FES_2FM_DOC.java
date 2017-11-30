package comita.auto.selenium.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import comita.auto.selenium.util.Dates;

public class FES_2FM_DOC extends FES_DOC {
	
	private String id;
	private String recordTypeFES;
	private String dateOfChange;
	private String codeReasonApplyingMeasures;
	private String codeOfOrganization;
	private String dateToFreeze;
	private String timeToFreeze;
	private String typeOfFundsToFreeze;
	private String currencyCode;
	private String sum;
	private String sumRUR;
	private String securitiesInfo;
	private String securitiesNominalPrice;
	private String securitiesMarketPrice;
	private String additionalInfo;
	private Dates dates = new Dates();
	public String dateAndTime = dates.getDate();
	public String date = dateAndTime.substring(0,10);
	public String time = dateAndTime.substring(10) + ":00";
	
	public FES_2FM_DOC writeData() {
        Properties property = new Properties();
 
        try {
        	String path = "src/test/resources/test_data/FES_2FM.txt";
        	property.load(new InputStreamReader(new FileInputStream(path), "UTF-8"));
			writeData(path);
        	this.id = property.getProperty("{id}");
			this.recordTypeFES = property.getProperty("{recordTypeFES}");
			this.dateOfChange = property.getProperty("{dateOfChange}");
			this.codeReasonApplyingMeasures = property.getProperty("{codeReasonApplyingMeasures}");
			this.codeOfOrganization = property.getProperty("{codeOfOrganization}");
			this.dateToFreeze = date;
			this.timeToFreeze = time;
			this.typeOfFundsToFreeze = property.getProperty("{typeOfFundsToFreeze}");
			this.currencyCode = property.getProperty("{currencyCode}");
			this.sum = property.getProperty("{sum}");
			this.sumRUR = property.getProperty("{sumRUR}");
			this.securitiesInfo = property.getProperty("{securitiesInfo}");
			this.securitiesNominalPrice = property.getProperty("{securitiesNominalPrice}");
			this.securitiesMarketPrice = property.getProperty("{securitiesMarketPrice}");
			this.additionalInfo = property.getProperty("{additionalInfo}");
			
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл отсуствует!");
        }
		return this;
	}
	public String getId() {
		return id;
	}
	public FES_2FM_DOC setId(String id) {
		this.id = id;
		return this;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public FES_2FM_DOC setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
		return this;
	}
	public String getSum() {
		return sum;
	}
	public FES_2FM_DOC setSum(String sum) {
		this.sum = sum;
		return this;
	}
	public String getSumRUR() {
		return sumRUR;
	}
	public FES_2FM_DOC setSumRUR(String sumRUR) {
		this.sumRUR = sumRUR;
		return this;
	}
	public String getSecuritiesInfo() {
		return securitiesInfo;
	}
	public FES_2FM_DOC setSecuritiesInfo(String securitiesInfo) {
		this.securitiesInfo = securitiesInfo;
		return this;
	}
	public String getSecuritiesNominalPrice() {
		return securitiesNominalPrice;
	}
	public FES_2FM_DOC setSecuritiesNominalPrice(String securitiesNominalPrice) {
		this.securitiesNominalPrice = securitiesNominalPrice;
		return this;
	}
	public String getSecuritiesMarketPrice() {
		return securitiesMarketPrice;
	}
	public FES_2FM_DOC setSecuritiesMarketPrice(String securitiesMarketPrice) {
		this.securitiesMarketPrice = securitiesMarketPrice;
		return this;
	}
	
	public String getType() {
		return type;
	}
	public FES_2FM_DOC setType(String type) {
		this.type = type;
		return this;
	}
	
	public String getDateOfFES() {
		return dateOfFES;
	}
	
	public FES_2FM_DOC setDateOfFES(String dateOfFES) {
		this.dateOfFES = dateOfFES;
		return this;
	}
	
	public String getNfoOKPO() {
		return nfoOKPO;
	}
	
	public FES_2FM_DOC setNfoOKPO(String nfoOKPO) {
		this.nfoOKPO = nfoOKPO;
		return this;
	}
	
	public String getNfoOGRN() {
		return nfoOGRN;
	}
	
	public FES_2FM_DOC setNfoOGRN(String nfoOGRN) {
		this.nfoOGRN = nfoOGRN;
		return this;
	}
	
	public String getRecordTypeFES() {
		return recordTypeFES;
	}
	
	public FES_2FM_DOC setRecordTypeFES(String recordTypeFES) {
		this.recordTypeFES = recordTypeFES;
		return this;
	}
	
	public String getDateOfChange() {
		return dateOfChange;
	}
	
	public FES_2FM_DOC setDateOfChange(String dateOfChange) {
		this.dateOfChange = dateOfChange;
		return this;
	}
	
	public String getCodeReasonApplyingMeasures() {
		return codeReasonApplyingMeasures;
	}
	public FES_2FM_DOC setCodeReasonApplyingMeasures(String codeReasonApplyingMeasures) {
		this.codeReasonApplyingMeasures = codeReasonApplyingMeasures;
		return this;
	}
	
	public String getCodeOfOrganization() {
		return codeOfOrganization;
	}
	
	public FES_2FM_DOC setCodeOfOrganization(String codeOfOrganization) {
		this.codeOfOrganization = codeOfOrganization;
		return this;
	}
	
	public String getDateToFreeze() {
		return dateToFreeze;
	}
	
	public FES_2FM_DOC setDateToFreeze(String dateToFreeze) {
		this.dateToFreeze = dateToFreeze;
		return this;
	}
	
	public String getTimeToFreeze() {
		return timeToFreeze;
	}
	
	public FES_2FM_DOC setTimeToFreeze(String timeToFreeze) {
		this.timeToFreeze = timeToFreeze;
		return this;
	}
	
	public String getTypeOfFundsToFreeze() {
		return typeOfFundsToFreeze;
	}
	
	public FES_2FM_DOC setTypeOfFundsToFreeze(String typeOfFundsToFreeze) {
		this.typeOfFundsToFreeze = typeOfFundsToFreeze;
		return this;
	}
	
	public String getAdditionalInfo() {
		return additionalInfo;
	}
	
	public FES_2FM_DOC setAdditionalInfo(String addInfo) {
		this.additionalInfo = addInfo;
		return this;
	}
}
