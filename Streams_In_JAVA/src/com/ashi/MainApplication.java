package com.ashi;


import java.util.List;


public class MainApplication {
	  public static void main(String[] args) {
		
			/*
			 * List<Integer> numbers = List.of(1,2,3,4,5);
			 * 
			 * //get even numbers before java 8
			 * 
			 * for(int i =0 ;i < numbers.size() ;i++) { if((numbers.get(i) & 1) == 0) {
			 * System.out.println(numbers.get(i)); } }
			 * 
			 * System.out.println("--------");
			 * 
			 * //get even numbers after java 8 numbers.stream().filter(x -> x%2 ==
			 * 0).forEach(System.out::println);
			 */
		 
		  
		  
		  
			/*
			 * //1. From Collection Object List<String> values =
			 * List.of("one","two","three");
			 * 
			 * Stream<String> stream = values.stream();
			 * 
			 * //2. Array of values String[] names = {"a","b","c"}; Stream<String> stream2 =
			 * Arrays.stream(names);
			 * 
			 * //3.Stream methods Stream<String> stream3 = Stream.of("one","two","three");
			 * 
			 * 
			 * //4. generate()
			 * 
			 * Stream<String> stream4 = Stream.generate(()->"ashish");
			 * 
			 * //5.bulider design : builder()
			 * 
			 * Stream.Builder<Object> builder = Stream.builder(); Stream<Object> builder2 =
			 * builder.add("one").add("two").build();
			 * 
			 * //6.empty() Stream<Object> empty = Stream.empty();
			 */
			
          // Creation Of Stream
		  
		  List<Employee> employees = Company.getAllEmployees();
		  employees.stream().forEach(System.out::println);
		  System.out.println("=====================================================");
		  
//		  Stream<Employee> empStream = employees.stream();
//		  empStream.forEach(System.out::println);
//			
		
		  //filter(Predicate )
		  
		  System.out.println("filter method filter age of employee less than 25 years :");
//		  
//		  Stream<Employee> stream = employees.stream();
//		  
//		  Stream<Employee> stream2 = stream.filter(emp -> emp.getAge() < 25 ); //intermediate operation creates a new stream pipeline
//		  
//		  stream2.forEach(System.out::println);
//		  
          
		  employees.stream().filter(emp -> emp.getAge() > 25).forEach(System.out::println);
		  
		  
		  System.out.println("employees from IT department and gender is Female ");
		  employees.stream()
		    				.filter(e -> e.getDepartment().equalsIgnoreCase("IT"))
		    				
		    				.filter(e -> e.getGender().equalsIgnoreCase("Female"))
		    				
		    				.forEach(System.out::println);
		
		  
		System.out.println("names of the employee :");
		employees.stream().map(e -> e.getName()).forEach(System.out::println);
		  
		System.out.println("names of the employee starting with A :");
		
		employees.stream()
						.map(e -> e.getName())
						
						.filter(e -> e.startsWith("A"))
						
						.forEach(System.out::println);
		
		System.out.println("no of employees in IT department :");
		long count = employees.stream().map(e -> e.getDepartment())
						.filter(e -> e.equalsIgnoreCase("IT"))
						.count(); //terminal operation 
		
		System.out.println(count);
		
		
		System.out.println("get all the employee name and salariyes :");
		
		employees.stream()
		.map(e -> Integer.toString(e.getId()) +" : "+ e.getName() + " : " + e.getSalary())
		.forEach(System.out::println);
		
		
		
		
		
		
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		
	}
}
