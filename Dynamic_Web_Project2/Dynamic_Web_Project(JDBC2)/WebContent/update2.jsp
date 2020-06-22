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
<jsp:useBean id="dto" class="bean.bbsDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<%
	MemberDAO dao = new MemberDAO();
	int result = dao.bbsupdate(dto);
	if(result != 0){
		response.sendRedirect("selectone.jsp?no="+dto.getNo());
	}else{
		response.sendRedirect("update.jsp?no="+dto.getNo());
	}
%>
</body>
</html>