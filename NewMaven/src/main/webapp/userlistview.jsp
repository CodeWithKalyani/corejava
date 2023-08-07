<%@page import="in.co.bean.UserBean"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Userlist" method="post">
<jsp:useBean id="Bean" class="in.co.bean.UserBean" scope="request"></jsp:useBean>
<%@include file="header.jsp" %>
<% List list =(List)request.getAttribute("list");
	%>
	<center>
		<div align="center">
			<h1>User List</h1>
		</div>
		<%Iterator<UserBean> it=list.iterator();
			if (list!= null) {
		%>
		<br>
		<table border="1" width="100%" align="center" cellpadding="7px"cellpadding="2">
		<tr style="background-color: yellow;">
			<tr>
				<th>Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Gender</th>
				<th>gmailid id</th>
				<th>password</th>
			</tr>
			<%
				while (it.hasNext()) {
						UserBean usb = (UserBean) it.next();%>
						<tr align="center" style="background-color: green">
			    <tr aglin="center">
				<td><%=usb.getId()%></td>
				<td><%=usb.getFname()%></td>
				<td><%=usb.getLname()%></td>
				<td><%=usb.getGender()%></td>
				<td><%=usb.getGmailid()%></td>
				<td><%=usb.getPassword()%></td>
				<%
					}
				%>
				<%
					}
					%>
			</tr>





		</table>
	
	</center>
<%@include file="footer.jsp" %>	
	</form>
</body>
</html>