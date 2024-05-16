package com.sufyan97.learn_lombok.withoutlombok;

import java.math.BigDecimal;
import java.util.Objects;

public class Customer {
	private BigDecimal customerId;
	private Account account;
	private final String company = "SUFYAN97";
	
	//start @RequiredArgsConstructor
	public Customer(Account account) {
		if (account == null)
			throw new NullPointerException("account is marked non-null but is null");
		this.account = account;
	}
	//end @RequiredArgsConstructor
	
	//start setter
	public void setCustomerId(BigDecimal customerId) {
		this.customerId = customerId;
	}

	public void setAccount(Account account) {
		if (account == null)
			throw new NullPointerException("account is marked non-null but is null");
		this.account = account;
	}
	//end setter
	
	//start hash and equal
	@Override
	public int hashCode() {
		return Objects.hash(account, company, customerId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(account, other.account) && Objects.equals(company, other.company)
				&& Objects.equals(customerId, other.customerId);
	}
	//end hash and equal

	//start to string
	public String toString() {
		return "Customer(customerId=" + getCustomerId() + ", account=" + getAccount() + ", company=" + getCompany()
				+ ")";
	}
	//end to string

	//start getter
	public BigDecimal getCustomerId() {
		return this.customerId;
	}

	public Account getAccount() {
		return this.account;
	}

	public String getCompany() {
		Objects.requireNonNull(this);
		return "SUFYAN97";
	}
	//end getter
}