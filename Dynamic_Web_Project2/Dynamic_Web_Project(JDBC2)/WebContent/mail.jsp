<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> 메일 화면입니다.</h1>
<%= session.getAttribute("id") %> 님의 메일화면입니다.<br>
<a href="cafe.jsp">카페 화면가기</a><br>
<a href="news.jsp">주요뉴스가기</a><br>
</body>
</html>