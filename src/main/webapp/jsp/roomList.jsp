<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="roomList" type="java.util.List"--%>
<html>
<head>
    <title>Room list</title>
</head>
<body>
<h1>View all rooms</h1>
<form name="listRoom" method="post" action="controller">
    <input type="hidden" name="command" value="listRoom"/>
    <table border="1" cellpadding="5" cellspacing="1">
        <tr>
            <th>Room number</th>
            <th>Room name</th>
            <th>Country</th>
            <th>Country code</th>
            <th>Open</th>
        </tr>

        <c:forEach items="${roomList}" var="room">
            <tr>
                <td>${room.idRoom}</td>
                <td>${room.roomName}</td>
                <td>${room.country}</td>
                <td>${room.countryCode}</td>
                <td><input type="submit" name="openRoom" value="Open room"></td>
            </tr>
        </c:forEach>
    </table>
</form>

</body>
</html>
