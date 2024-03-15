<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="Header.jsp"%>

	<form action="LoginCtl" method="post">
		<table>
			<tr>
				<th>Login</th>
				<td><input type="email" name="loginId"></td>
			</tr>
			<tr>
				<th>password</th>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
	<%@ include file="Footer.jsp"%>
</body>
</html>