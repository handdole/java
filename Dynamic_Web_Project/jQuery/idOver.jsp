<%@page import="bean.MemberDAO"%><%@page import="bean.MemberDTO"%><%@page import="java.util.Random"%><%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    String id = request.getParameter("id");    // ajax에 들어가는 key값
    MemberDTO dto = new MemberDTO();
    dto.setId(id);
    MemberDAO dao = new MemberDAO();
    int result = dao.idover(dto);
    String check = "";
    if(result == 0){
		check = "중복된 아이디 없음.사용가능!!";    	
    }else{
		check = "중복된 아이디 있음. 사용불가능!!";    	
    }
%>아나아아아아아아<%=check %>
