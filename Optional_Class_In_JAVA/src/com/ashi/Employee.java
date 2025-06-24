package com.ashi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	
	  private Integer id;
	  private String name;
	  private Integer age;
	  private Double salary;
	  private String dept;
	
	  
	  
}
