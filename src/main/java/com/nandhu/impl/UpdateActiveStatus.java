package com.nandhu.impl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UpdateActiveStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ProfilesImpl p=new ProfilesImpl();
		
		int userid=Integer.parseInt(request.getParameter("userid"));
		int activests=	Integer.parseInt(request.getParameter("activests"));
			p.updateActive(userid,activests);
			response.sendRedirect("AdminHome.jsp");
	
	}
	
}
