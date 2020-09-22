package test.com;



import java.util.*;
import java.util.Iterator;
import java.util.Stack;


//Cr7    //
//james   //
//craft  //
//John   // 
//SORESA //

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stack = new Stack();
		
		stack.push("Soresa");
		stack.push("john");
		stack.push("Craft");
		stack.push("james");
		stack.push("CR7");
		
		System.out.println("Elements of the stack");
		
		Iterator itr=stack.iterator();
		
	
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}	
		
		

		stack.pop();// CR7
		stack.pop();// james

		
		System.out.println("Elements of the stack after pop");	
		Iterator itr1=stack.iterator();
		
	
		
		while(itr1.hasNext())
		{
		System.out.println(itr1.next());
		}
		
	}

}
