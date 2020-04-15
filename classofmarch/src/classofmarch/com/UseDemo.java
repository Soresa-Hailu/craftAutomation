package classofmarch.com;


class Demo{
	
	public void show(int number) {
	System.out.println("In int " + number);	
	}
	
	public void show(String name) {
		System.out.println("In String " + name);
	}
	
	public void show(byte by) {
		System.out.println("In byte " + by);
	}
	
	
}

public class UseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d = new Demo();
		d.show(12345);
		d.show("Soresa");
		d.show(12);
		

	}

}
