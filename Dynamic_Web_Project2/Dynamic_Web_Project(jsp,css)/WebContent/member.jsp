<%@page import="DB.MemberDAO"%>
<%@page import="DB.MemberDTO"%>
<%@page import="com.sun.org.apache.bcel.internal.generic.NEW"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 스크립트릿 -->
<%
	//request: 내장된 객체, 클라이언트--->웹서버
	//	       클라이언트가 입력하여 전송한 데이터를
	//		   웹서버가 받아주는 역할
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String com = request.getParameter("com");
	String tel = request.getParameter("tel");
	String gender = request.getParameter("gender");
	String word = request.getParameter("word");
	String[] hobby = request.getParameterValues("hobby");
	String list = "";
	//hobby가 있을 때
	if(hobby != null){
		for(String s: hobby){ //for-each
			list = list + s + " ";
		}
	}else{
		list = "선택하지 않았습니다.";
	}
	
	if(word.equals("")){
		word = "작성하지 않았습니다.";
	}
	
	MemberDTO dto = new MemberDTO();
	dto.setId(id);
	dto.setPw(pw);
	dto.setName(name);
	dto.setTel(com+"-"+tel);
	
	MemberDAO dao = new MemberDAO();
	dao.insert(dto);
	
%>
받은 아이디는 : <% out.print(id); %><br>
받은 패스워드는 : <%= pw %><br> <!-- 표현식(expression) -->
받은 이름은 : <%= name %><br>
받은 연락처는 : <%= com %>-<%= tel %> <br> 
받은 성별은 : <%= gender %> <br>
받은 하고 싶은 말은 : <%= word %> <br>
받은 취미는: <%= list %>
</body>
</html>






