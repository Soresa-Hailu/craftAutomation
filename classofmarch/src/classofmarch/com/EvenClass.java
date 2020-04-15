package classofmarch.com;

public class EvenClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<=50; i++) {
			
			if(i%2==1 ) 
			{
				if(i==11 || i==13) 
				{
					break;
				}
				System.out.println(i);
			}
		}
		
	}

}
