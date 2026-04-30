-- 숫자 함수 

-- ABS()
-- 절대값 구하기 
select ABS(-10), ABS(10), ABS(0);

-- ROUND(숫자, 자릿수)
-- 반올림
select 	
	ROUND(1234.567,2),
	ROUND(1234.567,0),
	ROUND(1234.567),
	ROUND(1235.567,-1),
	ROUND(1234.567,-2);

-- FLOOR()
-- 주어진 숫자보다 작거나 같은 정수 중 최대값을 반환
-- 내림이라고 생각해도 좋다.

select 
	FLOOR(2),
	FLOOR(2.1),
	FLOOR(-2.1);

-- TRUNCATE()
-- 버림
select TRUNCATE(3.141592,2);

-- CEIL()
-- 주어진 숫자보다 크거나 같은 정수 중 최소값
-- 올림

select 
	CEIL(2),
	CEIL(2.1),
	CEIL(-2.1);
-- SIGN()
-- 인자로 전달된 숫자가 양수 -> 1
-- 음수면 -> -1
-- 0이면 -> 0
-- NULL -> NULL

select 
	SIGN(-238),
	SIGN(0),
	SIGN(359);

-- MOD()
-- 나누기 했을 때 나머지를 구한다.
select 
	MOD(1,3),
	MOD(2,3),
	MOD(3,3),
	MOD(4,3);

select 
	4%3;

-- POWER(밑값, 지수)
select 	
	POWER(2,1),
	POWER(2,2),
	POWER(2,3),
	POWER(2,0);


-- RAND()
-- 0이상 1미만의 난수를 반환
select 
	RAND();

-- GRATEST() / LEAST()
-- 최대값, 최소값을 반환
select 
	GREATEST(10,20,5),
	LEAST(10,20,5);

CREATE TABLE sales (
  id INT PRIMARY KEY,
  product VARCHAR(50),
  price DECIMAL(10,2),
  quantity INT,
  discount_rate DECIMAL(5,2)  -- 할인율(예: 0.15 → 15%)
);

INSERT INTO sales VALUES
(1, 'Keyboard', 29900, 2, 0.10),
(2, 'Mouse',    15900, 3, 0.05),
(3, 'Monitor',  199000, 1, 0.20),
(4, 'USB',       8900, 10, 0.00),
(5, 'Speaker',  45500, 4, 0.15);

-- 각 상품의 제품명과 가격을 3으로 나눈 나머지를 조회하세요
select ID, PRODUCT, PRICE, MOD(PRICE,3)
from sales s ;
USE academy_db;
-- 모든 내용을 조회하되, 할인률은 %로 표시하기
SELECT 
	ID,
	PRODUCT,
	PRICE, 
	CONCAT(DISCOUNT_RATE * 100, '%') as '할인율'
from sales s ;
-- 세일즈 테이블에서 아이디, 제품명, 가격, 재고, 총 가격(소수점 아래 버림)을 조회하시오.
select 
	ID,
	PRICE,
	QUANTITY,
	PRICE * QUANTITY
from sales;


-- 1~100 사이의 난수를 생성하세요
select 
	FLOOR(RAND() * 100)+1;


-- 상품 가격이 5000만 보다 크면 1, 작으면 -1, 같으면 0이 되도록
-- 상품 이름과 함께 조회하세요

select 
	PRODUCT,
	SIGN(PRICE-50000)
	from SALES;

-- FORMAT(숫자, 소수점 자리수)
-- 숫자를 사람이 보기 좋게 "문자열 형태로 포맷팅" 하는 함수 
-- 특히 천 단위 콤마(,) + 소수점 자리수 지정을 자동으로 해준다.
select 
	PRODUCT,
	FORMAT(PRICE,0)
	from SALES;
-- 결과는 숫자가 아니라 문자열로 반환한다.
select 
	ID,
	PRODUCT,
	FORMAT(PRICE,0),
	QUANTITY,
	discount_rate
from SALES;

-- 날짜 함수 
-- 날짜 / 시간 데이터를 조회, 계산, 추출, 변환, 포멧팅을 할 때 사용
-- NOW()
-- 현재 날짜와 시간을 반환한다.
select NOW();

