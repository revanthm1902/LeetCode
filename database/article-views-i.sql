# Write your MySQL query statement below
SELECT distinct author_id as id FROM VIEWS
WHERE AUTHOR_ID=VIEWER_ID
ORDER BY id ASC;