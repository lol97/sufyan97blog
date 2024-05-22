package com.sufyan97.general.di;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class AccountDI {
	private BankAccount bnAccount;
	
	public void openAccount(BankAccount bnAccount) {
		bnAccount.setBalance(BigDecimal.ZERO);
	}
}
