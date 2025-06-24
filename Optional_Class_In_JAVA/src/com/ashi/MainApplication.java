package com.ashi;

import java.util.Optional;

public class MainApplication {

	public static void main(String[] args) {

		EmployeeTest t = new EmployeeTest();
		// create Optional<C>

		/*
		 * Optional<String> s1 = Optional.empty();
		 * System.out.println(s1);//Optional.empty
		 * 
		 * Optional<String> s2 = Optional.of("jack"); //value the value to describe,
		 * which must be non-null System.out.println(s2.get()); //->
		 * NullPointerException
		 * 
		 * 
		 * Optional<String> s3 = Optional.ofNullable(null); //Returns an Optional
		 * describing the given value, if non-null, otherwise returns an empty Optional
		 * System.out.println(s3);//Optional[apple]
		 */

		Optional<Employee> emp = Optional.ofNullable(t.getEmployeeObj());

		// System.out.println(emp);

		// System.out.println(emp.get());

		if (emp.isEmpty()) {
			System.out.println("No employee found");
		} else {
			System.out.println(emp.get());
		}

		if (!emp.isPresent()) {
			System.out.println("No employee found");
		} else {
			System.out.println(emp.get());
		}

		// orElse() -> eager loading

		Employee orElse = emp.orElse(new Employee());// If a value is present, returns the value, otherwise returns
														// other.
		System.out.println(orElse);

		// orElseGet() - lazy loading
//		
//		If a value is present, returns the value, otherwise returns the result produced by the supplying function.
//		Parameters:
//		supplier the supplying function that produces a value to be returned
//		Returns:
//		the value, if present, otherwise the result produced by the supplying function
//		Throws:
//		NullPointerException - if no value is present and the supplying function is null

		Employee orElseGet = emp.orElseGet(() -> new Employee());
		System.out.println(orElseGet);

		// ifPresent()

		// If a value is present, performs the given action with the value, otherwise
		// does nothing
		// NullPointerException - if value is present and the given action is null

		// Consumer<i>
		emp.ifPresent(e -> System.out.println(e.getName()));

		// manual
		if (emp.isPresent()) {
			Employee employee = emp.get();
			System.out.println(employee.getName());
		}

		// ifPresentOrElse()

		// manual
		if (emp.isPresent()) {
			Employee employee = emp.get();
			System.out.println(employee.getName());
		} else {
			System.out.println("not found");
		}

		emp.ifPresentOrElse(e -> System.out.println(e.getName()),
						() -> new Employee()
						);
		
		//orElseThrows()
		//suplier<i>
		/*
		 * Employee orElseThrow = emp.orElseThrow(() -> new
		 * RuntimeException("Employee not found"));
		 * 
		 * 
		 * System.out.println(orElseThrow);
		 */
		
		
		//orElseThrow()
		
//		Employee orElseThrow = emp.orElseThrow(); //() -> new NoSuchElementException();
//		System.out.println(orElseThrow);
//		
		
		
		
		
		
		//map and filter
		//if employee age > 25 , then get employee name
		
		String orElse3 = emp.filter(e -> e.getAge() > 25).map(e -> e.getName()).orElse("No Employee");
		System.out.println("map with filter :"+orElse3);
		
		
		
		Employee orElse2 = emp.filter(e -> e.getAge()>25).orElse(new Employee());
		System.out.println(orElse2);
		
		emp.map(e -> e.getName()).ifPresent(e -> System.out.println(e));
		
		
     //or() > Optional[fallback()]
		
	 emp.or(() -> Optional.ofNullable(new Employee())).ifPresent(System.out::println);
		
	
		
		
	}

}
