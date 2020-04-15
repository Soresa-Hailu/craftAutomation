package classofmarch.com;


class Human{
	
	  String color = "White";
	
	public  void eat() 
	{
		System.out.println("Human is eating");
		
	}
}


public class Boy extends Human{

	
	String color = "Red";
	
	@Override
	public void eat() {
		System.out.println("Boy is  eating");
	}
	
	public void Display() {
		eat();
		super.eat();
		System.out.println("Inside Boy Class: " + color);
		System.out.println("Inside Human Class: " + super.color );
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boy b = new Boy();
		b.Display();
	}

}
