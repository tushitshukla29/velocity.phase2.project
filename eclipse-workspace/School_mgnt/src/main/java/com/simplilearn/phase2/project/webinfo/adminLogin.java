package com.simplilearn.phase2.project.webinfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class adminLogin extends HttpServlet{

	private static final long serialVersionUID=1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("login.html").include(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//fetching data from the following places
		
		String userName = request.getParameter("UserEmail");
		String userpassword=request.getParameter("UserPassword");
		
		if(userName.equals("")  ||  userpassword.equals(""))
		{
			out.println("<h1 style='color:red '>Login Failed ! ** Required filed is missing </h1>");
		}
		else
			if(userName.equals("admin@gmail.com")  && userpassword.equals("admin@123"))
		{
					request.getRequestDispatcher("admin.jsp").include(request, response);
				
				
		}
		else
		{
			out.println("<h1 style='color:red '>Login Failed ! ** Creadentails are Invalid </h1>");
		}
		
		
	}
		


}
