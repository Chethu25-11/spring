<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Network Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <style>
        /* Reset */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, Helvetica, sans-serif;
        }

        /* Header */
        .header {
            background-color: #1e3c72;
            color: white;
            text-align: center;
            padding: 20px;
        }

        /* Navbar */
        .navbar {
            background-color: #2a5298;
            padding: 10px 0;
        }

        .nav-links {
            list-style: none;
            display: flex;
            justify-content: center;
        }

        .nav-links li {
            margin: 0 20px;
        }

        .nav-links a {
            text-decoration: none;
            color: white;
            font-weight: bold;
            transition: 0.3s;
        }

        .nav-links a:hover {
            color: #ffd700;
        }

        /* Main Container */
        .container {
            width: 400px;
            margin: 40px auto;
            padding: 25px;
            background-color: #f4f6f9;
            border-radius: 8px;
            box-shadow: 0 4px 10px rgba(0,0,0,0.1);
        }

        .container h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #1e3c72;
        }

        /* Form Styling */
        .bank-form label {
            font-weight: bold;
            display: block;
            margin-bottom: 5px;
        }

        .bank-form input {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 4px;
            margin-bottom: 15px;
        }

        .bank-form input:focus {
            border-color: #2a5298;
            outline: none;
        }

        /* Button */
        .bank-form button {
            width: 100%;
            padding: 10px;
            background-color: #2a5298;
            color: white;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
            transition: 0.3s;
        }

        .bank-form button:hover {
            background-color: #1e3c72;
        }

        /* Footer */
        .footer {
            margin-top: 50px;
            padding: 15px;
            text-align: center;
            background-color: #1e3c72;
            color: white;
        }

        /* Responsive */
        @media (max-width: 500px) {
            .container {
                width: 90%;
            }

            .nav-links {
                flex-direction: column;
                align-items: center;
            }

            .nav-links li {
                margin: 10px 0;
            }
        }
    </style>
</head>

<body>

    <!-- Header -->
    <header class="header">
        <h1>Network Management</h1>
    </header>

    <!-- Navigation Bar -->
    <nav class="navbar">
        <ul class="nav-links">
            <li><a href="#">Home</a></li>
            <li><a href="#">Register Network</a></li>
            <li><a href="#">View Networks</a></li>
            <li><a href="#">Login</a></li>
        </ul>
    </nav>

    <!-- Main Content -->
    <main class="container">
        <h2>Network Registration</h2>

        <form action="network" method="post" class="bank-form">
            <label>Network Type Name:</label>
            <input type="text" name="networkTypeName" required>

            <label>Email:</label>
            <input type="email" name="email" required>

            <label>Status:</label>
            <input type="text" name="status" required>

            <label>Password:</label>
            <input type="password" name="password" required>

            <button type="submit">Register</button>
        </form>
    </main>

    <!-- Footer -->
    <footer class="footer">
        © 2026 Network Management System
    </footer>

</body>
</html>
