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

<a href="main.jsp">게시물 검색 </a><br>
<hr>
<form action="update2.jsp">
	<table border="1" >
	<tr>
	
		<td class="t1">no</td>
		<td class="t2">
			<%= dto2.getNo() %>	
			<input type="hidden" name="no" value="<%= dto2.getNo() %>" >	<!-- readonly도 있음. -->
		</td>
	</tr>
	<tr>
		<td class="t1">title</td>
		<td class="t2">
			<input type="text" name="title" value="<%= dto2.getTitle() %>">		
		</td>
	</tr>
	<tr>
		<td class="t1">content</td>
		<td class="t2">
			<input type="text" name="content" value="<%= dto2.getContent() %>">		
		</td>
	</tr>
	<tr>
		<td class="t1">id</td>
		<td class="t2"><%= session.getAttribute("id") %></td>
	</tr>
	</table>
	<input type="image" src="011.png">
</form>
</body>
</html>