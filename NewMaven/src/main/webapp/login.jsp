<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %> 
 <center>
 <%String err1=(String)request.getAttribute("message") ;%>
 <%if(err1!=null){ %>
<%=err1 %>
<%} %>
<%String err=(String)request.getAttribute("error"); %>
<%if(err!=null){ %>
<%=err %>
<%} %>
<form action="" method="post"> <br>

g-mail <input type="text" name="gmail"
placeholder="enter your g-mail"><br>
password<input type="password" name="password"
placeholder="Enter password"> <br>
<input type="submit" value="Login">

</form>
</center>
<%@include file="footer.jsp" %>
</body>
</html>