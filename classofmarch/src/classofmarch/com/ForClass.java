package classofmarch.com;

public class ForClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum =0;
		int i;
		for(i=0;i<=10; i++) 
		{
			
			sum = sum+i;
			
			
			if(sum>30) {
				break;
			}
		}
		System.out.println("the sum of the number is : " + sum);
		
	}

}
