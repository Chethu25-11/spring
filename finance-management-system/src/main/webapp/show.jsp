<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Finance Registration Success</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f3f4f6;
    }

    table {
        border-collapse: collapse;
        margin: 50px auto;
        width: 60%;
        text-align: center;
        background-color: white;
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
        margin-top: 40px;
    }

    a {
        display: block;
        text-align: center;
        margin-top: 20px;
        text-decoration: none;
        font-weight: bold;
        color: #2563eb;
    }
</style>
</head>

<body>

<h1>Loan Application Successful</h1>

<table>
    <tr>
        <th>Field</th>
        <th>Value</th>
    </tr>

    <tr>
        <td>Customer Name</td>
        <td>${customerName}</td>
    </tr>

    <tr>
        <td>Loan Type</td>
        <td>${loanType}</td>
    </tr>

    <tr>
        <td>Loan Amount</td>
        <td>${amount}</td>
    </tr>
</table>

<a href="continue">Apply New Loan</a>

</body>
</html>
