<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dodaj grę</title>
</head>
<body>
	<h2>Dodaj Grę</h2>
	<f:form action="addgame" method="post" modelAttribute="game">
		<div>
			<f:errors path="*" />
		</div>
		<div>
			Gracz:
			<f:select itemValue="id" path="player" items="${Player}"
				itemLabel="fullName" /><f:errors path="player" cssClass="error"/>
		</div>
		<div>
			Punkty:
			<f:input path="points" /><f:errors path="points" cssClass="error"/>
		</div>
		<div>
			Rozgrywka: (chyba nie jest tu potrzebna)
			<f:select itemValue="id" path="maxNumberOfPlayers" items="${MaxNumberOfPlayers}"
				itemLabel="maxPlayers" /><f:errors path="maxNumberOfPlayers" cssClass="error"/>
		</div>
		<div>
			<input type="submit" value="Dodaj do gry" />
		</div>
	</f:form>
</body>
</html>