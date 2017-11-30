package comita.auto.selenium.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import comita.auto.selenium.util.Dates;

public class FES_DOC {

	protected String type;
	protected String correspondentID;
	protected String typeInfo;
	protected String dateOfFES;
	protected String formID;
	protected String authorizedPosition;
	protected String authorizedSurname;
	protected String authorizedName;
	protected String authorizedPatronymic;
	protected String authorizedCodeAndPhone;
	protected String authorizedEmail;
	protected String infoAboutPersonType;
	protected String infoAboutPersonSurname;
	protected String infoAboutPersonName;
	protected String infoAboutPersonPatronymic;
	protected String infoAboutPersonINN;
	protected String infoAboutPersonLegalName;
	protected String nfoTypeCode;
	protected String nfoType;
	protected String nfoResidentSign;
	protected String nfoName;
	protected String nfoTransmittingInfoName;
	protected String nfoINN;
	protected String nfoINNIP;
	protected String nfoKPP;
	protected String nfoOKPO;
	protected String nfoOKVED;
	protected String nfoOGRN;
	protected String nfoOGRNIP;
	protected String nkoIndustrySectorCode;
	protected String nfoPersonSurname;
	protected String nfoPersonName;
	
	protected String nfoPersonPatronymic;
	protected String nfoIdentityDocType;
	protected String nfoIdentityDocSerie;
	protected String nfoIdentityDocNumber;
	protected String nfoIdentityDocIssueDate;
	protected String nfoIdentityDocIssuer;
	protected String nfoIdentityDocCodeDivision;
	protected String nfoIdentityDocBirthDate;
	protected String nfoBirthCountryCode;
	protected String nfoBirthSubjectCode;
	protected String nfoBirthArea;
	protected String nfoBirthCity;
	protected String nfoAddressCountryCode;	
	protected String nfoAddressSubjectCode;
	protected String nfoAddressArea;
	protected String nfoAddressCity;
	protected String nfoAddressStreet;
	protected String nfoAddressHouse;
	protected String nfoAddressCorp;
	protected String nfoAddressApartment;
	protected String ipAddress;
	protected String postalCode;
	protected String postalCountryCode;
	protected String postalSubjectCode;
	protected String postalArea;
	protected String postalCity;
	protected String postalStreet;
	protected String postalHouse;
	protected String postalCorp;
	protected String postalApartment;
	
	private Dates dates = new Dates();
	public String dateAndTime = dates.getDate();
	public String date = dateAndTime.substring(0, 10);
	public String time = dates.getTimeForLog().substring(0, 8);
	
