package comita.auto.selenium.applogic;

import comita.auto.selenium.model.ES_443_2_DOC;

public class ES_443_2_Helper extends DriverBasedHelper {
	
	public ES_443_2_Helper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}

	public void inputAllValues443_2(ES_443_2_DOC es) {
		pages.es_Page.ensurePageLoaded()
			.setSenderNfoINN(es.getSenderNfoINN())
			.setSenderNfoKPP(es.getSenderNfoKPP())
			.setAuthorizedPersonPosition(es.getAuthorizedPersonPosition())
			.setAuthorizedPersonSurname(es.getAuthorizedPersonSurname())
			.setAuthorizedPersonName(es.getAuthorizedPersonName())
			.setAuthorizedPersonPatronymic(es.getAuthorizedPersonPatronymic())
			.setAuthorizedPersonPhone(es.getAuthorizedPersonPhone())
			.selectOpenedAccoutNfoType(es.getOpenedAccountNfoType())
			.setOpenedAccountLegalPersonNfoName(es.getOpenedAccountLegalPersonNfoName())
			.setOpenedAccountNfoINN(es.getOpenedAccountNfoINN(), es.getOpenedAccountNfoINNIP())
			.setOpenedAccountNfoKPP(es.getOpenedAccountNfoKPP())
			.setOpenedAccountNfoOGRN(es.getOpenedAccountNfoOGRN(), es.getOpenedAccountNfoOGRNIP())
			.setOpenedAccountPrivatePersonSurname(es.getOpenedAccountPrivatePersonSurname())
			.setOpenedAccountPrivatePersonName(es.getOpenedAccountPrivatePersonName())
			.setOpenedAccountPrivatePersonPatronymic(es.getOpenedAccountPrivatePersonPatronymic());
		pages.es_443_2_Page.ensurePageLoaded()
			.selectInfoAboutCompanyTab()
			.addCompany()
			.setCompanyName(es.getCompanyName())
			.setCompanyINN(es.getCompanyINN())
			.setCompanyKPP(es.getCompanyKPP())
			.setCompanyOGRN(es.getCompanyOGRN())
			.setCompanyRegDate(es.getCompanyRegDate())
			.selectCompanyRegion(es.getCompanyRegion())
			.setCompanyArea(es.getCompanyArea())
			.setCompanyCity(es.getCompanyCity())
			.setCompanyStreet(es.getCompanyStreet())
			.setCompanyHouse(es.getCompanyHouse())
			.setCompanyCorp(es.getCompanyCorp())
			.setCompanyApartment(es.getCompanyApartment())
			.setComment(es.getComment())
			.clickOK()
			.selectFirstCompany()
			.addIssuer()
			.selectInfoDirectionSign(es.getInfoDirectionSign())
			.selectIssuerType(es.getIssuerType())
			.setIssuerCode(es.getIssuerCode())
			.setIssuerName(es.getIssuerName())
			.setPurchaseSecuritiesDate(es.getPurchaseSecuritiesDate())
			.clickOK()
			.selectFirstIssuer()
			.addSecurities()
			.selectSecuritiesTypeCode(es.getSecuritiesTypeCode())
			.setNumberISIN(es.getNumberISIN())
			.selectSecuritiesCurrencyCode(es.getSecuritiesCurrencyCode())
			.setSecuritiesCount(es.getSecuritiesCount())
			.selectSecuritiesPriceCurrencyCode(es.getSecuritiesPriceCurrencyCode())
			.setSecuritiesPrice(es.getSecuritiesPrice())
			.setSecuritiesPriceRUR(es.getSecuritiesPriceRUR())
			.clickOK();
	}
	
	public void inputRequiredValues443_2(ES_443_2_DOC es) {
		pages.es_Page.ensurePageLoaded()
			.setSenderNfoINN(es.getSenderNfoINN())
			.setAuthorizedPersonPosition(es.getAuthorizedPersonPosition())
			.setAuthorizedPersonSurname(es.getAuthorizedPersonSurname())
			.setAuthorizedPersonName(es.getAuthorizedPersonName())
			.setAuthorizedPersonPhone(es.getAuthorizedPersonPhone())
			.selectOpenedAccoutNfoType(es.getOpenedAccountNfoType())
			.setOpenedAccountLegalPersonNfoName(es.getOpenedAccountLegalPersonNfoName())
			.setOpenedAccountNfoINN(es.getOpenedAccountNfoINN(), es.getOpenedAccountNfoINNIP())
			.setOpenedAccountNfoKPP(es.getOpenedAccountNfoKPP())
			.setOpenedAccountNfoOGRN(es.getOpenedAccountNfoOGRN(), es.getOpenedAccountNfoOGRNIP())
			.setOpenedAccountPrivatePersonSurname(es.getOpenedAccountPrivatePersonSurname())
			.setOpenedAccountPrivatePersonName(es.getOpenedAccountPrivatePersonName());
		pages.es_443_2_Page.ensurePageLoaded()
			.selectInfoAboutCompanyTab()
			.addCompany()
			.setCompanyName(es.getCompanyName())
			.setCompanyINN(es.getCompanyINN())
			.setCompanyKPP(es.getCompanyKPP())
			.setCompanyOGRN(es.getCompanyOGRN())
			.setCompanyRegDate(es.getCompanyRegDate())
			.selectCompanyRegion(es.getCompanyRegion())
			.setCompanyCity(es.getCompanyCity())
			.clickOK()
			.selectFirstCompany()
			.addIssuer()
			.selectInfoDirectionSign(es.getInfoDirectionSign())
			.selectIssuerType(es.getIssuerType())
			.setIssuerCode(es.getIssuerCode())
			.setIssuerName(es.getIssuerName())
			.setPurchaseSecuritiesDate(es.getPurchaseSecuritiesDate())
			.clickOK()
			.selectFirstIssuer()
			.addSecurities()
			.selectSecuritiesTypeCode(es.getSecuritiesTypeCode())
			.setNumberISIN(es.getNumberISIN())
			.selectSecuritiesCurrencyCode(es.getSecuritiesCurrencyCode())
			.setSecuritiesCount(es.getSecuritiesCount())
			.selectSecuritiesPriceCurrencyCode(es.getSecuritiesPriceCurrencyCode())
			.setSecuritiesPrice(es.getSecuritiesPrice())
			.setSecuritiesPriceRUR(es.getSecuritiesPriceRUR())
			.clickOK();
	}
}
