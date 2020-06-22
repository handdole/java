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
					<table border="1" aglin="center" aglin="center">
						<tr>
							<td>부서</td>
							<td>이름</td>
							<td>직급</td>
						</tr>
						<tr>
							<td>기획</td>
							<td>박기획</td>
							<td>과장</td>
						</tr>
						<tr>
							<td>영업</td>
							<td>박영업</td>
							<td>대리</td>
						</tr>
						<tr>
							<td>교육</td>
							<td>박교육</td>
							<td>사원</td>
						</tr>
					</table>
				</div>
				<hr color="blue" width="500">
				<div id="bottom">
					<jsp:include page="bottom.jsp"></jsp:include>
				</div>
			</center>
		</body>
	</html>