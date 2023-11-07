package com.Super;

public class Person {
	String city = "bengaluru";
	int uid = 560060;
	
	Person(){
		System.out.println("calling Person Constructor");
	}
	public void display() {
		System.out.println("Person is from" + city + "city and her id is" + uid);
	}
}