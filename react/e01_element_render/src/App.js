import ButtonCancel from './components/ButtonCancel';
import ButtonOK from './components/ButtonOK';
import Profile from './components/Profile';

function App() {
  const style = {
    marginLeft: '50px',
  };
  style.backgroundColor = 'yellowgreen';

  return (
    <div style={style}>
      <h1>Hello React</h1>
      <ButtonOK />
      <ButtonCancel />
      <hr />
      <Profile />
    </div>
  );
}

export default App;
