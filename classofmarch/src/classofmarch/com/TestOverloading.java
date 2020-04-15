package classofmarch.com;

class Adder{
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	static double add(double a, double b) {
		return a+b;
	}
	
	static double add(double a, double b, double c, double d) {
		return a+b+c+d;
	}
	
	
	
}



public class TestOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		System.out.println("The sum of  Two Integer values is : " + Adder.add());
//		System.out.println("The sum of Three Integer values is : " + Adder.add(23, 34, 11));
		System.out.println("The sum of Two Double values is : " + Adder.add(12.4, 33));
//		System.out.println("The sum of Two Double values is : " + Adder.add(a, b, c, d);
		
	}

}
