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
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link href="<c:url value="/resources/css/layout.css" />" rel="stylesheet">
    <title>Регистрация</title>
</head>
<body>
<h2>Регистрация</h2>
<form:form method="POST" modelAttribute="newUser" action="/register">
    <div>
        <p>${user.firstName} ${user.lastName}, еще немного информации</p>
        <ul>
            <li>
                <input id="football" type="radio" name="sport" value="1">
                <label for="football">Футбол</label>
            </li>
            <li>
                <input id="hockey" type="radio" name="sport" value="2">
                <label for="hockey">Футбол</label>
            </li>
            <li>
                <input id="basketball" type="radio" name="sport" value="3">
                <label for="basketball">Футбол</label>
            </li>
        </ul>
        <p>Регион:</p>
        <select name="region" class="query-input">
            <option value="Moscow" name="moscow">Москва и МО</option>
            <option value="Samara" name="samara">Самарская область</option>
        </select>
        <p>Населенный пункт:</p>
        <select name="locality" class="query-input">
            <option value="moscow" name="moscow">Москва</option>
            <option value="kolomna" name="kolomna">Коломна</option>
            <option value="podolsk" name="podolsk">Подольск</option>
            <option value="khimki" name="khimki">Химки</option>
        </select>
        <input name="step" type="hidden" value="2"/>
        <input type="submit" value="Продолжить"/>
    </div>
</form:form>
</body>
</html>
