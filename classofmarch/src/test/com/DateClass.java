package test.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d= new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf1 =new SimpleDateFormat("dd-MM-yyyy");
		String str1 = sdf1.format(d);
		
		System.out.println("The Current Date: " +str1);
		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss");
		String str2 = sdf2.format(d);
		
		System.out.println("The Current Time: " +str2);
		
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MM-yyyy");
		// false if it is to be turned off
		 sdf3.setLenient(false);
		
		String str = "13-02-2019";
		
		try {
			Date date = sdf3.parse(str);
			System.out.println(date);
		}
		catch(ParseException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("dd-MM-yyyy");
		
		String str3 = "13-02-2020";
		String str4 = "13-02-2021";

		try {
			
			Date d1 = sdf4.parse(str3);
			Date d2 = sdf4.parse(str4);
			
			System.out.println(d1.compareTo(d2));
		}
		catch(ParseException e) {
			System.out.println("Invalid date format");
		}
		
		
	}

}
