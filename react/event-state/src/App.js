import logo from './logo.svg';
import './App.css';
import Counter from './components/Counter';
import TimeView from './components/TimeView';

function App() {
  console.log('App 렌더링');
  return (
    <div className="App">
      <h2>State & Event 예제</h2>
      <Counter />
      <hr></hr>
      <TimeView />
    </div>
  );
}

export default App;
