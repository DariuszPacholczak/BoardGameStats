<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista graczy w grze</title>
</head>
<body>
	<h2>Lista graczy w grze</h2>
	<table>
		<tr>
			<th>Gracz</th>
			<th>Punkty</th>
		</tr>
		<c:forEach items="${playerInGames}" var="playerInGame">
			<tr>
				<td>${playerInGame.fullName()}</td>
				<td>${playerInGame.points}</td>
				<td><a href="editingame?id=${playerInGame.id}">Edytuj</a></td>
				<td><a href="remove?id=${playerInGame.id}">Usuń</a></td>
				<td><f:select itemValue="id" path="gameInstance" items="${Player}" itemLabel="fullName" /></td>
				<td><a href="=${playerInGame.id}">Przypisz</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="addingame">Dodaj</a>
	<a href="../">Menu główne</a>
</body>
</html>