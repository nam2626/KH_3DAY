import ButtonOK from './components/ButtonOK';

function App() {
  const style = {
    marginLeft: '50px',
  };
  style.backgroundColor = 'yellowgreen';

  return (
    <div style={style}>
      <h1>Hello React</h1>
      <ButtonOK />
    </div>
  );
}

export default App;
