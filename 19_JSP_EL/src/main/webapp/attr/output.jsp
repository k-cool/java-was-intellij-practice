<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>

	<h1>계산 결과 2</h1>
	
	<div>
		<div>상품 가격: <%=request.getAttribute("price") %></div>
		<div>지불한 돈: <%=request.getAttribute("money") %></div>
		<div>잔돈: <%=request.getAttribute("ex") %></div>
		<div>멘트: <%=request.getAttribute("say") %></div>
	</div>

</body>
</html>