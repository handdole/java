<%@page import="bean.MemberDAO"%>
<%@page import="bean.Member1DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 1.넘어오는 값 받기 -->
<!-- 2. DTO 객체 만들어서 set메소드로 값넣기-->
<!-- 다른 패키지에 있는 클래스를 import해서 객체 생성,
	생성된 객체의 이름은 dto / new한거랑 똑같음
 -->
<jsp:useBean id="dto" class="bean.Member1DTO"></jsp:useBean>
<!-- 넘어오는 값 다 받아서 , 객체의 이름으로 지정된 dto의 메소드 중 
	넘어오는 파라메터 이름과 동일하면 해당 set메소드를 불러서 
	dto에 넣음. 이름이 다르면 안들어감 key값과 같아야함.
 -->
<jsp:setProperty property="*" name="dto"></jsp:setProperty>
<!-- 3. DAO객체 만들어서 insert메소드 호출 -->
<%
	Member1DAO dao = new Member1DAO();
	dao.insert(dto);
%>
sql문 정송함.
