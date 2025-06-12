package com.ashi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

		// filter(Predicate )

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
		employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("IT"))

				.filter(e -> e.getGender().equalsIgnoreCase("Female"))

				.forEach(System.out::println);

		System.out.println("names of the employee :");
		employees.stream().map(e -> e.getName()).forEach(System.out::println);

		System.out.println("names of the employee starting with A :");

		employees.stream().map(e -> e.getName())

				.filter(e -> e.startsWith("A"))

				.forEach(System.out::println);

		System.out.println("no of employees in IT department :");
		long count = employees.stream().map(e -> e.getDepartment()).filter(e -> e.equalsIgnoreCase("IT")).count(); // terminal
																													// operation

		System.out.println(count);

		System.out.println("get all the employee name and salariyes :");

		employees.stream().map(e -> Integer.toString(e.getId()) + " : " + e.getName() + " : " + e.getSalary())
				.forEach(System.out::println);

		// i need top 3 employees in the stream

		// limit(long) -> short circuit operation[intermediate operation]
		System.out.println("top 3 employees :");
		employees.stream().limit(3).forEach(System.out::println);

		// skip(long) -> short circuit operation[intermediate operation]
		System.out.println("skip first 3 employees :");
		employees.stream().skip(3).forEach(System.out::println);

		// short circuit operation mainly used in infinite Stream

		/*
		 * infinite Stream
		 * 
		 * > itreate() / generate() methods are used to create infinite Stream
		 * 
		 * 
		 * 
		 * Stream<Integer> infiniteStream = Stream.iterate(1, i -> i + 1); //infinite
		 * Stream
		 * 
		 * infiniteStream.limit(10).forEach(System.out::println);
		 * 
		 * Stream<String> infiniteStream2 = Stream.generate(() -> "HELLO"); //infinite
		 * Stream
		 * 
		 * infiniteStream2.limit(10).forEach(System.out::println);
		 */

		// anyMatch() , allMatch() -> return type is boolean [terminal operations]

		System.out.println("Employees getting salaary less than 45000 :");
		boolean anyMatch = employees.stream().anyMatch(e -> e.getSalary() < 45000);

		System.out.println(anyMatch);

		System.out.println("Employees getting salaary grater than 48000 :");
		boolean allMatch = employees.stream().allMatch(e -> e.getSalary() >= 48000);
		System.out.println(allMatch);

		// noneMatch() -> return type is boolean [terminal operations]

		// noneMatch()
		// any one matching : false
		// no one matching : true

		boolean noneMatch = employees.stream().noneMatch(e -> e.getSalary() <= 48000);
		System.out.println(noneMatch);

		// findAny() -> Optional<> [terminal operations] spring data JPA

		Optional<Employee> any = employees.stream().findAny();
		System.out.println("FindAny result :" + any.get());

		// findFirst()

		Employee employee = employees.stream().findFirst().get();
		System.out.println("find first result :" + employee);

		System.out.println("Get cityes :");

		// distinct() -> remove duplicates
		employees.stream().map(e -> e.getCity()).distinct().sorted().forEach(System.out::println);

		// sorted() default sorting order /sorted(Comparator (supports custom sorting))
		System.out.println("City Names reverse order:");
		employees.stream().map(e -> e.getCity()).distinct().sorted(Comparator.reverseOrder())
				.forEach(System.out::println);

		System.out.println("City names in ascending order :");
		employees.stream().map(e -> e.getCity()).distinct().sorted().forEach(System.out::println);

		// collect() -> terminal operation
		// collect(Collectors) -> intermediate operation

		/*
		 * collect() is used to convert stream to list, set, map
		 */
		/*
		 * List<Integer> num = List.of(1,2,4,3,2,1,1); //convert to set
		 * System.out.println("set result :");
		 * num.stream().collect(Collectors.toSet()).forEach(System.out::println);
		 * 
		 * //how to convert Array object to List
		 * 
		 * int[] arr = {1,2,3,4,5,6,7,8,9,10};
		 * 
		 * IntStream stream = Arrays.stream(arr); // sequence of primitive int-valued
		 * elements supporting sequential and parallel aggregate operations
		 * System.out.println("List result :");
		 * 
		 * //convert to list List<Integer> collect =
		 * stream.boxed().collect(Collectors.toList()); System.out.println(collect);
		 * 
		 * //convert to map
		 * 
		 * 
		 * 1 -> 1 2 -> 4 3 -> 9
		 * 
		 * 
		 * Map<Integer, Integer> collect2 =
		 * num.stream().distinct().collect(Collectors.toMap( n -> n, //key n ->
		 * n*n//value
		 * 
		 * )); System.out.println(collect2);
		 */
		
		System.out.println("i need to store id's of employees in list :");
		
		List<Integer> collect = employees.stream().map(e -> e.getId())
						 .collect(Collectors.toList());
		//collect.forEach(System.out::println);
		System.out.println(collect);
		
		//get the avgsal of the company
		
		
		
		//before java 8
		double s =0;
		for(Employee e : employees) {
			
			s += e.getSalary();
			
		}
		
		System.out.println("Avg sal :"+(s)/employees.size());
		
		//after java 8
		Double collect2 = employees.stream().map(e -> e.getSalary()).collect(Collectors.averagingDouble( e -> e ));
		System.out.println("avg sal of the company :"+collect2);
		
		
		//grouping 
		
		System.out.println("Depatment wise employee count :");
		
		Map<String, Long> collect3 = employees.stream().collect(Collectors.groupingBy(
				
				                dept -> dept.getDepartment(), //key
				                Collectors.counting() //value
				
				));
		
		System.out.println(collect3);
						 
		
		System.out.println("city wise count :");
		
		Map<String, Long> collect4 = employees.stream().collect(Collectors.groupingBy(
				
                e -> e.getCity(), //key
                Collectors.counting() //value

				));

			System.out.println(collect4);
			
			
			System.out.println("city wise count F/M :");
			
			Map<String, Map<String, Long>> collect5 = employees.stream().collect(Collectors.groupingBy(
					   
					    e -> e.getCity(),            //key
					    
					    Collectors.groupingBy(
					    		eq -> eq.getGender(), //key
					    		Collectors.counting()//value
					    		)                                //value
					    
					    
					
					));
			System.out.println(collect5);
		
			//summerize 
			
			System.out.println("City wise sum of sal :");
			
			Map<String, Double> collect6 = employees.stream().collect(Collectors.groupingBy(
					
					e -> e.getCity(), //key
					Collectors.summingDouble(e -> e.getSalary()) //value
					
					));
			System.out.println(collect6);
			
			//put id as KEY and rest off all as values
			
			Map<Integer, List<Employee>> collect7 = employees.stream().collect(Collectors.groupingBy(
					    e -> e.getId(), //key 
					    
					    Collectors.toList() //value
					    
					));
			
			System.out.println(collect7);
			
			//joining()
			
			System.out.println("joining :");
			
			String collect8 = employees.stream().map(e -> e.getName()).collect(Collectors.joining(","));
			System.out.println(collect8);
			
			//partionBy()
			
			System.out.println("partionBy :");
			
			Map<Boolean, Long> collect9 = employees.stream().collect(Collectors.partitioningBy(
					
					e -> e.getCity().equals("Pune"), //key
					
					Collectors.counting() //value
					
					));
			System.out.println(collect9);
			
			
			
			
			
			
		

	}
}
