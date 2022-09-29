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
    <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro' rel='stylesheet' type='text/css'>

    <title>Bolsta</title>
</head>
<body>
<div class="main-page">
<div class="main-page-container">
    <div class="main-page-banner">
        <h1>Bolsta</h1>
        <h2>спортивная социальная сеть</h2>
    </div>
    <div class="main-page-login-form-container">
        <form action="/login">
            <div>
            <label for="login">Логин:</label>
            <input type="text" name="login">
            </div>
            <div>
            <label for="password">Пароль:</label>
            <input type="password" name="password">
            </div>
            <input type="submit" name="login_submit">
        </form>
    </div>
    <div class="footer"></div>
</div>
</div>
</body>
</html>
