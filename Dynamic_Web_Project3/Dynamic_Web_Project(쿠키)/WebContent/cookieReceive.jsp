<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
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
	Cookie[] cookies = request.getCookies();
	out.print("쿠키의 개수는"+cookies.length);
	for(Cookie cookie : cookies){
		out.print("쿠키의 이름은 : " + cookie.getName()+"입니다. <br>");
		out.print("쿠키의 값은 : " + cookie.getValue()+"입니다. <br>");
	}
%>

</body>
</html>