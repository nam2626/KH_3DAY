import { Link } from 'react-router-dom';

export default () => {
  return (
    <nav className="navbar navbar-expand-lg">
      <div className="container-fluid">
        <ul className="navbar-nav">
          <li className="nav-item">
            <Link className="nav-link" to="/home">
              홈
            </Link>
          </li>
          <li className="nav-item">
            <Link className="nav-link" to="/register">
              회원등록
            </Link>
          </li>
        </ul>
      </div>
    </nav>
  );
};
