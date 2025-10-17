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
-----------------------------------------------------------------------------
-- CAR
-- 차량번호 - 문자 10개, 차량명, 제조사, 제조년도 - 정수 4자리, 금액 - 정수 5자리
-- 차량번호 --> A000000000
CREATE TABLE CAR(
	ID CHAR(10) PRIMARY KEY,
	CNAME VARCHAR2(50),
	MAKER VARCHAR2(50),
	MYEAR NUMBER(4),
	PRICE NUMBER(5)
);
-- 제약조건 삭제
ALTER TABLE CAR DROP CONSTRAINT SYS_C008314;
-- 제약조건 지정
ALTER TABLE CAR ADD CONSTRAINT PK_CAR PRIMARY KEY(ID);
-- 테이블 생성시 제약조건 지정
DROP TABLE CAR;

CREATE TABLE CAR(
	ID CHAR(10),
	CNAME VARCHAR2(50),
	MAKER VARCHAR2(50),
	MYEAR NUMBER(4),
	PRICE NUMBER(5),
	CONSTRAINT PK_CAR PRIMARY KEY(ID)
);


SELECT LENGTHB('바') FROM DUAL;

SELECT * FROM USER_CONSTRAINTS;






