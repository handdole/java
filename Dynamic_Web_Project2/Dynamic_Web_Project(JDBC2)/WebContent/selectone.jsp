<%@page import="bean.bbsDTO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.t1{
		width : 90px;
		height : 50px;
		background: blue;
	}
	
	.t2{
		width : 180px;
		height : 50px;
		background: yellow;
	}
	table{
		text-align: center;
	}
</style>
</head>
<body>
<jsp:useBean id="dto" class="bean.bbsDTO"></jsp:useBean>
<jsp:setProperty property="no" name="dto"/>
<%
	MemberDAO dao = new MemberDAO();
	bbsDTO dto2 = dao.bbsone(dto);

%>

<a href="update.jsp?no=<%=dto2.getNo()%>">수정</a><br>
<hr>
<table border="1" >
<tr>

	<td class="t1">no</td>
	<td class="t2"><%= dto2.getNo() %></td>
</tr>
<tr>
	<td class="t1">title</td>
	<td class="t2"><%= dto2.getTitle() %></td>
</tr>
<tr>
	<td class="t1">content</td>
	<td class="t2"><%= dto2.getContent() %></td>
</tr>
<tr>
	<td class="t1">id</td>
	<td class="t2"><%= session.getAttribute("id") %></td>
</tr>
</table>
</body>
</html>