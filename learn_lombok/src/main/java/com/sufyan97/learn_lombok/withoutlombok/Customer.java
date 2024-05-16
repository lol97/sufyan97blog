package com.sufyan97.learn_lombok.withoutlombok;

import java.math.BigDecimal;
import java.util.Objects;

public class Customer {
	private BigDecimal customerId;
	private Account account;
	
	//start setter
	public void setCustomerId(BigDecimal customerId) {
		this.customerId = customerId;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	//end setter

	//start equal and hashcode
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(account, other.account) && Objects.equals(customerId, other.customerId);
	}

	protected boolean canEqual(Object other) {
		return other instanceof com.sufyan97.learn_lombok.withlombok.Customer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(account, customerId);
	}
	//end equal and hashcode
	
	//s toString
	public String toString() {
		return "Customer(customerId=" + getCustomerId() + ", account=" + getAccount() + ")";
	}
	//e toString
	
	//s getter
	public BigDecimal getCustomerId() {
		return this.customerId;
	}

	public Account getAccount() {
		return this.account;
	}
	//e getter
}