<%@page import="bean.bbsDTO"%>
<%@page import="java.util.ArrayList"%>
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

<%
	MemberDAO dao = new MemberDAO();
	ArrayList<bbsDTO> list = dao.bbslist();
%>
<%-- <%= list%> --%>
<!-- 3. 받아온 dto를 html로 만들어줌.-->
<h3 style="color:blue">검색결과입니다.</h3>
<hr>

<table border=1>
<tr>
	<td>번호</td>
	<td>제목</td>
	<td>아이디</td>
</tr>
<%
	for(bbsDTO dto2 : list){
%>		
	
<tr>
	<td>
		<%= dto2.getNo() %>
	</td>
	<td>
	<a href="bbsContent.jsp?no=<%= dto2.getNo() %>">
	<%= dto2.getTitle() %>
	</a>
	</td>
	<td><%= dto2.getId() %></td>
</tr>


<%
	}
%>
</table> 




</body>
</html>