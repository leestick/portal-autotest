package comita.auto.selenium.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import comita.auto.selenium.util.Dates;

public class FES_3FM_DOC extends FES_DOC {

	private String id;
	private String recordTypeFES;
	private String dateOfChange;
	private String dateOfPrevInspection;
	private String startOfPeriodDate;
	private String endOfPeriodDate;
	private String startOfInspectionDate;
	private String endOfInspectionDate;
	private String totalNumberOfCustomers;
	private String numberOfCustomersOrg;
	private String numberOfCustomersInd;
	private String totalNumberOfBlocked;
	private String numberOfBlockedOrg;
	private String numberOfBlockedInd;
	private String totalNumberOfFESForBlocked;
	private String totalNumberOfNonBlocked;
	private String numberOfNonBlockedOrg;
	private String numberOfNonBlockedInd;
	private String numberOfFESForNonBlocked;
	private String baseApplyingMeasuresCode;
	private String organizationCode;
	private String additionalInfo;
	
	private Dates dates = new Dates();
	public String dateAndTime = dates.getDate();
	public String date = dateAndTime.substring(0,10);	
	
	public FES_3FM_DOC writeData() {
        Properties property = new Properties();
 
        try {
        	String path = "src/test/resources/test_data/FES_3FM.txt";
        	property.load(new InputStreamReader(new FileInputStream(path), "UTF-8"));
            writeData(path);            
            this.id = property.getProperty("{id}");
        	this.recordTypeFES = property.getProperty("{recordTypeFES}");
        	this.dateOfChange = property.getProperty("{dateOfChange}");
        	this.dateOfPrevInspection = property.getProperty("{dateOfPrevInspection}");
        	this.startOfPeriodDate = property.getProperty("{startOfPeriodDate}");
        	this.endOfPeriodDate = property.getProperty("{endOfPeriodDate}");
        	this.startOfInspectionDate = property.getProperty("{startOfInspectionDate}");
        	this.endOfInspectionDate = property.getProperty("{endOfInspectionDate}");
        	this.totalNumberOfCustomers = property.getProperty("{totalNumberOfCustomers}");
        	this.numberOfCustomersOrg = property.getProperty("{numberOfCustomersOrg}");
        	this.numberOfCustomersInd = property.getProperty("{numberOfCustomersInd}");
        	this.totalNumberOfBlocked = property.getProperty("{totalNumberOfBlocked}");
        	this.numberOfBlockedOrg = property.getProperty("{numberOfBlockedOrg}");
        	this.numberOfBlockedInd = property.getProperty("{numberOfBlockedInd}");
        	this.totalNumberOfFESForBlocked = property.getProperty("{totalNumberOfFESForBlocked}");
        	this.totalNumberOfNonBlocked = property.getProperty("{totalNumberOfNonBlocked}");
        	this.numberOfNonBlockedOrg = property.getProperty("{numberOfNonBlockedOrg}");
        	this.numberOfNonBlockedInd = property.getProperty("{numberOfNonBlockedInd}");
        	this.numberOfFESForNonBlocked = property.getProperty("{numberOfFESForNonBlocked}");
        	this.baseApplyingMeasuresCode = property.getProperty("{baseApplyingMeasuresCode}");
        	this.organizationCode = property.getProperty("{organizationCode}");
        	this.additionalInfo = property.getProperty("{additionalInfo}");
 
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл отсуствует!");
        }
		return this;
	}
	
	public String getId() {
		return id;
	}

	public FES_3FM_DOC setId(String id) {
		this.id = id;
		return this;
	}

	public String getRecordTypeFES() {
		return recordTypeFES;
	}

	public FES_3FM_DOC setRecordTypeFES(String recordTypeFES) {
		this.recordTypeFES = recordTypeFES;
		return this;
	}

	public String getDateOfChange() {
		return dateOfChange;
	}

	public FES_3FM_DOC setDateOfChange(String dateOfChange) {
		this.dateOfChange = dateOfChange;
		return this;
	}

	public String getDateOfPrevInspection() {
		return dateOfPrevInspection;
	}

	public FES_3FM_DOC setDateOfPrevInspection(String dateOfPrevInspection) {
		this.dateOfPrevInspection = dateOfPrevInspection;
		return this;
	}

	public String getStartOfPeriodDate() {
		return startOfPeriodDate;
	}

	public FES_3FM_DOC setStartOfPeriodDate(String startOfPeriodDate) {
		this.startOfPeriodDate = startOfPeriodDate;
		return this;
	}

	public String getEndOfPeriodDate() {
		return endOfPeriodDate;
	}

