-- 꽃 테이블과 화분 테이블 2개가 필요하고 꽃을 구매할 때 화분도 같이 구매한다.
-- 꽃은 꽃 이름, 색깔, 가격이 존재한다.
-- 화분 제품번호, 화분색깔, 모양, 꽃 이름이 존재한다.

-- 꽃 FLOWER
-- 이름 (PK) VARCHAR(200)
-- --------
-- 색깔 VARCHAR(200)
-- 가격 INT

-- 화분 POT
-- 제품번호 (PK) VARCHAR(100)
-- ----------
-- 화분 색깔 VARCHAR(100)
-- 모양 VARCHAR(100)
-- 꽃 이름 VARCHAR(200)
-- 꽃 테이블과 화분 테이블 2개가 필요하고 꽃을 구매할 때 화분도 같이 구매한다.
-- 꽃은 꽃 이름, 색깔, 가격이 존재한다.
-- 화분 제품번호, 화분  색깔, 모양, 꽃 이름이 존재한다.

-- 꽃 
-- 이름 (PK)
-- --------
-- 색깔 
-- 가격

-- 화분
-- 제품번호 (PK)
-- ----------
-- 화분 색깔
-- 모양
-- 꽃 이름 


create table FLOWER(
	FLOWER_NAME VARCHAR(200) primary key,
	FLOWER_COLOR VARCHAR(200),
	FLOWER_PRICE INT
	)

create table POT(
	POT_ID VARCHAR(100) primary key,
	POT_COLOR VARCHAR(100),
	POT_SHAPE VARCHAR(200),
	FLOWER_NAME VARCHAR(200),
	constraint foreign key(FLOWER_NAME) references FLOWER(FLOWER_NAME)
);

-- 사용자는 게시글을 작성할 수 있다.
-- 게시글에는 여러 개의 댓글이 달릴 수 있다.
-- 댓글은 반드시 하나의 게시글에 속한다.
-- 사용자는 댓글도 작성할 수 있다.
-- 유저에는 유저번호 , 이름만 있다.
-- 게시글에는 게시글 번호, 유저 번호, 제목, 내용이 있다.
-- 댓글에는 댓글 번호, 게시글 번호, 유저번호, 내용 생성시간이 있다.

create table USER(
	USER_ID INT primary key,
	USER_NAME VARCHAR(50)
);

create table POST(
	POST_ID INT primary key,
	USER_ID INT,
	TITLE VARCHAR(100),
	CONTENT TEXT,
	foreign key (USER_ID) references USER(USER_ID)
);
create table COMMENT(
	COMMENT_ID INT primary key,
	POST_ID INT,
	USER_ID INT,
	CONTENT TEXT,
	CREATED_AT DATETIME,
	foreign key(POST_ID) references POST(POST_ID),
	FOREIGN KEY(USER_ID) REFERENCES USER(USER_ID)
);

-- 영화 가격 수정하기
select TITLE, RENTAL_RATE from FILM_PRACTICE;

start transaction;

update FILM_PRACTICE
set RENTAL_RATE = RENTAL_RATE + 1
where FILM_ID = 1;

-- COMMIT을 해서 확정을 한다.
-- ROLLBACK을 통해서 되돌리기
rollback;

commit;  -- COMMIT을 하면 확정되기 때문에 ROLLBACK을 해도 반영이 안됨 







