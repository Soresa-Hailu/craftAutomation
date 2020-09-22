package classofmarch.com;

import java.util.ArrayList;
import java.util.*;

class Employee{
	
	private int empId;
	private String empName;
	private double empSalary;
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
}


public class empClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> list = new ArrayList();
		Map<Integer,Employee> m = new HashMap();
		
		Employee emp1 = new Employee();
		emp1.setEmpId(100);
		emp1.setEmpName("EmployeeOne_Name");
		emp1.setEmpSalary(12345.345);
		list.add(emp1);
		m.put(111, emp1);	
		
		Employee emp2 = new Employee();
		emp2.setEmpId(200);
		emp2.setEmpName("EmployeeTwo_Name");
		emp2.setEmpSalary(123456.234);
		list.add(emp2);
		m.put(222, emp2);
		
//		for(Employee emp: list) {
//			System.out.println(emp.getEmpId()+" "+emp.getEmpName()+ " "+emp.getEmpSalary());
//		}
		
//		Employee e2 = m.get(111);
//		System.out.println(e2.getEmpId()+" "+e2.getEmpName()+ " "+e2.getEmpSalary());
		
		  Set s= m.entrySet();
		  
			Iterator it = s.iterator();
			
				while(it.hasNext()) 
				{
				Map.Entry me= (Map.Entry)it.next();
				  System.out.print(me.getKey() + " ");
				  Employee e1 = (Employee) me.getValue();
				  System.out.println(e1.getEmpId()+" "+e1.getEmpName()+ " "+e1.getEmpSalary());	
			}

		
//		System.out.println(emp1.getEmpId()+" "+emp1.getEmpName()+ " "+emp1.getEmpSalary());
//		
//	    System.out.println(emp2.getEmpId()+" "+emp2.getEmpName()+ " "+emp2.getEmpSalary());
		
	}

}
