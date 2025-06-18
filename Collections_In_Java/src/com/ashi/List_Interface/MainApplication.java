package com.ashi.List_Interface;

import java.util.*;

public class MainApplication {

	public static void main(String[] args) {

		// add()
		List<Integer> numIntegers = new ArrayList<Integer>();
		numIntegers.add(144);
		numIntegers.add(234);
		numIntegers.add(33);
		numIntegers.add(664);
		numIntegers.add(5767);
		numIntegers.add(6868);
		numIntegers.add(843);

		numIntegers.add(493);
		numIntegers.add(100);
		numIntegers.add(843);

		System.out.println(numIntegers);

		// remove(int index)
		Integer remove = numIntegers.remove(1);
		System.out.println("removed element :" + remove);

		System.out.println(numIntegers);

		// remove(Object)
		numIntegers.remove(Integer.valueOf(100));

		System.out.println(numIntegers);

		// clear()
		// numIntegers.clear();
		// System.out.println(numIntegers);

		// contains()

		System.out.println(numIntegers.contains(144)); // return boolean
		System.out.println(numIntegers.contains(1000));

		// isEmpty()

		System.out.println(numIntegers.isEmpty());

		// size()
		System.out.println(numIntegers.size());

		// get()
		System.out.println(numIntegers.get(0));

		// set()
		System.out.println("before set :" + numIntegers);
		numIntegers.set(0, 1000);
		System.out.println("after set :" + numIntegers);

		// indexOf()
		System.out.println("indexOf(843) :" + numIntegers.indexOf(843));

		// lastIndexOf()
		System.out.println("lastIndexOf(843) :"+numIntegers.lastIndexOf(843));

		// containsAll()
		List<Integer> numIntegers2 = new ArrayList<Integer>();
		numIntegers2.add(1000);
		numIntegers2.add(1000);
		numIntegers2.add(1000);
		System.out.println(numIntegers.containsAll(numIntegers2));// Returns true if this list contains all of the
																	// elements of the specified collection.
		
		// subList()
		System.out.println("List : "+numIntegers);
		List<Integer> subList = numIntegers.subList(1, 4); //Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
		System.out.println("subList(1,4) :"+subList);

		
		// equals()
		List<Integer> numIntegers3 = new ArrayList<Integer>();
		numIntegers3.add(1000);
		numIntegers3.add(1000);
		numIntegers3.add(1000);
		System.out.println(numIntegers.equals(numIntegers3)); //Returns true if this list contains all of the elements of the specified collection.
		
		// listIterator()
		ListIterator<Integer> listIterator = numIntegers.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		// iterator()
		Iterator<Integer> iterator = numIntegers.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// toArray()
		Object[] toArray = numIntegers.toArray();
		System.out.println(Arrays.toString(toArray));
		
		// toArray(T[])
		Integer[] toArray2 = numIntegers.toArray(new Integer[0]);
		System.out.println(Arrays.toString(toArray2));
		
		
		System.out.println("before sort :"+numIntegers);
	    numIntegers.sort(Comparator.comparing(Integer::intValue));
		System.out.println("after sort :"+numIntegers);
		
		
		//replaceAll()
		System.out.println("Before replace All :"+numIntegers);
		numIntegers.replaceAll(e -> e * 2); //Replaces each element of this list with the result of applying the function to the corresponding element of the list
		System.out.println("after replace All :"+numIntegers);
		
		
		//Of()
		List<Integer> of = List.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println("of() :"+of);
		//of.add(101); error
		//of.remove(0); //error
		
		
		//copyOf()
	   List<Integer> n1 = new ArrayList<Integer>();
	   n1.add(1);
	   n1.add(2);
	   n1.add(3);
	   n1.add(4);
	   n1.add(5);
	   n1.add(6);
	   n1.add(7);
	   n1.add(8);
	   n1.add(9);
	   n1.add(10);
	   List<Integer> n2 = List.copyOf(n1);//returns an unmodifiable List
	   
	   System.out.println("copyOf() :"+n2);
	  // n2.add(101); //error	
	  
	   
	
	   List<Integer> l1 = new ArrayList<Integer>();
	   l1.add(1);
	   l1.add(2);
	   l1.add(3);
	   l1.add(4);
	   l1.add(5);
	   System.out.println("list1 : "+l1);
	   
	   List<Integer> l2 = new ArrayList<Integer>();
	   l2.add(6);
	   l2.add(7);
	   l2.add(8);
	   l2.add(9);
	   l2.add(10);
	   System.out.println("list2 : "+l2);
	   
	   l1.addAll(l2);
	   
	   System.out.println("addAll() :"+l1);
	   

	   List<Integer> list1 = new ArrayList<Integer>();
	   list1.add(1);
	   list1.add(2);
	   list1.add(3);
	   list1.add(4);
	   list1.add(15);
	   
	   List<Integer> unmodifiableList = Collections.unmodifiableList(list1);
	   System.out.println("unmodifiableList :"+unmodifiableList);
	   
	  //unmodifiableList.add(101); //error
	  // unmodifiableList.remove(1); //error
	   
	   
	   //removeAll()
	   List<Integer> list2 = new ArrayList<Integer>();
	   list2.add(1);
	   list2.add(2);
	   list2.add(3);
	   list2.add(4);
	   list2.add(5);
	   System.out.println("list2 : "+list2);
	   
	   List<Integer> list3 = new ArrayList<Integer>();
	   list3.add(11);
	   list3.add(12);
	   list3.add(13);
	   list3.add(14);
	   list3.add(15);
	   System.out.println("list3 : "+list3);
	   
	   list2.removeAll(list3);//Removes from this list all of its elements that are contained in the specified collection
	   System.out.println("list2.removeAll(list3) :"+list2);
	   
	  //======================== java-21=====================================
	   
	   //reversed()
	   List<Integer> list4 = new ArrayList<Integer>();
	   list4.add(1);
	   list4.add(2);
	   list4.add(3);
	   list4.add(4);
	   list4.add(5);
	   
	   System.out.println("list4 : "+list4);
	   
	   System.out.println("getFirst() :"+list4.getFirst());
	   
	   System.out.println("getLast() :"+list4.getLast());
	   
	   System.out.println("removeFirst() :"+list4.removeFirst());
	   
	   System.out.println("removeLast() :"+list4.removeLast());
	   
	   list4.addFirst(101);
	   
	   list4.addLast(102);
	   
	   System.out.println("list4 : "+list4);
	   List<Integer> reversed = list4.reversed();
	   
	   System.out.println("reversed() list4 :"+reversed);
	//==================================================================================
	}
	
	
	

}
