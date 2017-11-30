package comita.auto.selenium.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import comita.auto.selenium.util.Dates;

public class FES_3484_010206_DOC extends FES_DOC {	
	
	private String id;
	private String recordTypeFES;
	private String signOperationFinancingOfTerrorizm;
	private String dateOperation;
	private String dateDetectOperation;
	private String operationTypeCode;
	private String operationTypeAddCode;
	private String codeOfUnusualOperation;
	private String currencyCode;
	private String sum;
	private String sumRUR;
	private String codePreciousMetals;
	private String purposePay;
	private String signOperationCode;
	private String signFeatureCashCode;
	private String charOper;
	private String additionalInfo;
	private String kindOfDocumentCode;
	private String dateOfDocument;	
	private String numberOfDocument;
	private String documentSummary;
	private String participantStatusCode;
	private String participant2StatusCode;
	private String participantTypeCode;
	private String participantType;
	private String residentSign;
	private String legalPersonName;
	private String legalPersonINN;
	private String legalPersonKPP;
	private String legalPersonOKPO;
	private String legalPersonOKVED;
	private String legalPersonOGRN;
	private String legalPersonRegistrationAuthority;
	private String legalPersonRegistrationDate;
	private String privatePersonSurname;
	private String privatePersonName;
	private String privatePersonPatronymic;
	private String privatePersonINN;
	private String privatePersonOKVED;
	private String privatePersonOGRN;
	private String privatePersonRegistrationAuthority;
	private String privatePersonRegistrationDate;
	private String privatePersonIdentityDocType;
	private String privatePersonIdentityDocSerie;
	private String privatePersonIdentityDocNumber;
	private String privatePersonIdentityDocIssueDate;
	private String privatePersonIdentityDocIssuer;
	private String privatePersonIdentityDocCodeDivision;
	private String privatePersonIdentityDocBirthDate;
	private String privatePersonBirthCountryCode;
	private String privatePersonBirthSubjectCode;
	private String privatePersonBirthArea;
	private String privatePersonBirthCity;
	private String privatePersonBirthCountryCitizenshipCode;
	private String privatePersonBirthPublicEntitiesSign;
	private String privatePersonAddressCountryCode;
	private String privatePersonAddressSubjectCode;
	private String privatePersonAddressArea;
	private String privatePersonAddressCity;
	private String privatePersonAddressStreet;
	private String privatePersonAddressHouse;
	private String privatePersonAddressCorp;
	private String privatePersonAddressApartment;
	private String BIK;
	private String bankAccountNumber;
	private String bankName;	

	private Dates dates = new Dates();	
	public String dateAndTime = dates.getDate();
	public String date = dateAndTime.substring(0, 10);
	
