package com.nandhu.impl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CalculateExpiryDate
 */
public class CalculateExpiryDate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		MembershipDurationImpl p=new MembershipDurationImpl();
		HttpSession session=request.getSession();
		String u=(String)session.getAttribute("suserid");
		String p1=(String)session.getAttribute("splanid");
		int u1=Integer.parseInt(u);
		int p2=Integer.parseInt(p1);

		int month=Integer.parseInt(request.getParameter("month"));
		p.calculateExpiryDuration(u1,p2,month);
		response.sendRedirect("DurationDetails.jsp");
	}

}
