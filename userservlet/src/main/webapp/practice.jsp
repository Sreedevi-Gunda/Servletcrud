<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <% 
   String fruits [] = {"Apple","Mango","Banana","Orange","Grapes","Watermelon"}; 
   
       for(int i = 0;i< fruits.length;i++){
    	   
    	    
            String f = fruits[i];
            
            %>
            
            
            
            <%if(f.equals("Apple")){ %>
              <h3 style = color:red>
            <%= f %>
            </h3>
            <%} %>
            
             <%if(f.equals("Mango")){ %>
              <h3 style = "color: yellow;">
            <%= f %>
            </h3>
            <%} %>
          
            
            <% } %>
</body>
</html>