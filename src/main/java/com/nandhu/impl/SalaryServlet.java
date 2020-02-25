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
 * Servlet implementation class SalaryServlet
 */
public class SalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ProfilesImpl p=new ProfilesImpl();
		List<ProfilesImpl> d=new ArrayList<ProfilesImpl>();

		int sal=Integer.parseInt(request.getParameter("salary"));
		String gender=request.getParameter("gender");

		 try {
			 d=p.getSalaryDetails(sal, gender);
		 }		
		catch(Exception e)
		{
			e.printStackTrace();
		}
			

		out.print("<table border=5 align=center><tr><th>Name</th><th>Picture</th><th>DOB</th><th>Gender</th><th>Religion</th><th>Caste</th><th>Country</th><th>State</th><th>City</th><th>Mob.No</th><th>Height</th><th>Education</th><th>Occupation</th><th>Marital status</th><th>Salary</th><th>Action</th></tr>");


		for (ProfilesImpl pi : d) {
			System.out.println(pi.getSalaryDetails(sal, gender));
			
			out.print("<tr><td>"+pi.getUserName()+"</td><td><img src=images/"+pi.getPic()+" height='100' width='100'> </td><td>"+pi.getDob()+"</td><td>"+pi.getGender()+"</td><td>"+pi.getReligion()+"</td><td>"+pi.getCaste()+"</td><td>"+pi.getCountry()+"</td><td>"+pi.getState()+"</td><td>"+pi.getCity()+"</td><td>"+pi.getMobNo()+"</td><td>"+pi.getHeight()+"</td><td>"+pi.getEducation()+"</td><td>"+pi.getOccupation()+"</td><td>"+pi.getMaritalSts()+"</td><td>"+pi.getSalary()+"</td><td><a href=SendRequest.jsp?mail="+pi.getMail()+">Request</a></td></tr>");
			

			out.print("<br>");
		}

		out.print("</table>");
		out.print("<div align=center>");
		out.print("<br>");
		out.print("<button  onclick=\"window.location.href ='search.jsp';\">Back</button>");
		out.print("</div>");



	
	}

}
