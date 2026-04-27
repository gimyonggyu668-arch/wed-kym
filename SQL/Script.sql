create database if not exists academy_db
character set = utf8mb4
collate = utf8mb4_unicode_ci;

# 한 줄 주석 
-- 한 줄 주석

# TBL_MEMBER라는 이름의 데이블 만들기
#속성
-- 문자열 : 이름 (길이 50)
-- 정수 : 나이 
-- 제약 조건은 없음

#테이블을 생성하는 SQL 이기 때문에 다시 실행하면 이미 
#만들어져있다고 에러가 발생한다.
CREATE TABLE if not exists TBL_MEMBER (
    name varchar(50),
    age int
);

# 테이블명 TBL_CAR
#속성
#정수 : id
#문자열 : brand (길이 100)
#문자열 : color(길이 100)
#정수 : price
#id 속성에 기본키 제약 조건 주기 

CREATE TABLE TBL_CAR(
    id INT primary key,
    brand VARCHAR(100),
    color VARCHAR(100),
    price INT
);
#테이블의 삭제
drop table TBL_CAR;

# 테이블이 존재할 때만 삭제하는 방식
#DROP TABLE IF EXISTS

# 테이블 안의 데이터도 전부 삭제된다.
# 외래키(fk)로 연결된 테이블이 있을 경우 삭제가 안될 수 있다.

#속성 옆에 제약조건을 주는 거랑 
#CONSTRAINT 써서 제약조건을 주는 거랑 무슨차이 

#속성 옆에 작성하는 방법 (inline 방식)
#간단 하고 직관적이다

#Constraint 로 제약조건 작성 (Table-level 방식)

#이름 지정 여부 
#Constraint car_pk primary key(id)

#inline 방식은 이름이 자동생성 -> 나중에 수정 / 삭제 어렵다.

#여러 컬럼 제약조건 가능 여부 
#inline방식은 단일 컬럼에만 가능
#Constramint pk_order primary key(user_id, product_id);

#가독성과 구조
#inline 방식
#간단, 빠르게 작성, 소규모 테이블에 적합하다.


#Constraint 방식
# 구조가 명확
# 제약조건을 한 곳에서 관리 가능
# 실무에서 더 많이 사용됨

create table example(
col1 varchar(10) not null,
col2 varchar(10),
create_date datetime default CURRENT_TIMESTAMP
);

# 수정하기
# ALTER TABLE 테이블명 ...

# 컬럼 추가하기
alter table example add column col3 varchar(50);

# 컬럼 삭제하기 
# DROP COLUMU 컬럼명;
alter table example drop column col2;


# 컬럼명 변경하기 
# RENAME COLUMN 컬럼명 TO 바꿀 컬럼명;
alter table example rename column col1 to first_col;

# 컬럼의 타입 변경하기 
# MODIFY COLUMN 컬럼명 타입;
alter table example modify column col3 int; 

# 제약조건 추가하기
# ADD 제약조건 종류 (대상컬럼);
alter table example add primary key (first_col);

# 제약조건 삭제하기
# DROP 제약조건 종류; 

alter table example 
drop primary key;

# show index from 테이블
# 제약조건에 부여된 이름 찾기 KEY_NAME 부분이 부여된 이름임
show index from table TBL_CAR;

## STUDENT 테이블 만들기
# 속성
# ID : 정수, 기본키
# NAME : 문자열(50), NOT NULL
# AGE : 정수
# EMAIL : 문자열(100)

# 다음의 컬럼을 테이블에 추가하세요
# PHONE : 문자열(20)
alter table STUDENT add column phone varchar(20);
# AGE컬럼의 타입을 정수 -> TINYINT로 수정하세요
alter table STUDENT modify column age tinyint;
# NAME컬럼의 이름을 STUDENT_NAME으로 변경하세요
alter table STUDENT rename column name to STUDENT_NAME;
# PHONE 컬럼을 삭제하세요
alter table STUDENT drop column phone;
# EMAIL 컬럼을 NOT NULL로 변경하세요
alter table STUDENT modify EMAIL varchar(100) not null;

# 여러 컬럼을 한 번에 추가하기
# address : 문자열(100)
# grade: 정수 

alter table student
add address varchar(100),
add grade int;

create table tbl_animal(
	id int primary key,
	type varchar(100),
	age int,
	feed varchar(100)
)

drop table tbl_animal;



















