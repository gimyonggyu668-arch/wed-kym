-- actor 테이블에서 모든 배우 정보를 조회
select actor_id, first_name, last_name, last_update
from actor;

select * from actor;

-- actor 테이블에서, 이름과 성만 조회하기 
 select first_name, last_name
 from actor;        

-- film 테이블에서 영화 제목과 대여 기간을 조회하세요.
select title, rental_duration from film;

-- film 테이블에서rental_rate 가 2.99이상인
-- 영화의 제목과 rental_rate를 조회하세요
select title, rental_rate
from film
where rental_rate >= 2.99;

-- film 테이블에서 영화 길이가 120분 이상인 
-- 영화의 제목과 길이를 조회하세요
select title, length
from film
where length >= 120;
-- customer 테이블에서 active가 1인 고객만 조회하세요
select *
from customer
where active = 1;

-- null, not null 데이터 판별하는 법
-- address 테이블에서 address2가 아닌 것을 찾으시오

from address
where address2 is null;
alter select *
from address
where address2 is not null;

-- customer 테이블에서 성이 Smith인 고객 조회하기

-- or (또는)
-- film 테이블에서 영화 등급 (rating)이 PG 이거나 G인 영화를 조회하세요.
select * from film
where rating = 'PG' or rating = 'G';

-- film 테이블에서 영화 길이가 60분 이하거나 180분 이상인 영화를 조회
select title, length from film
where length <= 60 or length >= 180;


-- payment테이블에서 2020년 1월 1일 이후에 결제된 내역을 조회하세요 
select * from payment
where payment_date >= '2020-01-01';
