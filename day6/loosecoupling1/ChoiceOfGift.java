package com.loosecoupling1;

public class ChoiceOfGift implements examination {
	
	private examination g;
	ChoiceOfGift(examination g){
		 this.g = g;
	}
 
	public void gift() {
		g.gift();
	}
}
