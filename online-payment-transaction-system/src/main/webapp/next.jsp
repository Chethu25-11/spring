<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background: #f3f4f6;
        }

        /* Header */
        .header {
            background: #1f2937;
            color: white;
            padding: 15px;
            text-align: center;
            font-size: 22px;
        }

        /* Form container */
        .container {
            width: 360px;
            margin: 70px auto;
            background: white;
            padding: 25px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        input {
            width: 100%;
            padding: 10px;
            margin-top: 8px;
            margin-bottom: 15px;
        }

        button {
            width: 100%;
            padding: 10px;
            background: #2563eb;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        /* Footer */
        .footer {
            background: #1f2937;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>

<body>

<!-- HEADER -->
<div class="header">
    Online Payments - Registration
</div>

<!-- REGISTRATION FORM -->
<div class="container">
    <h3 style="text-align:center;">Create Account</h3>

    <form action="register" method="post">

        <label>Email</label>
        <input type="email" name="emailId" required>

        <label>Password</label>
        <input type="password" name="psw" required>

        <label>Repeat Password</label>
        <input type="password" name="rpsw" required>

        <label>Phone Number</label>
        <input type="text" name="phoneNumber" required>

        <button type="submit">Register</button>
    </form>
</div>

<!-- FOOTER -->
<div class="footer">
    © 2026 Online Payments | All Rights Reserved
</div>

</body>
</html>
