-- Table: Orders
-- +-----------------+----------+
-- | Column Name     | Type     |
-- +-----------------+----------+
-- | order_number    | int      |
-- | customer_number | int      |
-- +-----------------+----------+
-- order_number is the primary key (column with unique values) for this table.
-- This table contains information about the order ID and the customer ID.

-- Write a solution to find the customer_number for the customer who has placed the largest number of orders.
-- The test cases are generated so that exactly one customer will have placed more orders than any other customer.

WITH count_customer as (
    SELECT customer_number,
           COUNT(customer_number) AS total
    FROM Orders
    GROUP BY customer_number
)
SELECT customer_number
FROM count_customer
WHERE count_customer.total = (SELECT MAX(count_customer.total) FROM count_customer)
