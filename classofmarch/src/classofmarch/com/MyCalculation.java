package classofmarch.com;

class B{
	
	public void run() 
	{
		System.out.println("Inside B class");
	}
	
}


class Calculation extends B {
	   int z;
	   
	   public void run() {

		   System.out.println("Inside Calculation class");
	   }
	   
	   public void addition(int x, int y) {
	      z = x + y;
	      System.out.println("The sum of the  given numbers:" + z);
	   }
	   
	   public void Subtraction(int x, int y) {
	      z = x - y;
	      System.out.println("The difference between the given numbers:" + z);
	   }
	}


public class MyCalculation extends Calculation {
	
	public void multiplication(int x, int y) {
	      z = x * y;
	      System.out.println("The product of the given numbers:" + z);
	        }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCalculation calc = new MyCalculation ();
		
		int a=10, b=20;
		calc.addition(a,b);
		calc.Subtraction(a, b);
		calc.multiplication(a, b);
		calc.run();
		
//		Calculation calc1 =  new Calculation();
//		calc1.addition(a, b);
//		calc1.Subtraction(a, b);
//		calc1.multiplication(a, b);
		
	}

}
