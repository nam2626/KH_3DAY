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
-- 데이터 타입
-- 문자열 : CHAR(2000까지 지원), VARCHAR2(4000), CLOB(128TB)
-- 숫자 : NUMBER(자리수, 소수점개수) -> 최대 38, FLOAT(128)
-- 날짜 시간 : DATE(날짜/시간), TIMESTAMP(소수점까지 저장 가능 최대 9자리)
-- https://docs.oracle.com/en/database/oracle/oracle-database/19/refrn/datatype-limits.html

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

-- CAR 테이블 전체 조회
SELECT * FROM CAR;

-- 자동차 제조사만 조회
SELECT DISTINCT MAKER FROM CAR;
-- 제조사 데이터 건수 조회
SELECT COUNT(*) FROM (SELECT DISTINCT MAKER FROM CAR);
SELECT ROW_NUMBER() OVER(ORDER BY MAKER), MAKER FROM (SELECT DISTINCT MAKER FROM CAR);
-- 제조사별 데이터 건수
SELECT DISTINCT MAKER, COUNT(*) OVER(PARTITION BY MAKER)
FROM CAR;
-- 자동차의 제조사별 모델의 금액 순위
SELECT ID, CNAME, MAKER, RANK() OVER(PARTITION BY MAKER ORDER BY PRICE)
FROM CAR;

-- 옵션	설명
-- 'U'	대문자 알파벳
-- 'L'	소문자 알파벳
-- 'A'	대/소문자 알파벳
-- 'X'	대문자 알파벳 또는 숫자
-- 'P'	출력 가능한 모든 문자 (특수문자 포함)

SELECT DBMS_RANDOM.STRING('U', 1) || TO_CHAR(ROW_NUMBER() OVER(ORDER BY MAKER),'FM00'), MAKER 
FROM (SELECT DISTINCT MAKER FROM CAR);



