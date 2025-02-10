package BloodManage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateAvailableServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 int slNo = Integer.parseInt(request.getParameter("slNo"));
	        String available = request.getParameter("available");

	        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root", "root123")) {
	            String query = "UPDATE bloodrequest SET available = ? WHERE sl_no = ?";
	            PreparedStatement statement = connection.prepareStatement(query);
	            statement.setString(1, available);
	            statement.setInt(2, slNo);
	            
	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Updated successfully");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        response.sendRedirect("nextpage1.jsp");
	}

}
