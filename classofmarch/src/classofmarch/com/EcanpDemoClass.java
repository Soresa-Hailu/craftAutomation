package classofmarch.com;

import java.util.Scanner;

class EncapsulationDemo{
	
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
	
	EncapsulationDemo(String fname, String lname, int age, double salary, double bonus)
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
	
	 private class EncapDemo{
		 
		 //imnplementation
		 
	 }
	
	
	
	
}



 public class EcanpDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EncapsulationDemo encap = new EncapsulationDemo("james","Abebe",22,22345,234);
		
		Scanner in = new Scanner(System.in);
		
//		EncapsulationDemo encap2 = new EncapsulationDemo(23);
		
//		encap.setFname("James");
//		encap.setLname("jone");
//		encap.setAge(23);
//		encap.setSalary(30000);
//		encap.setBonus(2000);
		
		System.out.println(encap.getFname());
		System.out.println(encap.getLname());
		System.out.println(encap.getAge());
		System.out.println(encap.getSalary());
		System.out.println(encap.getBonus());
		
		
	}

}
