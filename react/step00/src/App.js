import './App.css';
import { minus, plus } from './func/math';
import mylog, { multi } from './func/log';

function App() {
  let sum = plus(100, 200);
  let sub = minus(40, 5);
  let mul = multi(5, 3);
  mylog('우리가 만들 로그함수');
  return (
    <div className="App">
      <h2>덧셈 결과 : {sum}</h2>
      <h2>뺄셈 결과 : {sub}</h2>
      <h2>곱셈 결과 : {mul}</h2>
      <p>안뇽 ㅋㅋㅋㅋ</p>
    </div>
  );
}

export default App;
