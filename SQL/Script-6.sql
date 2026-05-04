DROP TABLE IF EXISTS EMPLOYEES;

CREATE TABLE EMPLOYEES (
    EMPLOYEE_ID INT PRIMARY KEY,
    FIRST_NAME VARCHAR(50),
    LAST_NAME VARCHAR(50),
    EMAIL VARCHAR(100),
    HIRE_DATE DATE,
    JOB_ID VARCHAR(20),
    SALARY INT,
    COMMISSION_PCT DECIMAL(3,2),
    MANAGER_ID INT,
    DEPARTMENT_ID INT
);
INSERT INTO EMPLOYEES VALUES
(100, 'Steven', 'King', 'SKING', '2003-06-17', 'AD_PRES', 24000, NULL, NULL, 90),
(101, 'Neena', 'Kochhar', 'NKOCHHAR', '2005-09-21', 'AD_VP', 17000, NULL, 100, 90),
(102, 'Lex', 'De Haan', 'LDEHAAN', '2001-01-13', 'AD_VP', 17000, NULL, 100, 90),
(103, 'Alexander', 'Hunold', 'AHUNOLD', '2006-01-03', 'IT_PROG', 9000, NULL, 102, 60),
(104, 'Bruce', 'Ernst', 'BERNST', '2007-05-21', 'IT_PROG', 6000, NULL, 103, 60),
(105, 'David', 'Austin', 'DAUSTIN', '2005-06-25', 'IT_PROG', 4800, NULL, 103, 60),
(106, 'Valli', 'Pataballa', 'VPATABAL', '2006-02-05', 'IT_PROG', 4800, NULL, 103, 60),
(107, 'Diana', 'Lorentz', 'DLORENTZ', '2007-02-07', 'IT_PROG', 4200, NULL, 103, 60),
(108, 'Nancy', 'Greenberg', 'NGREENBE', '2002-08-17', 'FI_MGR', 12000, NULL, 101, 100),
(109, 'Daniel', 'Faviet', 'DFAVIET', '2002-08-16', 'FI_ACCOUNT', 9000, NULL, 108, 100),
(110, 'John', 'Chen', 'JCHEN', '2005-09-28', 'FI_ACCOUNT', 8200, NULL, 108, 100),
(111, 'Ismael', 'Sciarra', 'ISCIARRA', '2005-09-30', 'FI_ACCOUNT', 7700, NULL, 108, 100),
(112, 'Jose Manuel', 'Urman', 'JMURMAN', '2006-03-07', 'FI_ACCOUNT', 7800, NULL, 108, 100),
(113, 'Luis', 'Popp', 'LPOPP', '2007-12-07', 'FI_ACCOUNT', 6900, NULL, 108, 100),
(114, 'Den', 'Raphaely', 'DRAPHEAL', '2002-12-07', 'PU_MAN', 11000, NULL, 100, 30),
(115, 'Alexander', 'Khoo', 'AKHOO', '2003-05-18', 'PU_CLERK', 3100, NULL, 114, 30),
(116, 'Shelli', 'Baida', 'SBAIDA', '2005-12-24', 'PU_CLERK', 2900, NULL, 114, 30),
(117, 'Sigal', 'Tobias', 'STOBIAS', '2005-07-24', 'PU_CLERK', 2800, NULL, 114, 30),
(118, 'Guy', 'Himuro', 'GHIMURO', '2006-11-15', 'PU_CLERK', 2600, NULL, 114, 30),
(119, 'Karen', 'Colmenares', 'KCOLMENA', '2007-08-10', 'PU_CLERK', 2500, NULL, 114, 30);


-- 부서별 사원 수를 구하고 사원 수가 3명 이상인 부서만 
-- 조회하세요
select department_id, count(*)
from employees e 
group by department_id 
having count(*) >= 3;
-- 부서별 최고 급여가 10000 이상인 부서 조회
select department_id, max(salary)
from employees e 
group by department_id
having max(salary) >= 10000;

-- 입사년도별 사원 수 중 5명 이상인 년도만 출력 
select year(hire_date),count(*)
from employees 
group by year(HIRE_DATE)
having count(*) >= 5;










DROP TABLE IF EXISTS sales;

CREATE TABLE sales (
    id INT AUTO_INCREMENT PRIMARY KEY,
    category VARCHAR(50),
    amount INT,
    sale_date DATE
);

INSERT INTO sales (category, amount, sale_date)
VALUES
('식품', 80000, '2025-01-01'),
('식품', 70000, '2025-01-02'),
('식품', 60000, '2025-01-03'),
('전자제품', 250000, '2025-01-01'),
('전자제품', 150000, '2025-01-02'),
('의류', 30000, '2025-01-01'),
('의류', 25000, '2025-01-03'),
('도서', 12000, '2025-01-02'),
('가구', 180000, '2025-01-03'),
('가구', 50000, '2025-01-04'),
('문구', 15000, '2025-01-02');

-- 카테고리별 총 판매 금액을 구하되, 판매금액이 200,000이상인
-- 카테고리만 조회하기

-- 카테고리별 가장 큰 판매금액을 구하되
-- 가장 큰 금액이 200,000원 이상인 카테고리만 조회하세요

-- 카테코리별 판매 총액을 구한 뒤, 총 판매금액이 50,000이상인
-- 카테고리만 조회하세요

-- 2025년 1월 1일에 판매된 데이터만 대상으로 하여
-- 카테고리별 판매 총액 구하기
-- 총 판매 금액이 20,000이상인것만 조회하기
select category, sum(amount)
from sales s
where sale_date = '2025-01-01'
group by category 
having sum(amount) >= 20000;

-- ROLLUP
-- GROUP BY가 그룹별로 집계를 해준다면, ROLLUP은 소계와 총계 
-- 까지 한 번에 만드는 기능 

-- 아래에서 위로 합계를 말아 올리는 기능 
-- 카테고리별 판매금액 
select CATEGORY, SUM(AMOUNT)
from SALES
group by CATEGORY;
select * from sales ;

-- ROLLUP을 사용하여 카테고리별 합계와 전체합계를 같이조회
select CATEGORY, SUM(AMOUNT)
from SALES
group by CATEGORY with rollup;



INSERT INTO sales (category, amount, sale_date) VALUES
-- 2024 데이터 보강
('식품', 50000, '2024-01-02'),
('식품', 40000, '2024-01-03'),
('전자제품', 120000, '2024-02-01'),
('전자제품', 80000, '2024-02-03'),
('의류', 20000, '2024-03-01'),
('가구', 90000, '2024-03-05'), 
-- 2026 데이터 추가
('식품', 90000, '2026-01-01'),
('식품', 70000, '2026-01-02'),
('전자제품', 300000, '2026-01-03'),
('전자제품', 200000, '2026-01-04'),
('의류', 60000, '2026-02-01'),
('도서', 15000, '2026-02-03'),
('가구', 250000, '2026-03-01'),
('가구', 100000, '2026-03-05');

-- 년도별 + 카테고리별 ROLLUP
SELECT 
    year(SALE_DATE),
    CATEGORY,
    SUM(AMOUNT) AS 총매출
FROM SALES
GROUP BY YEAR(SALE_DATE), CATEGORY WITH ROLLUP;
-- 년도 + 카테고리별 합계
-- 년도별 합계
-- 전체 합계


select  * from SALES;

-- 월별 + 카테고리별 총 판매량 ROLLUP
select 
	year(SALE_DATE),
	MONTH(SALE_DATE),
	CATEGORY,
	SUM(AMOUNT)
from sales 
group by year(SALE_DATE),MONTH(sale_date), CATEGORY with rollup;
	








