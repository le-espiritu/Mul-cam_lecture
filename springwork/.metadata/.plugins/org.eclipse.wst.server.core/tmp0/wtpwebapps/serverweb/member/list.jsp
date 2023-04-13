<%@page import="member.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<jsp:include page="../template/top.jsp"></jsp:include>
		<br><br>
		<%
			//서블릿에서 공유한 데이터 꺼내서 출력하기
			ArrayList<MemberDTO> userlist = (ArrayList<MemberDTO>)request.getAttribute("userlist");
			//System.out.println(userlist.size()+"=================jsp");
		%>
		<h1>사원목록(JSP^^)</h1>
		<hr>
		<jsp:include page="search.jsp"></jsp:include>
		<hr/>
		<table border='1' width="600">
			<tr bgColor='skyblue'>
				<th>아이디</th><th>성명</th><th>패스워드</th>
				<th>주소</th>
				<th>포인트</th><th>부서번호</th><th>삭제</th>
			</tr>
			<%
			int size = userlist.size();
			for(int i=0;i<size;i++){
				//ArrayList에 저장된 레코드를 추출 - 레코드를 모델링해놓은 MemberDTO를 꺼내서 작업	
				MemberDTO user = userlist.get(i);%>
				<tr>
					<td><a href="/serverweb/member/read.do?id=<%= user.getId()%>"><%= user.getId() %></a></td>
					<td><%= user.getName()%></td>
					<td><%= user.getPass() %></td>
					<td><%= user.getAddr() %></td>
					<td><%= user.getPoint() %></td>
					<td><%= user.getDeptno() %></td>
					<td><a href="/serverweb/member/delete.do?id=<%= user.getId()%>">삭제</a></td>
				</tr>
			<%} %>
		</table>
	</div>
</body>
</html>






