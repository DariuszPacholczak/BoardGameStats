<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista Rozgrywek</title>
</head>
<body>
	<h2>Lista Rozgrywek</h2>
	<table>
		<tr>
			<th>Id</th>
			<th>Nazwa gry</th>
			<th>Data rozgrywki</th>
		</tr>
		<c:forEach items="${gameInstances}" var="gameInstance">
			<tr>
				<td>${gameInstance.id}</td>
				<td>${gameInstance.game.title}</td>
				<td>${gameInstance.gameDate}</td>
				<td><a href="editinstance?id=${gameInstance.id}">Edytuj</a></td>
				<td><a href="remove?id=${gameInstance.id}">Usuń</a></td>
				<td><a href="../playeringame/ingamelist?id=${gameInstance.id}">Szczegóły</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="../">Menu główne</a>
</body>
</html>