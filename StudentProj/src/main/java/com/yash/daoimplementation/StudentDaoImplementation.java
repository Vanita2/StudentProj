package com.yash.daoimplementation;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yash.dao.StudentDao;
import com.yash.student.Student;

@Repository("StudentDao")
public class StudentDaoImplementation implements StudentDao {
	@Autowired
	private SessionFactory sessionFactory;
	public void add(Student student){
		
		sessionFactory.getCurrentSession().saveOrUpdate(student);
	
		
		}

}

