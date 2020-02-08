package com.shalintha.studentservice.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shalintha.studentservice.model.Student;
import com.shalintha.studentservice.service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getAllSrudents(){
		
		return studentService.getAllStudents();
	}
	
	@RequestMapping("/student/{id}")
	public Student getAStudent(@PathVariable int id) {
		return studentService.getAStudent(id);
	}
	

}
