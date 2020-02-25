package com.nandhu.impl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class MembershipSaveServlet
 */
public class MembershipSaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		MembershipDurationImpl p=new MembershipDurationImpl();
		
		p.setMdUserId(Integer.parseInt(request.getParameter("userid")));
		p.setMdPlanId(Integer.parseInt(request.getParameter("planid")));
		HttpSession session=request.getSession();
		session.setAttribute("suserid", request.getParameter("userid"));
		session.setAttribute("splanid", request.getParameter("planid"));
		p.saveMembershipDurationDetails(p);
		response.sendRedirect("CalculateExpiryDate.jsp");

	}
	
}
