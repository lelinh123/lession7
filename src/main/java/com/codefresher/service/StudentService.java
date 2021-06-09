package com.codefresher.service;

import org.springframework.stereotype.Service;

import com.codefresher.model.Student;
@Service
public class StudentService {
	//get student
	public Student getStudent() {
		Student student = new Student();
		student.setId(1);
		student.setName("lhlinh");
		student.setAddress("thanh xuan");
		
		return student;
	}
}
