package com.loosecoupling;

public class Person {
 
	public static void main(String[] args) {
		
		//object
		Transport t1 = new Bus();
		Transport t2 = new Train();
		
		//travel class object
		//con call at time of object creation
		
		Itravel travel = new Travel(t2);
		travel.start();
		
	}
}
