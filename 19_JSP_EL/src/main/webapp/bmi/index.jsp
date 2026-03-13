<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>BMI 검사</title>

    <link rel="stylesheet" href="./css/bmi.css">
    <script src="./js/main.js" defer></script>
</head>
<body>

<form id="form" action="${pageContext.request.contextPath}/bmi" method="post" enctype="multipart/form-data">
    <div>
        <h2>BMI 검사</h2>
    </div>


    <div class="container">

        <div class="items">
            <div class="item1">이름</div>
            <div class="item2">
                <input id="nameInput" name="name" class="text-input" placeholder="필수 2글자 이상"/>
            </div>
        </div>

        <div class="items">
            <div class="item1">키(CM)</div>
            <div class="item2">
                <input id="heightInput" name="height" class="text-input" placeholder="3자리 이상, 숫자만" type="number"/>
            </div>
        </div>

        <div class="items">
            <div class="item1">체중(KG)</div>
            <div class="item2">
                <input id="weightInput" name="weight" class="text-input" placeholder="숫자만, 공백X" type="number"/>
            </div>
        </div>

        <div class="items">
            <div class="item1">사진</div>
            <div class="item2">
                <input name="pic" type="file">
            </div>
        </div>

        <div class="btnWrapper">
            <button id="btn">계산</button>
        </div>
    </div>
</form>


</body>
</html>