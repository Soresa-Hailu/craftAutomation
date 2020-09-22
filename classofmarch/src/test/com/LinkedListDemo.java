package test.com;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList al= new LinkedList();
		
		al.add("messi");
		al.add("ronaldo");
		al.add("ronaldo");
		al.add(" ");
		al.add(" ");
		al.add("rooney");
		al.add("neymar");
		al.add(0,23);
		
		
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
	}

}
