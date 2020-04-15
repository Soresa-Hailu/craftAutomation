package classofmarch.com;

import java.util.Scanner;




public class SwitchCaseClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		
		String dayOfWeekArg = in.nextLine();
		
		String typeOfDay;
	     switch (dayOfWeekArg) {
	     
	         case "Monday":
	             typeOfDay = "Start of work week";
	             break;
	             
	         case "Tuesday":
	         case "Wednesday":
	         case "Thursday":
	             typeOfDay = "Midweek";
	             break;
	         case "Friday":
	             typeOfDay = "End of work week";
	             break;
	         case "Saturday":
	         case "Sunday":
	             typeOfDay = "Weekend";
	             break;
	         default:
	             throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);
	     }
	     System.out.println(typeOfDay);
	}
		
	}


