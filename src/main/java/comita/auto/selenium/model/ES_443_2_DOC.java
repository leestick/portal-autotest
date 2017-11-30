package comita.auto.selenium.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import comita.auto.selenium.util.Dates;

public class ES_443_2_DOC extends ES_DOC {
	
	private String companyName;
	private String companyINN;
	private String companyKPP;
	private String companyOGRN;
	private String companyRegDate;
	private String companyRegion;
	private String companyArea;
	private String companyCity;
	private String companyStreet;
	private String companyHouse;
	private String companyCorp;
	private String companyApartment;
	private String comment;
	private String recordID;
	private String infoDirectionSign;
	private String issuerType;
	private String issuerCode;
	private String issuerName;
	private String purchaseSecuritiesDate;
	private String securitiesTypeCode;
	private String numberISIN;
	private String securitiesCurrencyCode;
	private String securitiesCount;
	private String securitiesPriceCurrencyCode;
	private String securitiesPrice;
	private String securitiesPriceRUR;
	
	private Dates dates = new Dates();
	public String dateAndTime = dates.getDate();
	public String date = dateAndTime.substring(0, 10);
	public String time = dates.getTimeForLog().substring(0, 8);
		
	public ES_443_2_DOC writeData() {
		Properties property = new Properties(); 
        try {
        	String path = "src/test/resources/test_data/ES_443_2.txt";
        	property.load(new InputStreamReader(new FileInputStream(path), "UTF-8"));
			writeData(path);
        	this.companyName = property.getProperty("{companyName}");
        	this.companyINN = property.getProperty("{companyINN}");
        	this.companyKPP = property.getProperty("{companyKPP}");
        	this.companyOGRN = property.getProperty("{companyOGRN}");
        	this.companyRegDate = property.getProperty("{companyRegDate}");
        	this.companyRegion = property.getProperty("{companyRegion}");
        	this.companyArea = property.getProperty("{companyArea}");
        	this.companyCity = property.getProperty("{companyCity}");
        	this.companyStreet = property.getProperty("{companyStreet}");
        	this.companyHouse = property.getProperty("{companyHouse}");
        	this.companyCorp = property.getProperty("{companyCorp}");
        	this.companyApartment = property.getProperty("{companyApartment}");
        	this.comment = property.getProperty("{comment}");
        	this.recordID = property.getProperty("{recordID}");
        	this.infoDirectionSign = property.getProperty("{infoDirectionSign}");
        	this.issuerType = property.getProperty("{issuerType}");
        	this.issuerCode = property.getProperty("{issuerCode}");
        	this.issuerName = property.getProperty("{issuerName}");
        	this.purchaseSecuritiesDate = property.getProperty("{purchaseSecuritiesDate}");
        	this.securitiesTypeCode = property.getProperty("{securitiesTypeCode}");
        	this.numberISIN = property.getProperty("{numberISIN}");
        	this.securitiesCurrencyCode = property.getProperty("{securitiesCurrencyCode}");
        	this.securitiesCount = property.getProperty("{securitiesCount}");
        	this.securitiesPriceCurrencyCode = property.getProperty("{securitiesPriceCurrencyCode}");
        	this.securitiesPrice = property.getProperty("{securitiesPrice}");
        	this.securitiesPriceRUR = property.getProperty("{securitiesPriceRUR}");
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл отсуствует!");
        }
		return this;
	}

	public String getCompanyName() {
		return companyName;
	}

	public ES_443_2_DOC setCompanyName(String companyName) {
		this.companyName = companyName;
		return this;
	}

	public String getCompanyINN() {
		return companyINN;
	}

	public ES_443_2_DOC setCompanyINN(String companyINN) {
		this.companyINN = companyINN;
		return this;
	}

	public String getCompanyKPP() {
		return companyKPP;
	}

	public ES_443_2_DOC setCompanyKPP(String companyKPP) {
		this.companyKPP = companyKPP;
		return this;
	}

	public String getCompanyOGRN() {
		return companyOGRN;
	}

	public ES_443_2_DOC setCompanyOGRN(String companyOGRN) {
		this.companyOGRN = companyOGRN;
		return this;
	}

	public String getCompanyRegDate() {
		return companyRegDate;
	}

	public ES_443_2_DOC setCompanyRegDate(String companyRegDate) {
		this.companyRegDate = companyRegDate;
		return this;
	}

	public String getCompanyRegion() {
		return companyRegion;
	}

