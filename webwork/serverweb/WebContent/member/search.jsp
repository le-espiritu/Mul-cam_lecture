<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form method="post" 
		action="/serverweb/member/search.do?action=SEARCH">
			검색:
			<select name="category">
				<option value="id">아이디</option>
				<option value="name">성명</option>
				<option value="addr">주소</option>
				<option value="deptno">부서</option>
			</select>
			<input type="text" name="search">
		<!-- 	<input type="hidden" name="action"  value="SEARCH"/> -->
			<input type="submit" value="검색"/>
		</form>
	</body>
</html>