package com.yash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yash.service.StudentService;
import com.yash.student.Student;
@RestController
public class StudentController {
	
	
	public StudentController() {
		System.out.println("Inside Student Controller");
	}
	@Autowired
	private StudentService studentservice;
    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public void add(@RequestBody Student student)
    {
    	studentservice.add(student);
    }
	
}
