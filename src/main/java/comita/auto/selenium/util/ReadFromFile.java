package comita.auto.selenium.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс для построчного чтения текстовых файлов
 * @author dmitryd
 *
 */
public class ReadFromFile {
	
	@SuppressWarnings("resource")
	public String [] readFromFile(String pathToFile) {			
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(pathToFile));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String line;
		List<String> lines = new ArrayList<String>();
    
		try {
			while ((line = reader.readLine()) != null) {
				lines.add(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] array = lines.toArray(new String[0]);
		return array;
	}
	
}
