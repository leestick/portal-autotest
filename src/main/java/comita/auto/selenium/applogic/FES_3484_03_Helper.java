package comita.auto.selenium.applogic;

import comita.auto.selenium.model.FES_3484_03_DOC;

public class FES_3484_03_Helper extends DriverBasedHelper {
	
	public FES_3484_03_Helper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	public void inputAllValues3484_03(FES_3484_03_DOC fes) throws InterruptedException {		
		pages.fes_nfo_Page.ensurePageLoaded()
			.selectTypeInfo(fes.getTypeInfo())
			.setDateOfFES(fes.getDateOfFES())
			.setAuthorizedPosition(fes.getAuthorizedPosition())
			.setAuthorizedSurname(fes.getAuthorizedSurname())
			.setAuthorizedName(fes.getAuthorizedName())
			.setAuthorizedPatronymic(fes.getAuthorizedPatronymic())
			.setAuthorizedCodeAndPhone(fes.getAuthorizedCodeAndPhone())
			.setAuthorizedEmail(fes.getAuthorizedEmail())
			.selectInfoTabOfNFO()
			.selectNfoTypeCode(fes.getNfoTypeCode())
			.selectNfoType(fes.getNfoType())
			.setNfoResidentSign(fes.getNfoResidentSign())
			.setNfoName(fes.getNfoName())
			.setNfoTransmittingInfoName(fes.getNfoTransmittingInfoName())
			.setNfoINN(fes.getNfoINN(), fes.getNfoINNIP())
			.setNfoKPP(fes.getNfoKPP())
			.setNfoOKPO(fes.getNfoOKPO())
			.setNfoOKVED(fes.getNfoOKVED())
			.setNfoOGRN(fes.getNfoOGRN(), fes.getNfoOGRNIP())
			.setNfoPersonSurname(fes.getNfoPersonSurname())
			.setNfoPersonName(fes.getNfoPersonName())
			.setNfoPersonPatronymic(fes.getNfoPersonPatronymic())
			.selectNfoIdentityDocType(fes.getNfoIdentityDocType())
			.setNfoIdentityDocSerie(fes.getNfoIdentityDocSerie())
			.setNfoIdentityDocNumber(fes.getNfoIdentityDocNumber())
			.setNfoIdentityDocIssueDate(fes.getNfoIdentityDocIssueDate())
			.setNfoIdentityDocIssuer(fes.getNfoIdentityDocIssuer())
			.setNfoIdentityDocCodeDivision(fes.getNfoIdentityDocCodeDivision())
			.setNfoIdentityDocBirthDate(fes.getNfoIdentityDocBirthDate())
			.selectNfoBirthCountryCode(fes.getNfoBirthCountryCode())
			.selectNfoBirthSubjectCode(fes.getNfoBirthSubjectCode())
			.setNfoBirthArea(fes.getNfoBirthArea())
			.setNfoBirthCity(fes.getNfoBirthCity())
			.selectNfoAddressCountryCode(fes.getNfoAddressCountryCode())
			.selectNfoAddressSubjectCode(fes.getNfoAddressSubjectCode())
			.setNfoAddressArea(fes.getNfoAddressArea())
			.setNfoAddressCity(fes.getNfoAddressCity())
			.setNfoAddressStreet(fes.getNfoAddressStreet())
			.setNfoAddressHouse(fes.getNfoAddressHouse())
			.setNfoAddressCorp(fes.getNfoAddressCorp())
			.setNfoAddressApartment(fes.getNfoAddressApartment());
		
		pages.fes_3484_03_Page.ensurePageLoaded()
			.selectInfoAboutMeasuresTab()
			.addRecord()
			.setId(fes.getId())
			.selectRecordTypeFES(fes.getRecordTypeFES())
			.selectBaseApplyMeasuresCode(fes.getBaseApplyMeasuresCode())
			.setOrganizationCode(fes.getOrganizationCode())
			.setDateOfBlocking(fes.getDateOfBlocking())
			.setTimeOfBlocking(fes.getTimeOfBlocking())
			.selectTypeOfFundsOrPropertyToBlock(fes.getTypeOfFundsOrPropertyToBlock())
			.selectCurrencyCode(fes.getCurrencyCode())
			.setSum(fes.getSum())
			.setSumRUR(fes.getSumRUR())
			.selectInfoAboutSecurities(fes.getInfoAboutSecurities())
			.setNominalValueOfSecurities(fes.getNominalValueOfSecurities())
			.setMarketValueOfSecurities(fes.getMarketValueOfSecurities())
			.setPurposePay(fes.getPurposePay())
			.clickOK();			
	}
	
	public void inputRequiredValues3484_03(FES_3484_03_DOC fes) throws InterruptedException {
		pages.fes_nfo_Page.ensurePageLoaded()
			.selectTypeInfo(fes.getTypeInfo())
			.setDateOfFES(fes.getDateOfFES())
			.selectInfoTabOfNFO()
			.setNfoResidentSign(fes.getNfoResidentSign())
			.setNfoOKPO(fes.getNfoOKPO())
			.setNfoOKVED(fes.getNfoOKVED())
			.setNfoOGRN(fes.getNfoOGRN(), fes.getNfoOGRNIP())
			.selectNfoAddressCountryCode(fes.getNfoAddressCountryCode());
		
		pages.fes_3484_03_Page.ensurePageLoaded()
			.selectInfoAboutMeasuresTab()
			.addRecord()
			.selectRecordTypeFES(fes.getRecordTypeFES())
			.selectBaseApplyMeasuresCode(fes.getBaseApplyMeasuresCode())
			.setOrganizationCode(fes.getOrganizationCode())
			.setDateOfBlocking(fes.getDateOfBlocking())
			.setTimeOfBlocking(fes.getTimeOfBlocking())
			.selectTypeOfFundsOrPropertyToBlock(fes.getTypeOfFundsOrPropertyToBlock())
			.selectCurrencyCode(fes.getCurrencyCode())
			.setSum(fes.getSum())
			.setSumRUR(fes.getSumRUR())
			.selectInfoAboutSecurities(fes.getInfoAboutSecurities())
			.setNominalValueOfSecurities(fes.getNominalValueOfSecurities())
			.setMarketValueOfSecurities(fes.getMarketValueOfSecurities())
			.clickOK();	
	}

}
