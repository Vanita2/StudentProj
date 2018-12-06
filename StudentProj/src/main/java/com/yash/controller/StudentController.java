package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.service.StudentService;
import com.yash.student.Address;
import com.yash.student.Student;

@RestController
public class StudentController {

	public StudentController() {
		System.out.println("Inside Student Controller");
	}

	@Autowired
	private StudentService studentservice;

	/* Adding the student deta/ils in student database */

	/*
	 * @RequestMapping(value = "/student", method = RequestMethod.POST) public
	 * void add(@RequestBody Student student) { studentservice.add(student);q }
	 */

	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public ResponseEntity<Student> add(@RequestBody Student student) {
		int returnValue = studentservice.add(student);

		if (returnValue != 0)
			return new ResponseEntity<Student>(HttpStatus.CREATED);
		else
			return new ResponseEntity<Student>(HttpStatus.NOT_IMPLEMENTED);
	}

	@RequestMapping(value = "/address/{studentId}", method = RequestMethod.GET)
	public List<Address> findAddressByStudentId(@PathVariable int studentId) {
		List<Address> returnValue = studentservice.findAddressByStudentId(studentId);

		return returnValue;
	}

	/* Getting the student details in student database */

	@RequestMapping(value = "/getallstudent", method = RequestMethod.GET)

	public List<Student> getAllStudent() {

		List<Student> studentList = studentservice.getAllStudent();
		return studentList;
	}

	/*
	 * 
	 * Getting the student details by student id in student database
	 */

	@GetMapping
	@RequestMapping(value = "/getStudentId/{studentId}")

	public Student getStudentId(@PathVariable int studentId) {

		Student student = studentservice.getStudentId(studentId);
		return student;

	}

	/*
	 * 
	 * Updates the student details by student id in student database
	 */

	@PutMapping
	@RequestMapping(value = "/updateStudent")

	public int updateStudent(@RequestBody Student student) {
		studentservice.updateStudent(student);

		return 1;
	}

	/*
	 * 
	 * delete the student details by student id in student database
	 */

	@DeleteMapping
	@RequestMapping(value = "/deleteStudent/{studentId}")

	public int deleteStudent(@PathVariable int studentId) {

		studentservice.deleteStudent(studentId);
		return 1;

	}

}
