<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/student.css" rel="stylesheet">
</head>
<body>
<form action="insertDetails.obj">
<table>
<tr>
	<th>Student ID :</th>
	<td>	
	<select name="studId">
		<option value="">Select Student Id	</option>
			<c:forEach items="${sessionScope.StudData}" var="studId">
				<option value="${studId}"> ${studId} </option>
			</c:forEach>
   </select>
   </td>
</tr>

<tr>
	<th>Subject :</th>
	<td>
	<select name="subject">
		<option value="">Select Subject Name </option>
		<option value="subject1">Subject 1</option>
		<option value="subject2">Subject 2</option>
		<option value="subject3">Subject 3</option>
		<option value="subject4">Subject 4</option>
		<option value="subject5">Subject 5</option>	
   </select>
	</td>
</tr>

<tr>
	<th>Theory :</th>
	<td><input type="text" name="theory" pattern ="[0-9]{1,2}" required/></td>
</tr>

<tr>
	<th>MCQ's :</th>
	<td><input type="text" name="mcq"   pattern ="[0-9]{1,2}" required/></td>
</tr>

<tr>
	<th>Lab :</th>
	<td><input type="text" name="lab"  pattern ="[0-9]{1,2}" required/></td>
</tr>

<tr>
	<td colspan="2"><input type="submit" value="Submit" /></td>
</tr>

</table>

</form>
</body>
</html>




