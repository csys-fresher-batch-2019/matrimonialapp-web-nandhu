package com.nandhu.impl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdatePlan extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
MembershipPlanImpl p=new MembershipPlanImpl();
		
	int planid=Integer.parseInt(request.getParameter("planid"));
	int amount=	Integer.parseInt(request.getParameter("amount"));
		p.updatePlan(amount,planid);
		response.sendRedirect("plan.jsp");
		
		
	}

}
