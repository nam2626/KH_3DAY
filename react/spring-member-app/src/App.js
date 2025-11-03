import 'bootstrap/dist/css/bootstrap.min.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Login from './pages/Login';
function App() {
  return (
    <div>
      <BrowserRouter>
        <hr />
        <Routes>
          <Route path="/" element={<Login />} />
          <Route path="/main" element={<></>} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
