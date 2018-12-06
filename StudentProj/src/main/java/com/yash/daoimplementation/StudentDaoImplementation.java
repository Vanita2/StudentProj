package com.yash.daoimplementation;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yash.dao.StudentDao;
import com.yash.student.Address;
import com.yash.student.Student;

@Repository("StudentDao")
public class StudentDaoImplementation implements StudentDao {
	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * public void add(Student student){
	 * 
	 * sessionFactory.getCurrentSession().saveOrUpdate(student);
	 * 
	 * 
	 * }
	 */
	public List<Student> getAllStudent() {

		Session session = sessionFactory.getCurrentSession();

		Criteria criteria = session.createCriteria(Student.class);
		List<Student> studentList = (List<Student>) criteria.list();
		return studentList;

	}

	public Student getStudentId(int studentId) {
		// TODO Auto-generated method stub

		Student student = (Student) sessionFactory.getCurrentSession().get(Student.class, studentId);
		return student;

	}

	public int updateStudent(Student student) {
		// TODO Auto-generated method stub

		sessionFactory.getCurrentSession().saveOrUpdate(student);
		return 1;
	}

	public int deleteStudent(int studentId) {
		// TODO Auto-generated method stub

		sessionFactory.getCurrentSession().delete(getStudentId(studentId));
		return 1;
	}

	public int add(Student student) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(student);
			return 1;
		} catch (Exception e) {
			return 0;// TODO: handle exception
		}
	}

	public List<Address> findAddressByStudentId(int studentId) {
		Session session = sessionFactory.getCurrentSession();
		Student student = session.get(Student.class, studentId);
		List<Address> addresses = student.getAddresses();
		System.out.println(student.getName());
		return addresses;
	}

}
