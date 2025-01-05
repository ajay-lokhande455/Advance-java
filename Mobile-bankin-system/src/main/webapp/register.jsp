<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bank Management System - Sign Up</title>
    <link rel="stylesheet" href="register.css">
</head>
<body>
<div class="signup-container">
    <h2>Create an Account</h2>
    <form action="register" method="post">
        <div class="form-group">
            <label for="fullname">Full Name:</label>
            <input type="text" id="fullname" name="fullname" required>
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
        </div>
        <div class="form-group">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
        </div>
        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
        </div>
        <div class="form-group">
            <label for="confirmPassword">Confirm Password:</label>
            <input type="password" id="confirmPassword" name="confirmPassword" required>
        </div>
        <div class="error" style="color: red;"    >
            <% String error = (String) request.getAttribute("error"); %>
            <% if (error != null) { %>
            <p><%= error %></p>
            <% } %>
        </div>
        <div class="success" style="color: green" ><% String success = (String) request.getAttribute("success"); %>
            <% if (success != null) { %>
            <p><%= success %></p>
            <% } %></div>
        <button type="submit" class="btn" value="sign up">Sign Up</button>
    </form>
</div>
<!--<script>-->
<!--    const form = document.getElementById('signupForm');-->
<!--    const errorMessage = document.getElementById('errorMessage');-->
<!--    const successMessage = document.getElementById('successMessage');-->

<!--    form.addEventListener('submit', (event) => {-->
<!--        event.preventDefault();-->
<!--        const fullname = form.fullname.value.trim();-->
<!--        const email = form.email.value.trim();-->
<!--        const username = form.username.value.trim();-->
<!--        const password = form.password.value.trim();-->
<!--        const confirmPassword = form.confirmPassword.value.trim();-->

<!--        errorMessage.textContent = '';-->
<!--        successMessage.textContent = '';-->

<!--        // Validate fields-->
<!--        if (password !== confirmPassword) {-->
<!--            errorMessage.textContent = "Passwords do not match!";-->
<!--            return;-->
<!--        }-->

<!--        if (password.length < 6) {-->
<!--            errorMessage.textContent = "Password must be at least 6 characters long.";-->
<!--            return;-->
<!--        }-->

<!--        // On successful validation-->
<!--        successMessage.textContent = "Sign-up successful! Redirecting...";-->
<!--        setTimeout(() => {-->
<!--            window.location.href = "login.html"; // Redirect to login page-->
<!--        }, 2000);-->
<!--    });-->
<!--</script>-->
</body>
</html>