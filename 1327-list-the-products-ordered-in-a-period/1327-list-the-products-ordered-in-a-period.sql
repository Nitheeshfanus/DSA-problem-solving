WITH sold_units AS (
    SELECT product_id, SUM(unit) as unit
    FROM orders
    WHERE order_date LIKE '%2020-02-__'
    GROUP BY product_id
)
SELECT
    p.product_name, s.unit
FROM products p
JOIN sold_units s ON s.product_id = p.product_id
WHERE s.unit >=100;