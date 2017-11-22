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
			Tytuł:
			<f:input path="title" /><f:errors path="title" cssClass="error"/>
		</div>
		<div>
			Ilość graczy:
			<f:select itemValue="id" path="maxNumberOfPlayers" items="${MaxNumberOfPlayers}"
				itemLabel="maxPlayers" /><f:errors path="maxNumberOfPlayers" cssClass="error"/>
		</div>
		<div>
			Czas gry:
			<f:select itemValue="id" path="maxPlayTime" items="${MaxPlayTime}"
				itemLabel="maxTime" /><f:errors path="maxPlayTime" cssClass="error"/>
		</div>
		<div>
			Kategoria gry:
			<f:select itemValue="id" path="gameCategory" items="${GameCategory}"
				itemLabel="category" /><f:errors path="gameCategory" cssClass="error"/>
		</div>
		<div>
			Złożoność:
			<f:input path="complexityRating" /><f:errors path="complexityRating" cssClass="error"/>
		</div>
		<div>
			<input type="submit" value="Dodaj grę" />
		</div>
	</f:form>
</body>
</html>