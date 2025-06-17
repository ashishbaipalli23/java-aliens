package com.ashi.IterableandCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MainApplication {

	public static void main(String[] args) {

		/*
		 * List<Integer> numList = new ArrayList<Integer>(); numList.add(1);
		 * numList.add(2); numList.add(3); numList.add(4); numList.add(5);
		 * Iterator<Integer> iterator = numList.iterator();
		 * 
		 * while (iterator.hasNext()) { Integer num = iterator.next();
		 * System.out.println(num); if(num == 3 ) { iterator.remove(); } }
		 * 
		 * System.out.println(numList);
		 */

		Collection<Integer> nuIntegers = new ArrayList<Integer>();
		nuIntegers.add(1);
		nuIntegers.add(2);
		nuIntegers.add(3);
		nuIntegers.add(4);
		nuIntegers.add(5);

		System.out.println(nuIntegers);
		System.out.println(nuIntegers.size());
		System.out.println(nuIntegers.contains(5));
		System.out.println(nuIntegers.remove(2));
		System.out.println(nuIntegers);

		System.out.println(nuIntegers.isEmpty());

		System.out.println("Before Clear :" + nuIntegers);

		// nuIntegers.clear();

		System.out.println("After Clear :" + nuIntegers);

		Object[] array = nuIntegers.toArray(); // list items to OBJECT ARRAY
		System.out.println(array);
		System.out.println(Arrays.toString(array));

		Integer[] array2 = nuIntegers.toArray(new Integer[1]);
		System.out.println(Arrays.toString(array2));

		Integer[] array3 = nuIntegers.toArray(Integer[]::new);
		System.out.println(Arrays.toString(array3));

		// addAll()

		List<Integer> n1 = List.of(1, 2, 3);
		List<Integer> n2 = List.of(11, 22, 33);

		List<Integer> n3 = new ArrayList<Integer>();
		n3.addAll(n1);
		n3.addAll(n2);

		System.out.println(n3);

		// removeAll()

		n3.removeAll(n1); // n1 items removed from the n3 list
		System.out.println(n3);

		// retainAll()
		n3.retainAll(n2); // Retains only the elements in this list that are contained in the specified
							// collection (optional operation). In other words, removes from this list all
							// of its elements that are not contained in the specified collection
		System.out.println(n3);
		
		//removeIf(Predicate<I>)
		
		Collection<Integer> numList1 = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
		System.out.println(numList1);
		//remove all the even numbers
		numList1.removeIf(num -> (num & 1)  == 0);
		
		System.out.println(numList1);
		
		System.out.println(numList1.hashCode());
		//. In particular, c1.equals(c2) implies that c1.hashCode()==c2.hashCode().
	
	}

}
