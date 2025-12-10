SELECT customer_id,  COUNT(transaction_id IS NULL) AS count_no_trans
FROM Visits
FULL OUTER JOIN Transactions
    ON  Visits.visit_id = Transactions.visit_id
WHERE Transactions.transaction_id IS NULL
GROUP BY Visits.customer_id