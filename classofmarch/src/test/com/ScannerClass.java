package test.com;

import java.util.*;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in= new Scanner(System.in);
		
		ArrayList li =new ArrayList();
		
		System.out.println("Pls enter your arrayList element:");
		
		for(int i=1; i<=6; i++) {
			li.add(in.nextLine());
		}
		
		System.out.println("\n" + li +"\n");
		
		
		Iterator it= li.iterator();
		
		while(it.hasNext()) {
			
			
			String s = (String)it.next();
			
			if(s.equals("four")) {
				it.remove();
			}
			
		}
		
		System.out.println(li);
		
		
	}

}
