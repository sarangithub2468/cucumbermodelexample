package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Systemtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to display the current date time in specific format.
        
		SimpleDateFormat dt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		
   /* dt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
	System.out.println("\nNow: "+dt.format(System.currentTimeMillis()));
*/
    System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());

		
		
	}

}
