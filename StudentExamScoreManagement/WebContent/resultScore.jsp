<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/student.css" rel="stylesheet">
</head>
<body>
<table>
	<tr>
		<th>Student Id :</th>
		<td><%=session.getAttribute("id") %></td>
	</tr>
	
	<tr>
		<th>Student Name :</th>
		<td><%=session.getAttribute("sub") %></td>
	</tr>
	
	<tr>
		<th>Total Scores</th>
		<td><%=session.getAttribute("total") %></td>
	</tr>
	
	<tr>
		<th>Grade :</th>
		<td><%=session.getAttribute("grade") %></td>
	</tr>
	
</table>

</body>
</html>