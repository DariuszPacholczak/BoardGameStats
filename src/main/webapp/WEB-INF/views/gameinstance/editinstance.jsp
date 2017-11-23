<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edytuj rozgrywkę</title>
</head>
<body>
	<h2>Edytuj rozgrywkę</h2>
	<f:form action="editinstance" method="post"
		modelAttribute="gameInstance">
		<div>
			Nazwa gry:
			<f:select itemValue="id" path="game" items="${Game}"
				itemLabel="title" />
		</div>
		<div>
			Data rozgrywki:
			<f:input type="date" path="gameDate" />
		</div>
		<div>
			<input type="submit" value="Edytuj rozgrywkę" />
		</div>
	</f:form>
</body>
</html>