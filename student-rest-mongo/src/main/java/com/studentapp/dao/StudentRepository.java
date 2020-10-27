package com.studentapp.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.studentapp.exceptions.StudentNotFoundException;
import com.studentapp.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student,Integer>{
	List<Student> findByDept(String dept)throws StudentNotFoundException;  
	List<Student> findByAge(int age);
	List<Student> findByAddressCity(String city)throws StudentNotFoundException;

}
