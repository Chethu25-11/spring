<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Loan Registration Success</title>

<style>
    table {
        border-collapse: collapse;
        margin: 50px auto;
        width: 70%;
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
        font-weight: bold;
        text-decoration: none;
    }
</style>
</head>

<body>

<h1><marquee>Loan Registered Successfully</marquee> </h1>

<table>
    <tr>
        <th>id</th>
        <th>Customer Name</th>
        <th>Loan Type</th>
        <th>Amount</th>
    </tr>

    <c:forEach var="item" items="${list}">
        <tr>
            <td>${item.id}</td>
            <td>${item.customerName}</td>
            <td>${item.loanType}</td>
            <td>${item.amount}</td>
        </tr>
    </c:forEach>
</table>

<a href="register.jsp">Apply Another Loan</a>

</body>
</html>
