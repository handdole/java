<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie cookie1 = new Cookie("hobby" , "tennis");
	Cookie cookie2 = new Cookie("tour" , "yangyang");
	Cookie cookie3 = new Cookie("date" , "20200407");
	
	response.addCookie(cookie1);
	response.addCookie(cookie2);
	response.addCookie(cookie3);
%>

<a href="testCookieView.jsp">쿠키 보러가기</a>
</body>
</html>