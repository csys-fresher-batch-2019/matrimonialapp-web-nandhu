package com.nandhu.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditProfileServlet
 */
public class EditProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String msg=null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ProfilesImpl p=new ProfilesImpl();
		String name=request.getParameter("username");
		long mob=Long.parseLong(request.getParameter("mob"));
		String occup=request.getParameter("occupation");
		int salary=Integer.parseInt(request.getParameter("salary"));
		msg=p.updateProfiles(occup,salary,name,mob);
		if (msg.equals("success")) {out.println("<script type=\"text/javascript\">");
		   out.println("alert('Updated Success');");
		   out.println("location='UserHome.jsp';");
		   out.println("</script>");
					}
		else {
			out.println("<script type=\"text/javascript\">");
			   out.println("alert('Update Fail');");
			   out.println("location='EditProfile.jsp';");
			   out.println("</script>");
		}
		
	}

}
