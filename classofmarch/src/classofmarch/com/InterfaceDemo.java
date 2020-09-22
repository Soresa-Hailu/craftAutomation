package classofmarch.com;



interface MyInterface {
	
	public int age=20;
	
	public void method1();
	public void method2();
	
	public default void method3() {
		System.out.println("method3 in interface");
	}
	
}


public class InterfaceDemo implements MyInterface {

	@Override
	public void method1() {
		System.out.println("implementation of method1");
	}
	
	@Override
	public void method2() {
		System.out.println("implementation of method2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceDemo it= new InterfaceDemo();
		it.method1();
		it.method2();
		it.method3();
		
	}

}
