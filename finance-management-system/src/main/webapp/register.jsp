<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Finance Registration</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f3f4f6;
        }
        .container {
            width: 400px;
            margin: 50px auto;
            background: white;
            padding: 25px;
            border-radius: 8px;
        }
        label {
            font-weight: bold;
        }
        input, select {
            width: 100%;
            padding: 8px;
            margin: 8px 0 15px;
        }
        button {
            width: 100%;
            padding: 10px;
            background: #2563eb;
            color: white;
            border: none;
            cursor: pointer;
        }
    </style>
</head>

<body>

<div class="container">
    <h2>Loan Application</h2>

    <form action="registration" method="post">
        <label>Loan Id</label>
               <input type="num" name="Loan Id" required>
        <label>Customer Name</label>
        <input type="text" name="customerName" required>

        <label>Loan Type</label>
        <select name="loanType" required>
            <option value="HOME">Home Loan</option>
            <option value="CAR">Car Loan</option>
            <option value="PERSONAL">Personal Loan</option>
        </select>

        <label>Loan Amount</label>
        <input type="number" name="amount" step="0.01" required>

        <!-- loanStatus is usually set in servlet -->
        <button type="submit">Apply Loan</button>
    </form>
</div>

</body>
</html>
