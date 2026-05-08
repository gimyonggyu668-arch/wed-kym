-- 고객이름, 주문한 제품명을 LEFT OUTER JOIN을 이용하여 조회하기 
SELECT 
    c.customer_name,  -- 고객이름
    p.product_name    -- 주문한 제품명
FROM 
    Customer c
LEFT OUTER JOIN 
    Orders o ON c.customer_id = o.customer_id
LEFT OUTER JOIN 
    Product p ON o.product_id = p.product_id;