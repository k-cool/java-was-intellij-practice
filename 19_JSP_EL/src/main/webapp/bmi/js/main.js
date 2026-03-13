
const form = document.getElementById("form");
const btn = document.getElementById("btn");
const nameInput = document.getElementById("nameInput");
const heightInput = document.getElementById("heightInput");
const weightInput = document.getElementById("weightInput");

const handleClickBtn = (e)=>{
    e.preventDefault();

    const name= nameInput.value;
    const height= heightInput.value;
    const weight= weightInput.value;

    if(name.length<2) return alert('이름을 2글자 이상 입력해주세요!');
    if(height<100) return alert('키를 양수, 세자리 이상 입력해주세요!');
    if(!weight||weight<=0) return alert('몸무게는 양수 값을 입력해주세요!');

    form.submit();
};

btn.addEventListener('click',handleClickBtn);