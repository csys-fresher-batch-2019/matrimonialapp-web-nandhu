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
 * Servlet implementation class CityServlet
 */
public class CityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ProfilesImpl p=new ProfilesImpl();
		List<ProfilesImpl> d=new ArrayList<ProfilesImpl>();
	
		String gender=request.getParameter("gender");
		String city=request.getParameter("city");

		 try {
				d=p.getCityProfile(gender,city);
		 }		
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
		
		out.print("<center><h3>User's Profile</h3></center>");
out.print("<table border=5 align=center><tr><th>Name</th><th>Picture</th><th>DOB</th><th>Gender</th><th>Religion</th><th>Caste</th><th>Country</th><th>State</th><th>City</th><th>Mob.No</th><th>Height</th><th>Education</th><th>Occupation</th><th>Marital status</th><th>Salary</th></tr>");

		
		for (ProfilesImpl pi : d) {
			System.out.println(pi.getCityProfile(gender,city));
			out.print("<tr><td>"+pi.getUserName()+"</td><td><img src=images/"+pi.getPic()+" height='100' width='100'> </td><td>"+pi.getDob()+"</td><td>"+pi.getGender()+"</td><td>"+pi.getReligion()+"</td><td>"+pi.getCaste()+"</td><td>"+pi.getCountry()+"</td><td>"+pi.getState()+"</td><td>"+pi.getCity()+"</td><td>"+pi.getMobNo()+"</td><td>"+pi.getHeight()+"</td><td>"+pi.getEducation()+"</td><td>"+pi.getOccupation()+"</td><td>"+pi.getMaritalSts()+"</td><td>"+pi.getSalary()+"</td></tr>");
			out.print("<br>");
		}
		
		out.print("</table>");
		
		//out.print("<button onclick=\"window.location.href ='UserProfile.jsp';\">Back</button>");
		}


	}


