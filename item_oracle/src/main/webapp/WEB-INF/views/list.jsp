<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="500" border="1">
		<tr>
			<td>상품명</td>
			<td>가격</td>
			<td>설명</td>
		</tr>
		<!-- 조회결과 -->
		<!-- list: 모델객체에서 보낸 이름 -->
		<c:forEach var="dto" items="${list}">
		<tr>
			<td>${dto.name}</td>
			<td>${dto.price}</td>
			<%-- <td>
			<a href="content_view?boardNo=${dto.boardNo}">${dto.boardTitle}</a>
			</td> --%>
			<td>${dto.description}</td>
		</tr>
		</c:forEach>
		</td>
		<td><a href="item_write">작성</td>
	</table>
</body>
</html>