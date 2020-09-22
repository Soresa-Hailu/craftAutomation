package test.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> set = new LinkedHashSet();
		
		set.add("Rooney");
		set.add("Messi");
		set.add("Ronaldo");
		set.add("");
		set.add("Martial");
		
		Iterator<String> itr=set.iterator();
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
		
		 
		 
		 
	}

}
