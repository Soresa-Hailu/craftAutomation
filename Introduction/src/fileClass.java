import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class fileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Date d = new Date();
//		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
//		String day  = sdf1.format(d);
//		
//		SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss");
//		String dayTime = sdf2.format(d);
//		
//		System.out.println("The current Date: " +day);
//		System.out.println("The Current Time : " +dayTime);
		
   		
//		SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MM-yyyy");
//		   sdf3.setLenient(false);
//		  String d = "2019-10-12";
//		  System.out.println("The Given Date is :" + d);
//		  
//		  try {
//		  Date day = sdf3.parse(d);
//		  System.out.println(day);
//		  
//		  }
//		  catch(ParseException e) {
//			  System.out.println(e.getMessage());
////			  e.printStackTrace();
//		  }
		  
//		SimpleDateFormat sdf4= new SimpleDateFormat("dd-MM-yyyyy");
//		String str1= "12-4-2019";
//		String str2= "13-4-2019";
//		
//		try {
//			Date d1= sdf4.parse(str1);
//			Date d2= sdf4.parse(str2);
//			System.out.println(d1.compareTo(d2));
//		}
//		catch(ParseException e) {
//			System.out.println("Invalid date given");
//		}
		
		FileInputStream in = null;
		FileOutputStream out =null;
		try {
			in= new FileInputStream("C:\\Users\\Dj\\Desktop\\file\\input.txt");
			out = new FileOutputStream("C:\\Users\\Dj\\Desktop\\file\\output.txt");
			
			int i=0;
			
			while((i= in.read()) != -1) {
				out.write(i);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
//		
//		String fileName = "C:\\Users\\Dj\\Desktop\\file\\input.txt";
//		String line= null;
//		try
//		{
//			FileReader fr= new FileReader(fileName);
//			BufferedReader bf = new BufferedReader(fr);
//			
//			while((line=bf.readLine()) != null) {
//				System.out.println(line);
//			}
//		}
//		catch(Exception e) {
//			System.out.println("Error while reading the file");
//		}
		
		
		
		
//		FileInputStream in = null;
//		FileOutputStream out = null;
////		
////		try {
////			in = new FileInputStream("C:\\Users\\Dj\\Desktop\\file\\input.txt");
////			out= new FileOutputStream("C:\\Users\\Dj\\Desktop\\file\\output.txt");
////			
////			int c=0;
////			while((c= in.read())!=-1) {
////				out.write(c);
////			}
////			
////		}
////		catch(Exception e) {
////			System.out.println("Error in the File Write/Read: " + e.getMessage());
////			
////		}
//			String fileName ="C:\\Users\\Dj\\Desktop\\file\\input.txt";
//			String line = null;
//			try {
//				FileReader fR = new FileReader(fileName);
//				BufferedReader bR = new BufferedReader(fR);
//				
//				while((line = bR.readLine()) != null) {
//					System.out.println(line);
//				}
//				bR.close();
//				
//			}catch(Exception e) {
//				System.out.println("Error in reading the file: " + fileName);
//			}
//					
		
		
				
		
		
	}

}
