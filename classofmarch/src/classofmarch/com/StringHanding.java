package classofmarch.com;

public class StringHanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		
		String name = "Soresa";
////		
		name.concat(" Hailu"); //Soresa Hailu
////		
		System.out.println("My name is : " + name);
		
		String strnew = "I" + " Like" + " Java" + " Language";
		System.out.println(strnew);
		
		int len = strnew.length();
		System.out.println("---------");
		System.out.println(len);
		
		
		//in.next().charAt(0);
		
		String str = "This is Hanif";
		System.out.println(str.charAt(4));
		
//		System.out.println("---------");
		
		String str1 = "Ismail";
		 String str2 = "Ismail";
		if(str1.equals(str2))
		{
		   System.out.println("The two strings are EQUAL");
		}
		else { 
		System.out.println("The two strings are NOT equal");
		}

		
		String str1 = "567867A5V6";
		  char ch;  
		  for(int i = 0;i<str1.length();i++)
		  {
		       ch = str1.charAt(i);
		       System.out.println(ch);
		       if(Character.isLetter(ch)){
		          continue;
		          }
		        else{
		          System.out.println("String contains NON Letter");
		         }
		}

		String str2  =  "Today is holiday Tomorrow is working day";
				int len_value = str2.indexOf("holiday");
				System.out.println("Index values :" + len_value);
				
				System.out.println(str2.substring(9, 27));
		
		String[] strArray = str2.split(" ");
		System.out.println("Result");
		System.out.println("------");
		System.out.println(str2);
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		
		String str1 = "Abul";

		String str2 = "Abdul123456";
		
		System.out.println(str2.compareTo(str1));
		
		
		String str = "                         Hello world.                                  ";
		System.out.println(str);
		
		System.out.println(str.trim());
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		StringBuffer str = new StringBuffer("Hello");
		
		System.out.println(str.insert(5, " World"));
		
		
		

	}
	
	

}
