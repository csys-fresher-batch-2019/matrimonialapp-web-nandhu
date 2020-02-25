<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="header.jsp" %>
   <%@ page import="com.nandhu.impl.RequestStatusImpl" %>
    <%@ page import="com.nandhu.dao.RequestStatusDAO" %>
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
String n=(String)session.getAttribute("semail");
out.print("<h2>Welcome </h2>"+n+"<h2> to our Matrimonial Site</h2>");
RequestStatusImpl p=new RequestStatusImpl();
List<RequestStatusImpl> d=new ArrayList<RequestStatusImpl>();


 try {
		d=p.getRequestorList(n);
 }		
catch(Exception e)
{
	e.printStackTrace();
}
	

out.print("<table  cellpadding=8 border=5 align=center><tr><th>Interested Profiles</th><th>Status</th></tr>");


for (RequestStatusImpl pi : d) {
	System.out.println(pi.getRequestorList(n));
	
	out.print("<tr><td>"+pi.getAcceptor()+"</td><td>"+pi.getStatus()+"</td></tr>");
	

}

out.print("</table>");

%>




</body>
</html>