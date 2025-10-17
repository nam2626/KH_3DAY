-- 비밀번호 잊어 버렸을 때
sqlplus sys/oracle as sysdba
-- 관리자 비밀번호 변경
alter user system identified by 123456;