<%@page import="bean.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
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
				if(session.getAttribute("id") != null){
			%>
			<%=session.getAttribute("id") %>님 환영합니다.
			<%
				}
			%>
			<%
				ProductDAO dao = new ProductDAO();
				ArrayList<ProductDTO> list = dao.list();
			%>
			
			<table border=1 style="background: white;">
				<tr>
					<th>제품id</th>
					<th>제품명</th>
					<th>제품가격</th>
					<th>제품이미지</th>
				</tr>
				<%
					for(ProductDTO dto2 : list){
				%>
				<tr>
					<td style="width: 200px;"><%= dto2.getId() %></td>
					<td style="width: 200px;">
					<a href="oneProduct.jsp?id=<%= dto2.getId() %>"><%= dto2.getTitle() %></a>
					</td>
					<td style="width: 200px;"><%= dto2.getPrice() %></td>
					<td><img src='../img/<%= dto2.getImg() %>' style="width: 200px; height: 200px;"></td>
				</tr>
				<%
					}
				%>
				
			</table>
			
			</div>	
		</div>
	</body>
</html>