package com.basic.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.basic.dao.StudentDao;
import com.basic.entity.Student;
import com.basic.util.HibernateUtil;

public class StudentServlet extends HttpServlet{
	
	StudentDao stdDao = new StudentDao();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Inside Student servlet - Post Method..!!");
		
		Student std = new Student();
		std.setFirstName(req.getParameter("fname"));
		std.setLastName(req.getParameter("lname"));
		std.setCourse(req.getParameter("course"));
		std.setAddress(req.getParameter("address"));

		
		Student savedStudent = stdDao.saveStudent(std);
		
		resp.sendRedirect( "index.jsp?name=Saved to DB!!!" );
		
	}

	
}
