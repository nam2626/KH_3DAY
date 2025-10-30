import { useReducer } from 'react';
//상태값을 제어하는 함수
function reducer(state, action) {
  console.log(action);
  switch (action.type) {
    case 'INCREMENT':
      return { value: state.value + 1 };
    case 'DECREMENT':
      return { value: state.value - 1 };
  }
}
export default () => {
  const [count, dispatch] = useReducer(reducer, { value: 0 });
  return (
    <div>
      <h2>reducer 예제</h2>
      <p>count : {count.value}</p>
      <p>
        <button onClick={() => dispatch({ type: 'INCREMENT', payload: 1 })}>+</button>
        <button>-</button>
      </p>
    </div>
  );
};
