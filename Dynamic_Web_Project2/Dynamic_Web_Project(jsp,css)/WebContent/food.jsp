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
		String good = request.getParameter("good");
		String bad = request.getParameter("bad");
		
		out.print("제일 좋아하는 음식은 : "+ good +"<br>");
		out.print("제일 싫어하는 음식은 : "+ bad +"<br>");
	%>
</body>
</html>