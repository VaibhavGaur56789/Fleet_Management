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
<td><c:out value="${v.getVehicleId() }"></c:out></td>
<td><c:out value="${v.getCustomerId() }"></c:out></td>
<td><c:out value="${v.getVehicleName() }"></c:out></td>
<td><c:out value="${v.getCreateTs() }"></c:out></td>
</tr>
</c:forEach>
</table>


</body>
</html>