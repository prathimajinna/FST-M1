SELECT  SUM(purchase_amount) AS  "Total Sum" from orders;

SELECT  AVG(purchase_amount) AS  "Average" from orders;

SELECT  MAX(purchase_amount) AS  "MAXAmount" from orders;

SELECT  MIN(purchase_amount) AS  "MINAmount" from orders;


SELECT  count(distinct salesman_id) AS  "Total Count" from orders;
