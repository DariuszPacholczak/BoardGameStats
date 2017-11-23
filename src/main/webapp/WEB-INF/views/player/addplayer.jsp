<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dodaj gracza</title>
</head>
<body>
	<h2>Dodaj gracza</h2>
	<f:form action="addplayer" method="post" modelAttribute="player">
		<div>
			Imię:
			<f:input path="firstName" /><f:errors path="firstName" cssClass="error"/>
		</div>
		<div>
			Nazwisko:
			<f:input path="lastName" /><f:errors path="lastName" cssClass="error"/>
		</div>
		<div>
			<input type="submit" value="Dodaj gracza" />
		</div>
	</f:form>
	</br>
	<a href="../">Menu główne</a>
</body>
</html>