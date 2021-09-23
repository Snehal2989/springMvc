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
<input type="hidden" name="uid" value="${u.uid}">
Name:<input type="text" name="name" value="${u.name}"> 
Username:<input type="text" name="uname" value="${u.uname}"> 
Password:<input type="text" name="pass" value="${u.pass}"> 
<input type="submit" value="Update"> 
</pre>
</form>
</body>
</html>