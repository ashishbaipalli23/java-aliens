package com.ashi.Collections_UtilityClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainApplication {

	public static void main(String[] args) {

		/*
		 * List<Integer> numList = new ArrayList<Integer>(); numList.add(122);
		 * numList.add(22); numList.add(31); numList.add(430); numList.add(51);
		 * 
		 * System.out.println(numList);
		 * 
		 * Collections.sort(numList); //python sort() method
		 * 
		 * System.out.println(numList);
		 * 
		 * Collections.reverse(numList);
		 * 
		 * System.out.println(numList);
		 * 
		 * //Collections.shuffle(numList); //random order
		 * 
		 * System.out.println(numList);
		 * 
		 * Collections.sort(numList,Collections.reverseOrder()); //reverse order of the
		 * list
		 * 
		 * System.out.println(numList);
		 * 
		 * //custom sorting(sort based on last digit of number)
		 * Collections.sort(numList, Comparator.comparing(e -> e % 10 ));
		 * System.out.println(numList);
		 */

		/*
		 * List<String> nameList = new ArrayList<String>(); nameList.add("jack");
		 * nameList.add("azex"); nameList.add("abm"); nameList.add("smith");
		 * nameList.add("john"); nameList.add("bob"); nameList.add("jane");
		 * nameList.add("joe"); nameList.add("jane"); nameList.add("joe");
		 * nameList.add("jane");
		 * 
		 * System.out.println(nameList);
		 * 
		 * //custom sorting
		 * 
		 * Collections.sort(nameList); System.out.println("Alphabetical order : " +
		 * nameList);
		 * 
		 * //sort based on the length of String
		 * 
		 * Collections.sort(nameList,Comparator.comparing(String::length));
		 * //String::length
		 * 
		 * System.out.println("Sort based on length of String : " + nameList);
		 * 
		 * 
		 * //sort based on first character of String
		 * Collections.sort(nameList,Comparator.comparing(e -> e.charAt(0) == 'a' ? 0
		 * :1)); //String::length
		 * System.out.println("Sort based on first character of String : " + nameList);
		 * 
		 * 
		 * //sort based on last character of String
		 * Collections.sort(nameList,Comparator.comparing(e -> e.charAt(e.length() - 1)
		 * == 'e' ? 0 :1)); //String::length
		 * System.out.println("Sort based on last character of String : " + nameList);
		 * 
		 */

		// Searching

		List<Integer> nameList = new ArrayList<Integer>(List.of(2,213,34,23,2,2,1,67,43));
		
		System.out.println(nameList);
		Collections.sort(nameList);
		System.out.println(nameList);
		
		System.out.println(Collections.binarySearch(nameList, 23));
		
		//swap()
		
		System.out.println("before swap :"+nameList);
		Collections.swap(nameList, 5, 4); //index numberss
		System.out.println("after swap :"+nameList);
		
		//min()
		
		System.out.println(Collections.min(nameList));
		
		//max()
		
		System.out.println(Collections.max(nameList));
		
		//frequency()
		
		System.out.println(Collections.frequency(nameList, 2));
		
		//fill()
		
		System.out.println("list before fill :" + nameList);
		
		//Collections.fill(nameList, 0);
		System.out.println("list after fill :" + nameList);
		
		
		//replaceAll()
		
		System.out.println("list before replaceAll :" + nameList);
		
		Collections.replaceAll(nameList,2, 0); //2`s replaced with 0
		System.out.println("list after replaceAll :" + nameList);
		
		//rotate()
		
		System.out.println("list before rotate :" + nameList);
		
		Collections.rotate(nameList, -2); //rotate by 1 right side
										//-ve left shift
		
		System.out.println("list after rotate :" + nameList);
		
	
		
		//disjoint()
		
		List<Integer> nameList1 = new ArrayList<Integer>(List.of(1,2,3));
		List<Integer> nameList2 = new ArrayList<Integer>(List.of(4,5,6));
		
		System.out.println(Collections.disjoint(nameList1, nameList2)); // true if no common elements
		
		//copy()
		
		List<Integer> nameList4 = new ArrayList<Integer>(List.of(1,2,3));
		
		System.out.println("list before copy list4:" + nameList4);
		
		List<Integer> nameList3 = new ArrayList<Integer>(List.of(4,5,6));
		System.out.println("list before copy List3:" + nameList3);
		Collections.copy(nameList4, nameList3);
		
		
		System.out.println("list after copy list4:" + nameList3);
		
		
		
		//indexOfSubList()
		
		List<Integer> nameList5 = new ArrayList<Integer>(List.of(1,2,3,4,5,6));
		
		System.out.println("list before indexOfSubList:" + nameList5);
		
		List<Integer> nameList6 = new ArrayList<Integer>(List.of(4,5));
		System.out.println("list before indexOfSubList:" + nameList6);
		
		System.out.println(Collections.indexOfSubList(nameList5, nameList6));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
