package BloodManage;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*@WebServlet("/BloodBankServlet")*/
public class BloodBankServlet extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		List<BloodBankRecord> records = new ArrayList<>();
		
		System.out.println("records displayed");
	
		try{
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Driver loaded succesfully");
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root","root123");
			
			String query="SELECT * FROM bloodrequest";
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next()) {
				BloodBankRecord record = new BloodBankRecord(
						rs.getInt("slno"),
						rs.getString("name"),
						rs.getString("email"),
						rs.getString("phonenumber"),
						rs.getString("bloodgroup"),
						rs.getString("status"),
						rs.getString("available")
						);
				records.add(record);
			}
			
			System.out.println(" Fetched records: " +records);
			
			for(BloodBankRecord record:records) {
				System.out.println(record.getSlNo());
			}
			
			if(!records.isEmpty() && records != null) {
			
				request.setAttribute("records", records);
			}else {
				request.setAttribute("records", new ArrayList<>());
			}
			
			request.getRequestDispatcher("nextpage1.jsp").forward(request, response);
			System.out.println("data sent to nextpage1.jsp");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
