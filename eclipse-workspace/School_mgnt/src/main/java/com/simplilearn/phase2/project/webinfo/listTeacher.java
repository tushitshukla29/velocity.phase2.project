package com.simplilearn.phase2.project.webinfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.simplilearn.phase2.project.Teachers;
import com.simplilearn.phase2.project.util.HibernateSessionUtil;
@WebServlet("/list-teacher")
public class listTeacher  extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		try {
			// Build Hibernate session factory
			SessionFactory factory = HibernateSessionUtil.buildSessionFactory();
			
			// Create the session object
			Session session= factory.openSession();
			
			// Read the Customers 
			
			List<Teachers> Teacher = session.createQuery("from Teacher").list();
			
			//show data as table.
			out.print("<h1 style='align-center' color='green'> Classess List :- </h1>");
			
			out.print("<style> table,td,th {"
					+ "border:2px solid red;"
					+ "padding: 10px; "
					+ "}</style>");
			out.print("<table >");
			out.print("<tr>");
				out.print("<th> Teacher Id</th>");
				out.print("<th>  Teacher Name</th>");
				out.print("<th>  Teacher Email</th>");
				out.print("<th>  Teacher Address</th>");
				out.print("<th>  Teacher Subject</th>");
				
				
				;
				
			out.print("</tr>");
			
			for(Teachers p : Teacher) {
				out.print("<tr>");
				out.print("<td>"+p.getId()+"</td>");
				out.print("<td>"+p.getTeacher_name()+"</td>");
				out.print("<td>"+p.getTeacher_email()+"</td>");
				out.print("<td>"+p.getTeacher_address()+"</td>");
				out.print("<td>"+p.getTeacher_subject()+"</td>");
				
				out.print("</tr>");
			}
			out.print("</table><br><br>");
			out.print("<h3><a href='add_teacher'>Back </a></h3>");
			// close session
			session.close();
		} catch (Exception e) {
			out.print("<h3 style='color:red'> OPPS Hibernate session is failed Due to some error ! </h3>");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
