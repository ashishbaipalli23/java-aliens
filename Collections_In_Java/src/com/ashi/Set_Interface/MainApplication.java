package com.ashi.Set_Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApplication {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>(List.of("A", "B", "C", "A", "E", "F"));

		System.out.println(set); // duplicates not allowed

		// add()
		// set.add(null);//null's allowed

		System.out.println(set);

		System.out.println("Size : " + set.size());

		// isEmpty()
		System.out.println("isEmplty() : " + set.isEmpty());
		// contains()
		System.out.println("contains() :" + set.contains("A"));

		// iterator()

		Iterator<String> iterator = set.iterator();
		// set.add("K");//=> ConcurrentModificationException
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);

			if (string.equals("A")) { // if set containes null..Then NullPointerException
				iterator.remove();
			}

		}

		System.out.println("set after iterator :  " + set);

		for (String ch : set) {
			// set.add("Y"); -> ConcurrentModificationException
			if (ch.equals("F")) {
				set.remove("F");
				set.add("Y");// no exception
			}
		}

		System.out.println("set after For :  " + set);

		// Set.of()

		/*
		 * Unmodifiable Sets The Set.of and Set.copyOf static factory methods provide a
		 * convenient way to create unmodifiable sets. The Set instances created by
		 * these methods have the following characteristics:
		 * 
		 * They are unmodifiable. Elements cannot be added or removed. Calling any
		 * mutator method on the Set will always cause UnsupportedOperationException to
		 * be thrown. However, if the contained elements are themselves mutable, this
		 * may cause the Set to behave inconsistently or its contents to appear to
		 * change. They disallow null elements. Attempts to create them with null
		 * elements result in NullPointerException. They are serializable if all
		 * elements are serializable. They reject duplicate elements at creation time.
		 * Duplicate elements passed to a static factory method result in
		 * IllegalArgumentException. The iteration order of set elements is unspecified
		 * and is subject to change. They are value-based. Programmers should treat
		 * instances that are equal as interchangeable and should not use them for
		 * synchronization, or unpredictable behavior may occur. For example, in a
		 * future release, synchronization may fail. Callers should make no assumptions
		 * about the identity of the returned instances. Factories are free to create
		 * new instances or reuse existing ones. They are serialized as specified on the
		 * Serialized Form page.
		 */

//		
//		Set<Integer> set1 = Set.of(1,2,3,4,5,3,2);
//		System.out.println(set1);// java.lang.IllegalArgumentException: duplicate element: 3
//		
		Set<Integer> set1 = Set.of(1, 2, 4, 5, 3); // Returns an unmodifiable set containing five elements. See
													// Unmodifiable Sets for details.
		System.out.println(set1);
		// set1.remove(1);// UnsupportedOperationException

		// set1.add(12); // UnsupportedOperationException

		Collection<Integer> collection = new ArrayList<Integer>();
		collection.add(1);
		collection.add(2);
		collection.add(1);

		// collection.add(null); //NullPointerExecption
		Set<Integer> set2 = Set.copyOf(collection);
		System.out.println(set2);

		List<Integer> list = List.of(1, 1, 2, 3, 1, 1, 2, 3);
		Set<Integer> copyOf = Set.copyOf(list);

		// remove duplicates from the list

		System.out.println("copyOf : " + copyOf);

		String string = "asdauuii";
		
		// remove duplicates
		List<Character> collect = string.chars().mapToObj(s -> (char) s).collect(Collectors.toList());
		Set<Character> copyOf2 = Set.copyOf(collect);
		System.out.println(copyOf2);
		String collect2 = copyOf2.stream().map(String::valueOf).collect(Collectors.joining());
		System.out.println(string);
		System.out.println(collect2);
	}

}
