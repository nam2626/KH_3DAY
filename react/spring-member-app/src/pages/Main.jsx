import axios from 'axios';
import { useEffect } from 'react';
export default () => {
  const getMemberList = async () => {
    try {
      const res = await axios.get('http://localhost:9999/member/list');
      console.log(res.data);
    } catch (err) {
      console.log(err);
    }
  };

  useEffect(() => {
    getMemberList();
  }, []);

  return (
    <div>
      <table>
        <thead>
          <tr>
            <th>아이디</th>
            <th>이름</th>
            <th>닉네임</th>
            <th>비고</th>
          </tr>
        </thead>
        <tbody></tbody>
      </table>
    </div>
  );
};
