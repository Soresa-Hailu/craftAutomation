package classofmarch2;

interface Mammals{
	public  final int id= 10;
	public abstract void Display();
}

 abstract class  Animal implements Mammals{

	 public abstract void Sound();
	 public void Display() {
		 System.out.println("Display anything");
	 }
	 
}
 
 class Dog extends Animal{
	 public void Sound() 
	 {
		 System.out.println("Woof");
	 }

 }

public class ClassTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d= new Dog();
		d.Sound();
		d.Display();
		System.out.println(Dog.id);
	}

}
