package com.lts.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", address=" + address + "]";
	}
Integer id;
 String name;
 String dept;
 @Autowired
 Address address;

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Integer getId() {
	return id;
}
@Value("${employee.id}")
public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}
@Value("${employee.name}")
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
@Value("${employee.dept}")
public void setDept(String dept) {
	this.dept = dept;
}
 
}
