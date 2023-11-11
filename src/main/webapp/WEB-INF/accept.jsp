<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><%= "Ты принял вызов. Поднимешься на мостик к капитану?" %></h1>

<form class="form-horizontal" >
    <fieldset>

        <!-- Form Name -->
        <legend></legend>

        <!-- Button (Double) -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="button1id"></label>
            <div class="col-md-8">
                <button id="button1id" name="button1id" class="btn btn-success"><a href="gotobridge">Подняться на мостик</a></button>
                <button id="button2id" name="button2id" class="btn btn-danger"><a href="dontgo">Отказаться подниматься на мостик</a></button>
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
