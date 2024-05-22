package com.sufyan97.general.di;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class AccountNonDI {
	private BankAccount bankAccount;
	
	public void openAccount() {
		bankAccount = new BankAccount();
		bankAccount.setBalance(BigDecimal.ZERO);
	}
}
