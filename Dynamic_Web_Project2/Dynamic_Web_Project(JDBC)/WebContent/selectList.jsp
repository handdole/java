<%@page import="java.util.ArrayList"%>
<%@page import="bean.MemberDTO2"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript">
$(function() {
	$('#check').click(function() {
		choiceList = $('input:checkbox[class="choice"]:checked')
		console.log(choiceList.length + "개 선택됨.")
	})
	$('button').click(function() {
		nameValue = $(this).attr('id')    // 버튼 안에 있는 속성중에 id를 가져와주세요
		console.log(nameValue)     //empty 는 자식들을 다 죽이는 것이고 remove는 자신을 죽이는 함수
		tr = $(this).parent().parent()
		$.ajax({
			url : "delete.jsp",
			data : {
				name : nameValue
			},
			success : function(result) {
				console.log(result)
				if (result == 1) {
					tr.remove()
				}
				else{
					alert("삭제에 문제가 있습니다.")
				}
			}
		})
		
	})
})
</script>
</head>
<body>

<%
	MemberDAO dao = new MemberDAO();
	ArrayList<MemberDTO2> list = dao.list1();
%>
<h3 style="color:blue">검색결과입니다.</h3>
<hr>
 
<table border=1>
<tr>
	<td><input type="button" style="background: yellow" id="check" value="블랙리스트 추가"></input></td>
	<td>이름</td>
	<td>나이</td>
	<td>회사</td>
	<td>번호</td>
	<td>삭제</td>
</tr>
<%
	for(MemberDTO2 dto2 : list){
%>		
	
<tr>
	<td><input type="checkbox" value="<%= dto2.getName() %>" class ='choice'></td>
	<td>
		<a href="selectAall.jsp?name=<%= dto2.getName() %>">
		<%= dto2.getName() %>
		</a>
	</td>
	<td><%= dto2.getAge() %></td>
	<td><%= dto2.getCompany() %></td>
	<td><%= dto2.getTel() %></td>
	<td><button type=button style="background:lime" id="<%= dto2.getName() %>" >삭제</button></td>
</tr>


<%
	}
%>
</table> 




</body>
</html>