package comita.auto.selenium.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import comita.auto.selenium.util.Dates;

public class FES_3484_03_DOC extends FES_DOC {
	
	/*private String type;
	private String correspondentID;
	private String typeInfo;
	private String dateOfFES;
	private String authorizedPosition;
	private String authorizedSurname;
	private String authorizedName;
	private String authorizedPatronymic;
	private String authorizedCodeAndPhone;
	private String authorizedEmail;	
	private String nfoTypeCode;
	private String nfoType;
	private String nfoResidentSign;
	private String nfoName;
	private String nfoTransmittingInfoName;
	private String nfoINN;
	private String nfoINNIP;
	private String nfoKPP;
	private String nfoOKPO;
	private String nfoOKVED;
	private String nfoOGRN;
	private String nfoOGRNIP;
	private String nfoPersonSurname;
	private String nfoPersonName;
	private String nfoPersonPatronymic;
	private String nfoIdentityDocType;
	private String nfoIdentityDocSerie;
	private String nfoIdentityDocNumber;
	private String nfoIdentityDocIssueDate;
	private String nfoIdentityDocIssuer;
	private String nfoIdentityDocCodeDivision;
	private String nfoIdentityDocBirthDate;
	private String nfoBirthCountryCode;
	private String nfoBirthSubjectCode;
	private String nfoBirthArea;
	private String nfoBirthCity;
	private String nfoAddressCountryCode;	
	private String nfoAddressSubjectCode;
	private String nfoAddressArea;
	private String nfoAddressCity;
	private String nfoAddressStreet;
	private String nfoAddressHouse;
	private String nfoAddressCorp;
	private String nfoAddressApartment;*/
	private String id;
	private String recordTypeFES;
	
	private String baseApplyMeasuresCode;
	private String organizationCode;
	private String dateOfBlocking;
	private String timeOfBlocking;
	private String typeOfFundsOrPropertyToBlock;
	private String currencyCode;
	private String sum;
	private String sumRUR;
	private String infoAboutSecurities;
	private String nominalValueOfSecurities;
	private String marketValueOfSecurities;
	private String purposePay;
	private Dates dates = new Dates();
	
	public String dateAndTime = dates.getDate();
	public String date = dateAndTime.substring(0, 10);
	public String time = dates.getTimeForLog().substring(0, 8);
	
