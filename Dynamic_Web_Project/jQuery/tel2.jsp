<%@page import="java.util.Random"%><%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><% //스크립트릿
	String tel = request.getParameter("tel");
    //6자의 임의의 값을 생성하여 전송해보세요.(2개이상의 방법을 융합)
    //1. 앞번호 3개에 따라서 다르게 생성(3자리 생성)
    //01012345678
    String company = tel.substring(0, 3); //010
    String no = "";
    
    if(company.equals("010")){
    	no = no + 123;
    }else if(company.equals("011")){
    	no = no + 456;
    }else if(company.equals("012")){
    	no = no + 789;
    }
    Random r = new Random();
    String tail1 = Integer.toString(r.nextInt(10));
    String tail2 = Integer.toString(r.nextInt(10));
    String tail3 = Integer.toString(r.nextInt(10));
    no = no+ tail1 + tail2 + tail3;
    //2. 뒷번호는 랜덤하게 생성(3자리)
%><%=no %>
