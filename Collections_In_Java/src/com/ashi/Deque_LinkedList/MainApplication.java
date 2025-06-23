package com.ashi.Deque_LinkedList;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainApplication {

	public static void main(String[] args) {

		Deque<Integer> numDeque = new LinkedList<Integer>();

		// insert
		numDeque.offer(101);
		numDeque.offer(102);
		numDeque.offer(103);
		numDeque.offer(103);

		numDeque.offerFirst(111);
		numDeque.offerLast(999);

		System.out.println(numDeque);

		// remove
		System.out.println(numDeque.poll()); // Retrieves and removes the head of the queue represented by this deque
												// (in other words, the first element of this deque), or returns null if
												// this deque is empty.
		System.out.println(numDeque.pollFirst());// Retrieves and removes the first element of this deque, or returns
													// null if this deque is empty.
		System.out.println(numDeque.pollFirst());// Retrieves and removes the last element of this deque, or returns
													// null if this deque is empty.

		System.out.println(numDeque);

		// peek()

		System.out.println(numDeque.peek()); // Retrieves, but does not remove, the head of the queue represented by
												// this deque (in other words, the first element of this deque), or
												// returns null if this deque is empty.
		System.out.println(numDeque.peekFirst()); // Retrieves, but does not remove, the first element of this deque, or
													// returns null if this deque is empty.
		System.out.println(numDeque.peekLast()); // Retrieves, but does not remove, the last element of this deque, or
													// returns null if this deque is empty.
		System.out.println(numDeque);

		// pop()

		System.out.println(numDeque.pop()); // Retrieves and removes the head of the queue represented by this deque
											// (in other words, the first element of this deque), or returns null if
											// this deque is empty.

		System.out.println(numDeque);

		// element()

		System.out.println(numDeque.element()); // Retrieves, but does not remove, the head of the queue represented by
												// this deque (in other words, the first element of this deque), or
												// returns null if this deque is empty.

		System.out.println(numDeque);

		// remove()

		System.out.println(numDeque.remove());// Retrieves and removes the head of the queue represented by this deque
												// (in other words, the first element of this deque). This method
												// differs from poll() only in that it throws an exception if this deque
												// is empty.

		// Deque method

		Deque<Integer> numIntegers = new LinkedList<Integer>();
		numIntegers.addAll(List.of(1, 2, 2, 3, 3, 2, 9, 3, 9));
		System.out.println("deque :" + numIntegers);

		// Removes the first occurrence of the specified element from this deque. If the
		// deque does not contain the element, it is unchanged. More formally, removes
		// the first element e such that Objects.equals(o, e) (if such an element
		// exists). Returns true if this deque contained the specified element (or
		// equivalently, if this deque changed as a result of the call).
		System.out.println(numIntegers.removeFirstOccurrence(2));

		// Removes the last occurrence of the specified element from this deque. If the
		// deque does not contain the element, it is unchanged. More formally, removes
		// the last element e such that Objects.equals(o, e) (if such an element
		// exists). Returns true if this deque contained the specified element (or
		// equivalently, if this deque changed as a result of the call).

		System.out.println(numIntegers.removeLastOccurrence(3));
		System.out.println(numIntegers);

		// Returns an iterator over the elements in this deque in reverse sequential
		// order. The elements will be returned in order from last (tail) to first
		// (head).
		Iterator<Integer> descendingIterator = numIntegers.descendingIterator();

		while (descendingIterator.hasNext()) {
			System.out.println(descendingIterator.next());
		}

		// add() vs offer()

		Deque<Integer> numIntegers2 = new LinkedList<Integer>();
		// Inserts the specified element into the queue represented by this deque (in
		// other words, at the tail of this deque) if it is possible to do so
		// immediately without violating capacity restrictions, returning true upon
		// success and throwing an IllegalStateException if no space is currently
		// available.
		numIntegers2.add(1);

		// Inserts the specified element into the queue represented by this deque (in
		// other words, at the tail of this deque) if it is possible to do so
		// immediately without violating capacity restrictions, returning true upon
		// success and false if no space is currently available
		numIntegers2.offer(2);

		numIntegers2.addFirst(3);
		numIntegers2.offerFirst(4);
		numIntegers2.addLast(5);
		numIntegers2.offerLast(6);// it would violate capacity restrictions.

		System.out.println(numIntegers2);

		// push()
//		Pushes an element onto the stack represented by this deque (in other words, at the head of this deque) if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
//		This method is equivalent to addFirst().

		numIntegers2.push(1111);
		System.out.println(numIntegers2);
		
		//offer()
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.offer(1);//Adds the specified element as the tail (last element) of this list.
		list1.offerFirst(2);
		list1.offerLast(3);//Inserts the specified element at the end of this list.
		list1.push(4);
		list1.add(5);
		list1.addFirst(6);
		list1.addLast(7);
		System.out.println(list1);
		
		
		

		
	}

}
