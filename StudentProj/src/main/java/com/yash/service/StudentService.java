package com.yash.service;

import java.util.List;

import com.yash.student.Student;

public interface StudentService {
	
	public void add(Student student);
	
	public List<Student> getAllStudent();

}
