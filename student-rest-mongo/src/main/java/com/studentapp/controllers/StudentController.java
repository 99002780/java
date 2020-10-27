package com.studentapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.studentapp.exceptions.StudentNotFoundException;
import com.studentapp.model.Student;
import com.studentapp.service.StudentService;

@RestController
@RequestMapping("/student-api")
public class StudentController {
	@Autowired
	StudentService studentService;
@PostMapping("/students")
Student addStudent(@RequestBody Student student) {
	return studentService.addStudent(student);
}
@DeleteMapping("/students/delete-one/{id}")
boolean deleteBook(@PathVariable("id") int id) throws StudentNotFoundException {
return studentService.deleteStudent(id);
}
@GetMapping("/students/get-one/{id}")
Student getStudentsById(@PathVariable("id")int id)throws StudentNotFoundException{
	return studentService.getStudentById(id);
}
@GetMapping("/students/dept/{dept}")
List<Student> getStudentByDept(@PathVariable("dept")String dept) throws StudentNotFoundException{
	return studentService.getStudentsByDept(dept);
}
@GetMapping("/students/city/{city}")
List<Student> getStudentByCity(@PathVariable("city")String city) throws StudentNotFoundException{
	return studentService.getStudentsByCity(city);
}
@GetMapping("/students/age/{age}")
List<Student> findByAge(@PathVariable("age") int age ) {
	return studentService.findByAge(age);
}
}
