package classofmarch.com;



abstract class myclass{
	
	public void Display() {
		System.out.println("Inside Abstract class");
	}
	public abstract void Display2();
	
}

class myclass2 extends myclass{
	
	@Override
	public void Display2()
{
		System.out.println("Disp2 method overrided inside myclass2");
		
}
	
	public void eat() {
		System.out.println("eat method inside myclass2");
	}
}


public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myclass2 my = new myclass2();
		
		my.Display();
		my.Display2();
		my.eat();
		
		
	}

}
