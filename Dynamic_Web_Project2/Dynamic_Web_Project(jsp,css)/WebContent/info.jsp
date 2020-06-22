<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- tomcat에게 java로 지시! (@의 뜻) : 지시자 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> 당신의 정보는 </h1>
	<br>
		<% //스크립트 릿
			//1. 클라이언트로 부터 온 데이터 받아야함.
			String name = request.getParameter("name"); 
			String age =request.getParameter("age"); 
			String company =request.getParameter("company"); 
			String number = request.getParameter("number"); 
			
			out.print("당신의 이름은" + name + "<br>");
			out.print("당신의 나이는" + age+ "<br>");
			out.print("당신의 회사는" + company+ "<br>");
			out.print("당신의 번호는" + number+ "<br>");
			
		%>
</body>
</html>