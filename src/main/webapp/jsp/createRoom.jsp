<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<form name="addRoom" method="post" action="controller">
    <input type="hidden" name="command" value="add"/>
    Room number:<br/>
    <input type="text" name="idRoom" value=""/>
    <br/>Room name:<br/>
    <input type="text" name="roomName" value=""/>
    <br/>Country list:<br/>
    <input type="text" name="country" value=""/>
    <br/>Country code:<br/>
    <input type="text" name="countryCode" value=""/>
    <br/>
    <input type="submit" value="Save" name="save"/>
</form>
<hr/>
</body>
</html>
