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
<jsp:useBean id="dto" class="bean.bbsDTO"></jsp:useBean>
<jsp:setProperty property="no" name="dto"/>
<%
	MemberDAO dao = new MemberDAO();
	ArrayList<bbsDTO> list = dao.bbscontent(dto);
%>
<!-- 3. 받아온 dto를 html로 만들어줌.-->
<h3 style="color:blue">검색결과입니다.</h3>
<hr>


<%
	for(bbsDTO dto2 : list){
%>		
	no : <%= dto2.getNo() %><br>
	title : <%= dto2.getTitle() %><br>
	content : <%= dto2.getContent() %><br>
	id : <%= dto2.getId() %><br>


<%
	}
%>

<hr>



</body>
</html>