	public void writeData(String path) {
        Properties property = new Properties();
 
        try {
        	property.load(new InputStreamReader(new FileInputStream(path), "UTF-8"));
			
		this.type = property.getProperty("{type}");
		this.correspondentID = property.getProperty("{correspondentID}");
		this.typeInfo = property.getProperty("{typeInfo}");
		this.dateOfFES = date;
		this.formID = property.getProperty("{formID}");
		this.authorizedPosition = property.getProperty("{authorizedPosition}");
		this.authorizedSurname = property.getProperty("{authorizedSurname}");
		this.authorizedName = property.getProperty("{authorizedName}");
		this.authorizedPatronymic = property.getProperty("{authorizedPatronymic}");
		this.authorizedCodeAndPhone = property.getProperty("{authorizedCodeAndPhone}");
		this.authorizedEmail = property.getProperty("{authorizedEmail}");
		this.infoAboutPersonType = property.getProperty("{infoAboutPersonType}");
		this.infoAboutPersonSurname = property.getProperty("{infoAboutPersonSurname}");
		this.infoAboutPersonName = property.getProperty("{infoAboutPersonName}");
		this.infoAboutPersonPatronymic = property.getProperty("{infoAboutPersonPatronymic}");
		this.infoAboutPersonINN = property.getProperty("{infoAboutPersonINN}");
		this.infoAboutPersonLegalName = property.getProperty("{infoAboutPersonLegalName}");
		this.nfoTypeCode = property.getProperty("{nfoTypeCode}");
		this.nfoType = property.getProperty("{nfoType}");
		this.nfoResidentSign = property.getProperty("{nfoResidentSign}");
		this.nfoName = property.getProperty("{nfoName}");
		this.nfoTransmittingInfoName = property.getProperty("{nfoTransmittingInfoName}");
		this.nfoINN = property.getProperty("{nfoINN}");
		this.nfoINNIP = property.getProperty("{nfoINNIP}");
		this.nfoKPP = property.getProperty("{nfoKPP}");
		this.nfoOKPO = property.getProperty("{nfoOKPO}");
		this.nfoOKVED = property.getProperty("{nfoOKVED}");
		this.nfoOGRN = property.getProperty("{nfoOGRN}");
		this.nfoOGRNIP = property.getProperty("{nfoOGRNIP}");
		this.nkoIndustrySectorCode = property.getProperty("{nkoIndustrySectorCode}");
		this.nfoPersonSurname = property.getProperty("{nfoPersonSurname}");
		this.nfoPersonName = property.getProperty("{nfoPersonName}");
		this.nfoPersonPatronymic = property.getProperty("{nfoPersonPatronymic}");
		this.nfoIdentityDocType = property.getProperty("{nfoIdentityDocType}");
		this.nfoIdentityDocSerie = property.getProperty("{nfoIdentityDocSerie}");
		this.nfoIdentityDocNumber = property.getProperty("{nfoIdentityDocNumber}");
		this.nfoIdentityDocIssueDate = property.getProperty("{nfoIdentityDocIssueDate}");
		this.nfoIdentityDocIssuer = property.getProperty("{nfoIdentityDocIssuer}");
		this.nfoIdentityDocCodeDivision = property.getProperty("{nfoIdentityDocCodeDivision}");
		this.nfoIdentityDocBirthDate = property.getProperty("{nfoIdentityDocBirthDate}");
		this.nfoBirthCountryCode = property.getProperty("{nfoBirthCountryCode}");
		this.nfoBirthSubjectCode = property.getProperty("{nfoBirthSubjectCode}");
		this.nfoBirthArea = property.getProperty("{nfoBirthArea}");
		this.nfoBirthCity = property.getProperty("{nfoBirthCity}");
		this.nfoAddressCountryCode = property.getProperty("{nfoAddressCountryCode}");
		this.nfoAddressSubjectCode = property.getProperty("{nfoAddressSubjectCode}");
		this.nfoAddressArea = property.getProperty("{nfoAddressArea}");
		this.nfoAddressCity = property.getProperty("{nfoAddressCity}");
		this.nfoAddressStreet = property.getProperty("{nfoAddressStreet}");
		this.nfoAddressHouse = property.getProperty("{nfoAddressHouse}");
		this.nfoAddressCorp = property.getProperty("{nfoAddressCorp}");
		this.nfoAddressApartment = property.getProperty("{nfoAddressApartment}");
		this.ipAddress = property.getProperty("{ipAddress}");
		this.postalCode = property.getProperty("{postalCode}");
		this.postalCountryCode = property.getProperty("{postalCountryCode}");
		this.postalSubjectCode = property.getProperty("{postalSubjectCode}");
		this.postalArea = property.getProperty("{postalArea}");
		this.postalCity = property.getProperty("{postalCity}");
		this.postalStreet = property.getProperty("{postalStreet}");
		this.postalHouse = property.getProperty("{postalHouse}");
		this.postalCorp = property.getProperty("{postalCorp}");
		this.postalApartment = property.getProperty("{postalApartment}");
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл отсуствует!");
        }
		
	}
	
	public String getType() {
		return type;
	}

	public FES_DOC setType(String type) {
		this.type = type;
		return this;
	}
	
	public String getCorrespondentID() {
		return correspondentID;
	}

	public FES_DOC setCorrespondentID(String correspondentID) {
		this.correspondentID = correspondentID;
		return this;
	}

	public String getTypeInfo() {
		return typeInfo;
	}

	public FES_DOC setTypeInfo(String typeInfo) {
		this.typeInfo = typeInfo;
		return this;
	}

	public String getDateOfFES() {
		return dateOfFES;
	}

	public FES_DOC setDateOfFES(String dateOfFES) {
		this.dateOfFES = dateOfFES;
		return this;
	}
	
	public String getFormID() {
		return formID;
	}

	public FES_DOC setFormID(String formID) {
		this.formID = formID;
		return this;
	}
	
	public String getAuthorizedPosition() {
		return authorizedPosition;
	}

	public FES_DOC setAuthorizedPosition(String authorizedPosition) {
		this.authorizedPosition = authorizedPosition;
		return this;
	}

	public String getAuthorizedSurname() {
		return authorizedSurname;
	}

