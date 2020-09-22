package test.com;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> deque = new ArrayDeque();
		
		deque.add("CR7");
		deque.add("john legend");
		deque.add("messi");
		
		deque.addFirst("CR71");
		deque.addLast("qwerty");
		
		
		deque.pollFirst();//CR71
		deque.pollLast();//qwerty

		

		//Traversing elements
		for (String str : deque) 
		{
		System.out.println(str);
		}
		
//		System.out.println();
//		
//		Iterator it = deque.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
	}

}
