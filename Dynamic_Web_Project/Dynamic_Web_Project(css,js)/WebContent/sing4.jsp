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
				<div id="center">
					<img src="img/way.jpg"><br>
					회사 오시는길 순서:<br>
					<ol type="A">
						<li>입구에 들어오자마자 우회전</li>
						<li>처음 갈림길에서 좌회전</li>
						<li>쭉 직진 하다가 우회전</li>
						<li>그대로 길 따라 오면 도착.</li>
					</ol>
				</div>
				<hr color="blue" width="500">
				<div id="bottom">
					<jsp:include page="bottom.jsp"></jsp:include>
				</div>
			</center>
		</body>
	</html>