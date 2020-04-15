package classofmarch.com;

import java.util.Scanner;

public class AcceptDataFromUser {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		System.out.println("pls enter the size of an array:");
		int arraySize = in.nextInt();
		
		String[] nameofStudent = new String[arraySize];
		
		System.out.println("pls enter the elements of an array");
		
		for(int i=0; i<nameofStudent.length; i++) 
		{
			
			System.out.println("the element at index : " + i + " is "+(nameofStudent[i]= in.next()));
		}
		
		
		System.out.println();
		
		
//		for(String elt:nameofStudent ) {
//			System.out.println(elt);
//		}
		
		for(int j=0; j<nameofStudent.length; j++) 
		{
			System.out.println(nameofStudent[j]);
		}
		
		
		
		
		
	}

}
