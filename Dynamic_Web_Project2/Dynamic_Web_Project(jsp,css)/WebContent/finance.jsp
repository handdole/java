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
	//조그맣게 자바 코드에 일부분을 스크립트로 쓰면 됨.
	//스크릅트 릿 
	//클라이언트가 보낸 company 변수값을 받으면 된다.
	String company = request.getParameter("company");
	//주식 정보를 디비 연동 하여 찾음 
	out.print(company + "회사의 주가는 " + 48000 + "입니다.");

%>
</body>
</html>