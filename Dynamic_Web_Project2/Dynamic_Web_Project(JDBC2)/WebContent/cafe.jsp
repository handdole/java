<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>카페 화면입니다.</h1>
환영합니다 <%=session.getAttribute("id") %>님의 카페 화면입니다.<br>
<a href="mail.jsp">메일 화면가기</a><br>
<a href="news.jsp">주요뉴스가기</a><br>
</body>
</html>