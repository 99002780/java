package com.lts.foodwiring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class FoodPanda {
	@Autowired
	@Qualifier("indian")
    Menu iMenu;

@Autowired
@Qualifier("chinese")
Menu cMenu;
	public List<String> showMenu(String choice) {
		// TODO Auto-generated method stub
		if(choice== "indian") {
		return iMenu.itemsAvailable();}
		else {
		 return cMenu.itemsAvailable();
	}
	}


}
