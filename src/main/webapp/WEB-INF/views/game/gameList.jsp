<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista gier</title>
</head>
<body>
	<h2>Lista gier</h2>
	<table>
		<tr>
			<th>Id</th>
			<th>Tytuł</th>
			<th>Czas Gry</th>
			<th>Liczba Graczy</th>
			<th>Złożoność gry</th>
			<th>Kategoria Gry</th>
			<th>Mechaniki</th>
		</tr>
		<c:forEach items="${games}" var="game">
			<tr>
				<td>${game.id}</td>
				<td>${game.title}</td>
				<td>${game.PlayTime}</td>
				<td>${game.NumOfPlayers}</td>
				<td>${game.ComplexityRating}</td>
				<td>${game.GameCategory}</td>
				<td>${game.GameMechanics}</td>
				<td><a href="edit?id=${game.id}">Edytuj grę</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="add">Dodaj nową grę</a>
</body>
</html>