package classofmarch.com;

import java.util.Scanner;

public class ControlStmtExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
			System.out.println("Pls enter your number: ");
			 double number = input.nextDouble();	
			 
	
//		if(number%2 ==0 ) 
//		{
//			
//			System.out.println("you enter even number");
//		}
//		else 
//		{
//			System.out.println("you enter odd number");
//		}
		
		
		String output = (number%2==0)? "you entered even number" : "you entered odd number";
		
		System.out.println(output);
		
	}

}
