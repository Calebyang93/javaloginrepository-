<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h2>Welcome, ${user.name}!</h2>
    <p>Username: ${user.username}</p>
    <p>Role: ${user.role}</p>
    <c:if test="${user.role == 'manager'}">
        <a href="restricted">Access Restricted Page</a><br><br>
    </c:if>
    <a href="logout">Logout</a>
</body>
</html>
