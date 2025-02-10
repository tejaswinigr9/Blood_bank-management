<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Success</title>
    
     <style type="text/css">
  
   body {
        font-family: Arial, sans-serif;
        background-color: #ffecd2;
        margin: 0;
        padding: 0;
        display: flex;
        flex-direction:column;
        justify-content: flex-start;
        align-items: center;
        height: 100vh;
    } 
    .container {
        text-align: center;
        padding: 30px;
        background-color: #ff7f50;
        border-radius: 10px;
        box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
        max-width: 400px;
        width: 100%;
    }
    h2 {
        color: #d32f2f;
        font-size: 24px;
        margin-bottom: 20px;
    }
    a {
        text-decoration: none;
        color: #ffffff;
        background-color: #ff4500;
        padding: 10px 20px;
        border-radius: 5px;
        font-size: 16px;
        transition: background-color 0.3s;
    }
    a:hover {
        background-color: #ff6347;
    }
    
</style>

</head>
<body>
    <div class="container">
        <h1>Registration Successful!</h1>
        <p>Your account has been successfully created.</p><br><br><a href="login.jsp">log in</a>.
        <a href="index.jsp">Go to Home</a>
    </div>

</body>
</html>