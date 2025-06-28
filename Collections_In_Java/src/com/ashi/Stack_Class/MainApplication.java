package com.ashi.Stack_Class;

import java.util.Stack;

public class MainApplication {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		System.out.println("init capacity :"+stack.capacity()); //10
		//Pushes an item onto the top of this stack. This has exactly the same effect as:

		 //addElement(item)
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		stack.push("F");
		stack.push("G");
		stack.push("H");
		stack.push("I");
		stack.push("J");
		stack.push("K");
		
		
		
	
		System.out.println("stack +"+stack);
	
		System.out.println(stack.pop());
//		Returns:
//			The object at the top of this stack (the last item of the Vector object).
//		Throws:
//			EmptyStackException - if this stack is empty.
		
		System.out.println("stack +"+stack);
		System.out.println("peek() :"+stack.peek()); //EmptyStackException - if this stack is empty.

		
		System.out.println("search :"+stack.search("B"));//the 1-based position from the top of the stack where the object is located; the return value -1 indicates that the object is not on the stack.
	}

}
