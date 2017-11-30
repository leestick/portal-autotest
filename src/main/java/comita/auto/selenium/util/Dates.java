package comita.auto.selenium.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Класс для работы с датами
 * @author dmitryd
 *
 */
public class Dates {
	
	/**
	 * Метод для получения текущей даты в формате "dd.MM.yyyy HH:mm" 
	 * @return
	 */
	public String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");		
		Date date = new Date();
        String date_string = dateFormat.format(date);
        /*String new_hour = String.valueOf(Integer.valueOf(date_string.substring(11, 13)) - 1);
        String new_date = date_string.substring(0, 11);
        		if (new_hour.length() < 2) {
        			new_hour = "0" + new_hour;
        		}
        new_date = new_date + new_hour + date_string.substring(13, 16);*/		
        		
        return date_string;//new_date;
    }
	
	/**
	 * Метод для получения текущей даты в формате "dd.MM.yyyy HH:mm:ss" 
	 * @return
	 */
	public String getTimeForLog() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss.SSS");		
		Date date = new Date();
        String date_string = dateFormat.format(date);       		
        return date_string;//new_date;
    }
	
	/**
	 * Метод, прибавляющий указанное количество минут к указанной дате
	 * @param date
	 * @param some_minutes
	 * @return
	 */
	public String addSomeMinutes(String date, int some_minutes){
		int year = Integer.valueOf(date.substring(6, 10));		
		String month = date.substring(3, 5);
		String day = date.substring(0, 2);
		String hour = date.substring(11, 13);
		String minute = date.substring(14, 16);
		String new_date = "";
		int sum = Integer.valueOf(minute) + some_minutes;
		
		minute = String.valueOf(sum % 60);
		if (minute.length() == 1){
			minute = "0" + minute;
		}
		hour = String.valueOf(Integer.valueOf(hour) + sum/60);
		if (hour.length() == 1){
			hour = "0" + hour;
		}
		
		/*if (sum > 60) {
				if (Integer.valueOf(hour) + sum/60 > 23) {
					hour = "00";
				}
				else {
					int i = (Integer.valueOf(minute) + some_minutes)/60;
					hour = String.valueOf(Integer.valueOf(hour) + i);
					minute = String.valueOf(Integer.valueOf(minute) + some_minutes - 60);
				}
			}
			if (Integer.valueOf(minute) + some_minutes == 60) {
				if (Integer.valueOf(hour) + 1 > 23) {
					hour = "00";
				}
				else {
					hour = String.valueOf(Integer.valueOf(hour) + 1);
					minute = "00";
				}
			}
			else minute = String.valueOf(Integer.valueOf(minute) + some_minutes);*/
		new_date = day + "." + month + "." + String.valueOf(year) + " " + hour + ":" + minute;
		return new_date;
	}
	
	public String getNextDay(String date){
		int year = Integer.valueOf(date.substring(6, 10));		
		String month = date.substring(3, 5);
		String day = date.substring(0, 2);
		String hour = date.substring(11, 13);
		String minute = date.substring(14, 16);
		String tomorrow = "";					 
			if (month == "12" && day == "31"){
				tomorrow = "01";				
				month = "01";
				year++;
			}
			else if ((day == "31" && month != "12") | (day == "30" && month == "04") | (day == "30" && month == "06") | (day == "30" && month == "09") | (day == "30" && month == "11")){
				tomorrow = "01";				
				month = String.valueOf(Integer.valueOf(month) + 1);
				if (month.length() == 1){
					month = "0" + month;
				}
			}
			else if ((day == "28" && month == "02")) {
				tomorrow = "01";			
				month = "03";
			}
			else {
				tomorrow = String.valueOf(Integer.valueOf(day) + 1);				
				if (tomorrow.length() == 1){
					tomorrow = "0" + tomorrow;
				}
			}		
		tomorrow = tomorrow + "." + month + "." + String.valueOf(year) + " " + hour + ":" + minute;		
		return tomorrow;
		
	}
	
	public void waitForRightTime(String right_date) throws ParseException, InterruptedException{
		String actual_date = getDate();		
		SimpleDateFormat my_format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
		long waiting_time = my_format.parse(right_date).getTime() - my_format.parse(actual_date).getTime();
		
		if (waiting_time >= 0){
			Thread.sleep(waiting_time + 30000);
		}		
	}
}
