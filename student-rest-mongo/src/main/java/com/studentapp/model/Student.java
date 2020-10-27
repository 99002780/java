package com.studentapp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
@Component
@Document(collection="student")
public class Student {
	@Id
 int id;
 String name;
 String dept;
 int age;

 Address address;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + ", address=" + address + "]";
}


 
}
