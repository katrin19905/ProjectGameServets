<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<<h1> Попробуй пройти снова </h1>
<a href="http://localhost/ProjectGame_war_exploded/">Начать заново</a>
<br>
<br>
<br>
<p>Количество игр: ${sessionScope.counter}</p>
<p>Имя игрока: ${sessionScope.name}</p>
<br>

<br>
<br>
</body>
</html>
