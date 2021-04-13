<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Customer confirmation</title>
<style>
table, th, td {
  margin: 5px;
  padding: 5px;
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>
	Customer confirmed: ${customer.firstName} ${customer.lastName}
	<br>
	<br>Postal Code: ${customer.postalCode}
	<br>
	<br>Passes: ${customer.freePasses}
	<br>
	<br>Course Code: ${customer.courseCode}
	<br>
	<br>
	<br>
	<h2>Data Base:</h2>
	<table>
	    <tr><th>  Id  </th><th>  First Name  </th>  <th>  Last Name  </th>  <th>  Free Passes  </th>  <th>  Postal Code  </th>  <th>  Course Code  </th></tr>
	    <tr>
    	<c:forEach var="tmp" items="${customersData}">
    		<tr><td>${tmp.customerId}</td><td>${tmp.firstName}</td>  <td>${tmp.lastName}</td>  <td>${tmp.freePasses}</td>  <td>${tmp.postalCode}</td>  <td>${tmp.courseCode}</td></tr>
    	</c:forEach>
    	</tr>
    </table>
</body>
</html>