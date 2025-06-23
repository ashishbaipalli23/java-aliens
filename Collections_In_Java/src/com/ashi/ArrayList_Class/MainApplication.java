package com.ashi.ArrayList_Class;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {
	public static void main(String[] args) {

		// methods that are not in List<I>
		/*
		 * | Method Signature                                                             | Description                                                 |
| ---------------------------------------------------------------------------- | ----------------------------------------------------------- |
| `public void trimToSize()`                                                   | Reduces capacity to current size (optimize memory).         |
| `public void ensureCapacity(int minCapacity)`                                | Ensures internal array can hold `minCapacity` elements.     |
| `protected void removeRange(int fromIndex, int toIndex)`                     | Removes a range of elements; protected and used internally. |
| `boolean batchRemove(Collection<?> c, boolean complement, int from, int to)` | Internal method to batch remove or retain.                  |
| `boolean equalsRange(List<?> other, int from, int to)`                       | Internal method to compare a range of elements.             |
| `int hashCodeRange(int from, int to)`                                        | Calculates hash code for subrange of list.                  |
| `boolean removeIf(Predicate<? super E>, int, int)`                           | Internal range-based version of `removeIf`.                 |
| `void checkInvariants()`                                                     | Internal integrity checker (debugging/testing).             |
| `static <E> E elementAt(Object[] array, int index)`                          | Utility method to get element from array safely.            |
| `E elementData(int index)`                                                   | Internal method to access backing array directly.           |

		 * */
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.add(4);

		System.out.println("Array List :" + numList);

		// Trims the capacity of this ArrayList instance to be the list's current size.
		// An application can use this operation to minimize the storage of an ArrayList
		// instance.
		numList.trimToSize();
		System.out.println("" + numList.size());

		// Increases the capacity of this ArrayList instance, if necessary, to ensure
		// that it can hold at least the number of elements specified by the minimum
		// capacity argument.
		numList.ensureCapacity(10);
		
		
		//removeRange() not works
		
		List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		list.subList(1, 4).clear();  // Internally calls removeRange(1, 4)
		System.out.println(list);   // Output: [1, 5]


		//removeIf()
		System.out.println("Array List before:" + numList);
		numList.removeIf(e -> e%2 == 0);
		System.out.println("Array List after  :" + numList);
		
	
		ArrayList<Integer> list1 = new ArrayList<Integer>(List.of(33,44,22,33,22,3));
		
		List<Integer> subList = list1.subList(1, 4);
		subList.clear();
		//list1.add(2222); -> will throw  concurrent modification exception 
		System.out.println("sub list :" + subList);
		System.out.println(list1);
		
		
		

	}
}
