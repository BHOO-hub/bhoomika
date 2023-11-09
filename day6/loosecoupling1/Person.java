package com.loosecoupling1;

public class Person {
	public static void main(String[] args) {
		//examination
		examination gift1 = new Bike();
		examination gift2= new Cycle();
		ChoiceOfGift g = new ChoiceOfGift(gift1);
		g.gift();
	
	}

}
