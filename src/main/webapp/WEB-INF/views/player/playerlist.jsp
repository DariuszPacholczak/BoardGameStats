<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista graczy</title>
</head>
<body>
	<h2>Lista graczy</h2>
	<table>
		<tr>
			<th>Id</th>
			<th>Imię</th>
			<th>Nazwisko</th>

		</tr>
		<c:forEach items="${players}" var="player">
			<tr>
				<td>${player.id}</td>
				<td>${player.firstName}</td>
				<td>${player.lastName}</td>
				<td><a href="editplayer?id=${player.id}">Edytuj gracza</a></td>
				<td><a href="remove?id=${player.id}">Usuń gracza</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="addplayer">Dodaj nowego gracza</a>
	</br></br>
	<a href="../">Menu główne</a>
</body>
</html>