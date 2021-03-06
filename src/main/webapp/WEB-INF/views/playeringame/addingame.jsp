<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dodaj graczy do gry</title>
</head>
<body>
	<h2>Dodaj graczy do gry</h2>
	<f:form action="addingame" method="post" modelAttribute="playerInGame">
		<div>
			<f:errors path="*" />
		</div>
		<div>
			Gracz:
			<f:select itemValue="id" path="player" items="${Player}"
				itemLabel="fullName" />
			<f:errors path="player" cssClass="error" />
		</div>
		<div>
			Punkty:
			<f:input type="number" path="points" />
			<f:errors path="points" cssClass="error" />
		</div>
		<f:hidden path="id" value="${playerInGame.id}" />
		<input type="hidden" name="gameInstance" value="${gameInstanceId }" />
		<div>
			<input type="submit" value="Dodaj do gry" />
		</div>
	</f:form>
	</br>
	<a href="../">Menu główne</a>
</body>
</html>