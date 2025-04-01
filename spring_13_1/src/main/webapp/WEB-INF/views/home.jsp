<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<form action="student" method="get">
	student id: <input type="text" name="id"><br/>
	<input type="submit" value="전송">
</form>
</body>
</html>
