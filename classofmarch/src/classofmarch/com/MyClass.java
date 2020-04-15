package classofmarch.com;

public class MyClass {

	  public static int age =20;

	
	public static void methodOne()
	{
        int  j = 25;         //  <----------  local variable         
        System.out.println("Value of j:" + j);
        System.out.println("Value of age: " + age); 
      
	}
	
	
    public static void methodTwo()
    {
        int  k = 30;         //  <----------  local variable 
        System.out.println("Value of K: " + k);
        System.out.println("Value of age: " + age);   
       
    }
   

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		MyClass m1 = new MyClass();
//		
//		MyClass m2 = new MyClass(); 
		
		System.out.println("The value of age: " + (MyClass.age=30));
		
		MyClass.methodOne();
		MyClass.methodTwo();

		
	}

}
