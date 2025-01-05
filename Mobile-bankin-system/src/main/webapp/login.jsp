<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bank Management System - Login</title>
    <link rel="stylesheet" href="login.css">
</head>
<body>
<div class="login-container" >
    <h2>Mobile Banking</h2>
    <form id="loginForm" action="login" method="post">
        <div class="form-group">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
        </div>
        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
        </div>
        <button type="submit" class="btn" value="login her">Login</button>
        <div id="error" style="color: red;">
            <% String error = (String) request.getAttribute("error"); %>
            <% if (error != null) { %>
            <p><%= error %></p>
            <% } %>
        </div>
        <div class="register">
            <p>Don't have an account? <a href="register.jsp">Register here</a></p>
        </div>
    </form>
</div>
</body>
</html>