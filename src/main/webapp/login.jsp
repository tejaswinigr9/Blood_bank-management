<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="styles.css">

</head>
    <body>
    
    <header>

<a class="logo"><img class="logo" src="Logo1.png"></a>
 
  <nav>
    <ul>
      <li><a href="index.jsp">Home</a></li>
      <li><a href="about us.jsp">About Us</a></li>
       <li><a href="register.jsp">Register</a></li>
      <li><a href="login.jsp">Login</a></li>
      <li><a href="hospital.jsp">Hospital</a></li>
    </ul>
  </nav>
</header>

         <main>
         <form action="login" method="post">
         
         <label for="name">Name:</label><br>
         <input type="name" id="name" name="name" required><br><br>
        
        
         <label for="password">Password</label><br>
        <input type="password" id="password" name="password" required><br><br>
        
       
<button type="submit">Login</button>
         
         </form>

         </main>

<footer>
<p>&copy; 2025 Techmiya Solutions. All Rights Reserved</p>
</footer>

   </body>
</html>