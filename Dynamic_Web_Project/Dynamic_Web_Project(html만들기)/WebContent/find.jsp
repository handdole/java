<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  //자바 코드 넣는 부분
	//1. 자동차 넘어온값 받기.
	//http방법으로 전송을 할 것 임.
	String word = request.getParameter("word");
	out.print("당신이 검색한 단어는 "+word+"군요");
	//2. DB에 연결해서, 결과 값 받아와야 함.
	//3. DB검색 결과를 다시 클라이언트에게 보내줘야함.
	//(html로 보내주어야 함.)
%>
</body>
</html>





