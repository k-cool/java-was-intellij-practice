<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<!--

     EL(Expression Language)
     - 값 읽을때
     - 연산자 사용 가능
     - import 필요없음
     - 값이 없으면 넘어감

     EL 사용법
     - parameter 읽기 : \${param.이름}
     - attribute 읽기 : \${어트리뷰트 이름}
     - object 읽기    : \${객체이름.멤버변수}

     기본형[] or ArrayList<>  : \${이름[인덱스]}
     객체                     : \${이름[인덱스].멤버변수}

-->

<%
    //    Student std = (Student) request.getAttribute("std");
%>

<body>

<%--<div>--%>
<%--    이름: <%=std.getName()%> <br>--%>
<%--    중간: <%=std.getMid()%> <br>--%>
<%--    기말: <%=std.getFin()%> <br>--%>
<%--    평균: <%=std.getAvg()%> <br>--%>
<%--    등급: <%=std.getGrade()%> <br>--%>
<%--</div>--%>

<div>
    이름: ${param.name} <br>
    중간: ${param.mid} <br>
    기말: ${param.fin} <br>
    평균: ${std.avg} <br>
    등급: ${std.grade} <br>
</div>

--------------------------------

<div>
    a: ${a} <br>
    b: ${b} <br>
    iArr[0]: ${iArr[0]} <br>
    iArr[1]: ${iArr[1]} <br>
    iArr[2]: ${iArr[2]} <br>
    iArr[3]: ${iArr[3]} -> 값이 없으면 넘어감 <br>
    sArr[0]: ${sArr[0]} <br>
    sArr[1]: ${sArr[1]} <br>
    stds: ${stds} <br>

    <hr>

    <%--    1번학생 이름, 등급--%>
    ${stds[0].name} ${stds[1].grade} <br>
    <%--    3번학생 이름, 평점, 등급--%>
    ${stds[2].name} ${stds[2].avg} ${stds[2].grade} <br>

</div>

</body>
</html>
