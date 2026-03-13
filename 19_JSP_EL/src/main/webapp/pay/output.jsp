<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	번돈 : ${r.earn} <br>
	쓴돈 : ${r.spend} <br>
	남은돈 : ${r.remain} <br>

	<a href="${pageContext.request.contextPath}">처음으로</a>
</body>
</html>