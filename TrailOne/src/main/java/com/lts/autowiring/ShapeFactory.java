package com.lts.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	@Autowired
	@Qualifier("traingle")
        Shape shape;
	@Autowired
	@Qualifier("traingle")
	   Shape nshape;
		public void printArea(int x, int y) {
			// TODO Auto-generated method stub
			System.out.println("Print Area");
			shape.calculateArea(x, y);
			nshape.calculateArea(x, y);
		}

}
