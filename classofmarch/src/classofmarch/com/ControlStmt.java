package classofmarch.com;

public class ControlStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		while(i<0)
		{
			System.out.println("Inside while loop: " +i);
			i++;
		}
		
		System.out.println();
		
		for(int j=1; j<0; j++) 
		{
			System.out.println("Inside for loop: " +j);
		}
		
		System.out.println();
		
		int k =1;
		do {
			System.out.println("Inside do-while loop: " +k);
			k++;		
		}while(k<0);
		
		
		
	}

}
