package com.lts.constr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
      String name;
      Integer id;
      String dept;
      Course course;
      @Autowired
	public Student(Course course) {
		super();
		this.course = course;
	}
	public String getName() {
		return name;
	}
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	@Value("${student.id}")
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	@Value("${student.dept}")
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", dept=" + dept + ", course=" + course + "]";
	}
	
}
