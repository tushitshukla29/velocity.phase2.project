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

import com.simplilearn.phase2.project.classes;
import com.simplilearn.phase2.project.util.HibernateSessionUtil;

@WebServlet("/List-classes")
public class listClasses extends HttpServlet{

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
			
			List<classes> clas = session.createQuery("from classes").list();
			
			//show data as table.
			out.print("<h1 style='align-center' color='green'> Classess List :- </h1>");
			
			out.print("<style> table,td,th {"
					+ "border:2px solid red;"
					+ "padding: 10px; "
					+ "}</style>");
			out.print("<table >");
			out.print("<tr>");
				out.print("<th> Class Id</th>");
				out.print("<th>  ClassName</th>");
				out.print("<th>  ClassRoom</th>");
				out.print("<th>  ClassSection</th>");
				
			out.print("</tr>");
			
			for(classes p : clas) {
				out.print("<tr>");
				out.print("<td>"+p.getId()+"</td>");
				out.print("<td>"+p.getclassroom()+"</td>");
				out.print("<td>"+p.getRoom_number()+"</td>");
				out.print("<td>"+p.getSection()+"</td>");
				
				out.print("</tr>");
			}
			out.print("</table><br><br>");
			out.print("<h3><a href='Add_school'>Back </a></h3>");
			// 3. close session
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
	

		

