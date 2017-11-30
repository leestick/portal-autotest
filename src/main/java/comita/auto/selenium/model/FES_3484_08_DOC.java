package comita.auto.selenium.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import comita.auto.selenium.util.Dates;

public class FES_3484_08_DOC extends FES_DOC {
	
	private String id;
	private String recordTypeFES;
	private String refusalCode;
	private String refusalDate;
	private String currencyCode;
	private String sum;
	private String sumRUR;
	private String purposePay;
	private String operationSignCode;
	private String codeTypeMoney;
	private String charOper;
	private String comment;
	private String docTypeCode;
	private String docDate;
	private String docNumber;
	private String docInfo;
	private String statusOfParticipantCode;
	private String statusOfParticipant2Code;
	private String typeOfParticipantCode;
	private String typeOfParticipant;
	private String residentSign;
	private String legalPersonName;
	private String legalPersonINN;
	private String legalPersonKPP;
	private String legalPersonOKPO;
	private String legalPersonOKVED;
	private String legalPersonOGRN;
	private String nameRegOrg;
	private String dateReg;
	private String privatePersonSurname;
	private String privatePersonName;
	private String privatePersonPatronymic;
	private String privatePersonINN;
	private String privatePersonOKVED;
	private String identityDocType;
	private String identityDocSerie;
	private String identityDocNumber;
	private String identityIssueDate;
	private String identityIssuer;
	private String identityCodeSubDivision;
	private String identityBirthDate;
	private String birthCountryCode;
	private String birthSubjectCode;
	private String birthArea;
	private String birthCity;
	private String birthCitizenshipCode;
	private String birthPublicFacesSign;
	private String addressCountryCode;
	private String addressSubjectCode;
	private String addressArea;
	private String addressCity;
	private String addressStreet;
	private String addressHouse;
	private String addressCorp;
	private String addressApartment;

	private Dates dates = new Dates();	
	public String dateAndTime = dates.getDate();
	public String date = dateAndTime.substring(0, 10);
	public String time = dates.getTimeForLog().substring(0, 8);	
	
	public FES_3484_08_DOC writeData() {
        Properties property = new Properties();
 
        try {
        	String path = "src/test/resources/test_data/FES_3484_08.txt";
        	property.load(new InputStreamReader(new FileInputStream(path), "UTF-8"));
			writeData(path);
			this.id = property.getProperty("{id}");
			this.recordTypeFES = property.getProperty("{recordTypeFES}");
			this.refusalCode = property.getProperty("{refusalCode}");
			this.refusalDate = property.getProperty("{refusalDate}");
			this.currencyCode = property.getProperty("{currencyCode}");
			this.sum = property.getProperty("{sum}");
			this.sumRUR = property.getProperty("{sumRUR}");
			this.purposePay = property.getProperty("{purposePay}");
			this.operationSignCode = property.getProperty("{operationSignCode}");
			this.codeTypeMoney = property.getProperty("{codeTypeMoney}");
			this.charOper = property.getProperty("{charOper}");
			this.comment = property.getProperty("{comment}");
			this.docTypeCode = property.getProperty("{docTypeCode}");
			this.docDate = property.getProperty("{docDate}");
			this.docNumber = property.getProperty("{docNumber}");
			this.docInfo = property.getProperty("{docInfo}");
			this.statusOfParticipantCode = property.getProperty("{statusOfParticipantCode}");
			this.statusOfParticipant2Code = property.getProperty("{statusOfParticipant2Code}");
			this.typeOfParticipantCode = property.getProperty("{typeOfParticipantCode}");
			this.typeOfParticipant = property.getProperty("{typeOfParticipant}");
			this.residentSign = property.getProperty("{residentSign}");
			this.legalPersonName = property.getProperty("{legalPersonName}");
			this.legalPersonINN = property.getProperty("{legalPersonINN}");
			this.legalPersonKPP = property.getProperty("{legalPersonKPP}");
			this.legalPersonOKPO = property.getProperty("{legalPersonOKPO}");
			this.legalPersonOKVED = property.getProperty("{legalPersonOKVED}");
			this.legalPersonOGRN = property.getProperty("{legalPersonOGRN}");
			this.nameRegOrg = property.getProperty("{nameRegOrg}");
			this.dateReg = property.getProperty("{dateReg}");
			this.privatePersonSurname = property.getProperty("{privatePersonSurname}");
			this.privatePersonName = property.getProperty("{privatePersonName}");
			this.privatePersonPatronymic = property.getProperty("{privatePersonPatronymic}");
			this.privatePersonINN = property.getProperty("{privatePersonINN}");
			this.privatePersonOKVED = property.getProperty("{privatePersonOKVED}");
			this.identityDocType = property.getProperty("{identityDocType}");
			this.identityDocSerie = property.getProperty("{identityDocSerie}");
			this.identityDocNumber = property.getProperty("{identityDocNumber}");
			this.identityIssueDate = property.getProperty("{identityIssueDate}");
			this.identityIssuer = property.getProperty("{identityIssuer}");
			this.identityCodeSubDivision = property.getProperty("{identityCodeSubDivision}");
			this.identityBirthDate = property.getProperty("{identityBirthDate}");
			this.birthCountryCode = property.getProperty("{birthCountryCode}");
			this.birthSubjectCode = property.getProperty("{birthSubjectCode}");
			this.birthArea = property.getProperty("{birthArea}");
			this.birthCity = property.getProperty("{birthCity}");
			this.birthCitizenshipCode = property.getProperty("{birthCitizenshipCode}");
			this.birthPublicFacesSign = property.getProperty("{birthPublicFacesSign}");
			this.addressCountryCode = property.getProperty("{addressCountryCode}");
			this.addressSubjectCode = property.getProperty("{addressSubjectCode}");
			this.addressArea = property.getProperty("{addressArea}");
			this.addressCity = property.getProperty("{addressCity}");
			this.addressStreet = property.getProperty("{addressStreet}");
			this.addressHouse = property.getProperty("{addressHouse}");
			this.addressCorp = property.getProperty("{addressCorp}");
			this.addressApartment = property.getProperty("{addressApartment}");
		
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл отсуствует!");
        }
		return this;
	}
	
