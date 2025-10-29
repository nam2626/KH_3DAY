import { useRef, useState } from 'react';

export default () => {
  const [count, setCount] = useState(0);
  const addStateCount = () => {
    setCount(count + 1);
  };
  //일반 변수는 렌더링 될때마다 초기화
  let n = 0;
  const refCount = useRef(0);
  const addRefCount = () => {
    refCount.current++;
    n++;
    console.log('ref : ', refCount.current);
    console.log('n : ', n);
    console.log('txt : ', txt.current.value);
  };

  //input tag에 연결
  const txt = useRef(null);

  return (
    <>
      <input type="text" ref={txt} onChange={() => console.log(txt.current.value)} />
      <br />
      <button onClick={addRefCount}>ref 카운트 증가 : {refCount.current}</button>
      <button onClick={addStateCount}>state 카운트 증가 : {count} </button>
    </>
  );
};
