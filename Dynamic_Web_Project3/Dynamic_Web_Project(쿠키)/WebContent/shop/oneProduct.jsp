<%@page import="bean.ProductDTO"%>
<%@page import="bean.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="../css/cssshop.css">
	</head>
	<body>
		<div id="total">
			<div id="top1">
				<jsp:include page="top1.jsp"></jsp:include>
			</div>	
			<div id="top2">
				<jsp:include page="top2.jsp"></jsp:include>
			</div>
			<div id="center">
				<%
					ProductDTO dto = new ProductDTO();
					String id = request.getParameter("id");
					dto.setId(id);
					ProductDAO dao = new ProductDAO();
					ProductDTO dto2 = new ProductDTO();
					dto2 = dao.one(dto);
				%>
				
				<table border=1 >
					<tr>
						<td>제품 id</td>
						<td><%= dto2.getId() %></td>
					</tr>
					<tr>
						<td>제품 제목</td>
						<td><%= dto2.getTitle() %></td>
					</tr>
					<tr>
						<td>제품 내용</td>
						<td><%= dto2.getContent() %></td>
					</tr>
					<tr>
						<td>제품 이미지</td>
						<td>
							<img src="../img/<%= dto2.getImg() %>">
						</td>
					</tr>
					<tr>
						<td>제품 가격</td>
						<td><%= dto2.getPrice() %></td>
					</tr>
				</table>
				<button id="basketbtn" value="<%= dto2.getId() %>" style="width: 200px; height: 100px">장바구니에 넣기</button>
			</div>	
		</div>
	</body>
</html>