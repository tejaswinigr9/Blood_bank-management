<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" href="styles.css">

</head>
    <body>
    
    <header>

<a class="logo"><img class="logo" src="Logo1.png"></a>
 
  <nav>
    <ul>
      <li><a href="index.jsp">Home</a></li>
       <li><a href="register.jsp">Register</a></li>
      <li><a href="about us.jsp">About Us</a></li>
      <li><a href="login.jsp">Login</a></li>
      <li><a href="hospital.jsp">Hospital</a></li>
    </ul>
  </nav>
</header>

         <main>
         <form action="register" method="post">
         
         <label for="name">Name:</label><br>
         <input type="name" id="name" name="name" required><br><br>
         
          <label for="bloodgroup">Blood group</label><br>
          <select id="bloodgroup" name="bloodgroup" required>
        <option></option>
        <option value="A+">A+</option>
        <option value="A-">A-</option>
        <option value="B+">B+</option>
        <option value="AB+">AB+</option>
        <option value="AB-">AB-</option>
        <option value="B-">B-</option>
        <option value="O+">O+</option>
        <option value="O-">O-</option>
        </select><br><br>
        
        <label for="phonenumber">Phone Number</label><br>
        <input type="phonenumber" id="phonenumber" name="phonenumber" required><br><br>
        
        <label for="email">E-mail</label><br>
        <input type="email" id="email" name="email"><br><br>
        
         <label for="password">Password</label><br>
        <input type="password" id="password" name="password" required><br><br>
        
      
        <label for="status">Status</label><br>
        <select id="status" name="status" required>
        <option></option>
        <option value="Request for blood">Request for Blood</option>
        <option value="Donate blood">Donate Blood</option>
        <option value="Request/Donate blood">Request/Donate Blood</option>
        </select><br><br>
     

<button type="submit">Submit</button>
         
         </form>

         </main>

<footer>
<p>&copy; 2025 Techmiya Solutions. All Rights Reserved</p>
</footer>

   </body>
</html>