package comita.auto.selenium.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import comita.auto.selenium.util.Dates;

public class ES_DOC {

	protected String type;
	protected String dateOfES;
	protected String senderNfoINN;
	protected String senderNfoKPP;
	protected String authorizedPersonPosition;
	protected String authorizedPersonSurname;
	protected String authorizedPersonName;
	protected String authorizedPersonPatronymic;
	protected String authorizedPersonPhone;
	protected String openedAccountNfoType;
	protected String openedAccountLegalPersonNfoName;
	protected String openedAccountNfoINN;
	protected String openedAccountNfoINNIP;
	protected String openedAccountNfoKPP;
	protected String openedAccountNfoOGRN;
	protected String openedAccountNfoOGRNIP;
	protected String openedAccountPrivatePersonSurname;
	protected String openedAccountPrivatePersonName;
	protected String openedAccountPrivatePersonPatronymic;
	
	private Dates dates = new Dates();
	public String dateAndTime = dates.getDate();
	public String date = dateAndTime.substring(0, 10);
	
	public void writeData(String path) {
        Properties property = new Properties();
 
        try {
        	property.load(new InputStreamReader(new FileInputStream(path), "UTF-8"));
			
		this.type = property.getProperty("{type}");
		this.dateOfES = date;
		this.senderNfoINN = property.getProperty("{senderNfoINN}");
		this.senderNfoKPP = property.getProperty("{senderNfoKPP}");
		this.authorizedPersonPosition = property.getProperty("{authorizedPersonPosition}");
		this.authorizedPersonSurname = property.getProperty("{authorizedPersonSurname}");
		this.authorizedPersonName = property.getProperty("{authorizedPersonName}");
		this.authorizedPersonPatronymic = property.getProperty("{authorizedPersonPatronymic}");
		this.authorizedPersonPhone = property.getProperty("{authorizedPersonPhone}");
		this.openedAccountNfoType = property.getProperty("{openedAccountNfoType}");
		this.openedAccountLegalPersonNfoName = property.getProperty("{openedAccountLegalPersonNfoName}");
		this.openedAccountNfoINN = property.getProperty("{openedAccountNfoINN}");
		this.openedAccountNfoINNIP = property.getProperty("{openedAccountNfoINNIP}");
		this.openedAccountNfoKPP = property.getProperty("{openedAccountNfoKPP}");
		this.openedAccountNfoOGRN = property.getProperty("{openedAccountNfoOGRN}");
		this.openedAccountNfoOGRNIP = property.getProperty("{openedAccountNfoOGRNIP}");
		this.openedAccountPrivatePersonSurname = property.getProperty("{openedAccountPrivatePersonSurname}");
		this.openedAccountPrivatePersonName = property.getProperty("{openedAccountPrivatePersonName}");
		this.openedAccountPrivatePersonPatronymic = property.getProperty("{openedAccountPrivatePersonPatronymic}");
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл отсуствует!");
        }
		
	}
	
	public String getType() {
		return type;
	}
	
	public ES_DOC setType(String type) {
		this.type = type;
		return this;
	}
	
	public String getDateOfES() {
		return dateOfES;
	}
	
	public ES_DOC setDateOfES(String dateOfES) {
		this.dateOfES = dateOfES;
		return this;
	}
	
	public String getSenderNfoINN() {
		return senderNfoINN;
	}
	
	public ES_DOC setSenderNfoINN(String senderNfoINN) {
		this.senderNfoINN = senderNfoINN;
		return this;
	}
	
	public String getSenderNfoKPP() {
		return senderNfoKPP;
	}
	
	public ES_DOC setSenderNfoKPP(String senderNfoKPP) {
		this.senderNfoKPP = senderNfoKPP;
		return this;
	}
	
	public String getAuthorizedPersonPosition() {
		return authorizedPersonPosition;
	}
	
	public ES_DOC setAuthorizedPersonPosition(String authorizedPersonPosition) {
		this.authorizedPersonPosition = authorizedPersonPosition;
		return this;
	}
	
	public String getAuthorizedPersonSurname() {
		return authorizedPersonSurname;
	}
	
