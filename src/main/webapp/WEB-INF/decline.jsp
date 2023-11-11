<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Ты отклонил вызов. Ты проиграл</p>
<br>
<br>
<form class="form-horizontal">
    <fieldset>

        <!-- Form Name -->
        <legend>${sessionScope.name}, попробуй снова!</legend>

        <!-- Button -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="singlebutton">

            </label>
            <div class="col-md-4">
                <button id="singlebutton" name="singlebutton" class="btn btn-primary">
                    <a href="newgame">Продолжить...</a>
                </button>
            </div>
        </div>

    </fieldset>
</form>
<br>
<br>
<p>Количество игр: ${sessionScope.counter}</p>
<p>Имя игрока: ${sessionScope.name}</p>
<br>
</body>
</html>
