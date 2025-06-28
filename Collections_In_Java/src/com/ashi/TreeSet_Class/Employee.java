package com.ashi.TreeSet_Class;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("rawtypes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Comparable {
 
	private int id;
	private String name;
	private String city;
	private int age;
	private String gender;
	private String department;
	private int yearOfJoining;
	private double salary;
	
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		if(this.id > e.id) {
			return 1;
		}else if(this.id < e.id) {
			return -1;
		}
		return 0;
	}
	
	
	
}
