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
    <title>Monitoring</title>
</head>
<body>
<p><a href="/">Назад</a></p>
<div class="table-wrapper">
    <table class="fl-table">
        <thead>
        <th>Комната</th>
        <th>Температура</th>
        <th>Влажность</th>
        <th>Дата</th>
        </thead>
        <c:forEach items="${logs}" var="log">
            <tr>
                <td>${log.roomId}</td>
                <td>${log.temp}</td>
                <td>${log.humidity}</td>
                <td>${log.date}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
