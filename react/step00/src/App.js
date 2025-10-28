import './App.css';
import { minus, plus } from './func/math';

function App() {
  let sum = plus(100, 200);
  let sub = minus(40, 5);
  return (
    <div className="App">
      <h2>덧셈 결과 : {sum}</h2>
      <h2>뺄셈 결과 : {sub}</h2>
      <p>안뇽 ㅋㅋㅋㅋ</p>
    </div>
  );
}

export default App;
