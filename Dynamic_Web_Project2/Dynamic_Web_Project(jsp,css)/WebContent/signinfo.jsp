<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			//request는 내장된 객체이다. 
			//클라이언트가 입력하여 전송한 데이터를 웹서버가 받아주는 역활
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			String name = request.getParameter("name");
			String com = request.getParameter("com");
			String tel = request.getParameter("tel");
			String gender = request.getParameter("gender");
			String word = request.getParameter("word");
			String[] hobby = request.getParameterValues("hobby");
			String list = "";
			if(hobby.length != 0){
				for(String s : hobby){
					list = list + " "+ s;
				}
			}
			else{
				list = "취미가 없습니다.";
			}
			if(word.equals("")){
				word = "작성하지 않았습니다.";
			}
		%>
		받은 아이디는 : <% out.print(id); %><br>
		받은 패스워드는 : <%=password %><br> <!-- 표현식(expression) -->
		받은 이름은 : <%=name %><br>
		받은 번호는 : <%= com%>-<%= tel%><br>
		받은 성별은 : <%=gender %><br>
		받은 취미는 : <%=list %><br>
		받은 말은 : <%=word %><br>
	</body>
</html>