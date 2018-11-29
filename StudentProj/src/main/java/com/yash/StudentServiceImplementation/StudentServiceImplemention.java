package com.yash.StudentServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.yash.dao.StudentDao;
import com.yash.service.StudentService;
import com.yash.student.Student;

@Service("StudentService")
public class StudentServiceImplemention implements StudentService {
	@Autowired
	private StudentDao studentdao;

	@Transactional(propagation=Propagation.REQUIRED)
	public void add(Student student) {
		// TODO Auto-generated method stub

		studentdao.add(student);

	}
}
