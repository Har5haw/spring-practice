<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Student form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName" />
		<br>
		<br>
		Second Name: <form:input path="secondName" />
		<br>
		<br>
		Country: 
		<form:select path="country">
			<form:options items="${student.countryOptions}" />
		</form:select>
		<br>
		<br>
		Favorite Language:
		<br>
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		<br>
		Python <form:radiobutton path="favoriteLanguage" value="Python" />
		<br>
		C++ <form:radiobutton path="favoriteLanguage" value="C++" />
		<br>
		JavaScript <form:radiobutton path="favoriteLanguage"
			value="JavaScript" />
		<br>
		<br>
		Operating System:
		<br>
		Linux <form:checkbox path="operatingSystem" value="Linux" />
		<br>
		Windows <form:checkbox path="operatingSystem" value="Windows" />
		<br>
		Mac OS <form:checkbox path="operatingSystem" value="Mac OS" />
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>