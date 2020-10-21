package com.lts.carwiring;

import org.springframework.stereotype.Component;

@Component
public class Bike implements MileCalculator{

	@Override
	public void showMileage(int km, int fuel) {
		// TODO Auto-generated method stub
		System.out.println("Bike Mileage is"+ km / fuel);
		
	}

}
