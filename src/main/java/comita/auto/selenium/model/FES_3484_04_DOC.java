package comita.auto.selenium.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import comita.auto.selenium.util.Dates;

public class FES_3484_04_DOC extends FES_DOC {
	
	private String id;
	private String recordTypeFES;
	private String datePrevInspection;
	private String dateCurrInspection;
	private String numberOfCustomersOrg;
	private String numberOfCustomersInd;
	private String totalNumberOfCustomers;
	private String numberOfBlockedOrg;
	private String numberOfBlockedInd;
	private String numberOfFESForBlocked;
	private String numberOfNonBlockedOrg;
	private String numberOfNonBlockedInd;
	private String totalNumberOfNonBlocked;
	private String numberOfFESForNonBlocked;
	private String additionalInfo;
	private Dates dates = new Dates();
	
	public String dateAndTime = dates.getDate();
	public String date = dateAndTime.substring(0,10);
	
	public FES_3484_04_DOC writeData() {
        Properties property = new Properties();
 
        try {
        	String path = "src/test/resources/test_data/FES_3484_04.txt";
        	property.load(new InputStreamReader(new FileInputStream(path), "UTF-8"));
			writeData(path);
			this.id = property.getProperty("{id}");
			this.recordTypeFES = property.getProperty("{recordTypeFES}");
			this.datePrevInspection = property.getProperty("{datePrevInspection}");
			this.dateCurrInspection = property.getProperty("{dateCurrInspection}");
			this.numberOfCustomersOrg = property.getProperty("{numberOfCustomersOrg}");
			this.numberOfCustomersInd = property.getProperty("{numberOfCustomersInd}");
			this.totalNumberOfCustomers = property.getProperty("{totalNumberOfCustomers}");
			this.numberOfBlockedOrg = property.getProperty("{numberOfBlockedOrg}");
			this.numberOfBlockedInd = property.getProperty("{numberOfBlockedInd}");
			this.numberOfFESForBlocked = property.getProperty("{numberOfFESForBlocked}");
			this.numberOfNonBlockedOrg = property.getProperty("{numberOfNonBlockedOrg}");
			this.numberOfNonBlockedInd = property.getProperty("{numberOfNonBlockedInd}");
			this.totalNumberOfNonBlocked = property.getProperty("{totalNumberOfNonBlocked}");
			this.numberOfFESForNonBlocked = property.getProperty("{numberOfFESForNonBlocked}");
			this.additionalInfo = property.getProperty("{additionalInfo}");
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл отсуствует!");
        }
		return this;
	}

	public String getId() {
		return id;
	}

	public FES_3484_04_DOC setId(String id) {
		this.id = id;
		return this;
	}	
	
	public String getRecordTypeFES() {
		return recordTypeFES;
	}

	public FES_3484_04_DOC setRecordTypeFES(String recordTypeFES) {
		this.recordTypeFES = recordTypeFES;
		return this;
	}
	
	public String getDatePrevInspection() {
		return datePrevInspection;
	}

	public FES_3484_04_DOC setDatePrevInspection(String datePrevInsp) {
		this.datePrevInspection = datePrevInsp;
		return this;
	}

	public String getDateCurrInspection() {
		return dateCurrInspection;
	}

	public FES_3484_04_DOC setDateCurrInspection(String dateCurrInsp) {
		this.dateCurrInspection = dateCurrInsp;
		return this;
	}
	
	public String getNumberOfCustomersOrg() {
		return numberOfCustomersOrg;
	}

	public FES_3484_04_DOC setNumberOfCustomersOrg(String numberOfCustomersOrg) {
		this.numberOfCustomersOrg = numberOfCustomersOrg;
		return this;
	}

	public String getNumberOfCustomersInd() {
		return numberOfCustomersInd;
	}

	public FES_3484_04_DOC setNumberOfCustomersInd(String numberOfCustomersInd) {
		this.numberOfCustomersInd = numberOfCustomersInd;
		return this;
	}

	public String getTotalNumberOfCustomers() {
		return totalNumberOfCustomers;
	}

	public FES_3484_04_DOC setTotalNumberOfCustomers(String totalNumberOfCustomers) {
		this.totalNumberOfCustomers = totalNumberOfCustomers;
		return this;
	}
	
	public String getNumberOfBlockedOrg() {
		return numberOfBlockedOrg;
	}

	public FES_3484_04_DOC setNumberOfBlockedOrg(String numberOfBlockedOrg) {
		this.numberOfBlockedOrg = numberOfBlockedOrg;
		return this;
	}

	public String getNumberOfBlockedInd() {
		return numberOfBlockedInd;
	}

	public FES_3484_04_DOC setNumberOfBlockedInd(String numberOfBlockedInd) {
		this.numberOfBlockedInd = numberOfBlockedInd;
		return this;
	}

	public String getNumberOfFESForBlocked() {
		return numberOfFESForBlocked;
	}

	public FES_3484_04_DOC setNumberOfFESForBlocked(String numberOfFESForBlocked) {
		this.numberOfFESForBlocked = numberOfFESForBlocked;
		return this;
	}

	public String getNumberOfNonBlockedOrg() {
		return numberOfNonBlockedOrg;
	}

	public FES_3484_04_DOC setNumberOfNonBlockedOrg(String numberOfNonBlockedOrg) {
		this.numberOfNonBlockedOrg = numberOfNonBlockedOrg;
		return this;
	}

	public String getNumberOfNonBlockedInd() {
		return numberOfNonBlockedInd;
	}

	public FES_3484_04_DOC setNumberOfNonBlockedInd(String numberOfNonBlockedInd) {
		this.numberOfNonBlockedInd = numberOfNonBlockedInd;
		return this;
	}

	public String getTotalNumberOfNonBlocked() {
		return totalNumberOfNonBlocked;
	}

	public FES_3484_04_DOC setTotalNumberOfNonBlocked(String totalNumberOfNonBlocked) {
		this.totalNumberOfNonBlocked = totalNumberOfNonBlocked;
		return this;
	}

	public String getNumberOfFESForNonBlocked() {
		return numberOfFESForNonBlocked;
	}

	public FES_3484_04_DOC setNumberOfFESForNonBlocked(String numberOfFESForNonBlocked) {
		this.numberOfFESForNonBlocked = numberOfFESForNonBlocked;
		return this;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public FES_3484_04_DOC setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}	
}
