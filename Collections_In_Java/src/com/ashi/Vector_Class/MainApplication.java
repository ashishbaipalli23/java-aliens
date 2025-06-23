package com.ashi.Vector_Class;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class MainApplication {

	 public static void main(String[] args) {
		
		 
		 Vector<Integer> numIntegers = new Vector<Integer>();
		 numIntegers.add(10);
		 numIntegers.add(11);
		 numIntegers.add(12);
		 
		 System.out.println(numIntegers);
		 
		 Enumeration<Integer> elements = numIntegers.elements();
		 while (elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
	
		}
		 //new method interduced in java 9 in Enumeration<I>
		 //asItertor()
		 Enumeration<Integer> elements1 = numIntegers.elements();
		 Iterator<Integer> asIterator = elements1.asIterator();
		 while (asIterator.hasNext()) {
			System.out.println(asIterator.next());
			
		}
		 
		 //elementAt()
		 Integer elementAt = numIntegers.elementAt(1);
		 System.out.println("element at index 1: "+elementAt);
		 
		
		 System.out.println("size : "+numIntegers.size());
		 System.out.println("capacity : "+numIntegers.capacity());
		 
		 numIntegers.ensureCapacity(20);
		 System.out.println("ensureCapacity(20); capacity : "+numIntegers.capacity());
		 
		 
		 numIntegers.trimToSize(); //size() will come here
		 System.out.println(" numIntegers.trimToSize() => capacity : "+numIntegers.capacity());
		 
		
		 
		 
		 numIntegers.addElement(elementAt);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}














