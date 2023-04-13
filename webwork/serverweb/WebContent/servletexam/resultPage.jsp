<%@page import="member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>요청재지정으로 응답될 JSP문서 - 서블릿이 공유해준 데이터를 꺼내서 출력하기</h1>
		<hr/>
		<%
			//서블릿에서 공유한 데이터를 꺼내서 출력하기
			MemberDTO data = (MemberDTO)request.getAttribute("mydata");
		%>
		<h2>공유된 사용자명:<%= data.getAddr() %></h2>
	</body>
</html>