package utilityMethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Calender {
	public static String date1() {
		
		DateTimeFormatter forDate = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
    	String futureDate = LocalDate.now().plusDays(2).format(forDate);
    	return futureDate;
	}
	
public static String date2() {
		
		DateTimeFormatter forDate2 = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
    	String futureDate2 = LocalDate.now().plusDays(32).format(forDate2);
    	return futureDate2;
	}

}
