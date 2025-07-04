# Write your MySQL query statement below
SELECT V.CUSTOMER_ID, COUNT(v.Visit_id) AS COUNT_NO_TRANS
FROM VISITS AS V
left JOIN TRANSACTIONS AS T
ON V.VISIT_ID=T.VISIT_ID
WHERE t.transaction_id is NULL
group by v.customer_id;