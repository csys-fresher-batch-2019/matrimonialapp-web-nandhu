package com.nandhu.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChangePasswordServlet
 */
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String msg=null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProfilesImpl p=new ProfilesImpl();
		PrintWriter out = response.getWriter();
		String Mail=request.getParameter("mail");
		String OPass=request.getParameter("opass");
		String NPass=request.getParameter("npass");
		msg=p.changePassword(Mail,OPass,NPass);
		if (msg.equals("success")) {out.println("<script type=\"text/javascript\">");
		   out.println("alert('Updated Success');");
		   out.println("location='UserHome.jsp';");
		   out.println("</script>");
					}
		else {
			out.println("<script type=\"text/javascript\">");
			   out.println("alert('User or password incorrect');");
			   out.println("location='ChangePass.jsp';");
			   out.println("</script>");
		}

	}

}
