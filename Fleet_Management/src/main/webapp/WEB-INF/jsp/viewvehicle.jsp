<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border = "1">
<tr>
<td>Vehicle ID</td>
<td>Customer ID</td>
<td>Vehicle Name</td>
<td>Current Date</td>
</tr>
<c:forEach items="${vehicle}" var="v">
<tr>
<td><c:out value="${v.getVehicle_id() }"></c:out></td>
<td><c:out value="${v.getCustomer_id() }"></c:out></td>
<td><c:out value="${v.getVehicle_name() }"></c:out></td>
<td><c:out value="${v.getCreate_ts() }"></c:out></td>
</tr>
</c:forEach>
</table>


</body>
</html>