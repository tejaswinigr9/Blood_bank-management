<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
        <div class="logo">
            <img src="Logo1.png" alt="Logo">
        </div>
        <nav>
            <ul>
                <li><a href="index.jsp">Home</a></li>
                <li><a href="about us.jsp">About Us</a></li>
                <li><a href="register.jsp">Register</a></li>
                <li><a href="logout.jsp">Logout</a></li>
                <li><a href="hospital.jsp">Hospital</a></li>
            </ul>
        </nav>
    </header>

    <main class="dashboard">
        <div class="left-side">
            <h1>Welcome, ${sessionScope.name}!</h1>
            <div class="welcome-message">
                <h2>Your Dashboard</h2>
                <p>Here you can manage your blood requests, hospital information, and more.</p>
            </div>

            <div class="dashboard-links">
                <div class="dashboard-card">
                    <h3>Manage Blood Requests</h3>
                    <p>View and manage your blood requests and donations.</p>
                    <a href="index.jsp" class="button">Go to Home</a>
                </div>

                <div class="dashboard-card">
                    <h3>Hospital Information</h3>
                    <p>View and update hospital information and services.</p>
                    <a href="hospital.jsp" class="button">Go to Hospital Info</a>
                </div>
            </div>
        </div>

        <div class="right-side">
            <div class="logout">
                <a href="logout.jsp" class="button">Logout</a>
            </div>
        </div>
    </main>

    <footer>
        <p>&copy; 2025 Techmiya Solutions. All Rights Reserved</p>
    </footer>
</body>
</html>
