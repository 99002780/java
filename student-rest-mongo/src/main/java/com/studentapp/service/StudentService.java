package com.studentapp.service;

import java.util.List;
import com.studentapp.exceptions.StudentNotFoundException;
import com.studentapp.model.Student;

public interface StudentService {
	Student addStudent(Student student);
	boolean deleteStudent(int id) throws StudentNotFoundException;
	Student getStudentById(int id)throws StudentNotFoundException;
	List<Student> getStudentsByCity(String city)throws StudentNotFoundException;
	List<Student> findByAge(int age);
	List<Student> getStudentsByDept(String dept)throws StudentNotFoundException;
}
