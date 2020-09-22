package classofmarch.com;

public class ErrorHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try 
		{
			System.out.println(5/0);
			
			String value= "abc";
			int num = Integer.parseInt(value);
			System.out.println(num);
			
			int a[] = new int[5];
			System.out.println(a[6]=7);
			
			
			
			String name= null;
			System.out.println(name.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
		finally {
			System.out.println("everything is fine!!");
		}
		
		
	}

}
