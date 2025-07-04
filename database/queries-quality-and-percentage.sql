# Write your MySQL query statement below
select query_name, ROUND(AVG(RATING/POSITION),2) AS quality, 
ROUND(SUM(CASE WHEN RATING<3 then 1 else 0 end)*100/COUNT(*),2) AS POOR_QUERY_PERCENTAGE
FROM QUERIES
GROUP BY QUERY_NAME;
