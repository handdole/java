<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>회사 소개 페이지</title>
		</head>
		<body>
			<center>
				<div id="top">
				<!-- 동적태그 : jsp -->
					<jsp:include page="top.jsp"></jsp:include>
				</div>
				<hr color="red" width="500">
				<div id="center" >
				판매하는 품목 : <br>
					<ul type="square" >
						<li>생선</li>
						<li>야채</li>
						<li>해산물</li>
					</ul>
					<ol type="A">
						<li>오프라인 판매</li>
						<li>온라인 판매</li>
						<li>방문 판매</li>
					</ol>
				</div>
				<hr color="blue" width="500">
				<div id="bottom">
					<jsp:include page="bottom.jsp"></jsp:include>
				</div>
			</center>
		</body>
	</html>