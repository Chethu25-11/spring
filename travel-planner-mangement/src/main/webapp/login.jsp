<html>
<body>

<h2>Login</h2>

<c:if test="${not empty error}">
    <p style="color:red">${error}</p>
</c:if>

<form action="login" method="post">
    Name: <input type="text" name="name" required><br><br>
    Km: <input type="km" name="km" required><br><br>
    <button type="submit">Login</button>
</form>

</body>
</html>
