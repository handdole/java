<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="../css/cssshop.css">
		<script type="text/javascript" src="../js/jquery-3.4.1.js"></script>
		<script type="text/javascript">
		$(function () {
			$("#b1").click(function() {
				$.ajax({
					url : "login.jsp" , 
					data : {
						id : $('#id').val(),
						pw : $('#pw').val()
					},
					success : function(result) {
						console.log(result)
						if(result=='0'){
							$('#center').append("<span style=color:red;>로그인되지않음</span>");
						}
						else{
							location.href("member.jsp")
						}
					}
				
				})
			})
		})
		
		
		</script>
	</head>
	<body>
		<div id="total">
			<div id="top1">
				<jsp:include page="top1.jsp"></jsp:include>
			</div>	
			<div id="top2">
				<jsp:include page="top2.jsp"></jsp:include>
			</div>
			<div id="center" >
			<%
				//세션이 설정되어 있지 않으면 , 로그인 화면을 보여주고 , 
				if(session.getAttribute("id") == null){
			%>
				id : <input type="text" name="id" id="id">
				pw : <input type="text" name="pw" id="pw">
				<button type="button" id="b1">로그인</button>
			<%
				}else{
				//세션이 설정되어 있지 있으면 , 세션정보를 보여주어야함.
					
			%>
				
			<%=session.getAttribute("id") %>님 환영합니다.
			<a href="logout.jsp">로그아웃</a>
			<%
				}
			%>
				
			</div>	
		</div>
	</body>
</html>