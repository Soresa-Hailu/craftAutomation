package classofmarch.com;

public class OperatorsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=20, b=25;
		int c =a+b;
		int d = a*b;
		double e = a/b;
		int f  = b-a;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
				
		
		int  x   = 21;
		int   result1   =  x %  2  ;   //The result  is 1
		int   result2  =  x % 3; 
		
		System.out.println(result1);
		System.out.println(result2);
		
		int k=42;
		
    	int l = k++;
//		int l = k--;
		
		System.out.println(k); //41
		System.out.println(l); //42
		
		System.out.println();
		
		int i = 40;
		
//		int j= ++i;
		int j= --i; 
		
		System.out.println(i);//39
		System.out.println(j); //39
	
		
		int m =11;
		int n =11;
		
		boolean p = m <= n;
		System.out.println(p);
		
				
		int  num1   =  110;
		int  num2   =  30;
		int  num3   =  45;

		if((num1<=num2 )&&(num1==num3)) 
		{
		  System.out.println("The greatest of three numbers is:" + num1);
		}
		else {
			System.out.println("Some expressions");
		}
		
		int number=10;
		String result;
		result=(number<=0) ? "Negative" : "Postive";
		System.out.println("The number is " + result);
		
		
		if(number<=0) {
			System.out.print("Negative");
		}
		else {
			System.out.print("postive");
		}

		
	}

}
