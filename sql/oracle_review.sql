-- 비밀번호 잊어 버렸을 때
sqlplus sys/oracle as sysdba
-- 관리자 비밀번호 변경
alter user system identified by 123456;
-- JDBC 드라이버 위치 : C:\app\user1\product\21c\dbhomeXE\jdbc\lib
-- 사용자 생성
CREATE USER C##ADMIN IDENTIFIED BY 123456;
-- 권한 적용
GRANT RESOURCE, CONNECT, CREATE VIEW TO C##ADMIN;
-- 저장소 사용량 부여
ALTER USER C##ADMIN DEFAULT TABLESPACE USERS QUOTA UNLIMITED ON USERS;  