	public FES_3484_010206_DOC writeData() {
        Properties property = new Properties();
 
        try {
        	
        	String path = "src/test/resources/test_data/FES_3484_010206.txt";
        	property.load(new InputStreamReader(new FileInputStream(path), "UTF-8"));
			writeData(path);
			this.id = property.getProperty("{id}");
			this.recordTypeFES = property.getProperty("{recordTypeFES}");
			this.signOperationFinancingOfTerrorizm = property.getProperty("{signOperationFinancingOfTerrorizm}");
			this.dateOperation = property.getProperty("{dateOperation}");
			this.dateDetectOperation = property.getProperty("{dateDetectOperation}");
			this.operationTypeCode = property.getProperty("{operationTypeCode}");
			this.operationTypeAddCode = property.getProperty("{operationTypeAddCode}");
			this.codeOfUnusualOperation = property.getProperty("{codeOfUnusualOperation}");
			this.currencyCode = property.getProperty("{currencyCode}");
			this.sum = property.getProperty("{sum}");
			this.sumRUR = property.getProperty("{sumRUR}");
			this.codePreciousMetals = property.getProperty("{codePreciousMetals}");
			this.purposePay = property.getProperty("{purposePay}");
			this.signOperationCode = property.getProperty("{signOperationCode}");
			this.signFeatureCashCode = property.getProperty("{signFeatureCashCode}");
			this.charOper = property.getProperty("{charOper}");
			this.additionalInfo = property.getProperty("{additionalInfo}");
			this.kindOfDocumentCode = property.getProperty("{kindOfDocumentCode}");
			this.dateOfDocument = property.getProperty("{dateOfDocument}");
			this.numberOfDocument = property.getProperty("{numberOfDocument}");
			this.documentSummary = property.getProperty("{documentSummary}");		
			this.participantStatusCode = property.getProperty("{participantStatusCode}");
			this.participant2StatusCode = property.getProperty("{participant2StatusCode}");
			this.participantTypeCode = property.getProperty("{participantTypeCode}");
			this.participantType = property.getProperty("{participantType}");
			this.residentSign = property.getProperty("{residentSign}");
			this.legalPersonName = property.getProperty("{legalPersonName}");
			this.legalPersonINN = property.getProperty("{legalPersonINN}");
			this.legalPersonKPP = property.getProperty("{legalPersonKPP}");
			this.legalPersonOKPO = property.getProperty("{legalPersonOKPO}");
			this.legalPersonOKVED = property.getProperty("{legalPersonOKVED}");
			this.legalPersonOGRN = property.getProperty("{legalPersonOGRN}");
			this.legalPersonRegistrationAuthority = property.getProperty("{legalPersonRegistrationAuthority}");
			this.legalPersonRegistrationDate = property.getProperty("{legalPersonRegistrationDate}");
			this.privatePersonSurname = property.getProperty("{privatePersonSurname}");
			this.privatePersonName = property.getProperty("{privatePersonName}");
			this.privatePersonPatronymic = property.getProperty("{privatePersonPatronymic}");
			this.privatePersonINN = property.getProperty("{privatePersonINN}");
			this.privatePersonOKVED = property.getProperty("{privatePersonOKVED}");
			this.privatePersonOGRN = property.getProperty("{privatePersonOGRN}");
			this.privatePersonRegistrationAuthority = property.getProperty("{privatePersonRegistrationAuthority}");
			this.privatePersonRegistrationDate = property.getProperty("{privatePersonRegistrationDate}");
			this.privatePersonIdentityDocType = property.getProperty("{privatePersonIdentityDocType}");
			this.privatePersonIdentityDocSerie = property.getProperty("{privatePersonIdentityDocSerie}");
			this.privatePersonIdentityDocNumber = property.getProperty("{privatePersonIdentityDocNumber}");
			this.privatePersonIdentityDocIssueDate = property.getProperty("{privatePersonIdentityDocIssueDate}");
			this.privatePersonIdentityDocIssuer = property.getProperty("{privatePersonIdentityDocIssuer}");
			this.privatePersonIdentityDocCodeDivision = property.getProperty("{privatePersonIdentityDocCodeDivision}");
			this.privatePersonIdentityDocBirthDate = property.getProperty("{privatePersonIdentityDocBirthDate}");
			this.privatePersonBirthCountryCode = property.getProperty("{privatePersonBirthCountryCode}");
			this.privatePersonBirthSubjectCode = property.getProperty("{privatePersonBirthSubjectCode}");
			this.privatePersonBirthArea = property.getProperty("{privatePersonBirthArea}");
			this.privatePersonBirthCity = property.getProperty("{privatePersonBirthCity}");
			this.privatePersonBirthCountryCitizenshipCode = property.getProperty("{privatePersonBirthCountryCitizenshipCode}");
			this.privatePersonBirthPublicEntitiesSign = property.getProperty("{privatePersonBirthPublicEntitiesSign}");
			this.privatePersonAddressCountryCode = property.getProperty("{privatePersonAddressCountryCode}");
			this.privatePersonAddressSubjectCode = property.getProperty("{privatePersonAddressSubjectCode}");
			this.privatePersonAddressArea = property.getProperty("{privatePersonAddressArea}");
			this.privatePersonAddressCity = property.getProperty("{privatePersonAddressCity}");
			this.privatePersonAddressStreet = property.getProperty("{privatePersonAddressStreet}");
			this.privatePersonAddressHouse = property.getProperty("{privatePersonAddressHouse}");
			this.privatePersonAddressCorp = property.getProperty("{privatePersonAddressCorp}");
			this.privatePersonAddressApartment = property.getProperty("{privatePersonAddressApartment}");
			this.BIK = property.getProperty("{BIK}");
			this.bankAccountNumber = property.getProperty("{bankAccountNumber}");
			this.bankName = property.getProperty("{bankName}");			
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл отсуствует!");
        }
		return this;
	}

