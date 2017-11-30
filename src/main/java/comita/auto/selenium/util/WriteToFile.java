package comita.auto.selenium.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	
	public String path;
	
	public WriteToFile(String logPath){
		Dates dates = new Dates();
		path = System.getProperty("user.dir") + logPath + dates.getDate().substring(0,10) + ".log";
	}
	
	public void AppendToFile(String toWrite) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {			
			File file = new File(path);
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			bw.write(toWrite + " \n");
			}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				bw.close();
			} catch (Exception e) {
			}
			try {
				fw.close();
			} catch (Exception e) {
			}
		}
	}

	
}
