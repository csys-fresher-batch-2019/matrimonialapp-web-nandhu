<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@include file="header.jsp" %>
   <%@ page import="com.nandhu.impl.ProfilesImpl" %>
    <%@ page import="com.nandhu.dao.ProfilesInterfaceDAO" %>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shyloo Matrimony</title>
</head>
<body>
<div>
<form action="HeightServlet" method="post">
<h1>Display Profile as per their Height</h1>
<table  align="left" cellpadding="7" >
<tr>
<td><h3 >Enter Gender:</h3>
</td>
<td><input type="radio" name="gender" value="M"> Male<br>
  <input type="radio" name="gender" value="F"> Female<br>
</td>
</tr>
<tr>
<td><h3 >Enter Height:</h3>
</td>
<td><input type="float" name="height" required/>
</td>
</tr>
<tr>
<td align="right">
<input type="submit" name="submit" value="submit" >
<td>
</tr>
</table>
</form>
</div>

</body>
</html>