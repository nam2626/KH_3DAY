import 'bootstrap/dist/css/bootstrap.min.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Login from './pages/Login';
import Header from './components/Header';
import Main from './pages/Main';
function App() {
  return (
    <div>
      <BrowserRouter>
        <Header />
        <hr />
        <Routes>
          <Route path="/" element={<Login />} />
          <Route path="/main" element={<Main />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
