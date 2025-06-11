package com.ashi;

import java.util.ArrayList;
import java.util.List;

public class Company {
  
	public static List<Employee> getAllEmployees(){
		 List<Employee> employees = new ArrayList<>();

		    employees.add(new Employee(1, "Ashi", "Delhi", 25, "Female", "IT", 2018, 75000));
		    employees.add(new Employee(2, "Raj", "Mumbai", 30, "Male", "Finance", 2015, 65000));
		    employees.add(new Employee(3, "Neha", "Pune", 27, "Female", "HR", 2019, 55000));
		    employees.add(new Employee(4, "Amit", "Bangalore", 35, "Male", "Marketing", 2012, 80000));
		    employees.add(new Employee(5, "Sneha", "Hyderabad", 29, "Female", "IT", 2016, 72000));
		    employees.add(new Employee(6, "Karan", "Delhi", 32, "Male", "Operations", 2014, 60000));
		    employees.add(new Employee(7, "Rita", "Mumbai", 26, "Female", "Finance", 2020, 58000));
		    employees.add(new Employee(8, "Vikram", "Pune", 38, "Male", "IT", 2010, 90000));
		    employees.add(new Employee(9, "Anjali", "Bangalore", 24, "Female", "HR", 2022, 50000));
		    employees.add(new Employee(10, "Deepak", "Hyderabad", 40, "Male", "Marketing", 2009, 95000));

		    employees.add(new Employee(11, "Tina", "Delhi", 28, "Female", "Operations", 2017, 62000));
		    employees.add(new Employee(12, "Mohit", "Mumbai", 31, "Male", "IT", 2015, 71000));
		    employees.add(new Employee(13, "Pooja", "Pune", 27, "Female", "Finance", 2018, 66000));
		    employees.add(new Employee(14, "Rohan", "Bangalore", 36, "Male", "HR", 2011, 78000));
		    employees.add(new Employee(15, "Simran", "Hyderabad", 30, "Female", "Marketing", 2014, 74000));
		    employees.add(new Employee(16, "Manoj", "Delhi", 33, "Male", "Operations", 2013, 69000));
		    employees.add(new Employee(17, "Kavita", "Mumbai", 26, "Female", "IT", 2019, 67000));
		    employees.add(new Employee(18, "Yash", "Pune", 29, "Male", "Finance", 2016, 64000));
		    employees.add(new Employee(19, "Divya", "Bangalore", 25, "Female", "HR", 2021, 52000));
		    employees.add(new Employee(20, "Nitin", "Hyderabad", 39, "Male", "Marketing", 2010, 88000));

		    employees.add(new Employee(21, "Swati", "Delhi", 28, "Female", "Operations", 2017, 63000));
		    employees.add(new Employee(22, "Arjun", "Mumbai", 34, "Male", "IT", 2012, 81000));
		    employees.add(new Employee(23, "Priya", "Pune", 23, "Female", "Finance", 2023, 48000));
		    employees.add(new Employee(24, "Ravi", "Bangalore", 37, "Male", "HR", 2008, 91000));
		    employees.add(new Employee(25, "Meena", "Hyderabad", 29, "Female", "Marketing", 2015, 70000));
		    employees.add(new Employee(26, "Suresh", "Delhi", 31, "Male", "Operations", 2016, 65000));
		    employees.add(new Employee(27, "Aarti", "Mumbai", 26, "Female", "IT", 2020, 61000));
		    employees.add(new Employee(28, "Gaurav", "Pune", 35, "Male", "Finance", 2013, 73000));
		    employees.add(new Employee(29, "Sonali", "Bangalore", 30, "Female", "HR", 2018, 56000));
		    employees.add(new Employee(30, "Harsh", "Hyderabad", 38, "Male", "Marketing", 2011, 85000));

		    return employees;
	}
}
