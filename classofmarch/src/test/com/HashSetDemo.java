package test.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set= new HashSet();
		set.add("Rooney");
		set.add("Messi");
		set.add("Ronaldo");
		set.add(" ");	
		set.add(" ");
		set.add("Martial");
		set.add("Martial");
		//Traversing elements
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
	}

}
