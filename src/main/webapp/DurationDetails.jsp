<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="a_header.jsp" %>
     
    <%@ page import="com.nandhu.impl.MembershipDurationImpl" %>
    <%@ page import="com.nandhu.dao.MembershipDurationDAO" %>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="java.util.List" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shyloo Matrimony</title>
</head>
<body>
<form>
<%
MembershipDurationImpl p=new MembershipDurationImpl();
List<MembershipDurationImpl> d=new ArrayList<MembershipDurationImpl>();

	
 try {
		d=p.getMembershipDetails();
	}
catch(Exception e)
{
	e.printStackTrace();
}
	

out.print("<center><h3>Duration Details</h3></center>");
out.print("<table  border=5 align=center><tr><th>Member Id</th><th>User Id</th><th>Plan Id</th><th>Expiry Date</th></tr>");


for (MembershipDurationImpl pi : d) {
	//System.out.println(pi.getMembershipDetails());
	out.print("<tr><td>"+pi.getMemberId()+"</td><td>"+pi.getMdUserId()+"</td><td>"+pi.getMdPlanId()+"</td><td>"+pi.getExpiryDate()+"</td></tr>");
	
}
//out.print("<button onclick="window.location,href=''">update</button>);
out.print("<center><a href='UpdateExpiryDate.jsp'>update</a></center>");
out.print("<br>");
out.print("</table>");

%><br>
<center><a href='RemainingDays.jsp'>Get Remaining Days</a></center>
</form>
</body>
</html>