	public FES_3FM_DOC setEndOfPeriodDate(String endOfPeriodDate) {
		this.endOfPeriodDate = endOfPeriodDate;
		return this;
	}

	public String getStartOfInspectionDate() {
		return startOfInspectionDate;
	}
 
	public FES_3FM_DOC setStartOfInspectionDate(String startOfInspectionDate) {
		this.startOfInspectionDate = startOfInspectionDate;
		return this;
	}

	public String getEndOfInspectionDate() {
		return endOfInspectionDate;
	}

	public FES_3FM_DOC setEndOfInspectionDate(String endOfInspectionDate) {
		this.endOfInspectionDate = endOfInspectionDate;
		return this;
	}

	public String getTotalNumberOfCustomers() {
		return totalNumberOfCustomers;
	}

	public FES_3FM_DOC setTotalNumberOfCustomers(String totalNumberOfCustomers) {
		this.totalNumberOfCustomers = totalNumberOfCustomers;
		return this;
	}

	public String getNumberOfCustomersOrg() {
		return numberOfCustomersOrg;
	}

	public FES_3FM_DOC setNumberOfCustomersOrg(String numberOfCustomersOrg) {
		this.numberOfCustomersOrg = numberOfCustomersOrg;
		return this;
	}

	public String getNumberOfCustomersInd() {
		return numberOfCustomersInd;
	}

	public FES_3FM_DOC setNumberOfCustomersInd(String numberOfCustomersInd) {
		this.numberOfCustomersInd = numberOfCustomersInd;
		return this;
	}

	public String getTotalNumberOfBlocked() {
		return totalNumberOfBlocked;
	}

	public FES_3FM_DOC setTotalNumberOfBlocked(String totalNumberOfBlocked) {
		this.totalNumberOfBlocked = totalNumberOfBlocked;
		return this;
	}

	public String getNumberOfBlockedOrg() {
		return numberOfBlockedOrg;
	}

	public FES_3FM_DOC setNumberOfBlockedOrg(String numberOfBlockedOrg) {
		this.numberOfBlockedOrg = numberOfBlockedOrg;
		return this;
	}

	public String getNumberOfBlockedInd() {
		return numberOfBlockedInd;
	}

	public FES_3FM_DOC setNumberOfBlockedInd(String numberOfBlockedInd) {
		this.numberOfBlockedInd = numberOfBlockedInd;
		return this;
	}

	public String getTotalNumberOfFESForBlocked() {
		return totalNumberOfFESForBlocked;
	}

	public FES_3FM_DOC setTotalNumberOfFESForBlocked(String totalNumberOfFESForBlocked) {
		this.totalNumberOfFESForBlocked = totalNumberOfFESForBlocked;
		return this;
	}

	public String getTotalNumberOfNonBlocked() {
		return totalNumberOfNonBlocked;
	}

	public FES_3FM_DOC setTotalNumberOfNonBlocked(String totalNumberOfNonBlocked) {
		this.totalNumberOfNonBlocked = totalNumberOfNonBlocked;
		return this;
	}

	public String getNumberOfNonBlockedOrg() {
		return numberOfNonBlockedOrg;
	}

	public FES_3FM_DOC setNumberOfNonBlockedOrg(String numberOfNonBlockedOrg) {
		this.numberOfNonBlockedOrg = numberOfNonBlockedOrg;
		return this;
	}

	public String getNumberOfNonBlockedInd() {
		return numberOfNonBlockedInd;
	}

	public FES_3FM_DOC setNumberOfNonBlockedInd(String numberOfNonBlockedInd) {
		this.numberOfNonBlockedInd = numberOfNonBlockedInd;
		return this;
	}

	public String getNumberOfFESForNonBlocked() {
		return numberOfFESForNonBlocked;
	}

	public FES_3FM_DOC setNumberOfFESForNonBlocked(String numberOfFESForNonBlocked) {
		this.numberOfFESForNonBlocked = numberOfFESForNonBlocked;
		return this;
	}

	public String getBaseApplyingMeasuresCode() {
		return baseApplyingMeasuresCode;
	}

	public FES_3FM_DOC setBaseApplyingMeasuresCode(String baseApplyingMeasuresCode) {
		this.baseApplyingMeasuresCode = baseApplyingMeasuresCode;
		return this;
	}

	public String getOrganizationCode() {
		return organizationCode;
	}

	public FES_3FM_DOC setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
		return this;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public FES_3FM_DOC setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	public Dates getDates() {
		return dates;
	}

	public FES_3FM_DOC setDates(Dates dates) {
		this.dates = dates;
		return this;
	}

	
	
	

	
}
