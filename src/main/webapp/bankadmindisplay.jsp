<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
    <%@ page import="BloodManage.BloodBankRecord" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Blood Bank Records</title>

       <style>
 table{
 width: 100%;
 border-collapse: collapse;
 }
 
 th,td{
 padding: 10px;
 text-align: left;
 border : 1px solid #ddd;
 }
 select{
 width: 100px;
 }
      </style>
</head>
<body>



<%-- <h2>Blood Bank Record</h2>

<c:if test="${empty records}">
<p>No data found.</p>
</c:if>

<c:if test="${not empty records}">

<table>
  <thead>
    <tr>
      <th>SL.No</th>
      <th>Name</th>
      <th>Email</th>
      <th>Phonenumber</th>
      <th>Bloodgroup</th>
      <th>Status</th>
      <th>Available</th>
     </tr>
    </thead> --%>
    
   <!--  <tbody> -->
    
   <%--  <c:forEach var="record" items="${records}">
      
         <tr>
             <td>${record.slNo}</td>
             <td>${record.name}</td>
             <td>${record.email}</td>
             <td>${record.phonenumber}</td>
             <td>${record.bloodgroup}</td>
             <td>${record.status}</td>  
          <td>
             <form action="UpdateAvailableServlet" method="post">
                <input type="hidden" name="slNo" value="${record.slNo}"/>
                <select name="available">
                      <option></option>
                      <option value="yes" ${record.available == 'yes' ? 'selected' : ''}>Yes</option>
                      <option value="No" ${record.available == 'No' ? 'selected' : '' }>No</option>
                      <option value="Pending" ${record.available == 'Pending' ? 'selected' : ''}>Pending</option>
                </select>
                
                <button type="submit">Update</button>
             
             </form> 
           </td>
           
           
           </tr>
    </c:forEach>
    </tbody>  
  
</table>
</c:if> --%>


<% 
    List<BloodBankRecord> records = (List<BloodBankRecord>) request.getAttribute("records");
    if (records == null || records.isEmpty()) {
%>
    <p>No data found.</p>
<% 
    } else {
%>
<form action="BloodBankServlet" method="post">
    <table>
        <thead>
            <tr>
                <th>SL.No</th>
                <th>Name</th>
                <th>Email</th>
                <th>Phone Number</th>
                <th>Blood Group</th>
                <th>Status</th>
                <th>Available</th>
            </tr>
        </thead>
        <tbody>
            <% 
                for (BloodBankRecord record : records) {
            %>
                <tr>
                    <td><%= record.getSlNo() %></td>
                    <td><%= record.getName() %></td>
                    <td><%= record.getEmail() %></td>
                    <td><%= record.getPhonenumber() %></td>
                    <td><%= record.getBloodgroup() %></td>
                    <td><%= record.getstatus() %></td>
                    <td>
                        <form action="UpdateAvailableServlet" method="post">
                            <input type="hidden" name="slNo" value="<%= record.getSlNo() %>"/>
                            <select name="available">
                                <option value="yes" <%= "yes".equals(record.getAvailable()) ? "selected" : "" %>>Yes</option>
                                <option value="No" <%= "No".equals(record.getAvailable()) ? "selected" : "" %>>No</option>
                                <option value="Pending" <%= "Pending".equals(record.getAvailable()) ? "selected" : "" %>>Pending</option>
                            </select>
                            <button type="submit">Update</button>
                        </form>
                    </td>
                </tr>
            <% 
                }
            %>
        </tbody>
    </table>
    </form> 
<% 
    }
%>


</body>
</html>