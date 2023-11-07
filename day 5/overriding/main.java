package com.overriding;

public class main {
	public static void main (String[] args)
	{
		Bank  b1 = new Bank();
		b1.loanpercentageYear();
		
		Bank  b2 = new SBI();
		b2.loanpercentageYear();
		
		Bank  b3 = new HDFC();
		b3.loanpercentageYear();
		
		Bank  b4 = new ICICI();
		b4.loanpercentageYear();
	}	
}
