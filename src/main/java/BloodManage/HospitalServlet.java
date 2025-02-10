package BloodManage;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*@WebServlet("/HospitalServlet")*/
public class HospitalServlet extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		List<BloodRequest> bloodRequests = new ArrayList<>();
		
		System.out.println("records displayed");
	
		try{
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Driver loaded succesfully");
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root","root123");

			
			Statement stmt= con.createStatement();
			System.out.println("statement executed");
			
			ResultSet rs=stmt.executeQuery("SELECT * FROM bloodrequest");
			
			while(rs.next()) {
				BloodRequest bloodRequest = new BloodRequest(
						rs.getInt("sl_no"),
						rs.getString("name"),
						rs.getString("email"),
						rs.getString("phonenumber"),
						rs.getString("bloodgroup"),
						rs.getString("status"),
						rs.getString("available")
						);
				 bloodRequests.add(bloodRequest);
			}
			
			System.out.println(" Fetched records: " +bloodRequests);
			
			for(BloodRequest bloodRequest:bloodRequests) {
				System.out.println(bloodRequest.getName());
			}
			
			if(!bloodRequests.isEmpty() && bloodRequests != null) {
			
				request.setAttribute("bloodRequests", bloodRequests);
			}else {
				request.setAttribute("bloodRequests", new ArrayList<>());
			}
			
			request.getRequestDispatcher("hosadmdisplay.jsp").forward(request, response);
			System.out.println("data sent to hosadmdisplay.jsp");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
