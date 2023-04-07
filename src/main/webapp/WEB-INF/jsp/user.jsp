<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="<c:url value="/resources/style.css" />">
    <title>User information</title>
</head>
<body>
<form action="#" method="post">
    <div>
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>
    </div>
    <div>
        <label for="surname">Surname:</label>
        <input type="text" id="surname" name="surname" required>
    </div>
    <div>
        <label for="middlename">Middlename:</label>
        <input type="text" id="middlename" name="middlename" required>
    </div>
    <div>
        <label for="telephone">Telephone number:</label>
        <input type="tel" id="telephone" name="telephone" required>
    </div>
    <div>
        <label for="birthdate">Date of birth:</label>
        <input type="date" id="birthdate" name="birthdate" required>
    </div>
    <div>
        <label for="sex">Sex:</label>
        <select id="sex" name="sex" required>
            <option value="male">Male</option>
            <option value="female">Female</option>
            <option value="other">Other</option>
        </select>
    </div>
    <input type="hidden" id="place" name="place" value="New York">
    <div>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
    </div>
    <div>
        <label for="confirm-password">Confirm Password:</label>
        <input type="password" id="confirm-password" name="confirm-password" required>
    </div>
    <div>
        <button type="submit">Submit</button>
    </div>
</form>

</body>
</html>