	public String getId() {
		return id;
	}

	public FES_3484_010206_DOC setId(String id) {
		this.id = id;
		return this;
	}

	public String getSignOperationFinancingOfTerrorizm() {
		return signOperationFinancingOfTerrorizm;
	}

	public FES_3484_010206_DOC setSignOperationFinancingOfTerrorizm(
			String signOperationFinancingOfTerrorizm) {
		this.signOperationFinancingOfTerrorizm = signOperationFinancingOfTerrorizm;
		return this;
	}	
	
	public String getRecordTypeFES() {
		return recordTypeFES;
	}

	public FES_3484_010206_DOC setRecordTypeFES(String recordTypeFES) {
		this.recordTypeFES = recordTypeFES;
		return this;
	}	

	public String getDateOperation() {
		return dateOperation;
	}

	public FES_3484_010206_DOC setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
		return this;
	}

	public String getDateDetectOperation() {
		return dateDetectOperation;
	}

	public FES_3484_010206_DOC setDateDetectOperation(String dateDetectOperation) {
		this.dateDetectOperation = dateDetectOperation;
		return this;
	}

	public String getOperationTypeCode() {
		return operationTypeCode;
	}

	public FES_3484_010206_DOC setOperationTypeCode(String operationTypeCode) {
		this.operationTypeCode = operationTypeCode;
		return this;
	}

	public String getOperationTypeAddCode() {
		return operationTypeAddCode;
	}

	public FES_3484_010206_DOC setOperationTypeAddCode(String operationTypeAddCode) {
		this.operationTypeAddCode = operationTypeAddCode;
		return this;
	}

	public String getCodeOfUnusualOperation() {
		return codeOfUnusualOperation;
	}

	public FES_3484_010206_DOC setCodeOfUnusualOperation(String codeOfUnusualOperation) {
		this.codeOfUnusualOperation = codeOfUnusualOperation;
		return this;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public FES_3484_010206_DOC setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
		return this;
	}

	public String getSum() {
		return sum;
	}

	public FES_3484_010206_DOC setSum(String sum) {
		this.sum = sum;
		return this;
	}

	public String getSumRUR() {
		return sumRUR;
	}

	public FES_3484_010206_DOC setSumRUR(String sumRUR) {
		this.sumRUR = sumRUR;
		return this;
	}

	public String getCodePreciousMetals() {
		return codePreciousMetals;
	}

	public FES_3484_010206_DOC setCodePreciousMetals(String codePreciousMetals) {
		this.codePreciousMetals = codePreciousMetals;
		return this;
	}

	public String getPurposePay() {
		return purposePay;
	}

	public FES_3484_010206_DOC setPurposePay(String purposePay) {
		this.purposePay = purposePay;
		return this;
	}

	public String getSignOperationCode() {
		return signOperationCode;
	}

	public FES_3484_010206_DOC setSignOperationCode(String signOperationCode) {
		this.signOperationCode = signOperationCode;
		return this;
	}

	public String getCharOper() {
		return charOper;
	}

	public FES_3484_010206_DOC setCharOper(String charOper) {
		this.charOper = charOper;
		return this;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public FES_3484_010206_DOC setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}	

	public String getSignFeatureCashCode() {
		return signFeatureCashCode;
	}

	public FES_3484_010206_DOC setSignFeatureCashCode(String signFeatureCashCode) {
		this.signFeatureCashCode = signFeatureCashCode;
		return this;
	}
	
	public String getKindOfDocumentCode() {
		return kindOfDocumentCode;
	}

	public FES_3484_010206_DOC setKindOfDocumentCode(String kindOfDocumentCode) {
		this.kindOfDocumentCode = kindOfDocumentCode;
		return this;
	}
	
	public String getDateOfDocument() {
		return dateOfDocument;
	}

	public FES_3484_010206_DOC setDateOfDocument(String dateOfDocument) {
		this.dateOfDocument = dateOfDocument;
		return this;
	}

	public String getNumberOfDocument() {
		return numberOfDocument;
	}

	public FES_3484_010206_DOC setNumberOfDocument(String numberOfDocument) {
		this.numberOfDocument = numberOfDocument;
		return this;
	}

	public String getDocumentSummary() {
		return documentSummary;
	}

	public FES_3484_010206_DOC setDocumentSummary(String documentSummary) {
		this.documentSummary = documentSummary;
		return this;
	}
	
	public String getParticipantStatusCode() {
		return participantStatusCode;
	}

	public FES_3484_010206_DOC setParticipantStatusCode(String participantStatusCode) {
		this.participantStatusCode = participantStatusCode;
		return this;
	}
	
	public String getParticipant2StatusCode() {
		return participant2StatusCode;
	}

	public FES_3484_010206_DOC setParticipant2StatusCode(String participant2StatusCode) {
		this.participant2StatusCode = participant2StatusCode;
		return this;
	}

	public String getParticipantTypeCode() {
		return participantTypeCode;
	}

	public FES_3484_010206_DOC setParticipantTypeCode(String participantTypeCode) {
		this.participantTypeCode = participantTypeCode;
		return this;
	}

	public String getParticipantType() {
		return participantType;
	}

	public FES_3484_010206_DOC setParticipantType(String participantType) {
		this.participantType = participantType;
		return this;
	}

	public String getResidentSign() {
		return residentSign;
	}

	public FES_3484_010206_DOC setResidentSign(String residentSign) {
		this.residentSign = residentSign;
		return this;
	}

	public String getLegalPersonName() {
		return legalPersonName;
	}

	public FES_3484_010206_DOC setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
		return this;
	}

	public String getLegalPersonINN() {
		return legalPersonINN;
	}

	public FES_3484_010206_DOC setLegalPersonINN(String legalPersonINN) {
		this.legalPersonINN = legalPersonINN;
		return this;
	}

	public String getLegalPersonKPP() {
		return legalPersonKPP;
	}

	public FES_3484_010206_DOC setLegalPersonKPP(String legalPersonKPP) {
		this.legalPersonKPP = legalPersonKPP;
		return this;
	}

	public String getLegalPersonOKPO() {
		return legalPersonOKPO;
	}

	public FES_3484_010206_DOC setLegalPersonOKPO(String legalPersonOKPO) {
		this.legalPersonOKPO = legalPersonOKPO;
		return this;
	}

	public String getLegalPersonOKVED() {
		return legalPersonOKVED;
	}

	public FES_3484_010206_DOC setLegalPersonOKVED(String legalPersonOKVED) {
		this.legalPersonOKVED = legalPersonOKVED;
		return this;
	}

	public String getLegalPersonOGRN() {
		return legalPersonOGRN;
	}

	public FES_3484_010206_DOC setLegalPersonOGRN(String legalPersonOGRN) {
		this.legalPersonOGRN = legalPersonOGRN;
		return this;
	}

	public String getLegalPersonRegistrationAuthority() {
		return legalPersonRegistrationAuthority;
	}

	public FES_3484_010206_DOC setLegalPersonRegistrationAuthority(
			String legalPersonRegistrationAuthority) {
		this.legalPersonRegistrationAuthority = legalPersonRegistrationAuthority;
		return this;
	}

	public String getLegalPersonRegistrationDate() {
		return legalPersonRegistrationDate;
	}

	public FES_3484_010206_DOC setLegalPersonRegistrationDate(String legalPersonRegistrationDate) {
		this.legalPersonRegistrationDate = legalPersonRegistrationDate;
		return this;
	}

	public String getPrivatePersonSurname() {
		return privatePersonSurname;
	}

	public FES_3484_010206_DOC setPrivatePersonSurname(String privatePersonSurname) {
		this.privatePersonSurname = privatePersonSurname;
		return this;
	}

	public String getPrivatePersonName() {
		return privatePersonName;
	}

	public FES_3484_010206_DOC setPrivatePersonName(String privatePersonName) {
		this.privatePersonName = privatePersonName;
		return this;
	}

	public String getPrivatePersonPatronymic() {
		return privatePersonPatronymic;
	}

	public FES_3484_010206_DOC setPrivatePersonPatronymic(String privatePersonPatronymic) {
		this.privatePersonPatronymic = privatePersonPatronymic;
		return this;
	}

	public String getPrivatePersonINN() {
		return privatePersonINN;
	}

	public FES_3484_010206_DOC setPrivatePersonINN(String privatePersonINN) {
		this.privatePersonINN = privatePersonINN;
		return this;
	}

	public String getPrivatePersonOKVED() {
		return privatePersonOKVED;
	}

	public FES_3484_010206_DOC setPrivatePersonOKVED(String privatePersonOKVED) {
		this.privatePersonOKVED = privatePersonOKVED;
		return this;
	}

	public String getPrivatePersonOGRN() {
		return privatePersonOGRN;
	}

	public FES_3484_010206_DOC setPrivatePersonOGRN(String privatePersonOGRN) {
		this.privatePersonOGRN = privatePersonOGRN;
		return this;
	}

	public String getPrivatePersonRegistrationAuthority() {
		return privatePersonRegistrationAuthority;
	}

	public FES_3484_010206_DOC setPrivatePersonRegistrationAuthority(
			String privatePersonRegistrationAuthority) {
		this.privatePersonRegistrationAuthority = privatePersonRegistrationAuthority;
		return this;
	}

	public String getPrivatePersonRegistrationDate() {
		return privatePersonRegistrationDate;
	}

	public FES_3484_010206_DOC setPrivatePersonRegistrationDate(
			String privatePersonRegistrationDate) {
		this.privatePersonRegistrationDate = privatePersonRegistrationDate;
		return this;
	}

	public String getPrivatePersonIdentityDocType() {
		return privatePersonIdentityDocType;
	}

	public FES_3484_010206_DOC setPrivatePersonIdentityDocType(String privatePersonIdentityDocType) {
		this.privatePersonIdentityDocType = privatePersonIdentityDocType;
		return this;
	}

	public String getPrivatePersonIdentityDocSerie() {
		return privatePersonIdentityDocSerie;
	}

	public FES_3484_010206_DOC setPrivatePersonIdentityDocSerie(
			String privatePersonIdentityDocSerie) {
		this.privatePersonIdentityDocSerie = privatePersonIdentityDocSerie;
		return this;
	}

	public String getPrivatePersonIdentityDocNumber() {
		return privatePersonIdentityDocNumber;
	}

	public FES_3484_010206_DOC setPrivatePersonIdentityDocNumber(
			String privatePersonIdentityDocNumber) {
		this.privatePersonIdentityDocNumber = privatePersonIdentityDocNumber;
		return this;
	}

	public String getPrivatePersonIdentityDocIssueDate() {
		return privatePersonIdentityDocIssueDate;
	}

	public FES_3484_010206_DOC setPrivatePersonIdentityDocIssueDate(
			String privatePersonIdentityDocIssueDate) {
		this.privatePersonIdentityDocIssueDate = privatePersonIdentityDocIssueDate;
		return this;
	}

	public String getPrivatePersonIdentityDocIssuer() {
		return privatePersonIdentityDocIssuer;
	}

	public FES_3484_010206_DOC setPrivatePersonIdentityDocIssuer(
			String privatePersonIdentityDocIssuer) {
		this.privatePersonIdentityDocIssuer = privatePersonIdentityDocIssuer;
		return this;
	}

	public String getPrivatePersonIdentityDocCodeDivision() {
		return privatePersonIdentityDocCodeDivision;
	}

	public FES_3484_010206_DOC setPrivatePersonIdentityDocCodeDivision(
			String privatePersonIdentityDocCodeDivision) {
		this.privatePersonIdentityDocCodeDivision = privatePersonIdentityDocCodeDivision;
		return this;
	}

	public String getPrivatePersonIdentityDocBirthDate() {
		return privatePersonIdentityDocBirthDate;
	}

	public FES_3484_010206_DOC setPrivatePersonIdentityDocBirthDate(
			String privatePersonIdentityDocBirthDate) {
		this.privatePersonIdentityDocBirthDate = privatePersonIdentityDocBirthDate;
		return this;
	}

	public String getPrivatePersonBirthCountryCode() {
		return privatePersonBirthCountryCode;
	}

	public FES_3484_010206_DOC setPrivatePersonBirthCountryCode(
			String privatePersonBirthCountryCode) {
		this.privatePersonBirthCountryCode = privatePersonBirthCountryCode;
		return this;
	}

	public String getPrivatePersonBirthSubjectCode() {
		return privatePersonBirthSubjectCode;
	}

	public FES_3484_010206_DOC setPrivatePersonBirthSubjectCode(
			String privatePersonBirthSubjectCode) {
		this.privatePersonBirthSubjectCode = privatePersonBirthSubjectCode;
		return this;
	}

	public String getPrivatePersonBirthArea() {
		return privatePersonBirthArea;
	}

	public FES_3484_010206_DOC setPrivatePersonBirthArea(String privatePersonBirthArea) {
		this.privatePersonBirthArea = privatePersonBirthArea;
		return this;
	}

	public String getPrivatePersonBirthCity() {
		return privatePersonBirthCity;
	}

	public FES_3484_010206_DOC setPrivatePersonBirthCity(String privatePersonBirthCity) {
		this.privatePersonBirthCity = privatePersonBirthCity;
		return this;
	}

	public String getPrivatePersonBirthCountryCitizenshipCode() {
		return privatePersonBirthCountryCitizenshipCode;
	}

	public FES_3484_010206_DOC setPrivatePersonBirthCountryCitizenshipCode(
			String privatePersonBirthCountryCitizenshipCode) {
		this.privatePersonBirthCountryCitizenshipCode = privatePersonBirthCountryCitizenshipCode;
		return this;
	}

	public String getPrivatePersonBirthPublicEntitiesSign() {
		return privatePersonBirthPublicEntitiesSign;
	}

	public FES_3484_010206_DOC setPrivatePersonBirthPublicEntitiesSign(
			String privatePersonBirthPublicEntitiesSign) {
		this.privatePersonBirthPublicEntitiesSign = privatePersonBirthPublicEntitiesSign;
		return this;
	}

	public String getPrivatePersonAddressCountryCode() {
		return privatePersonAddressCountryCode;
	}

	public FES_3484_010206_DOC setPrivatePersonAddressCountryCode(
			String privatePersonAddressCountryCode) {
		this.privatePersonAddressCountryCode = privatePersonAddressCountryCode;
		return this;
	}

	public String getPrivatePersonAddressSubjectCode() {
		return privatePersonAddressSubjectCode;
	}

	public FES_3484_010206_DOC setPrivatePersonAddressSubjectCode(
			String privatePersonAddressSubjectCode) {
		this.privatePersonAddressSubjectCode = privatePersonAddressSubjectCode;
		return this;
	}

	public String getPrivatePersonAddressArea() {
		return privatePersonAddressArea;
	}

	public FES_3484_010206_DOC setPrivatePersonAddressArea(String privatePersonAddressArea) {
		this.privatePersonAddressArea = privatePersonAddressArea;
		return this;
	}

	public String getPrivatePersonAddressCity() {
		return privatePersonAddressCity;
	}

	public FES_3484_010206_DOC setPrivatePersonAddressCity(String privatePersonAddressCity) {
		this.privatePersonAddressCity = privatePersonAddressCity;
		return this;
	}

	public String getPrivatePersonAddressStreet() {
		return privatePersonAddressStreet;
	}

	public FES_3484_010206_DOC setPrivatePersonAddressStreet(String privatePersonAddressStreet) {
		this.privatePersonAddressStreet = privatePersonAddressStreet;
		return this;
	}

	public String getPrivatePersonAddressHouse() {
		return privatePersonAddressHouse;
	}

	public FES_3484_010206_DOC setPrivatePersonAddressHouse(String privatePersonAddressHouse) {
		this.privatePersonAddressHouse = privatePersonAddressHouse;
		return this;
	}

	public String getPrivatePersonAddressCorp() {
		return privatePersonAddressCorp;
	}

	public FES_3484_010206_DOC setPrivatePersonAddressCorp(String privatePersonAddressCorp) {
		this.privatePersonAddressCorp = privatePersonAddressCorp;
		return this;
	}

	public String getPrivatePersonAddressApartment() {
		return privatePersonAddressApartment;
	}

	public FES_3484_010206_DOC setPrivatePersonAddressApartment(
			String privatePersonAddressApartment) {
		this.privatePersonAddressApartment = privatePersonAddressApartment;
		return this;
	}

	public String getBIK() {
		return BIK;
	}

	public FES_3484_010206_DOC setBIK(String bIK) {
		BIK = bIK;
		return this;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public FES_3484_010206_DOC setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
		return this;
	}

	public String getBankName() {
		return bankName;
	}

	public FES_3484_010206_DOC setBankName(String bankName) {
		this.bankName = bankName;
		return this;
	}
}