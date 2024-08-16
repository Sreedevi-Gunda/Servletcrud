<%@page import="userservlet.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% User u  = (User)request.getAttribute("user"); %>
<form action = "update1" method = "get">
  Id:<input type = "number" name = "id" value = "<%= u.getId()%>">
  FirstName: <input type = "text" name = "fName" value = "<%= u.getFName()%>">
  LastName: <input type = "text" name = "lName" value = "<%= u.getLName()%>">
  Age:<input type = "number" name = "age" value = "<%= u.getAge()%>">
  Phone:<input type = "tel" name = "phone" value = "<%= u.getPhone()%>">
  Email:<input type = "email" name = "email" value = "<%= u.getEmail()%>">
  Password:<input type = "password" name = "pwd" value = "<%= u.getPwd()%>">
  Gender:<input type = "text" name = "gender" value = "<%= u.getGender()%>">
  <button>EDIT</button>
</form>
</body>
</html>