package com.nandhu.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemainingDays
 */
public class RemainingDays extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		MembershipDurationImpl p=new MembershipDurationImpl();
		List<MembershipDurationImpl> d=new ArrayList<MembershipDurationImpl>();

		int user_id=Integer.parseInt(request.getParameter("userid"));

				d=p.getRemainingDays(user_id);
				out.print("<div align=center>");
		 out.print("<h2>Remaining Days</h2>");
		 out.print("<br>");
			out.print("</div>");

		out.print("<table cellpadding=5 border=5 align=center><tr><th>User Name</th><th>Remaining Days</th></tr>");


		for (MembershipDurationImpl pi : d) {
			System.out.println(pi.getRemainingDays(user_id));
			
			out.print("<tr><td>"+pi.getUserName()+"</td><td>"+pi.getRemainingDays()+"</td></tr>");
			
		}
		out.print("</table>");
		out.print("<div align=center>");
		out.print("<br>");
		out.print("<button  onclick=\"window.location.href ='DurationDetails.jsp';\">Back</button>");
		out.print("</div>");
		
	}

}
