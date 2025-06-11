package com.ashi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
 
	private int id;
	private String name;
	private String city;
	private int age;
	private String gender;
	private String department;
	private int yearOfJoining;
	private double salary;
	
	
}
