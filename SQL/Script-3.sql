-- film 테이블에서 길이가 60분 이상 90분 이하인 
-- 영화를 조회하세요
USE academy_db;

CREATE TABLE ACTOR (
    ACTOR_ID INT PRIMARY KEY,
    FIRST_NAME VARCHAR(50),
    LAST_NAME VARCHAR(50)
);
select title, length from film
where length not between 60 and 90;


-- actor 테이블에서 이름이 A로 시작하는 배우의 이름을 조회하기 
SELECT FIRST_NAME from ACTOR WHERE FIRST_NAME like '%A';

-- film 테이블에서 제목에 LOVE가 포함된 영화의 제목을 조회하세요 
select TITLE from FILM where TITKE like 'LOVE';

-- actor 테이블에서 이름이 A로 시작하고 총 3글자인 배우의 이름을 
-- 조회하세요
select FIRST_NAME from ACTOR
where FIRST_NAME like 'A__';

-- 배우테이블에서 이름의 두번 쨰 글자가 A인 배우를 조회하세요
SHOW TABLES;

-- 배우테이블에서 이름이 정확히 4글자인 배우의 이름 조회하기 
SELECT FIRST_NAME 
FROM ACTOR 
WHERE FIRST_NAME LIKE '____'; -- 언더바 4개


-- 일부 컬럼만 추가하기
-- 컬럼이 NOT NULL이면 무조건 써야함 
USE academy_db; -- 데이터베이스 선택
DROP TABLE FRUIT; -- 기존의 꼬인 테이블 삭제

CREATE TABLE FRUIT (
    FRUIT_ID INT PRIMARY KEY,    -- 고유 식별 번호 (PK)
    FRUIT_NAME VARCHAR(50),      -- 과일 이름
    PRICE INT                    -- 가격
);
insert into FRUIT values (7, '키위', 5000);
insert into FRUIT values (6, '딸기', 1200);
SET FOREIGN_KEY_CHECKS = 0;
TRUNCATE TABLE FLOWER;
SET FOREIGN_KEY_CHECKS = 1;
DESC FLOWER;
INSERT INTO FLOWER (FLOWER_ID, FLOWER_NAME, FLOWER_COLOR, FLOWER_PRICE) 
VALUES 
(1, '장미', '빨간색', 3000),
(2, '무궁화', '핑크색', 4000),
(3, '튤립', '노란색', 2000);
-- 화분테이블 추가하기 
select * from POT;
insert into POT(POT_ID, POT_COLOR, POT_SHAPE, FLOWER_NAME)
values('2026002','검은색', '네모', '해바라기');
-- TBL_STUDENT 테이블에 홍길동의 이름을 김길동으로 바꿔라
update TBL_STUDENT
set NAME = '김길동'
where ID = 1;   -- 조건을 걸지 않으면 테이블내의 모든 속성이 수정될 수 있다.

-- DEFAULT 값으로 바꾸기
update TBL_STUDENT 
set GENDER = default 
where ID = 3;

-- 여러 조건으로 UPDATE 하기
-- AND 를 사용하여 조건을 모두 만족하는 행만 수정하기 
-- 꽃 테이블에서 


create table ACTOR_PRACTICE as
select ACTOR_ID, first_NAME, last_NAME, last_UPDATE
from SAKILA.ARTOR;

select * from ACTOR_PRACTIC;

-- 배우 번호가 1번인 배우의 이름을 'JAMES'로 수정
-- 영화 번호가 1번인 영화의 대여 가격 (RENTAL_RATE)을  4.99로 수정하세요
-- 영화 번호가 1인 영화에 대해 대여기간을 1증가 시키기 
select TITLE, RENTAL_DURATION from FILM_PRACTICE

-- 배우 테이블에서 ID가 1인 배우 삭제하기 
-- 여러행을 삭제 
-- 이름이 JOHN 인 배우 모두 삭제하기 
delete from ACTOR_PRACTICE where FIRST_NAME = 'JHON';

-- FLOWER 테이블의 장미 삭제하기 
-- 외래키를 설정할 때 ON DELETE CASCADE 설정을 주게 되면
-- 같이 삭제 된다.
delete from flower where FLOWER_NAME = '장미';
 
-- 사용자 생성하기
create user 'student_user'@'localhost'
identified by '1234';

-- 사용자 확인하기 
-- MySQL 사용자는 mysql.user 테이블에서 확인할 수 있다.
select user, host from mysql.user;

-- GRANT
-- 사용자에게 권한을 주는 명령어
-- GRANT 권한 ON 데이터베이스명.테이블명 TO '사용자명'@'접속위치';

-- sakila 데이터베이스의 actor 테이블을 조회할 수 있는 권한 주기 
-- sakila 데이터베이스의 다른 테이블에도 접근할 수 있다.
grant select 
on sakila.*
to 'student_user'@'localhost';


select * from actor;


-- 모든 권한 부여하기
grant all privileges
on sakila.*
to 'student_user'@'localhost';

-- 권한 확인하기 
show grants for 'student_user'@'localhost';

-- REVOKE
-- 사용자에게 부여한 권한을 회수하는 명령어
-- REVOKE 권한 ON 데이터베이스명. 테이블명 FROM '사용자명'@'접속위치';

revoke select 
on SAKILA.ACTOR
from 'student_user'@'localhost';

-- 모든 권한 회수하기   

-- 자주 쓰이는 권한의 종류
-- select, insert, update, delete: 데이터 관련
-- create, drop, alter 테이블 관련
-- index : 인덱스 생성 / 삭제 관련
-- references : 외래키 관련 권한 
-- all privilieges

-- 사용자 삭제 
-- drop user '사용자명'@'접속위치';
drop user 'student_user'@'localhost';


