package BloodManage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.mindrot.jbcrypt.BCrypt;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class Loginservlet extends HttpServlet {
   	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("JDBC Driver loaded succesfully");
	}
	catch(ClassNotFoundException e) {
		req.setAttribute("message", "JDBC Driver not found");
		req.getRequestDispatcher("register.jsp").forward(req, res);
		return;
	}
	
	String name=req.getParameter("name");
	String password=req.getParameter("password");
	
	if(name==null || name.trim().isEmpty() || password==null || password.trim().isEmpty()) {
		res.sendRedirect("login.jsp? error= Please fill out all fields");
		return;
	}
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root","root123");
		   
			String query="SELECT * FROM bloodrequest WHERE name=?";
			PreparedStatement stat=conn.prepareStatement(query);
			stat.setString(1, name);
			ResultSet rs=stat.executeQuery();
			
			if(rs.next()) {
	        	String storedPassword=rs.getString("password");
	        	
	        			if(password.equals(storedPassword)) {
	        				HttpSession sess=req.getSession();
	        				sess.setAttribute("name", name);
	        				System.out.println("calling dashboard = " + name);
	        				res.sendRedirect("dashboard.jsp?name = " + name);
	        			}
	        			else {
	        				res.sendRedirect("login.jsp?error=Invalid credentials");
	        			}
	        	
		}else {
			res.sendRedirect("login.jsp?error=User not found");
		}
			
		} 
		catch(SQLException e) {
			e.printStackTrace();
			res.sendRedirect("login.jsp?error=Database error");
		}
	}

}
