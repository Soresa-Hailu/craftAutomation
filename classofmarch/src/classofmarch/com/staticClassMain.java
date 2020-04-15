package classofmarch.com;

 class EmpClass1 {
	 
	  static String city ="New York";
	  String  name = "Mohammed Ismail";
	  int  age = 30;
	  
	}
public class staticClassMain {
	public static void main(String args[])
	{ 
//	  System.out.println("city:"+EmpClass1.city);
	  
	  
	//  System.out.println("name:"+EmpClass1.name);
	//  System.out.println("age:"+EmpClass1.age);
	  
	  EmpClass1   emp1 = new EmpClass1();
	  
	  emp1.city="Addis Ababa";
	  emp1.name = "Mohammed I";
	  
	  
	  System.out.println("city:"+emp1.city);     // EmpClass1.city
	  System.out.println("name:"+emp1.name);
	  System.out.println("age:"+emp1.age);
	  
	  System.out.println("----------------------");
	  
	  
    EmpClass1   emp2 = new EmpClass1();
	  
	  System.out.println("city:"+emp2.city);    // EmpClass1.city
	  System.out.println("name:"+emp2.name);
	  System.out.println("age:"+emp2.age);
	  }
}

