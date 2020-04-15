package classofmarch.com;



class PracticeClass1{
	
	//assignment implement this using scanner class
	
	
	 String name ="james";
	 int salary =1200;
	 double bonus = 230;
	 
	
	 
	 
	 public double total_salary() {
		 int age;
		 return salary+bonus;
		 
	 }
	 
	 public void methodOne() {
		 
		   int age;
	 }
	 
	 public void showMethod() {
	
		 int age;
		 System.out.println("The name of the employee is : " + name);//It display name
		 System.out.println("The salary of the employee is : " + salary);//
		 System.out.println("The bonus of the employee is : " + bonus);
		 System.out.println("The total salary of the employee is : " + total_salary());
		 
	 }
}

public class PracticeClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PracticeClass1 pc = new PracticeClass1();
		pc.showMethod();	
	}

}
