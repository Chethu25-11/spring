<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Registration Success</title>

<style>
    table {
        border-collapse: collapse;
        margin: 50px auto;
        width: 60%;
        text-align: center;
    }

    th, td {
        border: 1px solid black;
        padding: 12px;
    }

    th {
        background-color: #f2f2f2;
    }

    h1 {
        text-align: center;
        color: green;
    }

    a {
        display: block;
        text-align: center;
        margin-top: 20px;
        text-decoration: none;
        font-weight: bold;
    }
</style>
</head>

<table>
<tr>
<th>Id</th>
<th>Email</th>
<th>password</th>
<th>phoneNumber</th>
<th> Delete Action</th>
<th>Read Action</th>
<th>Edit Action</th>

</tr>
<c:forEach var="item" items="${list}">
<tr>
<td>${item.id}</td>
<td>${item.emailId}</td>
<td>${item.password}</td>
<td>${item.phoneNumber}</td>
<td>
<a href="deleteOnlinePayment?id=${item.id}">Delete</a>
</td>
<td>
<a href="viewById?id=${item.id}">View</a>
</td>
<td>
<a href="updateById?id=${item.id}">edit</a>
</td>
</tr>
</c:forEach>
</table>
<a href="next.jsp">Add  New Payments</a>
</body>
</html>
