<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "ravidb";
String userid = "root";
String password = "user";
String source_place=request.getParameter("source_place");
String destination_place=request.getParameter("Destination_place");
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<body background="E:\Mphasis\images\flight.jpg" width: 700%; height: 900%;>
<h1>Search Data</h1>
<table border="1">
<tr>
<td>flightNo</td>
<td>airline</td>
<td>source_place</td>
<td>destination_place</td>
<td>departure</td>
<td>price</td>
<td>flightNo</td>
<td>arrival</td>
<td>duration</td>
<td>duration_in_min</td>
<td>airportName</td>
<td>totalStops</td>
<td>fare</td>
</tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from SpiceJet where source_place='"+source_place+"'"; 
String sql1 ="select * from SpiceJet where Destination_place='"+destination_place+"'";


resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("flightNo") %></td>
<td><%=resultSet.getString("airline") %></td>
<td><%=resultSet.getString("source_place") %></td>
<td><%=resultSet.getString("Destination_place") %></td>
<td><%=resultSet.getString("departure") %></td>
<td><%=resultSet.getString("arrival") %></td>
<td><%=resultSet.getString("duration") %></td>
<td><%=resultSet.getString("duration_in_min") %></td>
<td><%=resultSet.getString("airportName") %></td>
<td><%=resultSet.getString("totalStops") %></td>
<td><%=resultSet.getString("availableSeats") %></td>
<td><%=resultSet.getString("fare") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
<a href="registrationpage.jsp" ><h2>click to register...!</h2></a></li>
</body>
</html>