-- Table: RequestAccepted
-- +----------------+---------+
-- | Column Name    | Type    |
-- +----------------+---------+
-- | requester_id   | int     |
-- | accepter_id    | int     |
-- | accept_date    | date    |
-- +----------------+---------+
-- (requester_id, accepter_id) is the primary key (combination of columns with unique values) for this table.
-- This table contains the ID of the user who sent the request, the ID of the user who received the request, and the date when the request was accepted.
--
-- Write a solution to find the people who have the most friends and the most friends number.
-- The test cases are generated so that only one person has the most friends.

-- Solution 1 --
SELECT agg.requester_id AS id,
       SUM(count) AS num
FROM (SELECT requester_id,
             COUNT(requester_id)
      FROM RequestAccepted
      GROUP BY requester_id
      UNION ALL
      SELECT accepter_id,
             COUNT(accepter_id)
      FROM RequestAccepted
      GROUP BY accepter_id
     ) AS agg
GROUP BY agg.requester_id
ORDER BY num DESC, agg.requester_id
LIMIT 1
