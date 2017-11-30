package comita.auto.selenium.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import comita.auto.selenium.util.Dates;

public class FES_1FM_POSTRF_DOC extends FES_DOC {
		
		private String id;
		private String recordTypeFES;
		private String dateOfChange;
		private String signFinancingOfTerrorizm;
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
		private String codeTypeMoney;
		private String charOperation;
		private String additionalInfo;
		private String codeTypeDoc;
		private String dateDoc;
		private String numberDoc;
		private String summaryDoc;
		private String roleOfParticipantCode;
		private String roleOfParticipant2Code;
		private String typeOfParticipantCode;
		private String signOfCommunionToTerrorism;
		private String baseApplyingMeasuresCode;
		private String codeULFL;
		private String typeOfParticipant;
		private String residentSign;
		private String clientSign;
		private String nameLP;
		private String typeCodeLP;
		private String innLP;
		private String kppLP;
		private String okpoLP;
		private String okvedLP;
		private String industryCodeLP;
		private String ogrnLP;
		private String regOrgNameLP;
		private String regDateLP;
		private String urAddressCountryCodeLP;
		private String urAddressSubjectCodeLP;
		private String urAddressAreaLP;
		private String urAddressCityLP;
		private String urAddressStreetLP;
		private String urAddressHouseLP;
		private String urAddressCorpLP;
		private String urAddressApartmentLP;
		private String regAddressCountryCodeLP;
		private String regAddressSubjectCodeLP;
		private String regAddressAreaLP;
		private String regAddressCityLP;
		private String regAddressStreetLP;
		private String regAddressHouseLP;
		private String regAddressCorpLP;
		private String regAddressApartmentLP;
		private String regAddressIPLP;
		private String codePP;
		private String surnamePP;
		private String namePP;
		private String patronymicPP;
		private String innPP;
		private String industryCodePP;
		private String identityDocTypePP;
		private String identityDocSeriePP;
		private String identityDocNumberPP;
		private String identityDocIssueDatePP;
		private String identityDocIssuerPP;
		private String identityDocCodeSubDivisionPP;
		private String birthDatePP;
		private String birthPlaceCountryCodePP;
		private String birthPlaceSubjectCodePP;
		private String birthPlaceAreaPP;
		private String birthPlaceCityPP;
		private String birthPlaceCitizenshipCodePP;
		private String publicFacesSignPP;
		private String regAddressCountryCodePP;
		private String regAddressSubjectCodePP;
		private String regAddressAreaPP;
		private String regAddressCityPP;
		private String regAddressStreetPP;
		private String regAddressHousePP;
		private String regAddressCorpPP;
		private String regAddressApartmentPP;
		private String regAddressIPPP;
		private String actualAddressCountryCodePP;
		private String actualAddressSubjectCodePP;
		private String actualAddressAreaPP;
		private String actualAddressCityPP;
		private String actualAddressStreetPP;
		private String actualAddressHousePP;
		private String actualAddressCorpPP;
		private String actualAddressApartmentPP;
		private String actualAddressIPPP;
		private String okvedPP;
		private String ogrnPP;
		private String regOrgNamePP;
		private String regDatePP;
		private String bik;
		private String bankAccountNumber;
		private String bankName;
		
		private Dates dates = new Dates();	
		public String dateAndTime = dates.getDate();
		public String date = dateAndTime.substring(0,10);
		
		
		
