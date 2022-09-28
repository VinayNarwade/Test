<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="/ErroPage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%--accept the parameter --%>
<%
String fname = request.getParameter("fname");
String lname = request.getParameter("lname");
int age = Integer.parseInt(request.getParameter("age"));%>
<%if(fname.isBlank() || lname.isBlank() || age==0){
	throw new Exception("file are empty");
}
else{%>
	first name:<%=fname %><br>
	last name:<%=lname %><br>
	Age:<%=age %>
	
<% } %>
</body>
</html>
