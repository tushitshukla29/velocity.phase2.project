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

import com.simplilearn.phase2.project.Student;
import com.simplilearn.phase2.project.util.HibernateSessionUtil;
@WebServlet("/list_student")
public class listStudent extends HttpServlet{

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
			
			List<Student> student = session.createQuery("from Student").list();
			
			//show data as table.
			out.print("<h1 style='align-center' color='green'> Classess List :- </h1>");
			
			out.print("<style> table,td,th {"
					+ "border:2px solid red;"
					+ "padding: 10px; "
					+ "}</style>");
			out.print("<table >");
			out.print("<tr>");
				out.print("<th> Student Id</th>");
				out.print("<th>  Student Name</th>");
				out.print("<th>  Student class</th>");
				out.print("<th>  Student RollNumber</th>");
				out.print("<th>  Student Address</th>");
				out.print("<th>  Student Gender</th>");
				out.print("<th>  Student DateOfBirth</th>");
				
				;
				
			out.print("</tr>");
			
			for(Student p : student) {
				out.print("<tr>");
				out.print("<td>"+p.getId()+"</td>");
				out.print("<td>"+p.getName()+"</td>");
				out.print("<td>"+p.getRoll_number()+"</td>");
				out.print("<td>"+p.getAddress()+"</td>");
				out.print("<td>"+p.getGender()+"</td>");
				out.print("<td>"+p.getDob()+"</td>");
				out.print("<td>"+p.getClas()+"</td>");
			
				out.print("</tr>");
			}
			out.print("</table><br><br>");
			out.print("<h3><a href='Add_student'>Back </a></h3>");
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
