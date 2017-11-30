package comita.auto.selenium.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import comita.auto.selenium.util.Dates;

public class ES_443_1_DOC extends ES_DOC {

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
	private String accountID;
	private String directionInfoSign;
	private String contractDate;
	private String contractNumber;
	private String accountType;
	private String accountOpenDate;
	private String accountNumber;	
	
	private Dates dates = new Dates();
	
	public String dateAndTime = dates.getDate();
	public String date = dateAndTime.substring(0, 10);
	public String time = dates.getTimeForLog().substring(0, 8);
	
	
	
	public ES_443_1_DOC writeData() {
        Properties property = new Properties();
 
        try {
        	String path = "src/test/resources/test_data/ES_443_1.txt";
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
			this.accountID = property.getProperty("{accountID}");
			this.directionInfoSign = property.getProperty("{directionInfoSign}");
			this.contractDate = property.getProperty("{contractDate}");
			this.contractNumber = property.getProperty("{contractNumber}");
			this.accountType = property.getProperty("{accountType}");
			this.accountOpenDate = property.getProperty("{accountOpenDate}");
			this.accountNumber = property.getProperty("{accountNumber}");		
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл отсуствует!");
        }
		return this;
	}
	
	public String getCompanyName() {
		return companyName;
	}

	public ES_443_1_DOC setCompanyName(String companyName) {
		this.companyName = companyName;
		return this;
	}

	public String getCompanyINN() {
		return companyINN;
	}

	public ES_443_1_DOC setCompanyINN(String companyINN) {
		this.companyINN = companyINN;
		return this;
	}

	public String getCompanyKPP() {
		return companyKPP;
	}

	public ES_443_1_DOC setCompanyKPP(String companyKPP) {
		this.companyKPP = companyKPP;
		return this;
	}

	public String getCompanyOGRN() {
		return companyOGRN;
	}

	public ES_443_1_DOC setCompanyOGRN(String companyOGRN) {
		this.companyOGRN = companyOGRN;
		return this;
	}

	public String getCompanyRegDate() {
		return companyRegDate;
	}

	public ES_443_1_DOC setCompanyRegDate(String companyRegDate) {
		this.companyRegDate = companyRegDate;
		return this;
	}

	public String getCompanyRegion() {
		return companyRegion;
	}

	public ES_443_1_DOC setCompanyRegion(String companyRegion) {
		this.companyRegion = companyRegion;
		return this;
	}

	public String getCompanyArea() {
		return companyArea;
	}

	public ES_443_1_DOC setCompanyArea(String companyArea) {
		this.companyArea = companyArea;
		return this;
	}

	public String getCompanyCity() {
		return companyCity;
	}

	public ES_443_1_DOC setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
		return this;
	}

	public String getCompanyStreet() {
		return companyStreet;
	}

	public ES_443_1_DOC setCompanyStreet(String companyStreet) {
		this.companyStreet = companyStreet;
		return this;
	}

	public String getCompanyHouse() {
		return companyHouse;
	}

	public ES_443_1_DOC setCompanyHouse(String companyHouse) {
		this.companyHouse = companyHouse;
		return this;
	}

	public String getCompanyCorp() {
		return companyCorp;
	}

	public ES_443_1_DOC setCompanyCorp(String companyCorp) {
		this.companyCorp = companyCorp;
		return this;
	}

	public String getCompanyApartment() {
		return companyApartment;
	}

	public ES_443_1_DOC setCompanyApartment(String companyApartment) {
		this.companyApartment = companyApartment;
		return this;
	}

	public String getComment() {
		return comment;
	}

	public ES_443_1_DOC setComment(String comment) {
		this.comment = comment;
		return this;
	}

	public String getAccountID() {
		return accountID;
	}

	public ES_443_1_DOC setAccountID(String accountID) {
		this.accountID = accountID;
		return this;
	}

	public String getDirectionInfoSign() {
		return directionInfoSign;
	}

	public ES_443_1_DOC setDirectionInfoSign(String directionInfoSign) {
		this.directionInfoSign = directionInfoSign;
		return this;
	}

	public String getContractDate() {
		return contractDate;
	}

	public ES_443_1_DOC setContractDate(String contractDate) {
		this.contractDate = contractDate;
		return this;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public ES_443_1_DOC setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
		return this;
	}

	public String getAccountType() {
		return accountType;
	}

	public ES_443_1_DOC setAccountType(String accountType) {
		this.accountType = accountType;
		return this;
	}

	public String getAccountOpenDate() {
		return accountOpenDate;
	}

	public ES_443_1_DOC setAccountOpenDate(String accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
		return this;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public ES_443_1_DOC setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		return this;
	}	
}
