package com.basic.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.basic.entity.Student;
import com.basic.util.HibernateUtil;

public class StudentDao {

	public Student saveStudent(Student s) {

		Session session = HibernateUtil.getSession();
		Transaction txn = session.beginTransaction();

		session.save(s);

		txn.commit();

		System.out.println("Data saved Successfully..!!");
		session.close();

		return s;
	}
}
