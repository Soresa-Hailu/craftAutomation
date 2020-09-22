package test.com;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int[] arr = new int[5];
			
			int a = 5;
			int b = 0;
            arr[5]= 23;
			System.out.println(a / b);
			
		}
		catch(Exception e) {
			System.out.print(e);
		}
	
			
//			int a=28;
//			int b=34;
//			System.out.println(a+b);
//			
	
		


		
		


	}

}
