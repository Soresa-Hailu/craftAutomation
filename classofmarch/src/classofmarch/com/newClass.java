package classofmarch.com;

public class newClass {

	public static void main(String[] args) {
		String one ="Qswert";

		char ch;
		for(int i=0; i<one.length();i++) {
			ch=one.charAt(i);
			
			if(Character.isLetter(ch)) {
				
			Character.toLowerCase(ch);
			System.out.print(ch);
			}
			else {
				System.err.println("Invalid input");
			}
			
		}
		
		
		
		
		
	}
	
}


