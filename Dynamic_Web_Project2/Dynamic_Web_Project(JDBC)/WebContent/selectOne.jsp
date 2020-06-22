<%@page import="bean.MemberDTO"%>
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
<!-- 1. 받아서 dto에 넣어야함. -->
<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean>
<!-- 2.dao의 select()호출, 결과 받아와야함. -->
<jsp:setProperty property="id" name="dto"/>
			<!--  setId(request.getParameter("id"))
				porperty는 html에서 input의 name과 이름이 같아야함.  -->

<%
	MemberDAO dao = new MemberDAO();
MemberDTO dto2 = dao.select(dto);
%>
<%= dto2 %>
<!-- 3. 받아온 dto를 html로 만들어줌.-->
<h3 style="color:blue">검색결과입니다.</h3>
<table border=1>

<tr>
	<td>
	아이디 : 
	</td>
	<td>
	</td>
</tr>
<tr>
	<td>
	이름 :
	</td>
	<td>
	
	</td>
</tr>
<tr>
	<td>
	비밀번호 : 
	</td>
	<td>
	</td>
</tr>
<tr>
	<td>
	전화번호 :
	</td>
	<td>
	</td>
</tr>
</table>


</body>
</html>