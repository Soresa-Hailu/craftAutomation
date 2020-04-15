package classofmarch.com;

import java.util.Scanner;

public class ControlStmtExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Pls enter your age: ");
		
		int age = in.nextInt();
		
		if(age<=18) 
		{
			
			System.out.println("under age");
		}
		else
		{
			System.out.println("you are in");
		}
		
	}

}
