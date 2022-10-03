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
            <img src="<c:url value="/resources/images/bolsta.png" />" alt="Bolsta - спортивная социальная сеть">
        </div>

        <form action="/login">
            <div class="main-page-login-form-container">
                <input type="text" placeholder="Почта или телефон" name="login" id="login"
                       class="log-reg-input main-page-input login">
                <input type="password" placeholder="Пароль" name="password" id="password" class="log-reg-input main-page-input">
                <a href="/forgot" class="forgot-pass">Забыли пароль?</a>
                <div class="log-reg-buttons">
                    <a href="/register" class="register">Регистрация</a>
                    <button type="submit" name="login_submit" class="log-reg-button log-button">Войти</button>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
