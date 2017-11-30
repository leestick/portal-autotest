package comita.auto.selenium.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import comita.auto.selenium.util.Dates;

public class FES_DELFM_DOC extends FES_DOC {
	
	private String numberFES;
	private String idFES;
	private String dateFES;
	private String typeFES;
	private String statusFES;
	private String provisionMethodFES;
	private String reasonsToDeleteFES;
	
	private Dates dates = new Dates();
	public String dateAndTime = dates.getDate();
	public String date = dateAndTime.substring(0,10);
	
	
	
	public FES_DELFM_DOC writeData() {
        Properties property = new Properties();
 
        try {
        	String path = "src/test/resources/test_data/FES_DELFM.txt";
        	property.load(new InputStreamReader(new FileInputStream(path), "UTF-8"));
            writeData(path); 
            this.numberFES = property.getProperty("{numberFES}");
            this.idFES = property.getProperty("{idFES}");
            this.dateFES = property.getProperty("{dateFES}");
            this.typeFES = property.getProperty("{typeFES}");
            this.statusFES = property.getProperty("{statusFES}");
            this.provisionMethodFES = property.getProperty("{provisionMethodFES}");
            this.reasonsToDeleteFES = property.getProperty("{reasonsToDeleteFES}");
		
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл отсуствует!");
        }
		return this;
	}
	
	public String getNumberFES() {
		return numberFES;
	}

	public FES_DELFM_DOC setNumberFES(String numberFES) {
		this.numberFES = numberFES;
		return this;
	}

	public String getIdFES() {
		return idFES;
	}

	public FES_DELFM_DOC setIdFES(String idFES) {
		this.idFES = idFES;
		return this;
	}

	public String getDateFES() {
		return dateFES;
	}

	public FES_DELFM_DOC setDateFES(String dateFES) {
		this.dateFES = dateFES;
		return this;
	}

	public String getTypeFES() {
		return typeFES;
	}

	public FES_DELFM_DOC setTypeFES(String typeFES) {
		this.typeFES = typeFES;
		return this;
	}

	public String getStatusFES() {
		return statusFES;
	}

	public FES_DELFM_DOC setStatusFES(String statusFES) {
		this.statusFES = statusFES;
		return this;
	}

	public String getProvisionMethodFES() {
		return provisionMethodFES;
	}

	public FES_DELFM_DOC setProvisionMethodFES(String provisionMethodFES) {
		this.provisionMethodFES = provisionMethodFES;
		return this;
	}

	public String getReasonsToDeleteFES() {
		return reasonsToDeleteFES;
	}

	public FES_DELFM_DOC setReasonsToDeleteFES(String reasonsToDeleteFES) {
		this.reasonsToDeleteFES = reasonsToDeleteFES;
		return this;
	}
}
