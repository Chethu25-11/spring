<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Registration Success</title>

</head>

<body>

<h1>Registration Successful</h1>

<table>
    <tr>
        <th>Field</th>
        <th>Value</th>

    </tr>

    <tr>
        <td>Name</td>
        <td>${name}</td>
    </tr>
    <tr>
            <td>Km</td>
            <td>${km}</td>
        </tr>
        <tr>
           <td>Email</td>
           <td>${email}</td>
                </tr>
                 <tr>
          <td>Address</td>
          <td>${address}</td>
            </tr>
</table>


<a href="index.jsp">New add</a>

</body>
</html>