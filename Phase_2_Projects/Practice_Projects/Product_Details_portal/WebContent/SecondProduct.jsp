<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<html>
<head>
<title>Display Table Using jsp</title>
</head>
<body>
<h2>Data from table 'product' of Database</h2>
<%
try {

String connectionURL = "jdbc:mysql://localhost:3306/ecommerce";

Connection connection = null;

Statement statement = null;

ResultSet rs = null;

Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

connection = DriverManager.getConnection(connectionURL, "root", "user");

statement = connection.createStatement();

String QueryString = "select * from eproduct";
rs = statement.executeQuery(QueryString);
%>
<TABLE cellpadding="15" border="1" >
<%
while (rs.next()) {
%>
<TR>
<TD><%=rs.getInt(1)%></TD>
<TD><%=rs.getString(2)%></TD>
<TD><%=rs.getInt(3)%></TD>
</TR>
<% } %>
<%
// close all the connections.
rs.close();
statement.close();
connection.close();
} catch (Exception ex) {
%>
</font>
<font size="+3" color="red"></b>
<%
out.println("Unable to connect to database.");
}
%>
</TABLE>
</font>
</body>
</html>
