package classofmarch.com;




class Animal{
	String Color ="Black";
	
	public void eat() {
		System.out.println("Inside Animal class ");
	}
	
}




public class Dog extends Animal {

	String Color ="White";
	
	@Override
	public void eat() {
		System.out.println("Inside Dog Class");
	}
	
	
	public void Display() {
		System.out.println("Color: " + Color);
		System.out.println("Color: " + super.Color);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d=  new Dog();
		d.eat();
		d.Display();
		
	}

}
