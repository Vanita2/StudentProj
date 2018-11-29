package com.yash.dao;

import java.util.List;

import com.yash.student.Student;

public interface StudentDao {
	
	public void add(Student student);
	

	public List<Student> getAllStudent();

	
}
