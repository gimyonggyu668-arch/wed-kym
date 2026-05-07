CREATE TABLE sales1 (
    id INT AUTO_INCREMENT PRIMARY KEY,
    region VARCHAR(20) NOT NULL,
    category VARCHAR(20) NOT NULL,
    product_name VARCHAR(50) NOT NULL,
    sales_amount INT NOT NULL,
    sales_date DATE NOT NULL
);
DROP from SALES1;

INSERT INTO sales1 (region, category, product_name, sales_amount, sales_date)
VALUES
('서울', '전자제품', '노트북', 1200000, '2026-05-01'),
('서울', '전자제품', '마우스', 50000, '2026-05-01'),
('서울', '가구', '의자', 150000, '2026-05-02'),
('서울', '가구', '책상', 300000, '2026-05-02'),
('부산', '전자제품', '노트북', 1100000, '2026-05-01'),
('부산', '전자제품', '키보드', 80000, '2026-05-02'),
('부산', '가구', '의자', 130000, '2026-05-03'),
('부산', '가구', '책상', 280000, '2026-05-03'),
('대구', '전자제품', '마우스', 45000, '2026-05-01'),
('대구', '전자제품', '키보드', 75000, '2026-05-02'),
('대구', '가구', '의자', 120000, '2026-05-03'),
('대구', '가구', '책상', 250000, '2026-05-03');

 
-- 1. 지역별 매출 합게와 전체 매출 합계 조회
-- - sales테이블에서 지역별 매출 합계를 구하고, 마지막에 전체 합계도 함께 출력하세요
-- region을 기준으로 그룹화하기
-- - sum(sales_amount) 사용하기

create database if not exists rollup_practice
character set = UTF8MB4
collate = UTF8MB4_UNICODE_CI;



select REGION, SUM(SALES_AMOUNT)
from SALES S
group by REGION with rollup;
DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
    emp_id INT AUTO_INCREMENT PRIMARY KEY,
    emp_name VARCHAR(30),
    department VARCHAR(30),
    salary INT
);

INSERT INTO employee (emp_name, department, salary) VALUES
('김철수', '개발팀', 7000),
('이영희', '개발팀', 7000),
('박민수', '개발팀', 5000),
('최유리', '인사팀', 6000),
('정하늘', '인사팀', 4000),
('한지민', '인사팀', 4000);


-- 급여가 높은 순으로 순번 부여하기 
-- RANK() 사용
-- 순위 뒤에는 사원의 모든 내용 조회하기 
SELECT 
    RANK() OVER (ORDER BY salary DESC) AS rank_num,
    e.*
FROM employee e
ORDER BY rank_num ASC;
-- 다음과 같은 형식으로 결과를 출력하세요 
-- 개발팀 - 김철수 - 1위 
SELECT 
    CONCAT(e.department, ' - ', e.emp_name, ' - ', 
           RANK() OVER (ORDER BY e.salary DESC), '위') AS 출력형식,
    RANK() OVER (ORDER BY e.salary DESC) AS 순위,
    e.*
FROM employee e
WHERE e.department = '개발팀'
ORDER BY e.salary DESC;
-- 개발팀 직원들의 급여 순위를 출력하세요 

SELECT 
    RANK() OVER (ORDER BY salary DESC) AS rank_num,
    e.*
FROM employee e
WHERE department = '개발팀'
ORDER BY rank_num ASC;

select 
	EMP_NAME,
	DEPARTMENT,
	SALARY,
	RANK() OVER(partition by DEPARTMENT order by SALARY desc)
from EMPLOYEE;
CREATE TABLE board (
    board_id INT AUTO_INCREMENT PRIMARY KEY,
    category VARCHAR(30),
    title VARCHAR(100),
    created_at DATETIME
);
INSERT INTO board(category, title, created_at) VALUES
('공지', '사이트 점검 안내', '2026-05-01 09:00:00'),
('공지', '회원가입 정책 변경', '2026-05-01 14:30:00'),
('자유', '오늘 점심 뭐 드셨나요?', '2026-05-02 12:10:00'),
('자유', '주말에 영화 추천 부탁드립니다', '2026-05-02 18:45:00'),
('질문', 'MySQL VARCHAR와 TEXT 차이가 뭔가요?', '2026-05-03 10:20:00'),
('질문', 'JOIN이 너무 어려운데 공부 방법 있을까요?', '2026-05-03 16:00:00'),
('후기', '리액트 강의 정말 도움이 됐습니다', '2026-05-04 11:15:00'),
('후기', '스프링부트 프로젝트 후기 남깁니다', '2026-05-04 19:40:00'),
('공지', '서버 점검 완료 안내', '2026-05-05 08:30:00'),
('자유', '요즘 공부할만한 기술 추천해주세요', '2026-05-05 21:05:00');
select *
from board
where category= '공지사항'
order by carated_at desc;

create index idx_board_category_created
on board(category, created_at);

-- explain으로 인덱스 사용 여부를 확인
explain
select *
from board
where category = '공지'
order by created_at desc;
-- -> index lookup on board using idx_board_category_created 
-- board 테이블에서 idx_board_category_created 인덱스를 사용해서 
-- category = '공지' 조건 데이터를 찾았고,
-- 역순으로 읽었으며
-- 예상 비용은 0.8 (cpu 사용량, 디스크 읽기, 메모리 사용량)
-- 예상 결과 행 수는 3개이다.

show index from board;

-- 상품 검색용 인덱스 생성하기
-- product_name 컬럼에 인덱스를 생성하세요.
-- idx_product_name 

-- 복합 인덱스 생성하기 
-- 카테고리별 가격 검색을 빠르게 하기 위해 category, price를 기준으로
-- 인덱스를 생성해주세요

-- product 테이블에 생성된 인덱스를 확인해주세요

-- idx_product_price 삭제하기 


-- 전체 직원의 평균 급여보다 급여를 많이 받는 직원의 이름과 급여를 조회 

select EMP_NAME, SALARY
from employee e where SALARY > (
	select AVG(SALARY)
	from EMPLOYEE
	);



-- ALL : 여러 값들 전부에 대해 조건을 만족해야 한다.
-- 인사팀의 모든 직원보다 급여가 높은 직원을 조회하세요.
select EMP_NAME, DEPARTMENT, SALARY
from EMPLOYEE E
where SALARY> all(
	select SALARY
	from EMPLOYEE
	where DEPARTMENT = '인사팀'
);

