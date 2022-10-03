<%--
  Created by IntelliJ IDEA.
  User: aleta
  Date: 01.09.2022
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <link href="<c:url value="/resources/css/layout.css" />" rel="stylesheet">
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <title>Rooms admin page</title>
</head>
<body>

<c:forEach items="${regions}" var="region">
    <h3>${region.name} - ${region.code}</h3>
    <table border="1">
        <tr>
            <td>id</td>
            <td>Населенный пункт</td>
            <td>Часовой пояс</td>
        </tr>
        <c:forEach items="${region.localities}" var="locality">
            <tr>
                <td>${locality.id}</td>
                <td>${locality.name}</td>
                <td>${locality.timezone}</td>
            </tr>
        </c:forEach>
    </table>
</c:forEach>

</body>
</html>
