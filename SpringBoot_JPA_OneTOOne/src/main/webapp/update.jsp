<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<table="2px">
<pre>
<input type="hidden" name="sid" value="${s.sid}">
Name:<input type="text" name="name" value="${s.name}">
Username:<input type="text" name="uname" value="${s.uname}">
Password:<input type="text" name="pass" value="${s.pass}">
City:<input type="text" name="addr.city" value="${s.addr.city}">
<input type="submit" value="update">
</pre>



</table>

</form>
</body>
</html>