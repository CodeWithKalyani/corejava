<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcomepage</title>
</head>
<body>

<%String name =(String)session.getAttribute("user1"); %>
<%if(name!=null){ %>
<%=name %>
<%} %>
</body>
</html>