	public FES_DOC setAuthorizedSurname(String authorizedSurname) {
		this.authorizedSurname = authorizedSurname;
		return this;
	}

	public String getAuthorizedName() {
		return authorizedName;
	}

	public FES_DOC setAuthorizedName(String authorizedName) {
		this.authorizedName = authorizedName;
		return this;
	}

	public String getAuthorizedPatronymic() {
		return authorizedPatronymic;
	}

	public FES_DOC setAuthorizedPatronymic(String authorizedPatronymic) {
		this.authorizedPatronymic = authorizedPatronymic;
		return this;
	}

	public String getAuthorizedCodeAndPhone() {
		return authorizedCodeAndPhone;
	}

	public FES_DOC setAuthorizedCodeAndPhone(String authorizedCodeAndPhone) {
		this.authorizedCodeAndPhone = authorizedCodeAndPhone;
		return this;
	}

	public String getAuthorizedEmail() {
		return authorizedEmail;
	}

	public FES_DOC setAuthorizedEmail(String authorizedEmail) {
		this.authorizedEmail = authorizedEmail;
		return this;
	}
	
	public String getInfoAboutPersonType() {
		return infoAboutPersonType;
	}

	public FES_DOC setInfoAboutPersonType(String infoAboutPersonType) {
		this.infoAboutPersonType = infoAboutPersonType;
		return this;
	}

	public String getInfoAboutPersonSurname() {
		return infoAboutPersonSurname;
	}

	public FES_DOC setInfoAboutPersonSurname(String infoAboutPersonSurname) {
		this.infoAboutPersonSurname = infoAboutPersonSurname;
		return this;
	}

	public String getInfoAboutPersonName() {
		return infoAboutPersonName;
	}

	public FES_DOC setInfoAboutPersonName(String infoAboutPersonName) {
		this.infoAboutPersonName = infoAboutPersonName;
		return this;
	}

	public String getInfoAboutPersonPatronymic() {
		return infoAboutPersonPatronymic;
	}

	public FES_DOC setInfoAboutPersonPatronymic(String infoAboutPersonPatronymic) {
		this.infoAboutPersonPatronymic = infoAboutPersonPatronymic;
		return this;
	}

	public String getInfoAboutPersonINN() {
		return infoAboutPersonINN;
	}

	public FES_DOC setInfoAboutPersonINN(String infoAboutPersonINN) {
		this.infoAboutPersonINN = infoAboutPersonINN;
		return this;
	}

	public String getInfoAboutPersonLegalName() {
		return infoAboutPersonLegalName;
	}

	public FES_DOC setInfoAboutPersonLegalName(String infoAboutPersonLegalName) {
		this.infoAboutPersonLegalName = infoAboutPersonLegalName;
		return this;
	}


	public String getNfoTypeCode() {
		return nfoTypeCode;
	}

	public FES_DOC setNfoTypeCode(String nfoTypeCode) {
		this.nfoTypeCode = nfoTypeCode;
		return this;
	}
	
	public String getNfoType() {
		return nfoType;
	}

	public FES_DOC setNfoType(String nfoType) {
		this.nfoType = nfoType;
		return this;
	}	

	public String getNfoResidentSign() {
		return nfoResidentSign;
	}

	public FES_DOC setNfoResidentSign(String nfoResidentSign) {
		this.nfoResidentSign = nfoResidentSign;
		return this;
	}

	public String getNfoName() {
		return nfoName;
	}

	public FES_DOC setNfoName(String nfoName) {
		this.nfoName = nfoName;
		return this;
	}

	public String getNfoTransmittingInfoName() {
		return nfoTransmittingInfoName;
	}

	public FES_DOC setNfoTransmittingInfoName(String nfoTransmittingInfoName) {
		this.nfoTransmittingInfoName = nfoTransmittingInfoName;
		return this;
	}
	
	public String getNfoINN() {
		return nfoINN;
	}

	public FES_DOC setNfoINN(String nfoINN) {
		this.nfoINN = nfoINN;
		return this;
	}

	public String getNfoINNIP() {
		return nfoINNIP;
	}
	
	public FES_DOC setNfoINNIP(String nfoINNIP) {
		this.nfoINNIP = nfoINNIP;
		return this;
	}

	public String getNfoKPP() {
		return nfoKPP;
	}

	public FES_DOC setNfoKPP(String nfoKPP) {
		this.nfoKPP = nfoKPP;
		return this;
	}
	
