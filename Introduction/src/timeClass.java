import java.text.SimpleDateFormat;
import java.util.Date;

public class timeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Date d = new Date();
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		String date = sdf.format(d);
		
		System.out.println("The Current :" + date );
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss");
		String dayTime = sdf1.format(d);
		
		System.out.println("The Current Time :" +dayTime);
		
	}

}