	/*public String getType() {
		return type;
	}

	public FES_3484_03_DOC setType(String type) {
		this.type = type;
		return this;
	}
	
	public String getCorrespondentID() {
		return correspondentID;
	}

	public FES_3484_03_DOC setCorrespondentID(String correspondentID) {
		this.correspondentID = correspondentID;
		return this;
	}

	public String getTypeInfo() {
		return typeInfo;
	}

	public FES_3484_03_DOC setTypeInfo(String typeInfo) {
		this.typeInfo = typeInfo;
		return this;
	}

	public String getDateOfFES() {
		return dateOfFES;
	}

	public FES_3484_03_DOC setDateOfFES(String dateOfFES) {
		this.dateOfFES = dateOfFES;
		return this;
	}
	
	public String getAuthorizedPosition() {
		return authorizedPosition;
	}

	public FES_3484_03_DOC setAuthorizedPosition(String authorizedPosition) {
		this.authorizedPosition = authorizedPosition;
		return this;
	}

	public String getAuthorizedSurname() {
		return authorizedSurname;
	}

	public FES_3484_03_DOC setAuthorizedSurname(String authorizedSurname) {
		this.authorizedSurname = authorizedSurname;
		return this;
	}

	public String getAuthorizedName() {
		return authorizedName;
	}

	public FES_3484_03_DOC setAuthorizedName(String authorizedName) {
		this.authorizedName = authorizedName;
		return this;
	}

	public String getAuthorizedPatronymic() {
		return authorizedPatronymic;
	}

	public FES_3484_03_DOC setAuthorizedPatronymic(String authorizedPatronymic) {
		this.authorizedPatronymic = authorizedPatronymic;
		return this;
	}

	public String getAuthorizedCodeAndPhone() {
		return authorizedCodeAndPhone;
	}

	public FES_3484_03_DOC setAuthorizedCodeAndPhone(String authorizedCodeAndPhone) {
		this.authorizedCodeAndPhone = authorizedCodeAndPhone;
		return this;
	}

	public String getAuthorizedEmail() {
		return authorizedEmail;
	}

	public FES_3484_03_DOC setAuthorizedEmail(String authorizedEmail) {
		this.authorizedEmail = authorizedEmail;
		return this;
	}

	public String getNfoTypeCode() {
		return nfoTypeCode;
	}

	public FES_3484_03_DOC setNfoTypeCode(String nfoTypeCode) {
		this.nfoTypeCode = nfoTypeCode;
		return this;
	}
	
	public String getNfoType() {
		return nfoType;
	}

	public FES_3484_03_DOC setNfoType(String nfoType) {
		this.nfoType = nfoType;
		return this;
	}	

	public String getNfoResidentSign() {
		return nfoResidentSign;
	}

	public FES_3484_03_DOC setNfoResidentSign(String nfoResidentSign) {
		this.nfoResidentSign = nfoResidentSign;
		return this;
	}

	public String getNfoName() {
		return nfoName;
	}

	public FES_3484_03_DOC setNfoName(String nfoName) {
		this.nfoName = nfoName;
		return this;
	}

	public String getNfoTransmittingInfoName() {
		return nfoTransmittingInfoName;
	}

	public FES_3484_03_DOC setNfoTransmittingInfoName(String nfoTransmittingInfoName) {
		this.nfoTransmittingInfoName = nfoTransmittingInfoName;
		return this;
	}
	
	public String getNfoINN() {
		return nfoINN;
	}

	public FES_3484_03_DOC setNfoINN(String nfoINN) {
		this.nfoINN = nfoINN;
		return this;
	}

	public String getNfoINNIP() {
		return nfoINNIP;
	}
	
	public FES_3484_03_DOC setNfoINNIP(String nfoINNIP) {
		this.nfoINNIP = nfoINNIP;
		return this;
	}

	public String getNfoKPP() {
		return nfoKPP;
	}

	public FES_3484_03_DOC setNfoKPP(String nfoKPP) {
		this.nfoKPP = nfoKPP;
		return this;
	}
	
	public String getNfoOKPO() {
		return nfoOKPO;
	}

	public FES_3484_03_DOC setNfoOKPO(String nfoOKPO) {
		this.nfoOKPO = nfoOKPO;
		return this;
	}

	public String getNfoOKVED() {
		return nfoOKVED;
	}

	public FES_3484_03_DOC setNfoOKVED(String nfoOKVED) {
		this.nfoOKVED = nfoOKVED;
		return this;
	}

	public String getNfoOGRN() {
		return nfoOGRN;
	}

	public FES_3484_03_DOC setNfoOGRN(String nfoOGRN) {
		this.nfoOGRN = nfoOGRN;
		return this;
	}
	
	public String getNfoOGRNIP() {
		return nfoOGRNIP;
	}

	public FES_3484_03_DOC setNfoOGRNIP(String nfoOGRNIP) {
		this.nfoOGRNIP = nfoOGRNIP;
		return this;
	}

	public String getNfoPersonSurname() {
		return nfoPersonSurname;
	}

	public FES_3484_03_DOC setNfoPersonSurname(String nfoPersonSurname) {
		this.nfoPersonSurname = nfoPersonSurname;
		return this;
	}

	public String getNfoPersonName() {
		return nfoPersonName;
	}

	public FES_3484_03_DOC setNfoPersonName(String nfoPersonName) {
		this.nfoPersonName = nfoPersonName;
		return this;
	}

	public String getNfoPersonPatronymic() {
		return nfoPersonPatronymic;
	}

	public FES_3484_03_DOC setNfoPersonPatronymic(String nfoPersonPatronymic) {
		this.nfoPersonPatronymic = nfoPersonPatronymic;
		return this;
	}

	public String getNfoIdentityDocType() {
		return nfoIdentityDocType;
	}

	public FES_3484_03_DOC setNfoIdentityDocType(String nfoIdentityDocType) {
		this.nfoIdentityDocType = nfoIdentityDocType;
		return this;
	}

	public String getNfoIdentityDocSerie() {
		return nfoIdentityDocSerie;
	}

	public FES_3484_03_DOC setNfoIdentityDocSerie(String nfoIdentityDocSerie) {
		this.nfoIdentityDocSerie = nfoIdentityDocSerie;
		return this;
	}

	public String getNfoIdentityDocNumber() {
		return nfoIdentityDocNumber;
	}

	public FES_3484_03_DOC setNfoIdentityDocNumber(String nfoIdentityDocNumber) {
		this.nfoIdentityDocNumber = nfoIdentityDocNumber;
		return this;
	}

	public String getNfoIdentityDocIssueDate() {
		return nfoIdentityDocIssueDate;
	}

	public FES_3484_03_DOC setNfoIdentityDocIssueDate(String nfoIdentityDocIssueDate) {
		this.nfoIdentityDocIssueDate = nfoIdentityDocIssueDate;
		return this;
	}

	public String getNfoIdentityDocIssuer() {
		return nfoIdentityDocIssuer;
	}

	public FES_3484_03_DOC setNfoIdentityDocIssuer(String nfoIdentityDocIssuer) {
		this.nfoIdentityDocIssuer = nfoIdentityDocIssuer;
		return this;
	}

	public String getNfoIdentityDocCodeDivision() {
		return nfoIdentityDocCodeDivision;
	}

	public FES_3484_03_DOC setNfoIdentityDocCodeDivision(String nfoIdentityDocCodeDivision) {
		this.nfoIdentityDocCodeDivision = nfoIdentityDocCodeDivision;
		return this;
	}

	public String getNfoIdentityDocBirthDate() {
		return nfoIdentityDocBirthDate;
	}

	public FES_3484_03_DOC setNfoIdentityDocBirthDate(String nfoIdentityDocBirthDate) {
		this.nfoIdentityDocBirthDate = nfoIdentityDocBirthDate;
		return this;
	}
	
	public String getNfoBirthCountryCode() {
		return nfoBirthCountryCode;
	}

	public FES_3484_03_DOC setNfoBirthCountryCode(String nfoBirthCountryCode) {
		this.nfoBirthCountryCode = nfoBirthCountryCode;
		return this;
	}

	public String getNfoBirthSubjectCode() {
		return nfoBirthSubjectCode;
	}

	public FES_3484_03_DOC setNfoBirthSubjectCode(String nfoBirthSubjectCode) {
		this.nfoBirthSubjectCode = nfoBirthSubjectCode;
		return this;
	}

	public String getNfoBirthArea() {
		return nfoBirthArea;
	}

	public FES_3484_03_DOC setNfoBirthArea(String nfoBirthArea) {
		this.nfoBirthArea = nfoBirthArea;
		return this;
	}

	public String getNfoBirthCity() {
		return nfoBirthCity;
	}

	public FES_3484_03_DOC setNfoBirthCity(String nfoBirthCity) {
		this.nfoBirthCity = nfoBirthCity;
		return this;
	}

	public String getNfoAddressCountryCode() {
		return nfoAddressCountryCode;
	}

	public FES_3484_03_DOC setNfoAddressCountryCode(String nfoAddressCountryCode) {
		this.nfoAddressCountryCode = nfoAddressCountryCode;
		return this;
	}

	public String getNfoAddressSubjectCode() {
		return nfoAddressSubjectCode;
	}

	public FES_3484_03_DOC setNfoAddressSubjectCode(String nfoAddressSubjectCode) {
		this.nfoAddressSubjectCode = nfoAddressSubjectCode;
		return this;
	}

	public String getNfoAddressArea() {
		return nfoAddressArea;
	}

	public FES_3484_03_DOC setNfoAddressArea(String nfoAddressArea) {
		this.nfoAddressArea = nfoAddressArea;
		return this;
	}

	public String getNfoAddressCity() {
		return nfoAddressCity;
	}

	public FES_3484_03_DOC setNfoAddressCity(String nfoAddressCity) {
		this.nfoAddressCity = nfoAddressCity;
		return this;
	}

	public String getNfoAddressStreet() {
		return nfoAddressStreet;
	}

	public FES_3484_03_DOC setNfoAddressStreet(String nfoAddressStreet) {
		this.nfoAddressStreet = nfoAddressStreet;
		return this;
	}

	public String getNfoAddressHouse() {
		return nfoAddressHouse;
	}

	public FES_3484_03_DOC setNfoAddressHouse(String nfoAddressHouse) {
		this.nfoAddressHouse = nfoAddressHouse;
		return this;
	}

	public String getNfoAddressCorp() {
		return nfoAddressCorp;
	}

	public FES_3484_03_DOC setNfoAddressCorp(String nfoAddressCorp) {
		this.nfoAddressCorp = nfoAddressCorp;
		return this;
	}

	public String getNfoAddressApartment() {
		return nfoAddressApartment;
	}

	public FES_3484_03_DOC setNfoAddressApartment(String nfoAddressApartment) {
		this.nfoAddressApartment = nfoAddressApartment;
		return this;
	}*/

