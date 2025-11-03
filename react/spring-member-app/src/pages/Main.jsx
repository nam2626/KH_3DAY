import axios from 'axios';
import { useEffect, useState } from 'react';
import { getMemberList } from '../utils/memberAPI';
export default () => {
  const [memberList, setMemberList] = useState([]);

  const deleteMember = async () => {};

  const fetchMemberList = async () => {
    const data = await getMemberList();
    setMemberList(data.list);
  };

  useEffect(() => {
    fetchMemberList();
  }, []);

  return (
    <div className="container-lg">
      <table className="table table-hover table-striped text-center">
        <thead>
          <tr className="fs-4">
            <th>아이디</th>
            <th>이름</th>
            <th>닉네임</th>
            <th>비고</th>
          </tr>
        </thead>
        <tbody>
          {memberList &&
            memberList.map((item) => (
              <tr key={item.id}>
                <td>{item.id}</td>
                <td>{item.userName}</td>
                <td>{item.nickName}</td>
                <td className="">
                  <button className="btn  btn-primary me-2">수정</button>
                  <button className="btn btn-danger">삭제</button>
                </td>
              </tr>
            ))}
        </tbody>
      </table>
    </div>
  );
};
