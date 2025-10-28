import './App.css';
import { plus } from './func/math';

function App() {
  let sum = plus(100, 200);
  return (
    <div className="App">
      <h2>덧셈 결과 : {sum}</h2>
      <p>안뇽 ㅋㅋㅋㅋ</p>
    </div>
  );
}

export default App;
