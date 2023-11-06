package com.package2;
 
import com.package1.Acccount;

public class Customer extends Acccount
{

	public static void main(String[] args)
	{
		Customer x = new Customer();
		x.info();
		x.address  =   "bangalore";
		x.location = "bangalore";
	    x.setacc_no("abcd");
		x.setifsc_code("abcd");
		System.out.println( "address of Customer" + x.address);
		System.out.println("location of Customer" + x.location);
		System.out.println("getacc_no of Customer"+ x.getacc_no());
		System.out.println("getifsc_code of Customer"+ x.getifsc_code());	
	} 
}