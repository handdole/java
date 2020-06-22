<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">


</style>
</head>
<body>

<table border="1" >

<%
	//쿠키의 value를 바꾸고 싶으면 key를 똑같이해서 보내면 되고 
	// 사라지게 하고싶으면 cookie.setmaxage를 사용해서 0으로하면 사라짐. (시간 주기를 지정하는 함수)
	Cookie[] cookies = request.getCookies();
	for(Cookie cookie : cookies){
%>
	<tr>
		<td><%= cookie.getName() %></td>
		<td><%= cookie.getValue() %></td>
	</tr>
<%
	}
%>

</table>


</body>
</html>