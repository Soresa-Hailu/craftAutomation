package classofmarch.com;

public class Calculator {
	
	
	public static int add(int a, int b) {
		
		return a+b;
	}
    
	public static int multi(int a, int b) 
	{
		
		return a*b;
	}
	
	public static int sub(int a, int b)
	{
		return a-b;
	}
	
	public static double div(int a, int b) 
	{
		return a/b;
	}
	
	public static double mod(int a, int b) 
	{
		return a%b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Calculator.add(11, 13));
		System.out.println(Calculator.multi(11, 13));
		System.out.println(Calculator.sub(11, 13));
		System.out.println(Calculator.div(10, 2));
		System.out.println(Calculator.mod(13, 11));
	}

}
