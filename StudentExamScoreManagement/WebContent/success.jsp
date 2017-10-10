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
<h1>Values are added !!!!!!!!!!!</h1>
<table>
	<tr>
		<th>Account Id :</th>
		<td><%=session.getAttribute("id") %></td>
	</tr>
	
	<tr>
		<th>Amoount :</th>
		<td><%=session.getAttribute("sub") %></td>
	</tr>
	
	<tr>
		<th>Balance : </th>
		<td><%=session.getAttribute("balance") %></td>
	</tr>
	
	<tr>
		<th>Transaction id  :</th>
		<td><%=session.getAttribute("trans_id") %></td>
	</tr>
	
</table>

</body>
</html>

