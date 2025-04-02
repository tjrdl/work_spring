<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
$(function() {
	$("#checkJson").click(function() {
		var member={id:"PJS", pw:"1234",name:"park", email:"park@test.com"};
		$.ajax({
			type:"POST"
			,url:"${contextPath}/sample/info"
			,contentType:"application/json"
			,data:JSON.stringify(member)
			,success:function(data){
				alert("@# data=> "+data);
			}
			,error:function(data){
				alert("오류 발생.");
			}
		}); 
	}); 
}); 
</script>
</head>
<body>
	<input type="button" id="checkJson" value="회원 정보 보내기">
</body>
</html>