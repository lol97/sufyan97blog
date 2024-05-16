package com.sufyan97.learn_lombok.withlombok;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Customer {
	private BigDecimal customerId;
	private Account account;
}
