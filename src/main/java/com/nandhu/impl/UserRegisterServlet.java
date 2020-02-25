package com.nandhu.impl;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class UserRegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ProfilesImpl p=new ProfilesImpl();
		
p.setUserName(request.getParameter("Name"));
p.setDob(java.sql.Date.valueOf(request.getParameter("dob")));
p.setGender(request.getParameter("gender"));
p.setReligion(request.getParameter("religion"));
p.setCaste(request.getParameter("caste"));
p.setCountry(request.getParameter("country"));
p.setState(request.getParameter("state"));
p.setCity(request.getParameter("city"));
p.setMobNo(Long.parseLong(request.getParameter("mob")));
p.setAadharNo(Long.parseLong(request.getParameter("aadhar")));
p.setMail(request.getParameter("mail"));
p.setHeight(Float.parseFloat(request.getParameter("height")));
p.setEducation(request.getParameter("education"));
p.setMaritalSts(request.getParameter("marital"));
p.setOccupation(request.getParameter("occup"));
p.setSalary(Integer.parseInt(request.getParameter("salary")));
p.setMembershipType(request.getParameter("plan"));
p.setPass(request.getParameter("pass"));
p.setPic(request.getParameter("pic"));
p.save(p);
response.sendRedirect("Login.jsp");
						}
}
