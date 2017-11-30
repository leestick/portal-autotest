package comita.auto.selenium.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import comita.auto.selenium.util.Dates;

public class FES_4FM_DOC extends FES_DOC {

	private String id;	
	private String recordTypeFES;
	private String correctionDate;
	private String foreignCountryCode;
	private String requirementOfLegislation;
	private String handicappingForm;
	private String additionalInfo;
	
	private Dates dates = new Dates();
	public String dateAndTime = dates.getDate();
	public String date = dateAndTime.substring(0,10);
		
	public FES_4FM_DOC writeData() {
        Properties property = new Properties();
 
        try {
        	String path = "src/test/resources/test_data/FES_4FM.txt";
        	property.load(new InputStreamReader(new FileInputStream(path), "UTF-8"));
            writeData(path); 
            this.id = property.getProperty("{id}");
            this.recordTypeFES = property.getProperty("{recordTypeFES}");
        	this.correctionDate = property.getProperty("{correctionDate}");
        	this.foreignCountryCode = property.getProperty("{foreignCountryCode}");
        	this.requirementOfLegislation = property.getProperty("{requirementOfLegislation}");
        	this.handicappingForm = property.getProperty("{handicappingForm}");
        	this.additionalInfo = property.getProperty("{additionalInfo}");			
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл отсуствует!");
        }
		return this;
	}

	public String getId() {
		return id;
	}
	
	public FES_4FM_DOC setId(String id) {
		this.id = id;
		return this;
	}

	public String getRecordTypeFES() {
		return recordTypeFES;
	}

	public FES_4FM_DOC setRecordTypeFES(String recordTypeFES) {
		this.recordTypeFES = recordTypeFES;
		return this;
	}

	public String getCorrectionDate() {
		return correctionDate;
	}

	public FES_4FM_DOC setCorrectionDate(String correctionDate) {
		this.correctionDate = correctionDate;
		return this;
	}

	public String getForeignCountryCode() {
		return foreignCountryCode;
	}

	public FES_4FM_DOC setForeignCountryCode(String foreignCountryCode) {
		this.foreignCountryCode = foreignCountryCode;
		return this;
	}

	public String getRequirementOfLegislation() {
		return requirementOfLegislation;
	}

	public FES_4FM_DOC setRequirementOfLegislation(String requirementOfLegislation) {
		this.requirementOfLegislation = requirementOfLegislation;
		return this;
	}

	public String getHandicappingForm() {
		return handicappingForm;
	}

	public FES_4FM_DOC setHandicappingForm(String handicappingForm) {
		this.handicappingForm = handicappingForm;
		return this;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}
	
	public FES_4FM_DOC setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	public Dates getDates() {
		return dates;
	}

	public FES_4FM_DOC setDates(Dates dates) {
		this.dates = dates;
		return this;
	}	
}
