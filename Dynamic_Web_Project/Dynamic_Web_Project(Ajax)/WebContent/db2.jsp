<%@page import="bean.Member2DAO"%>
<%@page import="bean.MemberDAO"%>
<%@page import="bean.Member2DTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dto" class="bean.Member2DTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<%
	Member2DAO dao = new Member2DAO();
	dao.insert(dto);
	
%>