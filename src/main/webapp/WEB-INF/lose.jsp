
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Ты потерял память. Принять вызов НЛО?</h1>

<form class="form-horizontal" >
    <fieldset>

        <!-- Form Name -->
        <legend></legend>

        <!-- Button (Double) -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="button1id"></label>
            <div class="col-md-8">
                <button id="button1id" name="button1id" class="btn btn-success"><a href="accept">Принять вызов</a></button>
                <button id="button2id" name="button2id" class="btn btn-danger"><a href="decline">Отклонить вызов</a></button>
            </div>
        </div>



    </fieldset>
</form>
<br>
<br>
<br>
<br>
<br>
<p>Количество игр: ${sessionScope.counter}</p>
<p>Имя игрока: ${sessionScope.name}</p>



</body>
</html>
