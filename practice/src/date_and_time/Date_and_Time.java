package date_and_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_and_Time {

	public static void main(String[] args) {
		// create the object of date class
		// use tostring() method
		
		Date d = new Date();
		System.out.println(d.toString());
		
		// create object of simpledateformat class
		
		SimpleDateFormat s1 = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(s1.format(d));
		
		SimpleDateFormat s2 = new SimpleDateFormat("HH-mm-ss");
		System.out.println(s2.format(d));
		
		SimpleDateFormat s3 = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		System.out.println(s3.format(d));
		
		SimpleDateFormat s4 = new SimpleDateFormat("dd-MM-yyyy HH.mm.ss");
		System.out.println(s4.format(d));
		
	}

}