	public String getNfoOKPO() {
		return nfoOKPO;
	}

	public FES_DOC setNfoOKPO(String nfoOKPO) {
		this.nfoOKPO = nfoOKPO;
		return this;
	}

	public String getNfoOKVED() {
		return nfoOKVED;
	}

	public FES_DOC setNfoOKVED(String nfoOKVED) {
		this.nfoOKVED = nfoOKVED;
		return this;
	}

	public String getNfoOGRN() {
		return nfoOGRN;
	}

	public FES_DOC setNfoOGRN(String nfoOGRN) {
		this.nfoOGRN = nfoOGRN;
		return this;
	}
	
	public String getNfoOGRNIP() {
		return nfoOGRNIP;
	}

	public FES_DOC setNfoOGRNIP(String nfoOGRNIP) {
		this.nfoOGRNIP = nfoOGRNIP;
		return this;
	}
	
	public String getNkoIndustrySectorCode() {
		return nkoIndustrySectorCode;
	}

	public FES_DOC setNkoIndustrySectorCode(String nkoIndustrySectorCode) {
		this.nkoIndustrySectorCode = nkoIndustrySectorCode;
		return this;
	}


	public String getNfoPersonSurname() {
		return nfoPersonSurname;
	}

	public FES_DOC setNfoPersonSurname(String nfoPersonSurname) {
		this.nfoPersonSurname = nfoPersonSurname;
		return this;
	}

	public String getNfoPersonName() {
		return nfoPersonName;
	}

	public FES_DOC setNfoPersonName(String nfoPersonName) {
		this.nfoPersonName = nfoPersonName;
		return this;
	}

	public String getNfoPersonPatronymic() {
		return nfoPersonPatronymic;
	}

	public FES_DOC setNfoPersonPatronymic(String nfoPersonPatronymic) {
		this.nfoPersonPatronymic = nfoPersonPatronymic;
		return this;
	}

	public String getNfoIdentityDocType() {
		return nfoIdentityDocType;
	}

	public FES_DOC setNfoIdentityDocType(String nfoIdentityDocType) {
		this.nfoIdentityDocType = nfoIdentityDocType;
		return this;
	}

	public String getNfoIdentityDocSerie() {
		return nfoIdentityDocSerie;
	}

	public FES_DOC setNfoIdentityDocSerie(String nfoIdentityDocSerie) {
		this.nfoIdentityDocSerie = nfoIdentityDocSerie;
		return this;
	}

	public String getNfoIdentityDocNumber() {
		return nfoIdentityDocNumber;
	}

	public FES_DOC setNfoIdentityDocNumber(String nfoIdentityDocNumber) {
		this.nfoIdentityDocNumber = nfoIdentityDocNumber;
		return this;
	}

	public String getNfoIdentityDocIssueDate() {
		return nfoIdentityDocIssueDate;
	}

	public FES_DOC setNfoIdentityDocIssueDate(String nfoIdentityDocIssueDate) {
		this.nfoIdentityDocIssueDate = nfoIdentityDocIssueDate;
		return this;
	}

	public String getNfoIdentityDocIssuer() {
		return nfoIdentityDocIssuer;
	}

	public FES_DOC setNfoIdentityDocIssuer(String nfoIdentityDocIssuer) {
		this.nfoIdentityDocIssuer = nfoIdentityDocIssuer;
		return this;
	}

	public String getNfoIdentityDocCodeDivision() {
		return nfoIdentityDocCodeDivision;
	}

	public FES_DOC setNfoIdentityDocCodeDivision(String nfoIdentityDocCodeDivision) {
		this.nfoIdentityDocCodeDivision = nfoIdentityDocCodeDivision;
		return this;
	}

	public String getNfoIdentityDocBirthDate() {
		return nfoIdentityDocBirthDate;
	}

	public FES_DOC setNfoIdentityDocBirthDate(String nfoIdentityDocBirthDate) {
		this.nfoIdentityDocBirthDate = nfoIdentityDocBirthDate;
		return this;
	}
	
	public String getNfoBirthCountryCode() {
		return nfoBirthCountryCode;
	}

	public FES_DOC setNfoBirthCountryCode(String nfoBirthCountryCode) {
		this.nfoBirthCountryCode = nfoBirthCountryCode;
		return this;
	}

	public String getNfoBirthSubjectCode() {
		return nfoBirthSubjectCode;
	}

