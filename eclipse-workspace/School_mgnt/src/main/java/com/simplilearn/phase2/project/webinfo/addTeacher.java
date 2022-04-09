package com.simplilearn.phase2.project.webinfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.simplilearn.phase2.project.Teachers;
import com.simplilearn.phase2.project.util.HibernateSessionUtil;

@WebServlet("/add_teacher")
public class addTeacher  extends HttpServlet{

	private static final long serialVersionID=1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("add_teacher.html").include(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//fetching data from the following places
		
		String teacherName = request.getParameter("teacher_name");
		String teacherEmail=request.getParameter("teacher_email");
		String teacherAddress=request.getParameter("teacher_address");
		String teacherSubject=request.getParameter("teacher_subject");
		
	
		
		try {
			//Building Hibernate Session factory
			SessionFactory factory = HibernateSessionUtil.buildSessionFactory();
			
			//Create Session object
			Session object =  factory.openSession();
			
			//create a product object
			Teachers cl = new Teachers(teacherName,teacherEmail,teacherAddress,teacherSubject);
			
			// Begin Transaction
			
			
			Transaction tx = object.beginTransaction();
			
			// Save Product 
			object.save(cl);
			
			//Commit Transaction
			tx.commit();
			
			
			if(object != null){
				out.print("<h3 style='color:green'> Class is Added into Database sucessfully ! </h3>");
			}
			
			//Closing the session object
			object.close();
			
			
		}catch (Exception e) {
			out.print("<h3 style='color:red'> OPPS!!!!! Hibernate session is failed due to some glitch! </h3>");
		}
		
	}

}
