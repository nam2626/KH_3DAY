import { useState } from 'react';

export default () => {
  //입력한 숫자들을 저장할 배열을 상태값으로 지정
  const [numbers, setNumbers] = useState([]);
  //버튼 클릭했을때 배열에 입력한 숫자를 저장하는 이벤트 함수를 만들어서 버튼에 이벤트 지정
  const addNumber = () => {
    const txt = document.querySelector('input');
    //값을 입력 했는지?
    if (txt.value.trim() == '') {
      alert('입력한 값이 없습니다.');
      return;
    }
    //입력한 값이 숫자가 맞는지?
    if (isNaN(txt.value)) {
      alert('숫자를 입력해 주세요');
      return;
    }
    //배열에 숫자 추가
    setNumbers([...numbers, parseInt(txt.value)]);
    console.log(numbers);
    //입력된 값 제거
    txt.value = '';
  };

  return (
    <>
      <input type="text" placeholder="숫자 입력하세요" />
      <p>현재 입력된 숫자 목록 :{numbers.join(',')}</p>
      <button onClick={addNumber}>숫자 추가</button>
      <p>입력된 숫자들의 평균 : {numbers.length != 0 && (numbers.reduce((acc, cur) => acc + cur) / numbers.length).toFixed(2)}</p>
    </>
  );
};
