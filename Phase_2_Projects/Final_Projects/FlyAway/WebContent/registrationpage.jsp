<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="E:\Mphasis\images\flight.jpg" width: 700%; height: 900%;>
<h1 align="center">Registration</h1>
<table style="background-color:transparent;"align ="center" border="1" cellpadding="5" width="300">
<tr><td>
<form action="registration.jsp" method="post">
 Full_Name    :=<input  type="text"   name="name"> <br><br>
 Address      :=<input  type="text"   name="Address" ><br><br>
 Age          :=<input  type="number" name="Age" ><br><br>
 Mobile 	  :=<input  type="number" name="mobile"  ><br><br>
 email_id     :=<input  type="text"   name="email_id" ><br><br>
 Drop_down    :=<input  type="text"   name="Drop_down" ><br><br>
 country      :=<input  type="text"   name="country" ><br><br>
  <button>Submit</button>
  </form>
  <a href="reviewdetails.jsp" ><h2>Already Registered?</h2></a>
  </td>
  </tr>
  </table>
  <a href="searchpages.jsp" ><h1>click here for flight details</h1></a></li>
  
</body>
</html>