<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<pre>
<input type="hidden" name="uid" value="${st1.uid}">
Name:<input type="text" name="name" value="${st1.name}">
Username:<input type="text" name="uname" value="${st1.uname}">
Password:<input type="text" name="password" value="${st1.password}">
<input type="submit" value="update"> 
</pre>



</form>
</body>
</html>