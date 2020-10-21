package com.lts.carwiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleDetails {
	@Autowired
	@Qualifier("car")
    MileCalculator car;
	@Autowired
	@Qualifier("bike")
    MileCalculator bike;
	int choice =0;
	public void getMileage(int km,int fuel) { 
		if(choice==0) {
			car.showMileage(km, fuel);
		}
		else
		{
			bike.showMileage(km, fuel);
		}
	}
}
