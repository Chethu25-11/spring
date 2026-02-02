<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background: #f3f4f6;
        }

        /* Navbar */
        .navbar {
            background: #1f2937;
            padding: 15px;
            color: white;
            font-size: 20px;
        }

        .navbar span {
            float: right;
            font-size: 14px;
        }

        /* Login box */
        .container {
            width: 360px;
            margin: 80px auto;
            background: white;
            padding: 25px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        input {
            width: 100%;
            padding: 10px;
            margin-top: 8px;
        }

        button {
            width: 100%;
            padding: 10px;
            margin-top: 15px;
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
       <form action="updateById" method="post">

           <input type="hidden" name="id" value="${entity.id}">

           <label>Email</label>
           <input type="text" name="emailId" value="${entity.emailId}" required>

           <label>Password</label>
           <input type="number" name="psw" value="${entity.password}" required>

           <label>Phone Number</label>
           <input type="number" name="phoneNumber" value="${entity.phoneNumber}" required>

           <button type="submit">Update</button>

       </form>


</body>
</html>
