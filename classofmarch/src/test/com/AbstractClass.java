package test.com;


interface Animal2{
	
}
interface Animal{
	
	public  int age= 2;
	public void travel();
	public void eat();
}


 abstract class Mammals {
	
	 private String name;
	 private int age;
	 
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public abstract void sound();
	
	public void Display() {
		System.out.println("Inside Animal class");
		System.out.println(getName());
		System.out.println(getAge());
		
	}
}

class Dog extends Mammals implements Animal, Animal2{
	
	
	public void sound() {
		System.out.println("woof");
	}
	public void eat() {
		System.out.println("Animal can eat");
	}
	public void travel() {
		System.out.println("Animal can travel");
		
	}

}



public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Dog d = new Dog();
		d.setName("jackey");
		d.setAge(2);
		d.Display();
		d.sound();
		d.eat();
		d.travel();
	}

}
