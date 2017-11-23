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
			<th>Liczba Graczy</th>
			<th>Czas Gry</th>
			<th>Kategoria Gry</th>
			<th>Złożoność gry</th>
		</tr>
		<c:forEach items="${games}" var="game">
			<tr>
				<td>${game.id}</td>
				<td>${game.title}</td>
				<td>${game.maxNumberOfPlayers.maxPlayers}</td>
				<td>${game.maxPlayTime.maxTime}</td>
				<td>${game.gameCategory.category}</td>
				<td>${game.complexityRating}</td>
				<td><a href="editgame?id=${game.id}">Edytuj grę</a></td>
				<td><a href="remove?id=${game.id}">Usuń grę</a></td>
			</tr>
		</c:forEach>
	</table>
	</br>
	<a href="addgame">Dodaj nową grę</a>
	</br></br>
	<a href="../">Menu główne</a>
</body>
</html>