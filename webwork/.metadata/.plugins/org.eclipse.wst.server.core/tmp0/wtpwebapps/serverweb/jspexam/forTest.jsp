<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<table border="1" width="50">
			<% for(int i=1;i<=10;i++){%>
				<tr bgcolor="yellow">
					<td><h1><%= i%></h1></td>
				</tr>
			<%} %>
		</table>
	</body>
</html>