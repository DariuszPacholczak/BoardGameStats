<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edytuj grę</title>
</head>
<body>
<body>
	<f:form action="edit" method="post" modelAttribute="game">
		<div>
			Tytuł:
			<f:input path="title" />
		</div>
		<div>
			Ilość graczy:
			<f:input type="number" path="numOfPlayers" />
		</div>
		<div>
			Czas gry:
			<f:input type="number" path="playTime" />
		</div>
		<div>
			Złożoność:
			<f:input path="complexityRating" />
		</div>
		<div>
			Kategoria gry:
			<f:input path="gameCategory" />
		</div>
		<div>
			<input type="submit" value="Zapisz grę" />
		</div>
	</f:form>
</body>
</html>