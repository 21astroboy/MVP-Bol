<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="<c:url value="/resources/style.css" />">
    <title>User information</title>
</head>
<body>
<form action="#" method="post">
    <div>
        <label for="username">Name:</label>
        <input type="text" id="username" name="firstname" required>
    </div>
    <div>
        <label for="surname">Surname:</label>
        <input type="text" id="surname" name="lastName" required>
    </div>
    <div>
        <label for="telephone">Telephone number:</label>
        <input type="tel" id="telephone" name="telephone" required>
    </div>
    <div>
        <label for="telephone">Phone code confirmation:</label>
        <input type="tel" id="code " name="phoneCode" required>
    </div>
    <div>
        <label for="birthdate">Date of birth:</label>
        <input type="date" id="birthdate" name="birthDate" required>
    </div>
    <div>
        <label for="sex">Sex:</label>
        <select id="sex" name="sex" required>
            <option value="male">Male</option>
            <option value="female">Female</option>
        </select>
    </div>
    <input type="hidden" id="place" name="town" value="">
    <div>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
    </div>
    <div>
        <label for="confirm-password">Confirm Password:</label>
        <input type="password" id="confirm-password" name="passwordConfirmation" required>
    </div>
    <div>
        <button type="submit">Submit</button>
    </div>
</form>

</body>
</html>
