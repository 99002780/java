package com.lts.carwiring;

import org.springframework.stereotype.Component;

@Component
public class Car implements MileCalculator {

	@Override
	public void showMileage(int km, int fuel) {
		// TODO Auto-generated method stub
		System.out.println("Car Mileage is"+ km / fuel);
		
	}

}