	public ES_443_2_DOC setCompanyRegion(String companyRegion) {
		this.companyRegion = companyRegion;
		return this;
	}

	public String getCompanyArea() {
		return companyArea;
	}

	public ES_443_2_DOC setCompanyArea(String companyArea) {
		this.companyArea = companyArea;
		return this;
	}

	public String getCompanyCity() {
		return companyCity;
	}

	public ES_443_2_DOC setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
		return this;
	}

	public String getCompanyStreet() {
		return companyStreet;
	}

	public ES_443_2_DOC setCompanyStreet(String companyStreet) {
		this.companyStreet = companyStreet;
		return this;
	}

	public String getCompanyHouse() {
		return companyHouse;
	}

	public ES_443_2_DOC setCompanyHouse(String companyHouse) {
		this.companyHouse = companyHouse;
		return this;
	}

	public String getCompanyCorp() {
		return companyCorp;
	}

	public ES_443_2_DOC setCompanyCorp(String companyCorp) {
		this.companyCorp = companyCorp;
		return this;
	}

	public String getCompanyApartment() {
		return companyApartment;
	}

	public ES_443_2_DOC setCompanyApartment(String companyApartment) {
		this.companyApartment = companyApartment;
		return this;
	}

	public String getComment() {
		return comment;
	}

	public ES_443_2_DOC setComment(String comment) {
		this.comment = comment;
		return this;
	}

	public String getRecordID() {
		return recordID;
	}

	public ES_443_2_DOC setRecordID(String recordID) {
		this.recordID = recordID;
		return this;
	}

	public String getInfoDirectionSign() {
		return infoDirectionSign;
	}

	public ES_443_2_DOC setInfoDirectionSign(String infoDirectionSign) {
		this.infoDirectionSign = infoDirectionSign;
		return this;
	}

	public String getIssuerType() {
		return issuerType;
	}

	public ES_443_2_DOC setIssuerType(String issuerType) {
		this.issuerType = issuerType;
		return this;
	}

	public String getIssuerCode() {
		return issuerCode;
	}

	public ES_443_2_DOC setIssuerCode(String issuerCode) {
		this.issuerCode = issuerCode;
		return this;
	}

	public String getIssuerName() {
		return issuerName;
	}

	public ES_443_2_DOC setIssuerName(String issuerName) {
		this.issuerName = issuerName;
		return this;
	}
	
	public String getPurchaseSecuritiesDate() {
		return purchaseSecuritiesDate;
	}

	public ES_443_2_DOC setPurchaseSecuritiesDate(String purchaseSecuritiesDate) {
		this.purchaseSecuritiesDate = purchaseSecuritiesDate;
		return this;
	}

	public String getSecuritiesTypeCode() {
		return securitiesTypeCode;
	}

	public ES_443_2_DOC setSecuritiesTypeCode(String securitiesTypeCode) {
		this.securitiesTypeCode = securitiesTypeCode;
		return this;
	}

	public String getNumberISIN() {
		return numberISIN;
	}
	
	public ES_443_2_DOC setNumberISIN(String numberISIN) {
		this.numberISIN = numberISIN;
		return this;
	}

	public String getSecuritiesCurrencyCode() {
		return securitiesCurrencyCode;
	}

	public ES_443_2_DOC setSecuritiesCurrencyCode(String securitiesCurrencyCode) {
		this.securitiesCurrencyCode = securitiesCurrencyCode;
		return this;
	}

	public String getSecuritiesCount() {
		return securitiesCount;
	}

	public ES_443_2_DOC setSecuritiesCount(String securitiesCount) {
		this.securitiesCount = securitiesCount;
		return this;
	}

	public String getSecuritiesPriceCurrencyCode() {
		return securitiesPriceCurrencyCode;
	}

	public ES_443_2_DOC setSecuritiesPriceCurrencyCode(String securitiesPriceCurrencyCode) {
		this.securitiesPriceCurrencyCode = securitiesPriceCurrencyCode;
		return this;
	}

	public String getSecuritiesPrice() {
		return securitiesPrice;
	}

	public ES_443_2_DOC setSecuritiesPrice(String securitiesPrice) {
		this.securitiesPrice = securitiesPrice;
		return this;
	}

	public String getSecuritiesPriceRUR() {
		return securitiesPriceRUR;
	}

	public ES_443_2_DOC setSecuritiesPriceRUR(String securitiesPriceRUR) {
		this.securitiesPriceRUR = securitiesPriceRUR;
		return this;
	}

}
