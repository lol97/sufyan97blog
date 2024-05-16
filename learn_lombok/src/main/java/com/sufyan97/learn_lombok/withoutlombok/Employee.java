package com.sufyan97.learn_lombok.withoutlombok;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Employee {
	private String name;
	private BigDecimal salary;
	
	//ini setara @NoArgsConstructor
	public Employee() {
		super();
	}

	//ini @AllArgsConstructor
	public Employee(String name, BigDecimal salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	//start ini setara @Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	//end ini setara @Setter
}
