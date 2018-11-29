package com.yash.daoimplementation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
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
	public List<Student> getAllStudent() {
		
		Session session= sessionFactory.getCurrentSession();
		
		Criteria criteria= session.createCriteria(Student.class);
		List<Student> studentList = (List<Student>) criteria.list();
		return studentList;
		
		
	}

}

