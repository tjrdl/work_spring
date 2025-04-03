<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="500" border="1">
		<form method="post" action="modify">
			<tr>
				<td>번호</td>
				<td>${content_view.boardNo}
				<input type="hidden" name="boardNo" value="${content_view.boardNo}">
				</td>
			</tr>
			<tr>
				<td>히트</td>
				<td>${content_view.boardHit}</td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="boardName" value="${content_view.boardName}">
				</td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="boardTitle" value="${content_view.boardTitle}"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><input type="text" name="boardContent" value="${content_view.boardContent}"></td>
			</tr>
			<tr>
				<td colspan="2">
				<input type="submit" value ="수정">
				<!-- jsp -> controller -> Service -> DAO -->
				&nbsp;&nbsp;<a href="list">목록보기 &nbsp;&nbsp;<a href="delete?boardNo=${content_view.boardNo}">삭제</a>
				</td>
			</tr>
		</form>
	</table>
</body>
</html>