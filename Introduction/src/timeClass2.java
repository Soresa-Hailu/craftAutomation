import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class timeClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
////		sdf.setLenient(false);
//		
//		String input = "2019-02-1";
//		System.out.println("Given date is: " + input);
//		
//		Date dt;
//		try {
//			dt= sdf.parse(input);
//			System.out.println(dt);
//		}
//		catch(ParseException e) {
////			e.printStackTrace();
//			System.out.println (e.getMessage());
//		}
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		  
		   String str2 = "12-02-2018";
		   String str1 = "12-02-1998";
		   
		   try {
			   Date d1= sdf1.parse(str1);
			   Date d2= sdf1.parse(str2);
			   System.out.println(d1.compareTo(d2));
		     }
		   catch(ParseException e) {
			   System.out.println("Invalid date given");
		   }
		
		
	}
	

}
