package classofmarch.com;

public class ClassOne {

	private String fname;
	private String lname;
	private int age;
	private double salary;
	private double bonus;
	
//	 EncapsulationDemo(){
//		
//	}
	
	
//	EncapsulationDemo()
//	{
//		fname ="one";
//		lname ="two";
//		age = 20;
//		salary = 2000;
//		bonus = 2344;
//		
//	}
	
	public ClassOne(String fname, String lname, int age, double salary, double bonus)
	{
		this.fname =fname;
		this.lname =lname;
		this.age = age;
		this.salary = salary;
		this.bonus = bonus;
		
	}
	
	
	public String getFname() {
		return fname;
	}	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		if(age>=18) 
		{
			this.age = age;
		}
		
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	
}
