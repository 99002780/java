package com.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.studentapp.dao.StudentRepository;
import com.studentapp.exceptions.StudentNotFoundException;
import com.studentapp.model.Student;
@Service
@Repository
public class StudentServiceImpl  implements StudentService{
	@Autowired
	StudentRepository studentRepository;


	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		Student newStudent= studentRepository.save(student);
		return newStudent;
	}

	@Override
	public boolean deleteStudent(int id) throws StudentNotFoundException{
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return true;
	}

	@Override
	public Student getStudentById(int id) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return studentRepository.findById(id)
				.orElseThrow(()-> new StudentNotFoundException("Id is not found"));
	}

	@Override
	public List<Student> getStudentsByCity(String city) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return studentRepository.findByAddressCity(city);
	}

	@Override
	public List<Student> getStudentsByDept(String dept) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return studentRepository.findByDept(dept);
	}

	@Override
	public List<Student> findByAge(int age) {
		// TODO Auto-generated method stub
		return studentRepository.findByAge(age);
	}

	

}
