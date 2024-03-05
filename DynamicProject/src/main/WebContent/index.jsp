<html>
<head>
<meta charset="ISO-8859-1">
<title>INDEX</title>
</head>
<body>
	<h2>Hello World!</h2>
	<%
		String str = "Hello JSP";
	%>
	<%=str%>
	<%
		for (int i = 1; i <= 10; i++) {
	%>

	<h1><%=i%>Hello World
	</h1>
	<%
		}
	%>
</body>
</html>