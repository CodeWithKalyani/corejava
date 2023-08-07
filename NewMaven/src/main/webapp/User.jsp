
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
h1{
box-shadow: 3px 3px 10px black;
}
h1{text-align: center;
   background-color: aqua;
   width: 500px;
   border: 0.1px solid black;
  border-radius: 0px 0px 120px
  }
  form{
text-align: center;
height: 500px;
width: 500px;
align-items: center;
align-content: center;
margin-left: 400px;
}
.bg{
border: 0px solid black;
box-shadow: 2px 2px 30px black;
animation-name: ess;
animation-duration: infinate;
}
.bg{
border: 1px solid black;
box-shadow: 2px 2px 10px skyblue;
}
.submit{
margin-top: 10px;
width: 70px;
height: 30px;
color: rgb(0,0,0);
border-radius: 5px;
background-color: rgb(255,255,255);
box-shadow: 1px 1px 10px rgb(0,0,0);
filter: drop-shadow(0 0 5px rgb(0,55,255));
transition: 2s;
 }
 .reset:hover{ 
 margin-top: 20px;
 box-shadow: 0px 0px 10px rgb(25,0,25);
 color: white;
 background-color: red;
 transition: 2s ease-in-out;
 border: 0px;}
</style>
<body style="margin-top: 0px; bacground-color:pink; "> 
<%@include file="header.jsp" %> 
	<center>
		<h1>User Registration</h1>
		<form action="user" method="post">
			FirstName <input type="text" name="fname" placeholder="enter your name"> <br>
		    LastName <input type="text" name="lname" placeholder="enter your name"> <br>
			g-mail <input type="text" name="gmailid" placeholder="enter your g-mailid"><br>
			password <input type="text" name="password" placeholder="enter your password"><br>
			Gender<br> <input type="radio" name="gender" value="male">male
			<input type="radio" name="gender" value="female">female<br>
			
			<input type="submit" value="add" name="operation">
			<input type="submit" value="delete" name="operation">
			<input type="submit" value="Update" name="operation">
		</form>
	</center>
	<%@include file="footer.jsp" %>
</body>
</html>