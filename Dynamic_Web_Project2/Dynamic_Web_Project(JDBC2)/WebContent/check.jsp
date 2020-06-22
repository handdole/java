<%@page import="javafx.scene.control.Alert"%>
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
<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<%
	MemberDAO dao = new MemberDAO();
	int result = dao.login(dto);
	if(result != 0 ){
		session.setAttribute("id", dto.getId());
		response.sendRedirect("mail.jsp");
	}
	else{
		response.sendRedirect("login.jsp");
	}
%>
</body>
</html>