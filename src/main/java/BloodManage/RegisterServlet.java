package BloodManage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.mindrot.jbcrypt.BCrypt;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*@WebServlet("/RegisterServlet")*/
public class RegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
			req.setAttribute("message","JDBC Driver not found");
			req.getRequestDispatcher("register.jsp").forward(req, res);
			return;
		}
		
		String email=req.getParameter("email");
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		String bloodgroup=req.getParameter("bloodgroup");
		String phonenumber=req.getParameter("phonenumber");
		String status=req.getParameter("status");
		
		if(email==null || name==null || password== null ||bloodgroup==null) {
			req.setAttribute("message", "All fields are required!");
			req.getRequestDispatcher("register.jsp").forward(req, res);
			return;
		}
		
		/* String hashedPassword=BCrypt.hashpw(password, BCrypt.gensalt(12)); */
		
		try(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root","root123")){
	
			String sql="INSERT INTO bloodrequest(name,bloodgroup,phonenumber,email,password,status) VALUES(?,?,?,?,?,?)";
			
			try(PreparedStatement stat=conn.prepareStatement(sql)){
			 stat.setString(1, name);
			 stat.setString(2, bloodgroup);
			 stat.setString(3, phonenumber);
			 stat.setString(4, email);
			 stat.setString(5,password);
			 stat.setString(6, status);
			 
			 int result=stat.executeUpdate();
			 if(result>0) {
				 res.sendRedirect("success.jsp");
			 }else {
				 req.setAttribute("message", "Registration failed.Please try again");
				 req.getRequestDispatcher("register.jsp").forward(req, res);
			 }
			 
			}
			
			catch(SQLException e) {
				e.printStackTrace();
				String errorMessage="Database error" +e.getMessage();
				req.setAttribute("message", errorMessage);
				req.getRequestDispatcher("register.jsp").forward(req, res);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
			req.setAttribute("message","Database error occured. Please try again");
			req.getRequestDispatcher("register.jsp").forward(req, res);
		}
}
}