	public ES_DOC setAuthorizedPersonSurname(String authorizedPersonSurname) {
		this.authorizedPersonSurname = authorizedPersonSurname;
		return this;
	}
	
	public String getAuthorizedPersonName() {
		return authorizedPersonName;
	}
	
	public ES_DOC setAuthorizedPersonName(String authorizedPersonName) {
		this.authorizedPersonName = authorizedPersonName;
		return this;
	}
	
	public String getAuthorizedPersonPatronymic() {
		return authorizedPersonPatronymic;
	}
	
	public ES_DOC setAuthorizedPersonPatronymic(String authorizedPersonPatronymic) {
		this.authorizedPersonPatronymic = authorizedPersonPatronymic;
		return this;
	}
	
	public String getAuthorizedPersonPhone() {
		return authorizedPersonPhone;
	}
	
	public ES_DOC setAuthorizedPersonPhone(String authorizedPersonPhone) {
		this.authorizedPersonPhone = authorizedPersonPhone;
		return this;
	}
	
	public String getOpenedAccountNfoType() {
		return openedAccountNfoType;
	}
	
	public ES_DOC setOpenedAccountNfoType(String openedAccountNfoType) {
		this.openedAccountNfoType = openedAccountNfoType;
		return this;
	}
	
	public String getOpenedAccountLegalPersonNfoName() {
		return openedAccountLegalPersonNfoName;
	}
	
	public ES_DOC setOpenedAccountLegalPersonNfoName(
			String openedAccountLegalPersonNfoName) {
		this.openedAccountLegalPersonNfoName = openedAccountLegalPersonNfoName;
		return this;
	}
	
	public String getOpenedAccountNfoINN() {
		return openedAccountNfoINN;
	}
	
	public ES_DOC setOpenedAccountNfoINN(String openedAccountNfoINN) {
		this.openedAccountNfoINN = openedAccountNfoINN;
		return this;
	}
	
	public String getOpenedAccountNfoINNIP() {
		return openedAccountNfoINNIP;
	}
	
	public ES_DOC setOpenedAccountNfoINNIP(String openedAccountNfoINNIP) {
		this.openedAccountNfoINNIP = openedAccountNfoINNIP;
		return this;
	}
	
	public String getOpenedAccountNfoKPP() {
		return openedAccountNfoKPP;
	}
	
	public ES_DOC setOpenedAccountNfoKPP(String openedAccountNfoKPP) {
		this.openedAccountNfoKPP = openedAccountNfoKPP;
		return this;
	}
	
	public String getOpenedAccountNfoOGRN() {
		return openedAccountNfoOGRN;
	}
	
	public ES_DOC setOpenedAccountNfoOGRN(String openedAccountNfoOGRN) {
		this.openedAccountNfoOGRN = openedAccountNfoOGRN;
		return this;
	}
	
	public String getOpenedAccountNfoOGRNIP() {
		return openedAccountNfoOGRNIP;
	}
	
	public ES_DOC setOpenedAccountNfoOGRNIP(String openedAccountNfoOGRNIP) {
		this.openedAccountNfoOGRNIP = openedAccountNfoOGRNIP;
		return this;
	}
	
	public String getOpenedAccountPrivatePersonSurname() {
		return openedAccountPrivatePersonSurname;
	}
	
	public ES_DOC setOpenedAccountPrivatePersonSurname(
			String openedAccountPrivatePersonSurname) {
		this.openedAccountPrivatePersonSurname = openedAccountPrivatePersonSurname;
		return this;
	}
	
	public String getOpenedAccountPrivatePersonName() {
		return openedAccountPrivatePersonName;
	}
	
	public ES_DOC setOpenedAccountPrivatePersonName(
			String openedAccountPrivatePersonName) {
		this.openedAccountPrivatePersonName = openedAccountPrivatePersonName;
		return this;
	}
	
	public String getOpenedAccountPrivatePersonPatronymic() {
		return openedAccountPrivatePersonPatronymic;
	}
	
	public ES_DOC setOpenedAccountPrivatePersonPatronymic(
			String openedAccountPrivatePersonPatronymic) {
		this.openedAccountPrivatePersonPatronymic = openedAccountPrivatePersonPatronymic;
		return this;
	}
}
