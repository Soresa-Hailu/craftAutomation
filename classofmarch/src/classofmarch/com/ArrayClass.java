package classofmarch.com;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Scanner in = new Scanner(System.in);
//        System.out.println("pls enter the size of an array");
//        int arraySize = in.nextInt();
//        
//        
//        int nameOfStudent[] = new int[arraySize];
//        
//        System.out.println("pls enter the element of an array");
//        for(int i=0; i<nameOfStudent.length; i++) {
//       	 System.out.println("the element input at index : "+ i + " is " + (nameOfStudent[i]= in.nextInt()));
//        }
//        System.out.println();
//        
//       for(int j=0; j<nameOfStudent.length; j++) {
//       	System.out.println("the element output at index : "+ j + " is " +nameOfStudent[j]);
//       }
		
		
		 String[] nameOfCommon = new String[60];   //0-59
         nameOfCommon[0]="Sozit";
         nameOfCommon[1]="Adane";
         nameOfCommon[2]="Ak";
         nameOfCommon[3]="ANTENH";
         nameOfCommon[4]="ayalew";
         
         //1,2,3
         
         for(int i=0; i<nameOfCommon.length; i++) {
        	 System.out.println(nameOfCommon[i]); 
         }
         
         System.out.println();
         
         
        
        
        System.out.println();
        
        char[] val = {'A','B','C','D'};//0-3
        
        for(int k=0; k<val.length; k++) {
        	System.out.println(val[k]);
        }
        
        
        System.out.println();
         
        int[] ageOfStudent = {101,11,112,13,14,15,16,17,18,19,20};
        
        Arrays.sort(ageOfStudent);
        for(int n:ageOfStudent) 
        {
        	
        	System.out.println(n);
        }
        
        
        System.out.println();
        
        for(int m=0; m<ageOfStudent.length; m++) 
        {
        	System.out.println(ageOfStudent[m]);
        }
        
//         System.out.println(nameOfCommon[0]);
//         System.out.println(nameOfCommon[1]);
//         System.out.println(nameOfCommon[2]);
//         System.out.println(nameOfCommon[3]);
	}

}
