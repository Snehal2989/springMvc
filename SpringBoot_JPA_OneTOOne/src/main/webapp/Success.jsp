<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function del()
{
	alert("Delete data");
	document.fn.action="delete";
	document.fn.submit();
}

function edt()
{
	alert("Edit data");
	document.fn.action="edit";
	document.fn.submit();
}


</script>
</head>
<body>
<form name="fn">
<table border="2px">
<tr>
<th>Select</th>
<th>Name</th>
<th>Username</th>
<th>Password</th>
<th>City</th>
</tr>

<c:forEach items="${data}" var="s">
<tr>
<td><input type="radio" name="sid" value="${s.sid}"></td>
<td><c:out value="${s.name}"></c:out></td>
<td><c:out value="${s.uname}"></c:out></td>
<td><c:out value="${s.pass}"></c:out></td>
<td><c:out value="${s.addr.city}"></c:out></td>
</tr>
</c:forEach>
</table>
<input type="button" value="Edit" onclick="edt()">
<input type="button" value="Delete" onclick="del()">
</form>
</body>
</html>