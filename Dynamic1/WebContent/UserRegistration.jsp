<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="UserRegistrationCtl" method="post">
		<table>
			<tr>
				<th>First Name:</th>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<th>last Name:</th>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<th>Email:</th>
				<td><input type="email" name="loginId"></td>
			</tr>
			<tr>
				<th>Password:</th>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<th>PhoneNo:</th>
				<td><input type="text" name="phoneNo"></td>
			</tr>
			<tr>
				<th>dob:</th>
				<td><input type="date" name="dob"></td>
			</tr>
			<tr>
				<th>Gender:</th>
				<td><input type="text" name="gender"></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>