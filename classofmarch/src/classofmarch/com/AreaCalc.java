package classofmarch.com;

public class AreaCalc {

	 public double calcArea(int length, int weidth) {
		 
		 double recArea = length*weidth;
		 return recArea;
	 }
	
	 public double calcArea(int radius) {
		 
		 double ciArea = 3.14* radius* radius;
		 return ciArea;
	 }
	 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AreaCalc     ar =   new AreaCalc();
		
		double  rarea  = ar.calcArea(12,14);
		System.out.println("Area of rectangle: " + rarea);
		 
		 double  cArea   = ar.calcArea(10);
		 System.out.println("Area of  circle :" + cArea);

		
		
	}

}
