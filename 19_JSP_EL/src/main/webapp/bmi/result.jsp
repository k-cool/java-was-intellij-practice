<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BMI 검사결과</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/bmi/css/result.css">
</head>



<body>
<div>
    <div>
        <h2>BMI 결과</h2>
    </div>

    <div class="container">
        <div>
            <img class="img" src='imgs/${bmiDto.pic}'>
        </div>


        <div class="items">
            <div class="item1">이름</div>
            <div class="item2">
                <div>${bmiDto.name}</div>
            </div>
        </div>

        <div class="items">
            <div class="item1">키(CM)</div>
            <div class="item2">
                <div>${bmiDto.height}</div>
            </div>
        </div>

        <div class="items">
            <div class="item1">체중(KG)</div>
            <div class="item2">
                <div>${bmiDto.weight}</div>
            </div>
        </div>

        <div class="items">
            <div class="item1">BMI</div>
            <div class="item2">
                <div>${bmiDto.bmi}</div>
            </div>
        </div>

        <div class="items">
            <div class="item1">결과</div>
            <div class="item2">
                <div>${bmiDto.status}</div>
            </div>
        </div>

        <div class="btnWrapper">
            <button onclick="history.back()">다시하기</button>

        </div>

            <a href="${pageContext.request.contextPath}">처음으로</a>
    </div>


</div>

</body>
</html>
