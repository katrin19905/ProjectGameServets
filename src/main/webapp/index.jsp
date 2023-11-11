<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Пролог</title>
</head>
<body>
<h1><%= "Пролог" %></h1>
<br/>
<br/>
<br>
<p>Ты стоишь в космическом порту и готов подняться на борт</p>
<p>своего корабля. Разве ты не об этом мечтал? Стать капитаном</p>
<p>галактического судна с экипажем, который будет совершать</p>
<p>подвиги под твоим командованием.</p>
<p>Так что вперед!</p>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<form class="form-horizontal"  method="post" >
    <fieldset>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="name">Введите имя на английском и нажмите ENTER</label>
            <div class="col-md-4">
                <input id="name" name="name" type="text" placeholder="Введите имя" class="form-control input-md" required="required" width="50%" value="${sessionScope.name}">

            </div>
        </div>

        <div class="form-group">
            <label class="col-md-4 control-label" for="submit"></label>
            <div class="col-md-4">
                <button id="submit" name="submit" class="btn btn-success">
                    <a href="lose" >Вперед к игре!</a>
                </button>
            </div>
        </div>

    </fieldset>
</form>

<%
    //System.out.println("print");
    String name = request.getParameter("name");
    //System.out.println(name);
    request.getSession().setAttribute("name", name);

%>

</body>
</html>