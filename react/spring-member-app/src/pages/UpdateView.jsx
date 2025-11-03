import { useEffect, useRef, useState } from 'react';
import { useNavigate, useParams } from 'react-router-dom';
import { getMember } from '../utils/memberAPI';

export default () => {
  const navigate = useNavigate();
  const { id } = useParams();
  const [member, setMember] = useState(null);
  useEffect(() => {
    const fetchMember = async () => {
      const data = await getMember(id);
      console.log(data.member);
      if (!data.member) navigate(-1);
      else setMember(data.member);
    };
    fetchMember();
  }, []);
  const txtId = useRef(null);
  const txtPasswd = useRef(null);
  const txtUserName = useRef(null);
  const txtNickName = useRef(null);
  alert('렌더링');
  return (
    <div className="conatiner text-center">
      <h2>회원정보 수정 페이지</h2>
      <hr />
      {member && (
        <div className="container">
          <input type="text" id="id" className="form-control mb-2" ref={txtId} value={member.id} readOnly />
          <input type="password" className="form-control mb-2" ref={txtPasswd} placeholder="암호를 입력하세요" />
          <input type="text" className="form-control mb-2" ref={txtUserName} value={member.userName} placeholder="사용자 이름을 입력하세요" />
          <input type="text" className="form-control mb-2" ref={txtNickName} value={member.nickName} placeholder="닉네임을 입력하세요" />
          <div>
            <button className="btn btn-primary me-2">수정하기</button>
            <button className="btn btn-warning">취소하기</button>
          </div>
        </div>
      )}
    </div>
  );
};
