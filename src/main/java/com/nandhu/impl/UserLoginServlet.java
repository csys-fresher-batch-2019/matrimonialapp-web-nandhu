package com.nandhu.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nandhu.impl.ProfilesImpl;


public class UserLoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	String msg=null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ProfilesImpl p=new ProfilesImpl();
		String Mail=request.getParameter("mail");
		String Pass=request.getParameter("pass");
		HttpSession session=request.getSession();
		session.setAttribute("semail", Mail);
		msg=p.userLogin(Mail,Pass);
		//System.out.println(msg);
		if (msg.equals("success")) {
			response.sendRedirect("UserHome.jsp");
		}
		else {
			out.println("<script type=\"text/javascript\">");
			   out.println("alert('UserName or password incorrect');");
			   out.println("location='Login.jsp';");
			   out.println("</script>");
		}

	}
}
	
