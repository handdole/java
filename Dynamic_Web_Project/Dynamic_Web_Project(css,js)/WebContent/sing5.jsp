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
					<audio controls src="media/horse.mp3">
					</audio><br>
					<video width="520" height="600" controls>
						<source src="media/mov_bbb.mp4">
					</video>
				</div>
				<hr color="blue" width="500">
				<div id="bottom">
					<jsp:include page="bottom.jsp"></jsp:include>
				</div>
			</center>
		</body>
	</html>