<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="<c:url value="/resources/style.css" />">
    <title>Login</title>
</head>
<body>

<div class="login-form-container">
    <form name="loginForm" class="login-form" action="/login" method="POST">
        <h1>Войти</h1>
        <input type="text" placeholder="Почта или телефон" name="username" id="login">
        <input type="password" placeholder="Пароль" name="password" id="password">
        <button type="submit" name="submit" value="submit">Войти</button>
        <c:if test="${not empty authFailedMessage}">
            <p class="error">${authFailedMessage}</p>
        </c:if>
    </form>

</div>

</body>
</html>
