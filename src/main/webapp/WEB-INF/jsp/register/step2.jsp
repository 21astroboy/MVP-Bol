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
    <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro' rel='stylesheet' type='text/css'>
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script src="https://www.sng-it.ru/bitrix/templates/master/js/jquery.inputmask.bundle.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $(".reg-region").on("change", function () {
                let id = $(this).find(":selected").val();
                $.ajax({
                    type: "GET",
                    url: "/region/" + id + "/locs",
                    success: function (data) {
                        let loc_select = $(".reg-locality");
                        loc_select.empty();
                        loc_select.append('<option value="" disabled selected>Населенный пункт</option>');
                        for (let i = 0; i < data.length; i++) {
                            loc_select.append("<option value=" + data[i].id + ">" + data[i].name + "</option>");
                        }
                        loc_select.change();
                    }
                });
            });
        });

    </script>
    <title>Bolsta</title>
</head>
<body>
<div class="main-page">
    <div class="reg-page-container">
        <form:form method="POST" modelAttribute="newUser" action="/register">
            <div>
                <div class="logo-cont">
                    <a href="/">
                        <img class="reg-logo" src="<c:url value="/resources/images/bolsta.png" />"
                             alt="Bolsta - спортивная социальная сеть">
                    </a>
                </div>
                <select class="log-reg-input reg-input reg-select reg-region">
                    <option value="" disabled selected>Регион</option>
                    <c:forEach items="${regions}" var="region">
                    <option value="${region.id}">${region.name}</option>
                    </c:forEach>
                </select>

                <select class="log-reg-input reg-input reg-select reg-locality">
                    <option value="" disabled selected>Населенный пункт</option>
                    <c:forEach items="${localities}" var="locality">
                        <option value="${locality.id}">${locality.name}</option>
                    </c:forEach>
                </select>
                <div class="log-reg-buttons reg-buttons">
                    <input name="step" type="hidden" value="2"/>
                    <button type="button" class="log-reg-button reg-button reg-back"> <</button>
                    <button type="submit" class="log-reg-button reg-button reg-next">Продолжить</button>
                </div>
            </div>
        </form:form>

    </div>
</div>
</body>
</html>