	public String getId() {
		return id;
	}

	public FES_3484_08_DOC setId(String id) {
		this.id = id;
		return this;
	}
	
	public String getRecordTypeFES() {
		return recordTypeFES;
	}

	public FES_3484_08_DOC setRecordTypeFES(String recordTypeFES) {
		this.recordTypeFES = recordTypeFES;
		return this;
	}

	public String getRefusalCode() {
		return refusalCode;
	}
	
	public FES_3484_08_DOC setRefusalCode(String refusalCode) {
		this.refusalCode = refusalCode;
		return this;
	}

	public String getRefusalDate() {
		return refusalDate;
	}

	public FES_3484_08_DOC setRefusalDate(String refusalDate) {
		this.refusalDate = refusalDate;
		return this;
	}
	
	public String getCurrencyCode() {
		return currencyCode;
	}

	public FES_3484_08_DOC setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
		return this;
	}

	public String getSum() {
		return sum;
	}

	public FES_3484_08_DOC setSum(String sum) {
		this.sum = sum;
		return this;
	}

	public String getSumRUR() {
		return sumRUR;
	}

	public FES_3484_08_DOC setSumRUR(String sumRUR) {
		this.sumRUR = sumRUR;
		return this;
	}

	public String getPurposePay() {
		return purposePay;
	}

	public FES_3484_08_DOC setPurposePay(String purposePay) {
		this.purposePay = purposePay;
		return this;
	}

	public String getOperationSignCode() {
		return operationSignCode;
	}
	
	public FES_3484_08_DOC setOperationSignCode(String operationSignCode) {
		this.operationSignCode = operationSignCode;
		return this;
	}

	public String getCodeTypeMoney() {
		return codeTypeMoney;
	}

	public FES_3484_08_DOC setCodeTypeMoney(String codeTypeMoney) {
		this.codeTypeMoney = codeTypeMoney;
		return this;
	}

	public String getCharOper() {
		return charOper;
	}

	public FES_3484_08_DOC setCharOper(String charOper) {
		this.charOper = charOper;
		return this;
	}

	public String getComment() {
		return comment;
	}

	public FES_3484_08_DOC setComment(String comment) {
		this.comment = comment;
		return this;
	}

	public String getDocTypeCode() {
		return docTypeCode;
	}

	public FES_3484_08_DOC setDocTypeCode(String docTypeCode) {
		this.docTypeCode = docTypeCode;
		return this;
	}

	public String getDocDate() {
		return docDate;
	}

	public FES_3484_08_DOC setDocDate(String docDate) {
		this.docDate = docDate;
		return this;
	}

	public String getDocNumber() {
		return docNumber;
	}
	
	public FES_3484_08_DOC setDocNumber(String docNumber) {
		this.docNumber = docNumber;
		return this;
	}

	public String getDocInfo() {
		return docInfo;
	}

	public FES_3484_08_DOC setDocInfo(String docInfo) {
		this.docInfo = docInfo;
		return this;
	}

	public String getStatusOfParticipantCode() {
		return statusOfParticipantCode;
	}

	public FES_3484_08_DOC setStatusOfParticipantCode(String statusOfParticipantCode) {
		this.statusOfParticipantCode = statusOfParticipantCode;
		return this;
	}
	
	public String getStatusOfParticipant2Code() {
		return statusOfParticipant2Code;
	}
	
	public FES_3484_08_DOC setStatusOfParticipant2Code(String statusOfParticipant2Code) {
		this.statusOfParticipant2Code = statusOfParticipant2Code;
		return this;
	}

	public String getTypeOfParticipantCode() {
		return typeOfParticipantCode;
	}

	public FES_3484_08_DOC setTypeOfParticipantCode(String typeOfParticipantCode) {
		this.typeOfParticipantCode = typeOfParticipantCode;
		return this;
	}

	public String getTypeOfParticipant() {
		return typeOfParticipant;
	}
	
	public FES_3484_08_DOC setTypeOfParticipant(String typeOfParticipant) {
		this.typeOfParticipant = typeOfParticipant;
		return this;
	}

	public String getResidentSign() {
		return residentSign;
	}
	
	public FES_3484_08_DOC setResidentSign(String residentSign) {
		this.residentSign = residentSign;
		return this;
	}

	public String getLegalPersonName() {
		return legalPersonName;
	}

	public FES_3484_08_DOC setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
		return this;
	}

	public String getLegalPersonINN() {
		return legalPersonINN;
	}

	public FES_3484_08_DOC setLegalPersonINN(String legalPersonINN) {
		this.legalPersonINN = legalPersonINN;
		return this;
	}
	
	public String getLegalPersonKPP() {
		return legalPersonKPP;
	}
	
	public FES_3484_08_DOC setLegalPersonKPP(String legalPersonKPP) {
		this.legalPersonKPP = legalPersonKPP;
		return this;
	}

	public String getLegalPersonOKPO() {
		return legalPersonOKPO;
	}

	public FES_3484_08_DOC setLegalPersonOKPO(String legalPersonOKPO) {
		this.legalPersonOKPO = legalPersonOKPO;
		return this;
	}

	public String getLegalPersonOKVED() {
		return legalPersonOKVED;
	}

	public FES_3484_08_DOC setLegalPersonOKVED(String legalPersonOKVED) {
		this.legalPersonOKVED = legalPersonOKVED;
		return this;
	}

	public String getLegalPersonOGRN() {
		return legalPersonOGRN;
	}

	public FES_3484_08_DOC setLegalPersonOGRN(String legalPersonOGRN) {
		this.legalPersonOGRN = legalPersonOGRN;
		return this;
	}

	public String getNameRegOrg() {
		return nameRegOrg;
	}

	public FES_3484_08_DOC setNameRegOrg(String nameRegOrg) {
		this.nameRegOrg = nameRegOrg;
		return this;
	}

	public String getDateReg() {
		return dateReg;
	}

	public FES_3484_08_DOC setDateReg(String dateReg) {
		this.dateReg = dateReg;
		return this;
	}

	public String getPrivatePersonSurname() {
		return privatePersonSurname;
	}
	
	public FES_3484_08_DOC setPrivatePersonSurname(String privatePersonSurname) {
		this.privatePersonSurname = privatePersonSurname;
		return this;
	}
	
	public String getPrivatePersonName() {
		return privatePersonName;
	}

	public FES_3484_08_DOC setPrivatePersonName(String privatePersonName) {
		this.privatePersonName = privatePersonName;
		return this;
	}

	public String getPrivatePersonPatronymic() {
		return privatePersonPatronymic;
	}

	public FES_3484_08_DOC setPrivatePersonPatronymic(String privatePersonPatronymic) {
		this.privatePersonPatronymic = privatePersonPatronymic;
		return this;
	}

	public String getPrivatePersonINN() {
		return privatePersonINN;
	}

	public FES_3484_08_DOC setPrivatePersonINN(String privatePersonINN) {
		this.privatePersonINN = privatePersonINN;
		return this;
	}

	public String getPrivatePersonOKVED() {
		return privatePersonOKVED;
	}

	public FES_3484_08_DOC setPrivatePersonOKVED(String privatePersonOKVED) {
		this.privatePersonOKVED = privatePersonOKVED;
		return this;
	}

	public String getIdentityDocType() {
		return identityDocType;
	}

	public FES_3484_08_DOC setIdentityDocType(String identityDocType) {
		this.identityDocType = identityDocType;
		return this;
	}

	public String getIdentityDocSerie() {
		return identityDocSerie;
	}

	public FES_3484_08_DOC setIdentityDocSerie(String identityDocSerie) {
		this.identityDocSerie = identityDocSerie;
		return this;
	}

	public String getIdentityDocNumber() {
		return identityDocNumber;
	}

	public FES_3484_08_DOC setIdentityDocNumber(String identityDocNumber) {
		this.identityDocNumber = identityDocNumber;
		return this;
	}
	
	public String getIdentityIssueDate() {
		return identityIssueDate;
	}

	public FES_3484_08_DOC setIdentityIssueDate(String identityIssueDate) {
		this.identityIssueDate = identityIssueDate;
		return this;
	}

	public String getIdentityIssuer() {
		return identityIssuer;
	}

	public FES_3484_08_DOC setIdentityIssuer(String identityIssuer) {
		this.identityIssuer = identityIssuer;
		return this;
	}

	public String getIdentityCodeSubDivision() {
		return identityCodeSubDivision;
	}

	public FES_3484_08_DOC setIdentityCodeSubDivision(String identityCodeSubDivision) {
		this.identityCodeSubDivision = identityCodeSubDivision;
		return this;
	}

	public String getIdentityBirthDate() {
		return identityBirthDate;
	}

	public FES_3484_08_DOC setIdentityBirthDate(String identityBirthDate) {
		this.identityBirthDate = identityBirthDate;
		return this;
	}

	public String getBirthCountryCode() {
		return birthCountryCode;
	}

	public FES_3484_08_DOC setBirthCountryCode(String birthCountryCode) {
		this.birthCountryCode = birthCountryCode;
		return this;
	}

	public String getBirthSubjectCode() {
		return birthSubjectCode;
	}

	public FES_3484_08_DOC setBirthSubjectCode(String birthSubjectCode) {
		this.birthSubjectCode = birthSubjectCode;
		return this;
	}

	public String getBirthArea() {
		return birthArea;
	}

	public FES_3484_08_DOC setBirthArea(String birthArea) {
		this.birthArea = birthArea;
		return this;
	}

	public String getBirthCity() {
		return birthCity;
	}

	public FES_3484_08_DOC setBirthCity(String birthCity) {
		this.birthCity = birthCity;
		return this;
	}

	public String getBirthCitizenshipCode() {
		return birthCitizenshipCode;
	}

	public FES_3484_08_DOC setBirthCitizenshipCode(String birthCitizenshipCode) {
		this.birthCitizenshipCode = birthCitizenshipCode;
		return this;
	}

	public String getBirthPublicFacesSign() {
		return birthPublicFacesSign;
	}

	public FES_3484_08_DOC setBirthPublicFacesSign(String birthPublicFacesSign) {
		this.birthPublicFacesSign = birthPublicFacesSign;
		return this;
	}
	
	public String getAddressCountryCode() {
		return addressCountryCode;
	}
	
	public FES_3484_08_DOC setAddressCountryCode(String addressCountryCode) {
		this.addressCountryCode = addressCountryCode;
		return this;
	}

	public String getAddressSubjectCode() {
		return addressSubjectCode;
	}

	public FES_3484_08_DOC setAddressSubjectCode(String addressSubjectCode) {
		this.addressSubjectCode = addressSubjectCode;
		return this;
	}

	public String getAddressArea() {
		return addressArea;
	}

	public FES_3484_08_DOC setAddressArea(String addressArea) {
		this.addressArea = addressArea;
		return this;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public FES_3484_08_DOC setAddressCity(String addressCity) {
		this.addressCity = addressCity;
		return this;
	}

	public String getAddressStreet() {
		return addressStreet;
	}

	public FES_3484_08_DOC setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
		return this;
	}

	public String getAddressHouse() {
		return addressHouse;
	}

	public FES_3484_08_DOC setAddressHouse(String addressHouse) {
		this.addressHouse = addressHouse;
		return this;
	}

	public String getAddressCorp() {
		return addressCorp;
	}

	public FES_3484_08_DOC setAddressCorp(String addressCorp) {
		this.addressCorp = addressCorp;
		return this;
	}
	
	public String getAddressApartment() {
		return addressApartment;
	}

	public FES_3484_08_DOC setAddressApartment(String addressApartment) {
		this.addressApartment = addressApartment;
		return this;
	}
}