		public FES_1FM_POSTRF_DOC writeData() {
	        Properties property = new Properties();
	 
	        try {
	        	String path = "src/test/resources/test_data/FES_1FM_POSTRF.txt";
	        	property.load(new InputStreamReader(new FileInputStream(path), "UTF-8"));
				writeData(path);
	        	this.id = property.getProperty("{id}");
	        	this.recordTypeFES = property.getProperty("{recordTypeFES}");
	        	this.dateOfChange = property.getProperty("{dateOfChange}");
	        	this.signFinancingOfTerrorizm = property.getProperty("{signFinancingOfTerrorizm}");
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
	        	this.codeTypeMoney = property.getProperty("{codeTypeMoney}");
	        	this.charOperation = property.getProperty("{charOperation}");
	        	this.additionalInfo = property.getProperty("{additionalInfo}");
	        	this.codeTypeDoc = property.getProperty("{codeTypeDoc}");
	        	this.dateDoc = property.getProperty("{dateDoc}");
	        	this.numberDoc = property.getProperty("{numberDoc}");
	        	this.summaryDoc = property.getProperty("{summaryDoc}");
	        	this.roleOfParticipantCode = property.getProperty("{roleOfParticipantCode}");
	        	this.roleOfParticipant2Code = property.getProperty("{roleOfParticipant2Code}");
	        	this.typeOfParticipantCode = property.getProperty("{typeOfParticipantCode}");
	        	this.signOfCommunionToTerrorism = property.getProperty("{signOfCommunionToTerrorism}");
	        	this.baseApplyingMeasuresCode = property.getProperty("{baseApplyingMeasuresCode}");
	        	this.codeULFL = property.getProperty("{codeULFL}");
	        	this.typeOfParticipant = property.getProperty("{typeOfParticipant}");
	        	this.residentSign = property.getProperty("{residentSign}");
	        	this.clientSign = property.getProperty("{clientSign}");
	        	this.nameLP = property.getProperty("{nameLP}");
	        	this.typeCodeLP = property.getProperty("{typeCodeLP}");
	        	this.innLP = property.getProperty("{innLP}");
	        	this.kppLP = property.getProperty("{kppLP}");
	        	this.okpoLP = property.getProperty("{okpoLP}");
	        	this.okvedLP = property.getProperty("{okvedLP}");
	        	this.industryCodeLP = property.getProperty("{industryCodeLP}"); 
	        	this.ogrnLP = property.getProperty("{ogrnLP}");
	        	this.regOrgNameLP = property.getProperty("{regOrgNameLP}");
	        	this.regDateLP = property.getProperty("{regDateLP}");
	        	this.urAddressCountryCodeLP = property.getProperty("{urAddressCountryCodeLP}");
	        	this.urAddressSubjectCodeLP = property.getProperty("{urAddressSubjectCodeLP}");
	        	this.urAddressAreaLP = property.getProperty("{urAddressAreaLP}");
	        	this.urAddressCityLP = property.getProperty("{urAddressCityLP}");
	        	this.urAddressStreetLP = property.getProperty("{urAddressStreetLP}");
	        	this.urAddressHouseLP = property.getProperty("{urAddressHouseLP}");
	        	this.urAddressCorpLP = property.getProperty("{urAddressCorpLP}");
	        	this.urAddressApartmentLP = property.getProperty("{urAddressApartmentLP}");
	        	this.regAddressCountryCodeLP = property.getProperty("{regAddressCountryCodeLP}");
	        	this.regAddressSubjectCodeLP = property.getProperty("{regAddressSubjectCodeLP}");
	        	this.regAddressAreaLP = property.getProperty("{regAddressAreaLP}");
	        	this.regAddressCityLP = property.getProperty("{regAddressCityLP}");
	        	this.regAddressStreetLP = property.getProperty("{regAddressStreetLP}");
	        	this.regAddressHouseLP = property.getProperty("{regAddressHouseLP}");
	        	this.regAddressCorpLP = property.getProperty("{regAddressCorpLP}");
	        	this.regAddressApartmentLP = property.getProperty("{regAddressApartmentLP}");
	        	this.regAddressIPLP = property.getProperty("{regAddressIPLP}");
	        	this.codePP = property.getProperty("{codePP}");
	        	this.surnamePP = property.getProperty("{surnamePP}");
	        	this.namePP = property.getProperty("{namePP}");
	        	this.patronymicPP = property.getProperty("{patronymicPP}");
	        	this.innPP = property.getProperty("{innPP}");
	        	this.industryCodePP = property.getProperty("{industryCodePP}");
	        	this.identityDocTypePP = property.getProperty("{identityDocTypePP}");
	        	this.identityDocSeriePP = property.getProperty("{identityDocSeriePP}");
	        	this.identityDocNumberPP = property.getProperty("{identityDocNumberPP}");
	        	this.identityDocIssueDatePP = property.getProperty("{identityDocIssueDatePP}");
	        	this.identityDocIssuerPP = property.getProperty("{identityDocIssuerPP}");
	        	this.identityDocCodeSubDivisionPP = property.getProperty("{identityDocCodeSubDivisionPP}");
	        	this.birthDatePP = property.getProperty("{birthDatePP}");
	        	this.birthPlaceCountryCodePP = property.getProperty("{birthPlaceCountryCodePP}");
	        	this.birthPlaceSubjectCodePP = property.getProperty("{birthPlaceSubjectCodePP}");
	        	this.birthPlaceAreaPP = property.getProperty("{birthPlaceAreaPP}");
	        	this.birthPlaceCityPP = property.getProperty("{birthPlaceCityPP}");
	        	this.birthPlaceCitizenshipCodePP = property.getProperty("{birthPlaceCitizenshipCodePP}");
	        	this.publicFacesSignPP = property.getProperty("{publicFacesSignPP}");
	        	this.regAddressCountryCodePP = property.getProperty("{regAddressCountryCodePP}");
	        	this.regAddressSubjectCodePP = property.getProperty("{regAddressSubjectCodePP}");
	        	this.regAddressAreaPP = property.getProperty("{regAddressAreaPP}");
	        	this.regAddressCityPP = property.getProperty("{regAddressCityPP}");
	        	this.regAddressStreetPP = property.getProperty("{regAddressStreetPP}");
	        	this.regAddressHousePP = property.getProperty("{regAddressHousePP}");
	        	this.regAddressCorpPP = property.getProperty("{regAddressCorpPP}");
	        	this.regAddressApartmentPP = property.getProperty("{regAddressApartmentPP}");
	        	this.regAddressIPPP = property.getProperty("{regAddressIPPP}");
	        	this.actualAddressCountryCodePP = property.getProperty("{actualAddressCountryCodePP}");
	        	this.actualAddressSubjectCodePP = property.getProperty("{actualAddressSubjectCodePP}");
	        	this.actualAddressAreaPP = property.getProperty("{actualAddressAreaPP}");
	        	this.actualAddressCityPP = property.getProperty("{actualAddressCityPP}");
	        	this.actualAddressStreetPP = property.getProperty("{actualAddressStreetPP}");
	        	this.actualAddressHousePP = property.getProperty("{actualAddressHousePP}");
	        	this.actualAddressCorpPP = property.getProperty("{actualAddressCorpPP}");
	        	this.actualAddressApartmentPP = property.getProperty("{actualAddressApartmentPP}");
	        	this.actualAddressIPPP = property.getProperty("{actualAddressIPPP}");
	        	this.okvedPP = property.getProperty("{okvedPP}");
	        	this.ogrnPP = property.getProperty("{ogrnPP}");
	        	this.regOrgNamePP = property.getProperty("{regOrgNamePP}");
	        	this.regDatePP = property.getProperty("{regDatePP}");
	        	this.bik = property.getProperty("{bik}");
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

		public FES_1FM_POSTRF_DOC setId(String id) {
			this.id = id;
			return this;
		}

		public String getRecordTypeFES() {
			return recordTypeFES;
		}

		public FES_1FM_POSTRF_DOC setRecordTypeFES(String recordTypeFES) {
			this.recordTypeFES = recordTypeFES;
			return this;
		}

		public String getDateOfChange() {
			return dateOfChange;
		}

		public FES_1FM_POSTRF_DOC setDateOfChange(String dateOfChange) {
			this.dateOfChange = dateOfChange;
			return this;
		}

		public String getSignFinancingOfTerrorizm() {
			return signFinancingOfTerrorizm;
		}

		public FES_1FM_POSTRF_DOC setSignFinancingOfTerrorizm(String signFinancingOfTerrorizm) {
			this.signFinancingOfTerrorizm = signFinancingOfTerrorizm;
			return this;
		}

		public String getDateOperation() {
			return dateOperation;
		}

		public FES_1FM_POSTRF_DOC setDateOperation(String dateOperation) {
			this.dateOperation = dateOperation;
			return this;
		}

		public String getDateDetectOperation() {
			return dateDetectOperation;
		}

		public FES_1FM_POSTRF_DOC setDateDetectOperation(String dateDetectOperation) {
			this.dateDetectOperation = dateDetectOperation;
			return this;
		}

		public String getOperationTypeCode() {
			return operationTypeCode;
		}

		public FES_1FM_POSTRF_DOC setOperationTypeCode(String operationTypeCode) {
			this.operationTypeCode = operationTypeCode;
			return this;
		}

		public String getOperationTypeAddCode() {
			return operationTypeAddCode;
		}

		public FES_1FM_POSTRF_DOC setOperationTypeAddCode(String operationTypeAddCode) {
			this.operationTypeAddCode = operationTypeAddCode;
			return this;
		}

		public String getCodeOfUnusualOperation() {
			return codeOfUnusualOperation;
		}

		public FES_1FM_POSTRF_DOC setCodeOfUnusualOperation(String codeOfUnusualOperation) {
			this.codeOfUnusualOperation = codeOfUnusualOperation;
			return this;
		}

		public String getCurrencyCode() {
			return currencyCode;
		}

		public FES_1FM_POSTRF_DOC setCurrencyCode(String currencyCode) {
			this.currencyCode = currencyCode;
			return this;
		}

		public String getSum() {
			return sum;
		}

		public FES_1FM_POSTRF_DOC setSum(String sum) {
			this.sum = sum;
			return this;
		}

		public String getSumRUR() {
			return sumRUR;
		}

		public FES_1FM_POSTRF_DOC setSumRUR(String sumRUR) {
			this.sumRUR = sumRUR;
			return this;
		}

		public String getCodePreciousMetals() {
			return codePreciousMetals;
		}

		public FES_1FM_POSTRF_DOC setCodePreciousMetals(String codePreciousMetals) {
			this.codePreciousMetals = codePreciousMetals;
			return this;
		}

		public String getPurposePay() {
			return purposePay;
		}

		public FES_1FM_POSTRF_DOC setPurposePay(String purposePay) {
			this.purposePay = purposePay;
			return this;
		}

		public String getSignOperationCode() {
			return signOperationCode;
		}

		public FES_1FM_POSTRF_DOC setSignOperationCode(String signOperationCode) {
			this.signOperationCode = signOperationCode;
			return this;
		}

		public String getCodeTypeMoney() {
			return codeTypeMoney;
		}

		public FES_1FM_POSTRF_DOC setCodeTypeMoney(String codeTypeMoney) {
			this.codeTypeMoney = codeTypeMoney;
			return this;
		}

		public String getCharOperation() {
			return charOperation;
		}

		public FES_1FM_POSTRF_DOC setCharOperation(String charOperation) {
			this.charOperation = charOperation;
			return this;
		}

		public String getAdditionalInfo() {
			return additionalInfo;
		}

		public FES_1FM_POSTRF_DOC setAdditionalInfo(String additionalInfo) {
			this.additionalInfo = additionalInfo;
			return this;
		}

		public String getCodeTypeDoc() {
			return codeTypeDoc;
		}

		public FES_1FM_POSTRF_DOC setCodeTypeDoc(String codeTypeDoc) {
			this.codeTypeDoc = codeTypeDoc;
			return this;
		}

		public String getDateDoc() {
			return dateDoc;
		}

		public FES_1FM_POSTRF_DOC setDateDoc(String dateDoc) {
			this.dateDoc = dateDoc;
			return this;
		}

		public String getNumberDoc() {
			return numberDoc;
		}

		public FES_1FM_POSTRF_DOC setNumberDoc(String numberDoc) {
			this.numberDoc = numberDoc;
			return this;
		}

		public String getSummaryDoc() {
			return summaryDoc;
		}

		public FES_1FM_POSTRF_DOC setSummaryDoc(String summaryDoc) {
			this.summaryDoc = summaryDoc;
			return this;
		}

		public String getRoleOfParticipantCode() {
			return roleOfParticipantCode;
		}

		public FES_1FM_POSTRF_DOC setRoleOfParticipantCode(String roleOfParticipantCode) {
			this.roleOfParticipantCode = roleOfParticipantCode;
			return this;
		}
		
		public String getRoleOfParticipant2Code() {
			return roleOfParticipant2Code;
		}

		public FES_1FM_POSTRF_DOC setRoleOfParticipant2Code(String roleOfParticipant2Code) {
			this.roleOfParticipant2Code = roleOfParticipant2Code;
			return this;
		}

		public String getTypeOfParticipantCode() {
			return typeOfParticipantCode;
		}

		public FES_1FM_POSTRF_DOC setTypeOfParticipantCode(String typeOfParticipantCode) {
			this.typeOfParticipantCode = typeOfParticipantCode;
			return this;
		}

		public String getSignOfCommunionToTerrorism() {
			return signOfCommunionToTerrorism;
		}

		public FES_1FM_POSTRF_DOC setSignOfCommunionToTerrorism(String signOfCommunionToTerrorism) {
			this.signOfCommunionToTerrorism = signOfCommunionToTerrorism;
			return this;
		}

		public String getBaseApplyingMeasuresCode() {
			return baseApplyingMeasuresCode;
		}

		public FES_1FM_POSTRF_DOC setBaseApplyingMeasuresCode(String baseApplyingMeasuresCode) {
			this.baseApplyingMeasuresCode = baseApplyingMeasuresCode;
			return this;
		}

		public String getCodeULFL() {
			return codeULFL;
		}

		public FES_1FM_POSTRF_DOC setCodeULFL(String codeULFL) {
			this.codeULFL = codeULFL;
			return this;
		}

		public String getTypeOfParticipant() {
			return typeOfParticipant;
		}

		public FES_1FM_POSTRF_DOC setTypeOfParticipant(String typeOfParticipant) {
			this.typeOfParticipant = typeOfParticipant;
			return this;
		}

		public String getResidentSign() {
			return residentSign;
		}

		public FES_1FM_POSTRF_DOC setResidentSign(String residentSign) {
			this.residentSign = residentSign;
			return this;
		}

		public String getClientSign() {
			return clientSign;
		}

		public FES_1FM_POSTRF_DOC setClientSign(String clientSign) {
			this.clientSign = clientSign;
			return this;
		}

		public String getNameLP() {
			return nameLP;
		}

		public FES_1FM_POSTRF_DOC setNameLP(String nameLP) {
			this.nameLP = nameLP;
			return this;
		}

		public String getTypeCodeLP() {
			return typeCodeLP;
		}

		public FES_1FM_POSTRF_DOC setTypeCodeLP(String typeCodeLP) {
			this.typeCodeLP = typeCodeLP;
			return this;
		}

		public String getInnLP() {
			return innLP;
		}

		public FES_1FM_POSTRF_DOC setInnLP(String innLP) {
			this.innLP = innLP;
			return this;
		}

		public String getKppLP() {
			return kppLP;
		}

		public FES_1FM_POSTRF_DOC setKppLP(String kppLP) {
			this.kppLP = kppLP;
			return this;
		}

		public String getOkpoLP() {
			return okpoLP;
		}

		public FES_1FM_POSTRF_DOC setOkpoLP(String okpoLP) {
			this.okpoLP = okpoLP;
			return this;
		}
		
		public String getIndustryCodeLP() {
			return industryCodeLP;
		}

		public FES_1FM_POSTRF_DOC setIndustryCodeLP(String industryCodeLP) {
			this.industryCodeLP = industryCodeLP;
			return this;
		}
		
		public String getOkvedLP() {
			return okvedLP;
		}

		public FES_1FM_POSTRF_DOC setOkvedLP(String okvedLP) {
			this.okvedLP = okvedLP;
			return this;
		}

		public String getOgrnLP() {
			return ogrnLP;
		}

		public FES_1FM_POSTRF_DOC setOgrnLP(String ogrnLP) {
			this.ogrnLP = ogrnLP;
			return this;
		}
		
		public String getRegOrgNameLP() {
			return regOrgNameLP;
		}

		public FES_1FM_POSTRF_DOC setRegOrgNameLP(String regOrgNameLP) {
			this.regOrgNameLP = regOrgNameLP;
			return this;
		}

		public String getRegDateLP() {
			return regDateLP;
		}

		public FES_1FM_POSTRF_DOC setRegDateLP(String regDateLP) {
			this.regDateLP = regDateLP;
			return this;
		}

		public String getUrAddressCountryCodeLP() {
			return urAddressCountryCodeLP;
		}

		public FES_1FM_POSTRF_DOC setUrAddressCountryCodeLP(String urAddressCountryCodeLP) {
			this.urAddressCountryCodeLP = urAddressCountryCodeLP;
			return this;
		}

		public String getUrAddressSubjectCodeLP() {
			return urAddressSubjectCodeLP;
		}

		public FES_1FM_POSTRF_DOC setUrAddressSubjectCodeLP(String urAddressSubjectCodeLP) {
			this.urAddressSubjectCodeLP = urAddressSubjectCodeLP;
			return this;
		}

		public String getUrAddressAreaLP() {
			return urAddressAreaLP;
		}

		public FES_1FM_POSTRF_DOC setUrAddressAreaLP(String urAddressAreaLP) {
			this.urAddressAreaLP = urAddressAreaLP;
			return this;
		}

		public String getUrAddressCityLP() {
			return urAddressCityLP;
		}

		public FES_1FM_POSTRF_DOC setUrAddressCityLP(String urAddressCityLP) {
			this.urAddressCityLP = urAddressCityLP;
			return this;
		}

		public String getUrAddressStreetLP() {
			return urAddressStreetLP;
		}

		public FES_1FM_POSTRF_DOC setUrAddressStreetLP(String urAddressStreetLP) {
			this.urAddressStreetLP = urAddressStreetLP;
			return this;
		}

		public String getUrAddressHouseLP() {
			return urAddressHouseLP;
		}

		public FES_1FM_POSTRF_DOC setUrAddressHouseLP(String urAddressHouseLP) {
			this.urAddressHouseLP = urAddressHouseLP;
			return this;
		}

		public String getUrAddressCorpLP() {
			return urAddressCorpLP;
		}

		public FES_1FM_POSTRF_DOC setUrAddressCorpLP(String urAddressCorpLP) {
			this.urAddressCorpLP = urAddressCorpLP;
			return this;
		}

		public String getUrAddressApartmentLP() {
			return urAddressApartmentLP;
		}

		public FES_1FM_POSTRF_DOC setUrAddressApartmentLP(String urAddressApartmentLP) {
			this.urAddressApartmentLP = urAddressApartmentLP;
			return this;
		}

		public String getRegAddressCountryCodeLP() {
			return regAddressCountryCodeLP;
		}

		public FES_1FM_POSTRF_DOC setRegAddressCountryCodeLP(String regAddressCountryCodeLP) {
			this.regAddressCountryCodeLP = regAddressCountryCodeLP;
			return this;
		}

		public String getRegAddressSubjectCodeLP() {
			return regAddressSubjectCodeLP;
		}

		public FES_1FM_POSTRF_DOC setRegAddressSubjectCodeLP(String regAddressSubjectCodeLP) {
			this.regAddressSubjectCodeLP = regAddressSubjectCodeLP;
			return this;
		}

		public String getRegAddressAreaLP() {
			return regAddressAreaLP;
		}

		public FES_1FM_POSTRF_DOC setRegAddressAreaLP(String regAddressAreaLP) {
			this.regAddressAreaLP = regAddressAreaLP;
			return this;
		}

		public String getRegAddressCityLP() {
			return regAddressCityLP;
		}

		public FES_1FM_POSTRF_DOC setRegAddressCityLP(String regAddressCityLP) {
			this.regAddressCityLP = regAddressCityLP;
			return this;
		}

		public String getRegAddressStreetLP() {
			return regAddressStreetLP;
		}

		public FES_1FM_POSTRF_DOC setRegAddressStreetLP(String regAddressStreetLP) {
			this.regAddressStreetLP = regAddressStreetLP;
			return this;
		}

		public String getRegAddressHouseLP() {
			return regAddressHouseLP;
		}

		public FES_1FM_POSTRF_DOC setRegAddressHouseLP(String regAddressHouseLP) {
			this.regAddressHouseLP = regAddressHouseLP;
			return this;
		}

		public String getRegAddressCorpLP() {
			return regAddressCorpLP;
		}

		public FES_1FM_POSTRF_DOC setRegAddressCorpLP(String regAddressCorpLP) {
			this.regAddressCorpLP = regAddressCorpLP;
			return this;
		}

		public String getRegAddressApartmentLP() {
			return regAddressApartmentLP;
		}

		public FES_1FM_POSTRF_DOC setRegAddressApartmentLP(String regAddressApartmentLP) {
			this.regAddressApartmentLP = regAddressApartmentLP;
			return this;
		}

		public String getRegAddressIPLP() {
			return regAddressIPLP;
		}

		public FES_1FM_POSTRF_DOC setRegAddressIPLP(String regAddressIPLP) {
			this.regAddressIPLP = regAddressIPLP;
			return this;
		}

		public String getCodePP() {
			return codePP;
		}

		public FES_1FM_POSTRF_DOC setCodePP(String codePP) {
			this.codePP = codePP;
			return this;
		}

		public String getSurnamePP() {
			return surnamePP;
		}

		public FES_1FM_POSTRF_DOC setSurnamePP(String surnamePP) {
			this.surnamePP = surnamePP;
			return this;
		}

		public String getNamePP() {
			return namePP;
		}

		public FES_1FM_POSTRF_DOC setNamePP(String namePP) {
			this.namePP = namePP;
			return this;
		}

		public String getPatronymicPP() {
			return patronymicPP;
		}

		public FES_1FM_POSTRF_DOC setPatronymicPP(String patronymicPP) {
			this.patronymicPP = patronymicPP;
			return this;
		}

		public String getInnPP() {
			return innPP;
		}

		public FES_1FM_POSTRF_DOC setInnPP(String innPP) {
			this.innPP = innPP;
			return this;
		}

		public String getIndustryCodePP() {
			return industryCodePP;
		}

		public FES_1FM_POSTRF_DOC setIndustryCodePP(String industryCodePP) {
			this.industryCodePP = industryCodePP;
			return this;
		}

		public String getIdentityDocTypePP() {
			return identityDocTypePP;
		}

		public FES_1FM_POSTRF_DOC setIdentityDocTypePP(String identityDocTypePP) {
			this.identityDocTypePP = identityDocTypePP;
			return this;
		}

		public String getIdentityDocSeriePP() {
			return identityDocSeriePP;
		}

		public FES_1FM_POSTRF_DOC setIdentityDocSeriePP(String identityDocSeriePP) {
			this.identityDocSeriePP = identityDocSeriePP;
			return this;
		}

		public String getIdentityDocNumberPP() {
			return identityDocNumberPP;
		}

		public FES_1FM_POSTRF_DOC setIdentityDocNumberPP(String identityDocNumberPP) {
			this.identityDocNumberPP = identityDocNumberPP;
			return this;
		}

		public String getIdentityDocIssueDatePP() {
			return identityDocIssueDatePP;
		}

		public FES_1FM_POSTRF_DOC setIdentityDocIssueDatePP(String identityDocIssueDatePP) {
			this.identityDocIssueDatePP = identityDocIssueDatePP;
			return this;
		}

		public String getIdentityDocIssuerPP() {
			return identityDocIssuerPP;
		}

		public FES_1FM_POSTRF_DOC setIdentityDocIssuerPP(String identityDocIssuerPP) {
			this.identityDocIssuerPP = identityDocIssuerPP;
			return this;
		}

		public String getIdentityDocCodeSubDivisionPP() {
			return identityDocCodeSubDivisionPP;
		}

		public FES_1FM_POSTRF_DOC setIdentityDocCodeSubDivisionPP(String identityDocCodeSubDivisionPP) {
			this.identityDocCodeSubDivisionPP = identityDocCodeSubDivisionPP;
			return this;
		}

		public String getBirthDatePP() {
			return birthDatePP;
		}

		public FES_1FM_POSTRF_DOC setBirthDatePP(String birthDatePP) {
			this.birthDatePP = birthDatePP;
			return this;
		}

		public String getBirthPlaceCountryCodePP() {
			return birthPlaceCountryCodePP;
		}

		public FES_1FM_POSTRF_DOC setBirthPlaceCountryCodePP(String birthPlaceCountryCodePP) {
			this.birthPlaceCountryCodePP = birthPlaceCountryCodePP;
			return this;
		}

		public String getBirthPlaceSubjectCodePP() {
			return birthPlaceSubjectCodePP;
		}

		public FES_1FM_POSTRF_DOC setBirthPlaceSubjectCodePP(String birthPlaceSubjectCodePP) {
			this.birthPlaceSubjectCodePP = birthPlaceSubjectCodePP;
			return this;
		}

		public String getBirthPlaceAreaPP() {
			return birthPlaceAreaPP;
		}

		public FES_1FM_POSTRF_DOC setBirthPlaceAreaPP(String birthPlaceAreaPP) {
			this.birthPlaceAreaPP = birthPlaceAreaPP;
			return this;
		}

		public String getBirthPlaceCityPP() {
			return birthPlaceCityPP;
		}

		public FES_1FM_POSTRF_DOC setBirthPlaceCityPP(String birthPlaceCityPP) {
			this.birthPlaceCityPP = birthPlaceCityPP;
			return this;
		}

		public String getBirthPlaceCitizenshipCodePP() {
			return birthPlaceCitizenshipCodePP;
		}

		public FES_1FM_POSTRF_DOC setBirthPlaceCitizenshipCodePP(String birthPlaceCitizenshipCodePP) {
			this.birthPlaceCitizenshipCodePP = birthPlaceCitizenshipCodePP;
			return this;
		}

		public String getPublicFacesSignPP() {
			return publicFacesSignPP;
		}

		public FES_1FM_POSTRF_DOC setPublicFacesSignPP(String publicFacesSignPP) {
			this.publicFacesSignPP = publicFacesSignPP;
			return this;
		}

		public String getRegAddressCountryCodePP() {
			return regAddressCountryCodePP;
		}

		public FES_1FM_POSTRF_DOC setRegAddressCountryCodePP(String regAddressCountryCodePP) {
			this.regAddressCountryCodePP = regAddressCountryCodePP;
			return this;
		}

		public String getRegAddressSubjectCodePP() {
			return regAddressSubjectCodePP;
		}

		public FES_1FM_POSTRF_DOC setRegAddressSubjectCodePP(String regAddressSubjectCodePP) {
			this.regAddressSubjectCodePP = regAddressSubjectCodePP;
			return this;
		}

		public String getRegAddressAreaPP() {
			return regAddressAreaPP;
		}

		public FES_1FM_POSTRF_DOC setRegAddressAreaPP(String regAddressAreaPP) {
			this.regAddressAreaPP = regAddressAreaPP;
			return this;
		}

		public String getRegAddressCityPP() {
			return regAddressCityPP;
		}

		public FES_1FM_POSTRF_DOC setRegAddressCityPP(String regAddressCityPP) {
			this.regAddressCityPP = regAddressCityPP;
			return this;
		}

		public String getRegAddressStreetPP() {
			return regAddressStreetPP;
		}

		public FES_1FM_POSTRF_DOC setRegAddressStreetPP(String regAddressStreetPP) {
			this.regAddressStreetPP = regAddressStreetPP;
			return this;
		}

		public String getRegAddressHousePP() {
			return regAddressHousePP;
		}

		public FES_1FM_POSTRF_DOC setRegAddressHousePP(String regAddressHousePP) {
			this.regAddressHousePP = regAddressHousePP;
			return this;
		}

		public String getRegAddressCorpPP() {
			return regAddressCorpPP;
		}

		public FES_1FM_POSTRF_DOC setRegAddressCorpPP(String regAddressCorpPP) {
			this.regAddressCorpPP = regAddressCorpPP;
			return this;
		}

		public String getRegAddressApartmentPP() {
			return regAddressApartmentPP;
		}

		public FES_1FM_POSTRF_DOC setRegAddressApartmentPP(String regAddressApartmentPP) {
			this.regAddressApartmentPP = regAddressApartmentPP;
			return this;
		}

		public String getRegAddressIPPP() {
			return regAddressIPPP;
		}

		public FES_1FM_POSTRF_DOC setRegAddressIPPP(String regAddressIPPP) {
			this.regAddressIPPP = regAddressIPPP;
			return this;
		}

		public String getActualAddressCountryCodePP() {
			return actualAddressCountryCodePP;
		}

		public FES_1FM_POSTRF_DOC setActualAddressCountryCodePP(String actualAddressCountryCodePP) {
			this.actualAddressCountryCodePP = actualAddressCountryCodePP;
			return this;
		}

		public String getActualAddressSubjectCodePP() {
			return actualAddressSubjectCodePP;
		}

		public FES_1FM_POSTRF_DOC setActualAddressSubjectCodePP(String actualAddressSubjectCodePP) {
			this.actualAddressSubjectCodePP = actualAddressSubjectCodePP;
			return this;
		}

		public String getActualAddressAreaPP() {
			return actualAddressAreaPP;
		}

		public FES_1FM_POSTRF_DOC setActualAddressAreaPP(String actualAddressAreaPP) {
			this.actualAddressAreaPP = actualAddressAreaPP;
			return this;
		}

		public String getActualAddressCityPP() {
			return actualAddressCityPP;
		}

		public FES_1FM_POSTRF_DOC setActualAddressCityPP(String actualAddressCityPP) {
			this.actualAddressCityPP = actualAddressCityPP;
			return this;
		}

		public String getActualAddressStreetPP() {
			return actualAddressStreetPP;
		}

		public FES_1FM_POSTRF_DOC setActualAddressStreetPP(String actualAddressStreetPP) {
			this.actualAddressStreetPP = actualAddressStreetPP;
			return this;
		}

		public String getActualAddressHousePP() {
			return actualAddressHousePP;
		}

		public FES_1FM_POSTRF_DOC setActualAddressHousePP(String actualAddressHousePP) {
			this.actualAddressHousePP = actualAddressHousePP;
			return this;
		}

		public String getActualAddressCorpPP() {
			return actualAddressCorpPP;
		}

		public FES_1FM_POSTRF_DOC setActualAddressCorpPP(String actualAddressCorpPP) {
			this.actualAddressCorpPP = actualAddressCorpPP;
			return this;
		}

		public String getActualAddressApartmentPP() {
			return actualAddressApartmentPP;
		}

		public FES_1FM_POSTRF_DOC setActualAddressApartmentPP(String actualAddressApartmentPP) {
			this.actualAddressApartmentPP = actualAddressApartmentPP;
			return this;
		}

		public String getActualAddressIPPP() {
			return actualAddressIPPP;
		}

		public FES_1FM_POSTRF_DOC setActualAddressIPPP(String actualAddressIPPP) {
			this.actualAddressIPPP = actualAddressIPPP;
			return this;
		}

		public String getOkvedPP() {
			return okvedPP;
		}

		public FES_1FM_POSTRF_DOC setOkvedPP(String okvedPP) {
			this.okvedPP = okvedPP;
			return this;
		}

		public String getOgrnPP() {
			return ogrnPP;
		}

		public FES_1FM_POSTRF_DOC setOgrnPP(String ogrnPP) {
			this.ogrnPP = ogrnPP;
			return this;
		}

		public String getRegOrgNamePP() {
			return regOrgNamePP;
		}

		public FES_1FM_POSTRF_DOC setRegOrgNamePP(String regOrgNamePP) {
			this.regOrgNamePP = regOrgNamePP;
			return this;
		}

		public String getRegDatePP() {
			return regDatePP;
		}

		public FES_1FM_POSTRF_DOC setRegDatePP(String regDatePP) {
			this.regDatePP = regDatePP;
			return this;
		}

		public String getBik() {
			return bik;
		}

		public FES_1FM_POSTRF_DOC setBik(String bik) {
			this.bik = bik;
			return this;
		}

		public String getBankAccountNumber() {
			return bankAccountNumber;
		}

		public FES_1FM_POSTRF_DOC setBankAccountNumber(String bankAccountNumber) {
			this.bankAccountNumber = bankAccountNumber;
			return this;
		}

		public String getBankName() {
			return bankName;
		}

		public FES_1FM_POSTRF_DOC setBankName(String bankName) {
			this.bankName = bankName;
			return this;
		}
	
}
