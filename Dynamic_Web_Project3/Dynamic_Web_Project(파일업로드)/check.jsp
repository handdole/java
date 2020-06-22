<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	//post 방식인 경우 한글처리를 따로 해주어야 한다.
	String find = request.getParameter("find");
%>
당신이 요청한 정보는 <%= find%> <!-- 표현식(expression -->
<hr>

당신이 요청한 정보는 ${param.find} <!-- 표현언어(expression language) -->