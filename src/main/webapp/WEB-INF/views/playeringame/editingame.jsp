<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edytuj graczy do gry</title>
</head>
<body>
	<h2>Edytuj graczy do gry</h2>
	<f:form action="editingame" method="post" modelAttribute="playerInGame">
		<div>
			Gracz:
			<f:select itemValue="id" path="player" items="${Player}"
				itemLabel="fullName" />
		</div>
		<div>
			Punkty:
			<f:input type="number" path="points" />
		</div>
		<f:hidden path="id" value="${playerInGame.id}" />
		<f:hidden path="gameInstance.id" />
		<div>
			<input type="submit" value="Zapisz zmiany" />
		</div>
	</f:form>
</body>
</html>