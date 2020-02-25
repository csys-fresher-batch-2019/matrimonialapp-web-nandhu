package com.nandhu.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
String msg=null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		AdminLoginImpl a = new AdminLoginImpl();
		a.setUserName(request.getParameter("userName"));
		a.setPassword(request.getParameter("password"));
		try
		{
		msg=a.adminLogin(a);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		if (msg.equals("success")) {

			response.sendRedirect("AdminHome.jsp");
		}
		else {
			out.println("<script type=\"text/javascript\">");
			   out.println("alert('UserName or password incorrect');");
			   out.println("location='AdminLogin.jsp';");
			   out.println("</script>");
			
		}
			}

}
