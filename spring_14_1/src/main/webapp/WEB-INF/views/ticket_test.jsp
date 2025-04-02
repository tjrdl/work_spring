<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- ${pageContext.request.contextPath} => 프로젝트 명 -->
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
$(function() {
	$("#checkJson").click(function() {
		var member={tno:"777", owner:"hong gill dong",grade:"A"};
		$.ajax({
			type:"POST"
			,url:"${contextPath}/sample/ticket"
			// colon(:), equals(=) 구분
			,contentType:"application/json"
			/* JSON.stringify : 객체를 json 문자열 형태로 변환 */
			,data:JSON.stringify(member)
			,success:function(data){
				 console.log("성공:", data);
			}
			,error:function(data){
				console.error("오류 발생:", status, error);
				alert("오류 발생.");
			}
		}); // end ajax
	}); // end of click
}); // end of function
</script>
</head>
<body>
	<input type="button" id="checkJson" value="회원 정보 보내기">
</body>
</html>