package test.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class empClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> li = new ArrayList();
		Map<Integer, Employee> m = new HashMap();
		
		Employee emp1 = new Employee();
		 
		  emp1.setEmpId(100);
		  emp1.setEmpName("Hanif");
		  emp1.setEmpSalary(30000.56);
		  li.add(emp1);
		  m.put(100, emp1);
		  
		  Employee  emp2 = new Employee();
		  
		  emp2.setEmpId(200);
		  emp2.setEmpName("Mohammed Iqbal");
		  emp2.setEmpSalary(15000.67);
		  li.add(emp2);
		  m.put(200, emp2);
		  
//		  System.out.println(emp1.getEmpId()+" "+emp1.getEmpName()+ " "+emp1.getEmpSalary());
//		  System.out.println(emp2.getEmpId()+" "+emp2.getEmpName()+ " "+emp2.getEmpSalary());
		  
		  
//		  
//		  for(Employee emp: li ) {
//			  System.out.println(emp.getEmpId()+" "+emp.getEmpName()+ " "+emp.getEmpSalary());
//		  }
		  


//		Employee e = m.get(100);
//		System.out.println(e.getEmpId()+" "+e.getEmpName()+ " "+e.getEmpSalary());
		
		
		Set s= m.entrySet();
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			
			Map.Entry me= (Map.Entry)it.next();
			  System.out.print(me.getKey() + " ");
			  Employee e1 = (Employee) me.getValue();
			  System.out.println(e1.getEmpId()+" "+e1.getEmpName()+ " "+e1.getEmpSalary());
		}
		
	}

}
