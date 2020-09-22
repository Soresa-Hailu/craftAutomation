package classofmarch.com;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String name = "Soresa";
//		
//		name.concat(" Hailu");
//		
//		System.out.println(name);
//		
//		String str1 = new String("This is a new string");
//		System.out.println(str1);
//		
//		String strnew = "I" + " Like" + " Java" + " Language";
//		System.out.println(strnew);
//		
//		int len = strnew.length();
//		System.out.println("Lenth of string is: " + len);
//		
//		String  str2 = "This is Hanif";
//		System.out.println(str1.charAt(4));
//			
//		String str3 = "Ismail";
//	    String str5 = "Ismail";
//		if(str3.equals(str5))
//		{
//		   System.out.println("The two strings are EQUAL");
//		}
//		else { 
//		System.out.println("The two strings are NOT equal");
//		}
		
		
//		String strDigital ="567867A56";
//		char ch;
//		for(int i=0; i<strDigital.length();i++) {
//		
//			ch = strDigital.charAt(i);
//			System.out.println(ch);
//			if(Character.isDigit(ch)) {
//				continue;
//			}
//			else {
//				System.out.println("String contains NON digits");
//			}
//			
//		}
		
		
//		String one =  "This is Ethiopia";
//		System.out.println(one.indexOf("Ethiopia"));
//		
//		System.out.println(one.substring(3,16));
		
		
//		String two  = "today is holiday tomorrow is working day";
//		String[] three = two.split(" ");
//		
//		System.out.println("Result:");
//		System.out.println("-------\n");
//		
//		for(int i = 0; i<three.length; i++) {
//			
//			System.out.println(three[i]);
//		}
		
//		String one= "ab";
//		String two= "AB";
//		int comp= one.compareTo(two);
//		System.out.println(comp);
		
		
		
		String str1 = "James";
		String str2 = str1.replace('J', 'H');
		
		
		System.out.println(str2);
		
		String str3  = " Hello World ";
		String str4 = str3.trim();
		
		System.out.println("--------");
		
		System.out.println(str3);
		System.out.println(str4);
		
		String  str5 = str1.toUpperCase();
		String  str6 = str1.toLowerCase();
		
		System.out.println("--------");
		
		System.out.println(str5);
		System.out.println(str6);
		
		
		System.out.println("--------");
		
		StringBuffer bff= new StringBuffer("Hello");
		bff.insert(5, " World");
		System.out.println(bff);
		

		
		
	}

}
