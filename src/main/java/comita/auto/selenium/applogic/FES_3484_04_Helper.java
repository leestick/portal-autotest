package comita.auto.selenium.applogic;

import comita.auto.selenium.model.FES_3484_04_DOC;

public class FES_3484_04_Helper extends DriverBasedHelper {
	
	public FES_3484_04_Helper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	public void inputAllValues3484_04(FES_3484_04_DOC fes) throws InterruptedException {		
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
		pages.fes_3484_04_Page.ensurePageLoaded()
			.selectInfoAboutResultsOfInspectionTab()
			.addRecord()
			.setID(fes.getId())
			.selectRecordTypeFES(fes.getRecordTypeFES())
			.setDatePrevInspection(fes.getDatePrevInspection())
			.setDateCurrInspection(fes.getDateCurrInspection())
			.setNumberOfCustomersOrg(fes.getNumberOfCustomersOrg())
			.setNumberOfCustomersInd(fes.getNumberOfCustomersInd())
			.setTotalNumberOfCustomers(fes.getTotalNumberOfCustomers())
			.setNumberOfBlockedOrg(fes.getNumberOfBlockedOrg())
			.setNumberOfBlockedInd(fes.getNumberOfBlockedInd())
			.setNumberOfFESForBlocked(fes.getNumberOfFESForBlocked())
			.setNumberOfNonBlockedOrg(fes.getNumberOfNonBlockedOrg())
			.setNumberOfNonBlockedInd(fes.getNumberOfNonBlockedInd())
			.setTotalNumberOfNonBlocked(fes.getTotalNumberOfNonBlocked())
			.setNumberOfFESForNonBlocked(fes.getNumberOfFESForNonBlocked())
			.setAdditionalInfo(fes.getAdditionalInfo())
			.clickOK();
	}

	public void inputRequiredValues3484_04(FES_3484_04_DOC fes) {
		pages.fes_nfo_Page.ensurePageLoaded()
			.selectTypeInfo(fes.getTypeInfo())
			.setDateOfFES(fes.getDateOfFES())
			.setAuthorizedPosition(fes.getAuthorizedPosition())
			.setAuthorizedSurname(fes.getAuthorizedSurname())
			.setAuthorizedName(fes.getAuthorizedName())
			.setAuthorizedCodeAndPhone(fes.getAuthorizedCodeAndPhone())
			.selectInfoTabOfNFO()
			.selectNfoTypeCode(fes.getNfoTypeCode())
			.selectNfoType(fes.getNfoType())
			.setNfoResidentSign(fes.getNfoResidentSign())
			.setNfoName(fes.getNfoName())
			.setNfoINN(fes.getNfoINN(), fes.getNfoINNIP())
			.setNfoKPP(fes.getNfoKPP())
			.setNfoOKPO(fes.getNfoOKPO())
			.setNfoOKVED(fes.getNfoOKVED())
			.setNfoOGRN(fes.getNfoOGRN(), fes.getNfoOGRNIP())
			.setNfoPersonSurname(fes.getNfoPersonSurname())
			.setNfoPersonName(fes.getNfoPersonName())
			.selectNfoIdentityDocType(fes.getNfoIdentityDocType())
			.setNfoIdentityDocSerie(fes.getNfoIdentityDocSerie())
			.setNfoIdentityDocNumber(fes.getNfoIdentityDocNumber())
			.setNfoIdentityDocIssueDate(fes.getNfoIdentityDocIssueDate())
			.setNfoIdentityDocIssuer(fes.getNfoIdentityDocIssuer())
			.setNfoIdentityDocCodeDivision(fes.getNfoIdentityDocCodeDivision())
			.setNfoIdentityDocBirthDate(fes.getNfoIdentityDocBirthDate())
			.selectNfoBirthCountryCode(fes.getNfoBirthCountryCode())
			.selectNfoBirthSubjectCode(fes.getNfoBirthSubjectCode())
			.setNfoBirthCity(fes.getNfoBirthCity())
			.selectNfoAddressCountryCode(fes.getNfoAddressCountryCode())
			.selectNfoAddressSubjectCode(fes.getNfoAddressSubjectCode())
			.setNfoAddressCity(fes.getNfoAddressCity());
		
		pages.fes_3484_04_Page.ensurePageLoaded()
			.selectInfoAboutResultsOfInspectionTab()
			.addRecord()
			.setID(fes.getId())
			.selectRecordTypeFES(fes.getRecordTypeFES())
			.setDatePrevInspection(fes.getDatePrevInspection())
			.setDateCurrInspection(fes.getDateCurrInspection())
			.setNumberOfCustomersOrg(fes.getNumberOfCustomersOrg())
			.setNumberOfCustomersInd(fes.getNumberOfCustomersInd())
			.setTotalNumberOfCustomers(fes.getTotalNumberOfCustomers())
			.setNumberOfBlockedOrg(fes.getNumberOfBlockedOrg())
			.setNumberOfBlockedInd(fes.getNumberOfBlockedInd())
			.setNumberOfFESForBlocked(fes.getNumberOfFESForBlocked())
			.setNumberOfNonBlockedOrg(fes.getNumberOfNonBlockedOrg())
			.setNumberOfNonBlockedInd(fes.getNumberOfNonBlockedInd())
			.setTotalNumberOfNonBlocked(fes.getTotalNumberOfNonBlocked())
			.setNumberOfFESForNonBlocked(fes.getNumberOfFESForNonBlocked())
			.clickOK();		
	}

}
