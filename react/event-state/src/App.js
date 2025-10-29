import logo from './logo.svg';
import './App.css';
import Counter from './components/Counter';
import TimeView from './components/TimeView';
import NumberList from './components/NumberList';
import RegisterComponent from './components/RegisterComponent';
import RefEx from './components/RefEx';
import EffectEx1 from './components/EffectEx1';

function App() {
  console.log('App 렌더링');
  return (
    <div className="App">
      {/*<h2>State & Event 예제</h2>
      <h2>State & Event 예제</h2>
       <Counter />
      <hr></hr>
      <TimeView /> 
      <NumberList />
      <RegisterComponent />
      <h2>Ref 예제</h2>
      <RefEx />*/}
      <EffectEx1 />
    </div>
  );
}

export default App;
