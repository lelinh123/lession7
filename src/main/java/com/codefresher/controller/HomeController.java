package com.codefresher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codefresher.model.Student;
import com.codefresher.service.StudentService;

@Controller
public class HomeController {
	
//	@Autowired
//	StudentService studentService;
	StudentService student = new StudentService();
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String gethome(Model model) {
		model.addAttribute("msg", "Spring Hello llll");
//		Student student = student.getStudent();
		model.addAttribute("student", student);
		return "home";
	}
}