	public String getId() {
		return id;
	}

	public FES_3484_03_DOC setId(String id) {
		this.id = id;
		return this;
	}
	
	public String getRecordTypeFES() {
		return recordTypeFES;
	}

	public void setRecordTypeFES(String recordTypeFES) {
		this.recordTypeFES = recordTypeFES;
	}

	public String getBaseApplyMeasuresCode() {
		return baseApplyMeasuresCode;
	}

	public void setBaseApplyMeasuresCode(String baseApplyMeasuresCode) {
		this.baseApplyMeasuresCode = baseApplyMeasuresCode;
	}

	public String getOrganizationCode() {
		return organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public String getDateOfBlocking() {
		return dateOfBlocking;
	}

	public void setDateOfBlocking(String dateOfBlocking) {
		this.dateOfBlocking = dateOfBlocking;
	}

	public String getTimeOfBlocking() {
		return timeOfBlocking;
	}

	public void setTimeOfBlocking(String timeOfBlocking) {
		this.timeOfBlocking = timeOfBlocking;
	}

	public String getTypeOfFundsOrPropertyToBlock() {
		return typeOfFundsOrPropertyToBlock;
	}

	public void setTypeOfFundsOrPropertyToBlock(String typeOfFundsOrPropertyToBlock) {
		this.typeOfFundsOrPropertyToBlock = typeOfFundsOrPropertyToBlock;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getSum() {
		return sum;
	}

	public void setSum(String sum) {
		this.sum = sum;
	}

	public String getSumRUR() {
		return sumRUR;
	}

	public void setSumRUR(String sumRUR) {
		this.sumRUR = sumRUR;
	}

	public String getInfoAboutSecurities() {
		return infoAboutSecurities;
	}

	public void setInfoAboutSecurities(String infoAboutSecurities) {
		this.infoAboutSecurities = infoAboutSecurities;
	}

	public String getNominalValueOfSecurities() {
		return nominalValueOfSecurities;
	}

	public void setNominalValueOfSecurities(String nominalValueOfSecurities) {
		this.nominalValueOfSecurities = nominalValueOfSecurities;
	}

	public String getMarketValueOfSecurities() {
		return marketValueOfSecurities;
	}

	public void setMarketValueOfSecurities(String marketValueOfSecurities) {
		this.marketValueOfSecurities = marketValueOfSecurities;
	}

	public String getPurposePay() {
		return purposePay;
	}

	public void setPurposePay(String purposePay) {
		this.purposePay = purposePay;
	}
	
	public FES_3484_03_DOC writeData() {
        Properties property = new Properties(); 
        try {
        	String path = "src/test/resources/test_data/FES_3484_03.txt";
        	property.load(new InputStreamReader(new FileInputStream(path), "UTF-8"));
			writeData(path);
			this.id = property.getProperty("{id}");
			this.recordTypeFES = property.getProperty("{recordTypeFES}");
			this.baseApplyMeasuresCode = property.getProperty("{baseApplyMeasuresCode}");
			this.organizationCode = property.getProperty("{organizationCode}");
			this.dateOfBlocking = property.getProperty("{dateOfBlocking}");
			this.timeOfBlocking = property.getProperty("{timeOfBlocking}");
			this.typeOfFundsOrPropertyToBlock = property.getProperty("{typeOfFundsOrPropertyToBlock}");
			this.currencyCode = property.getProperty("{currencyCode}");
			this.sum = property.getProperty("{sum}");
			this.sumRUR = property.getProperty("{sumRUR}");
			this.infoAboutSecurities = property.getProperty("{infoAboutSecurities}");
			this.nominalValueOfSecurities = property.getProperty("{nominalValueOfSecurities}");
			this.marketValueOfSecurities = property.getProperty("{marketValueOfSecurities}");
			this.purposePay = property.getProperty("{purposePay}");		
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл отсуствует!");
        }
		return this;
	}


}
