package com.ashi.TreeSet_Class;

import java.util.Base64;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainApplication {
	public static void main(String[] args) {

		/*
		 * TreeSet set = new TreeSet<>();
		 * 
		 * set.add(10); set.add(20); //set.add("jack");//class cast Exception
		 * //set.add(null); not allowed set.add(70); set.add(10); set.add(80);
		 * set.add(40); set.add(30); set.add(45); set.add(50);
		 * 
		 * System.out.println(set);
		 */

		TreeSet<Integer> set = new TreeSet<>();

		TreeSet<Integer> set2 = new TreeSet<Integer>(List.of(10, 20, 50, 90, 70, 10, 80, 40, 30, 45, 50));
		System.out.println(set2);

		TreeSet<Integer> set3 = new TreeSet<Integer>(Comparator.reverseOrder());

		set3.addAll(List.of(10, 20, 50, 90, 70, 10, 80, 40, 30, 45, 50));
		System.out.println(set3);

		// real time example where to use TreeSet

		List<Employee> employees = Company.getAllEmployees();

		System.out.println("================Employees are :========================= ");

		employees.forEach(System.out::println);

		// i am creating a custom comparator to store the employees based on their id(no duplicates)

		TreeSet<Employee> empSet = new TreeSet<>();
		empSet.addAll(employees);
		System.out.println("===================employee names are sorted using id :========================= ");
		empSet.stream().forEach(System.out::println);
		
		
		
		// i am creating a custom comparator to store the employees based id easy way
		TreeSet<Employee> empSet2 = new TreeSet<Employee>((a, b) -> a.getId() - b.getId());
		empSet2.addAll(employees);
		System.out.println("==============Employee ===================");
		
		empSet2.forEach(System.out::println);
		
		
		List<String> empName = employees.stream().map(e -> e.getName()).collect(Collectors.toList());
		
		TreeSet<String> empNames3 = new TreeSet<>(Comparator.reverseOrder());
		empNames3.addAll(empName);
		System.out.println("==============Employee Names Sorted and reverse oreder  ===================");
		empNames3.forEach(System.out::println);
		
		
		
		
		
		//basic examples 
		
		TreeSet<Integer> num = new TreeSet<Integer>(List.of(10, 20, 50, 90, 70, 10, 80, 40, 30, 45, 50));
		System.out.println(num);
		
		
		System.out.println("Comparator used  : "+num.comparator()); //if null default sorting order 
		
		TreeSet<Integer> num1 = new TreeSet<Integer>(Comparator.reverseOrder());
		
		num1.addAll(List.of(10, 20, 50, 90, 70, 10, 80, 40, 30, 45, 50));
		
		System.out.println("Comparator used ? : "+num1.comparator()); 
		
		
		
		
		
		//NavibagleSet
		System.out.println(num.pollFirst());	//remove first
		System.out.println(num);
		
		System.out.println(num.pollLast());	//remove last
		System.out.println(num);
		
		
		System.out.println(num.lower(40)); // < 40
		System.out.println(num.higher(40)); // > 40
		
		//Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
		System.out.println(num.ceiling(71)); // >= 71 in set
		
		//Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
		System.out.println(num.floor(71)); // <= 71 in set

		
		NavigableSet<Integer> descendingSet = num.descendingSet();
		//backend to original
		System.out.println(descendingSet); //reverse order
       
		
		//Returns an iterator over the elements in this set in descending order.
		Iterator<Integer> descendingIterator = num.descendingIterator();
		
		while (descendingIterator.hasNext()) {
			Integer integer = (Integer) descendingIterator.next();
			System.out.println(integer);
		}
		
		
		
		
		
		

	}
}
