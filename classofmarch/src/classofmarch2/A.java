package classofmarch2;

import classofmarch.com.ClassOne;

 class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ClassOne encap = new ClassOne("james","Abebe",22,22345,234);
	
		System.out.println(encap.getFname());
		System.out.println(encap.getLname());
		System.out.println(encap.getAge());
		System.out.println(encap.getSalary());
		System.out.println(encap.getBonus());
		
	}

}
