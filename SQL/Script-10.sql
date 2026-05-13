-- 프로시저 이름 : even_sum
-- 입력받은 두 숫자 사이의 짝수만 더하여 결과 출력하기 
-- 시작값과 끝 값은 in 매개변수로 받는다. 
-- while 사용
-- 짝수만 누적 
-- 결과는 select로 출력하기 
-- 회원등급 자동 변경

-- 회원등급 자동 변경
-- 프로시저명 : update_customer_grade
CREATE TABLE customer (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(50),
    total_amount INT,
    grade VARCHAR(20)
);
INSERT INTO customer VALUES
(1, '김철수', 120000, NULL),
(2, '이영희', 80000, NULL),
(3, '박민수', 300000, NULL);

-- 모든 회원을 반복 조회하면서 등급 갱신하기
-- 조건
-- 구매금액      등급
-- 20만원 이상      VIP
-- 10만원 이상      GOLD
-- 나머지         SILVER

-- 주문 금액 누적 시 배송시 계산
-- 주문 금액 누적 시 배송시 계산
CREATE TABLE cart (
    cart_id INT PRIMARY KEY,
    product_name VARCHAR(50),
    price INT
);
INSERT INTO cart VALUES
(1, '마우스', 30000),
(2, '키보드', 50000),

(3, '모니터', 200000);

-- 장바구니 금액을 누적하면서 배송비를 계산하시오
-- 누적금액 100,000원 이상 → 배송비 0원
-- 미만 → 배송비 3000원
-- 상품을 하나씩 읽으며 누적
-- SELECT를 이용하여 조회하기
delimiter //
create procedure calcaulte_cart_total()
begin
   declare v_id int default 1; -- 시작값
   declare v_max_id int; -- 종료값
   declare v_price int; -- 가격을 담을 변수
   declare v_total int default 0; -- 총합을 담을 변수
   declare v_delivery_fee int; -- 배송비를 담을 변수
   
   -- 가장 마지막 id찾기
   select max(cart_id)
   into v_max_id
   from cart;
   
   while v_id <= v_max_id do
      select price
      into v_price
      from cart
      where cart_id = v_id;
   
      -- 가격이 null이 아니라면
      if v_price is not null then
         -- v_total에 누적
         set v_total = v_total + v_price;
      
         if v_total >= 100000 then
            set v_delivery_fee = 0;
         else
            set v_delivery_fee = 3000;
         end if;
         
         select 
            v_total as current_total,
            v_delivery_fee as delivery_fee;
      end if;
         
      set v_id = v_id + 1;
   end while;
end //
delimiter ;



delimiter //
create procedure insert_member()
begin 
	declare continue handler for 1062
	begin 
		select '이미 존재하는 회원 ID입니다.' as message;
	end;
	insert into member(member_id, member_name)
	values(1, '김철수')
	
	select '프로시저가 끝까지 실행되었습니다.' as result;
end //
delimiter ; 


-- 프로시저명 : find_product
-- 매개변수 : in p_id int
-- id를 통해 상품의 이름과 가격을 조회
-- 조회 되는게 없으면 '해당 상품이 없습니다.'라고 조회하기 



delimiter //
create procedure find_product(in p_id int)
begin
	declare v_count int;

	select count(*) into v_count
	from product
	where id = p_id;
	
	if v_count > 0 then
		select name, price
		from product
		where id = p_id;
	else
	
 	 	select  '해당 상품이 없습니다.' as 결과;
	end if;
 end//
delimiter ;
	
	





