-- CURDATE() / CURRENT_DATE()
-- 현재 날짜만 반환

select CURDATE();
select CURRENT_DATE();

-- CURTIME() / CURRENT_TIME()
-- 현재 시간만 반환
select CURTIME();

-- YEAR(날짜)
select YEAR('2026-04-30');

-- DAY()
-- 일자를 추출
select DAY('2026-04-30');


-- HOUR(), MINUTE(), SECOND()
select 
	HOUR('2026-04-30 15:20:10'),
	MINUTE('2026-04-30 15:20:10'),
	SECOND('2026-04-30 15:20:10');

-- 날짜(DATE) 포맷: YYYY-MM-DD
-- DATETIME 포맷 : YYYY-MM-DD HH:MM:SS
 
-- DAYOFWEEK()
-- 요일을 숫자로 변환한다.

select DAYNAME(CURDATE());

-- 2: 월요일
-- 3: 화요일
-- 4: 수요일
-- 5: 목요일
-- 6: 금요일
-- 7: 토요일
-- 1: 일요일

-- DAYNAME ()
-- 요일 이름을 반환 (영어)
select DAYNAME('2026-04-30');

-- LAST_DAY(DATE)
-- 월의 마지막날 구하기
select 
	CURDATE(),
	LAST_DAY(CURDATE());

-- DATE_ADD(날짜, INTERVAL 단위)
-- INTERVAL 단위 : 얼마만큼 단위로 더할 것인가
select 
	NOW(),
	DATE_ADD(NOW(), interval 10 day),
	DATE_ADD(NOW(), interval 10 month),
	DATE_ADD(NOW(), interval 2 hour);


-- DATE_SUB()
-- 날짜에서 기간을 뺀다.
select 
	NOW(),
	DATE_SUB(NOW(), interval 10 day),
	DATE_SUB(NOW(), interval 3 month),
	DATE_SUB(NOW(), interval 2 hour);

-- 날짜 간의 차이를 계산
-- DATEDIFF()
-- 두 날짜 사이의 차이를 "일수"로 계산한다.
select 
	DATEDIFF('2026-05-10','2026-04-30'),
	DATEDIFF('2026-04-30','2026-05-10');

-- DATE_FORMAT(날짜, 포맷)
-- 날짜 포멧 
-- 자주 쓰는 포맷 기호 
-- %Y : 4자리 년도   2026
-- %y : 2자리 년도   26
-- %m : 2자리 월 	01~12		
-- %c : 1~2자리 월 1~12
-- %d : 2자리 일 01~31
-- %e : 1~2자리 일 1~~31
-- %H : 24시간제 시 01~24
-- %h : 12시간제 시 01~12
-- %i : 분 
-- %s : 초 
-- %W : 요일명 Thursday
-- %a : 짧은 요일명 Thu


select DATE_FORMAT('2026-04-30 15:20:10', '%Y년 %m월 %d일 %H시 %i분') as 날짜;

-- MAKEDATE(연도, 일수)
select MAKEDATE(2026,470);




CREATE TABLE orders (
    id INT PRIMARY KEY AUTO_INCREMENT,
    customer VARCHAR(50),
    order_date DATE,
    ship_date DATE,
    price INT
   );

INSERT INTO orders (customer, order_date, ship_date, price) VALUES
('홍길동', '2025-01-02', '2025-01-05', 30000),
('이몽룡', '2025-01-10', '2025-01-12', 45000),
('성춘향', '2024-12-28', '2025-01-03', 52000),
('김철수', '2025-02-01', '2025-02-03', 15000),
('박영희', '2025-02-10', NULL, 22000);  -- 아직 배송되지 않음

-- 주문테이블에서 고객의 이름과, 년, 월, 일을 조회하세요
select 
	CUSTOMER,
	ORDER_DATE,
	YEAR(order_DATE) as 년,
	MONTH(order_date) as 월,
	DAY(order_date) as 일
from orders o ;



-- 배송까지 걸린 일수를 이름과 함께 조회하기 
select 
	customer,
	
	concat(DATEDIFF(ship_date, order_date), '일') as '걸린 시간'
	from orders o ;
	WHERE SHIP_DATE IS NOT NULL;

