package com.lts.autowiring;

import org.springframework.stereotype.Component;

@Component("shape")
public class Rectangle implements Shape{
	@Override
     public void calculateArea (int x,int y) {
    	 System.out.println("rectangle ==>"+x*y);
     }


}
