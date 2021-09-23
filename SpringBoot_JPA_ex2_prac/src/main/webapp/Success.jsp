<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function del()
{
  alert("Delete data")
  document.fn.action="delete";
  document.fn.submit();
}

function edt()
{
  alert("Edit data")
  document.fn.action="edit";
  document.fn.submit();
  }
</script>
</head>
<body>
<form name="fn">
<table border="1px">
<tr>
<th>Select<th>
<th>Name</th>
<th>Username</th>
<th>Password</th>
<th>mobileno</th>
</tr>

<c:forEach items="${data}" var="us">
<tr>
<td><input type="radio" name="uid" value="${us.uid}"></td>
<td><c:out value="${us.name}"></c:out></td>
<td><c:out value="${us.uname}"></c:out></td>
<td><c:out value="${us.pass}"></c:out></td>
<td><c:out value="${us.mbno}"></c:out></td>
</tr>
</c:forEach>

</table>
<input type="button" value="EDIT" onclick="edt()">
<input type="button" value="DELETE" onclick="del()">
</form>
</body>
</html>