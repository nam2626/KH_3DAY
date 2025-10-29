import logo from './logo.svg';
import './App.css';
import Counter from './components/Counter';
import TimeView from './components/TimeView';
import NumberList from './components/NumberList';
import RegisterComponent from './components/RegisterComponent';

function App() {
  console.log('App 렌더링');
  return (
    <div className="App">
      <h2>State & Event 예제</h2>
      {/* <Counter />
      <hr></hr>
      <TimeView /> 
      <NumberList />*/}
      <RegisterComponent />
    </div>
  );
}

export default App;
