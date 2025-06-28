package com.ashi.SortedSet_Interface;

import java.util.*;

public class MainApplication {

	public static void main(String[] args) {

		SortedSet<Integer> set = new TreeSet<>();

		List<Integer> list = List.of(10, 20, 50, 90, 70, 10, 80, 40, 30, 45, 50);
		set.addAll(list); // remove duplicate and sorted order

		System.out.println("Set :" + set);

		SortedSet<Integer> subSet = set.subSet(10, 50);
		System.out.println(subSet); // 10,20,30,40,45,50
		// any change in the subSet will affect the original set

		subSet.add(33); // added to original too
		// 33 in range of 10<= 30 <50 no error

		// subSet.add(50);//java.lang.IllegalArgumentException: key out of range

		// subSet.add(9);//java.lang.IllegalArgumentException: key out of range

		// subSet.clear(); // 10 to 49 range elements are removed

		System.out.println("Set :" + set);

//		SortedSet<Integer> subSet1 = set.subSet(29, 20);// java.lang.IllegalArgumentException: fromKey > toKey
//		System.out.println(subSet1);

		// <50
		SortedSet<Integer> headSet = set.headSet(50); // backend to original set
		System.out.println(headSet); // 10,20,30,40,45

		// headSet.add(60);//java.lang.IllegalArgumentException: key out of range

		// >=50
		SortedSet<Integer> tailSet = set.tailSet(50);
		System.out.println(tailSet); // 50,70,80,90

		// tailSet.add(49);// java.lang.IllegalArgumentException:

		System.out.println("Set " + set);
		System.out.println(set.first()); // 10
		System.out.println(set.last()); // 90

		// using comparator() => we will learn more in TreeSet

		SortedSet<String> set1 = new TreeSet<>(Comparator.reverseOrder()); // descending order
		set1.addAll(Arrays.asList("Java", "Spring", "Java", "Hibernate"));
		System.out.println(set1); // [Spring, Java, Hibernate]

	}
}
