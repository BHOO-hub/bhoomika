package com.Interface;

public class Loan implements Bank{

	@Override
	public void credit() {
		throw new UnsupportedOperationException("Unimplemented method credit");	
	}

	@Override
	public void debit() {
		throw new UnsupportedOperationException("Unimplemented method debit");		
	}
	
	@Override
	public void Loan()
	{
		System.out.println("10000 amount is due on your Loan Account");
	}

}
