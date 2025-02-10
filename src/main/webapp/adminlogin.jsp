<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>

<style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            background: #ff5733;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .login-container {
            background-color: #ffe0e0;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 300px;
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        .input-group {
            margin-bottom: 15px;
        }

        label {
            font-size: 14px;
            display: block;
            margin-bottom: 5px;
        }

        input {
            width: 100%;
            padding: 10px;
            font-size: 14px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        button {
            width: 100%;
            padding: 10px;
            background-color: #e74c3c;
            color: white;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
        }

        button:hover {
            background-color: #c0392b;
        }

        .error-message {
            color: red;
            font-size: 12px;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
  <div class="login-container">
  
  <h2>Admin Login</h2>
  
  <form id="loginForm" onsubmit="return validateLogin(event)">
  
    <div class="input-group">
          <label for="username">User name:</label>
          <input type="text" id="username" name="username" required>
    </div>
  
   <div class="input-group">
       <label for="password">Password:</label>
       <input type="password" id="password" name="password" required>
  </div>
  
  <div class="error-message" id="errorMessage"></div>
  <form action="BloodBankServlet" method="post">
			<button type="submit">Login</button>
		</form>
</form>
</div>

<script>
   function validateLogin(event){
	   event.preventDefault();
	   
	   const username=document.getElementById('username').value;
	   const password=document.getElementById('password').value;
	   const errorMessage=document.getElementById('errorMessage');
	   
	   const validUsername="admin";
	   const validPassword="admin";
	   
	   if(username==validUsername && password==validPassword){
		   window.location.href="BloodBankServlet";
	   }else{
		   errorMessage.textContent="Invalid username or password.";
	   }
   }
</script>

</body>
</html>