<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/hello-servlet">
    이름 : <input type="text" name="name">
    중간 : <input type="text" name="mid">
    기말 : <input type="text" name="fin">
    <button>확인</button>
</form>


</body>
</html>