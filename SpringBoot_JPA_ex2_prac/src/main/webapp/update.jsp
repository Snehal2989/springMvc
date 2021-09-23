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
<table>
<pre>
<input type="hidden" name="uid" value="${u.uid}">
Name:<input type="text" name="name" value="${u.name}">
Username:<input type="text" name="uname" value="${u.uname}">
Password:<input type="text" name="pass" value="${u.pass}">
Mobileno:<input type="text" name="mbno" value="${u.mbno}">
<input type="submit" value="update">
</pre>
</table>

</form>
</body>
</html>