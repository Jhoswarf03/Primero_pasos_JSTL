
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>welcome to Secion</h3>  


<form action="Lenguajedeexpresionprocesar.jsp">  
Enter Name:<input type="text" name="name" /><br/><br/>  
<input type="submit" value="go"/>  
</form>  
<%  
Cookie co = new Cookie("Nombre","valofsdfsfsr");
co.setMaxAge(365*24*60*60);
//response.addCookie(cooki);
response.addCookie(co);
session.setAttribute("user", "hola ");
%>  

<h1>First Cookis </h1>  
</body>
</html>