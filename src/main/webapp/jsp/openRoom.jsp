<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<div style="text-align: center;">
    <head>
        <title>Room</title>
    </head>
    <style>
        input.bulb {
            width: 100px;
            height: 100px;
            background: yellow;
        }
    </style>

    <body>
    <h2>Room</h2><br/>
    <form action="controller" method="post" name="openRoom">
        <label>
            <input type="checkbox" class="bulb" value="Light bulb"/>
        </label>
    </form>
    </body>
</div>
</html>