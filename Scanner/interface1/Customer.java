package com.interface1;

public class Customer implements Bike,Car
{

	@Override
	public void CarFeature() {
		System.out.println("Max Speed: 300kmph");
		
	}

	@Override
	public void BikeFeature() {
		System.out.println("Max Speed: 170kmph");	
	}
	 public  static void main(String[] args)
	 {
		 Customer c1 = new Customer();
		 c1.CarFeature();
		 c1.BikeFeature();
	 }
}
