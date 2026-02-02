<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Bank Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/style.css">
</head>
<body>

<!-- Header -->
<header class="header">
    <h1>Xworkz Banking</h1>
</header>

<!-- Main Content -->
<main class="container">
    <h2>Customer Registration</h2>

    <form action="register" method="post" class="bank-form">
        <label>Customer ID</label>
        <input type="number" name="customerId" required>
<br> <br>
        <label>Name</label>
        <input type="text" name="name" required>
<br>  <br>
        <label>Account Number</label>
        <input type="number" name="accountNumber" required>
<br> <br>
        <label>Amount</label>
        <input type="number" name="amount" step="0.01" required>
<br> <br>
        <button type="submit">Register</button>
    </form>
</main>

<!-- Footer -->
<footer class="footer">
    <p>© 2026 Xworkz Banking App</p>
</footer>

</body>
</html>
