package com.Interface;

public class Account implements Bank {

	@Override
	public void credit() {
		System.out.println("1000 credited to your account");
	}

	@Override
	public void debit() {
		System.out.println("500 debited to your account");
		
	}
	public static void main(String[] args) {
		Account b1 = new Account();
		b1.credit();
		b1.debit();
		b1.Loan();
	}

	@Override
	public void Loan() {
		System.out.println("1000 is due on your account");
	}
}
