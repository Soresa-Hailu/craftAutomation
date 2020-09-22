package classofmarch.com;

import java.util.Scanner;

public class sumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("pls enter the length of the array:");
		int len = in.nextInt();
	    System.out.println("Pls enter the element of array:");
	    int[] sumArray = new int[len];
	    
	    for(int i=0; i<sumArray.length; i++) {
	    	sumArray[i] = in.nextInt();
	    }
	    
	    System.out.println(oddEvenSum(sumArray));
	    
		
	}
	private static int oddEvenSum(int[] a) {
		
	int x= 0;
	int y = 0;
	
	for(int i=0; i<a.length; i++) {
		if(a[i]%2 != 0) {
			x=x+a[i];
		}
		else {
			y=y+a[i];
		}
	}
	return x-y;
		
	}

}
