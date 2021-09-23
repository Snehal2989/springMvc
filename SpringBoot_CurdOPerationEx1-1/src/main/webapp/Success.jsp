<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function del() {
	alert("delete");
	document.fn.action="del";
	document.fn.submit();
}

function edit() {
	alert("edit");
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
</tr>
<c:forEach  items="${user}" var="u">
<tr>
<td><input type="radio" name="uid" value="${u.uid}"></td>
<td><c:out value="${u.name}"></c:out></td>
<td><c:out value="${u.uname}"></c:out></td>
<td><c:out value="${u.pass}"></c:out></td>
</tr>

</c:forEach>
</table>
<input type="button" value="Edit" onclick="edit()">
<input type="button" value="Delete" onclick="del()">
</form>
</body>
</html>