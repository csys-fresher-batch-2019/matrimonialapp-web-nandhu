<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="a_header.jsp" %>
    <%@ page import="com.nandhu.impl.MembershipPlanImpl" %>
    <%@ page import="com.nandhu.dao.MembershipPlanInterfaceDAO" %>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shyloo Matrimony</title>
</head>
<body>
<%
MembershipPlanImpl p=new MembershipPlanImpl();
List<MembershipPlanImpl> d=new ArrayList<MembershipPlanImpl>();

 try {
		d=p.getMembershipPlanDetails();
 }		
catch(Exception e)
{
	e.printStackTrace();
}
	

out.print("<center><h3>MEMBERSHIP PLAN </h3></center>");
out.print("<table border=5 align=center><tr><th>PLAN ID</th><th>MEMBERSHIP TYPE</th><th>TOTAL MONTH</th><th>AMOUNT</th></tr>");


for (MembershipPlanImpl pi : d) {
	//System.out.println(pi.getMembershipPlanDetails());
	out.print("<tr><td>"+pi.getPlanId()+"</td><td>"+pi.getMembershipType()+"</td><td>"+pi.getTotalMonths()+"</td><td>"+pi.getAmount()+"</td></tr>");
	out.print("<br>");
}
out.print("<center><a href='UpdatePlan.jsp'>update</a></center>");
out.print("<br>");
out.print("</table>");






%>
</body>
</html>