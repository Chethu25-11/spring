<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <style>
        * {
            box-sizing: border-box;
        }

        body {
            margin: 0;
            font-family: "Segoe UI", Arial, sans-serif;
            background: linear-gradient(120deg, #e5e7eb, #f9fafb);
            min-height: 100vh;
        }

        /* Navbar */
        .navbar {
            background: #111827;
            padding: 15px 25px;
            color: white;
            font-size: 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .navbar span {
            font-size: 14px;
            color: #d1d5db;
        }

        /* Login box */
        .container {
            width: 360px;
            margin: 90px auto;
            background: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 12px 25px rgba(0, 0, 0, 0.12);
        }

        h2 {
            color: #1f2937;
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-top: 12px;
            font-size: 14px;
            color: #374151;
        }

        input {
            width: 100%;
            padding: 10px;
            margin-top: 6px;
            border: 1px solid #d1d5db;
            border-radius: 6px;
            font-size: 14px;
        }

        input:focus {
            outline: none;
            border-color: #2563eb;
            box-shadow: 0 0 0 2px rgba(37, 99, 235, 0.2);
        }

        button {
            width: 100%;
            padding: 12px;
            margin-top: 20px;
            background: #2563eb;
            color: white;
            border: none;
            border-radius: 6px;
            font-size: 16px;
            cursor: pointer;
            transition: background 0.3s ease;
        }

        button:hover {
            background: #1d4ed8;
        }

        /* Footer */
        .footer {
            background: #111827;
            color: #d1d5db;
            text-align: center;
            padding: 10px;
            font-size: 13px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }

        /* Responsive */
        @media (max-width: 420px) {
            .container {
                width: 90%;
            }
        }
    </style>

</head>

<body>

    <!-- NAVBAR -->
    <div class="navbar">
        Helpdesk System
        <span>Login</span>
    </div>

    <!-- LOGIN FORM -->
    <div class="container">
        <h2 style="text-align:center;">User Login</h2>

        <form action="register" method="post">
            <label>Email</label>
            <input type="text" name="email" required>

            <label>Password</label>
            <input type="password" name="password" required>

            <label>Role</label>
            <input type="text" name="role" required>


            <button type="submit">Login</button>
        </form>

        <!-- Error Message -->
        <%
            String error = (String) request.getAttribute("error");
            if (error != null) {
        %>
            <p style="color:red; text-align:center;"><%= error %></p>
        <%
            }
        %>
    </div>

    <!-- FOOTER -->
    <div class="footer">
        © 2026 Helpdesk System | All Rights Reserved
    </div>

</body>
</html>
