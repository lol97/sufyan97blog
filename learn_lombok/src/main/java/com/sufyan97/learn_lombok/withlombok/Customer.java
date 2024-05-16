package com.sufyan97.learn_lombok.withlombok;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NonNull;

@Data
public class Customer {
	private BigDecimal customerId;
	@NonNull Account account;
	private final String company = "SUFYAN97";
}
