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
        <p>Имя:</p>
        <form:input path="firstName"/>
        <p>Фамилия:</p>
        <form:input path="lastName"/>
        <p>Отчество:</p>
        <form:input path="middleName"/>
        <p>Телефон:</p>
        <form:input path="phone"/>
        <p>E-mail:</p>
        <form:input path="email"/>
        <input name="step" type="hidden" value="1"/>
        <input type="submit"  value="Продолжить"/>
    </div>
</form:form>
</body>
</html>
