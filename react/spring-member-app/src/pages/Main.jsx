import axios from 'axios';
import { useEffect, useState } from 'react';
export default () => {
  const [memberList, setMemberList] = useState([]);
  const getMemberList = async () => {
    try {
      const res = await axios.get('http://localhost:9999/member/list');
      console.log(res.data);
      setMemberList(res.data.list);
    } catch (err) {
      console.log(err);
    }
  };

  useEffect(() => {
    getMemberList();
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
              <tr>
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
