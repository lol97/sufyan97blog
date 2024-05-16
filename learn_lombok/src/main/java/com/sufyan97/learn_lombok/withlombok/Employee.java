package com.sufyan97.learn_lombok.withlombok;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private String name;
	private BigDecimal salary;
}
