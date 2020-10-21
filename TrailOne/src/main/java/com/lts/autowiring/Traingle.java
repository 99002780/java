package com.lts.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Traingle implements Shape{
@Override
public void calculateArea(int x,int y) {
	System.out.println("traingle ==>"+0.5*x*y);
}
}
