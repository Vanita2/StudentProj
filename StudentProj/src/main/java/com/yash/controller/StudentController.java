package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	/*
	 
	 Adding the student details in student database 
	 */
	
    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public void add(@RequestBody Student student)
    {
    	studentservice.add(student);
    }
    
    /*
	 
	 Getting the student details in student database 
	 */
    
    @RequestMapping(value="/getallstudent",method = RequestMethod.GET)
    
    public List<Student> getAllStudent(){
    	
    	List<Student> studentList = studentservice.getAllStudent();
		return studentList;
    }
    
    /*
	 
	 Getting the student details by student id in student database 
	 */
   
		@GetMapping
	@RequestMapping(value="/getStudentId/{studentId}")
   
    	public Student getStudentId(@PathVariable int studentId){
		
		Student student = studentservice.getStudentId(studentId);
			return student;
		
		}
		
		 /*
		 
		 Updates the student details by student id in student database 
		 */
	    
		
		@PutMapping
		@RequestMapping(value="/updateStudent")
		
		public int updateStudent(@RequestBody Student student ){
			studentservice.updateStudent(student);
			
			return 1;
		}
	
		
    }

	

