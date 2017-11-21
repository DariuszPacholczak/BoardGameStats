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
			Tytuł:
			<f:input path="title" />
		</div>
		<div>
			Ilość graczy:
			<f:select path="maxNumberOfPlayers" items="${MaxNumberOfPlayers}" itemLabel="maxPlayers" />
		</div>
		<div>
			Czas gry:
			<f:select path="maxPlayTime" items="${MaxPlayTime}" itemLabel="maxTime" />
		</div>
		<div>
			Kategoria gry:
			<f:select path="gameCategory" items="${GameCategory}" itemLabel="category" />
		</div>
		<div>
			Złożoność:
			<f:input path="complexityRating" />
		</div>
		<div>
			<input type="submit" value="Dodaj grę" />
		</div>
	</f:form>
</body>
</html>