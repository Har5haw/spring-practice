<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Student confirmation</title>
</head>
<body>
	student confirmed: ${student.firstName} ${student.secondName}
	<br>
	<br> Country: ${student.country}
	<br>
	<br> Favorite Language : ${student.favoriteLanguage}
	<br>
	<br> Operating System:
	<ul>
		<c:forEach var="tmp" items="${student.operatingSystem}">
			<li>${tmp}</li>
		</c:forEach>
	</ul>
</body>
</html>