	public FES_DOC setNfoBirthSubjectCode(String nfoBirthSubjectCode) {
		this.nfoBirthSubjectCode = nfoBirthSubjectCode;
		return this;
	}

	public String getNfoBirthArea() {
		return nfoBirthArea;
	}

	public FES_DOC setNfoBirthArea(String nfoBirthArea) {
		this.nfoBirthArea = nfoBirthArea;
		return this;
	}

	public String getNfoBirthCity() {
		return nfoBirthCity;
	}

	public FES_DOC setNfoBirthCity(String nfoBirthCity) {
		this.nfoBirthCity = nfoBirthCity;
		return this;
	}

	public String getNfoAddressCountryCode() {
		return nfoAddressCountryCode;
	}

	public FES_DOC setNfoAddressCountryCode(String nfoAddressCountryCode) {
		this.nfoAddressCountryCode = nfoAddressCountryCode;
		return this;
	}

	public String getNfoAddressSubjectCode() {
		return nfoAddressSubjectCode;
	}

	public FES_DOC setNfoAddressSubjectCode(String nfoAddressSubjectCode) {
		this.nfoAddressSubjectCode = nfoAddressSubjectCode;
		return this;
	}

	public String getNfoAddressArea() {
		return nfoAddressArea;
	}

	public FES_DOC setNfoAddressArea(String nfoAddressArea) {
		this.nfoAddressArea = nfoAddressArea;
		return this;
	}

	public String getNfoAddressCity() {
		return nfoAddressCity;
	}

	public FES_DOC setNfoAddressCity(String nfoAddressCity) {
		this.nfoAddressCity = nfoAddressCity;
		return this;
	}

	public String getNfoAddressStreet() {
		return nfoAddressStreet;
	}

	public FES_DOC setNfoAddressStreet(String nfoAddressStreet) {
		this.nfoAddressStreet = nfoAddressStreet;
		return this;
	}

	public String getNfoAddressHouse() {
		return nfoAddressHouse;
	}

	public FES_DOC setNfoAddressHouse(String nfoAddressHouse) {
		this.nfoAddressHouse = nfoAddressHouse;
		return this;
	}

	public String getNfoAddressCorp() {
		return nfoAddressCorp;
	}

	public FES_DOC setNfoAddressCorp(String nfoAddressCorp) {
		this.nfoAddressCorp = nfoAddressCorp;
		return this;
	}

	public String getNfoAddressApartment() {
		return nfoAddressApartment;
	}

	public FES_DOC setNfoAddressApartment(String nfoAddressApartment) {
		this.nfoAddressApartment = nfoAddressApartment;
		return this;
	}
	
	public String getIpAddress() {
		return ipAddress;
	}

	public FES_DOC setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
		return this;
	}
	
	public String getPostalCode() {
		return postalCode;
	}

	public FES_DOC setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}

	public String getPostalCountryCode() {
		return postalCountryCode;
	}

	public FES_DOC setPostalCountryCode(String postalCountryCode) {
		this.postalCountryCode = postalCountryCode;
		return this;
	}

	public String getPostalSubjectCode() {
		return postalSubjectCode;
	}

	public FES_DOC setPostalSubjectCode(String postalSubjectCode) {
		this.postalSubjectCode = postalSubjectCode;
		return this;
	}

	public String getPostalArea() {
		return postalArea;
	}

	public FES_DOC setPostalArea(String postalArea) {
		this.postalArea = postalArea;
		return this;
	}

	public String getPostalCity() {
		return postalCity;
	}

	public FES_DOC setPostalCity(String postalCity) {
		this.postalCity = postalCity;
		return this;
	}

	public String getPostalStreet() {
		return postalStreet;
	}

	public FES_DOC setPostalStreet(String postalStreet) {
		this.postalStreet = postalStreet;
		return this;
	}

	public String getPostalHouse() {
		return postalHouse;
	}

	public FES_DOC setPostalHouse(String postalHouse) {
		this.postalHouse = postalHouse;
		return this;
	}

	public String getPostalCorp() {
		return postalCorp;
	}

	public FES_DOC setPostalCorp(String postalCorp) {
		this.postalCorp = postalCorp;
		return this;
	}

	public String getPostalApartment() {
		return postalApartment;
	}

	public FES_DOC setPostalApartment(String postalApartment) {
		this.postalApartment = postalApartment;
		return this;
	}

	
}
