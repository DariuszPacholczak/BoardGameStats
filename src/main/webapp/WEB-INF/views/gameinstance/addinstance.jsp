<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dodaj rozgrywkę</title>
</head>
<body>
	<h2>Dodaj rozgrywkę</h2>
	<f:form action="addinstance" method="post" modelAttribute="gameInstance">
		<div>
			Nazwa gry:
			<f:select itemValue="id" path="game" items="${Game}"
				itemLabel="title" /><f:errors path="game" cssClass="error"/>
		</div>
		<div>
			Data rozgrywki:
			<f:input type="date" path="gameDate" /><f:errors path="gameDate" cssClass="error"/>
		</div>
		<div>
			<input type="submit" value="Dodaj rozgrywkę" />
		</div>
	</f:form>
	</br>
	<a href="../">Menu główne</a>
</body>
</html>