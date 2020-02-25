package com.nandhu.impl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateExpiryDate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
MembershipDurationImpl p=new MembershipDurationImpl();
		
		p.setMdUserId(Integer.parseInt(request.getParameter("userid")));
		p.setMdPlanId(Integer.parseInt(request.getParameter("planid")));
		p.setMonthValidity(Integer.parseInt(request.getParameter("month")));
		p.updateExpiryDate(p);
		response.sendRedirect("DurationDetails.jsp");
		
	}

}
