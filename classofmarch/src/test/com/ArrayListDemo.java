package test.com;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		ArrayList li= new ArrayList();//Creating arraylist
		
//		list.add("messi");//Adding object in arraylist
//		list.add("3");
//		list.add("ronaldo");
//		list.add("rooney");
//		list.add("neymar");
//		list.add(1,"Soresa");
//		list.set(1, "name");
//		list.remove(1);
		
		
		for(int i =1; i<=5; i++) {
			li.add(in.nextLine());
		}
		
		
		System.out.println(li);
//		System.out.println(list.size());

		
//		
		//Traversing list through Iterator
		Iterator itr=li.iterator();
//		
		while(itr.hasNext())
		{
		String s =(String)itr.next();
		if(s.equals("five")) {
			li.remove("three");
		}
		
		System.out.println(itr.next());
		}
		
		System.out.println(li);
		
	}

}
