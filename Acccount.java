package com.package1;

public class Acccount {
	private String acc_no;
	private String ifsc_code;
	protected String  location;
	protected String address;
	
	double amount=10000;
	public String getacc_no() {
		return acc_no;
	}
	public void setacc_no(String acc_no)
	{
	   this.acc_no = acc_no;	
	}
	public String getifsc_code()
	{
		return ifsc_code;
	}
	public void setifsc_code(String ifsc_code)
	{
		this.ifsc_code = ifsc_code;
	}
	protected void info()
	{
		System.out.println("info message");
		System.out.println("amount" + amount);
	}
}
