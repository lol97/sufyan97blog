package com.sufyan97.jml;

public class TestJml {
	public static void main(String[] args) throws BankingException {
		BankingExample bankingExample = new BankingExample();
		bankingExample.debit(100000);
		System.out.println(bankingExample.getBalance());
	}
}
