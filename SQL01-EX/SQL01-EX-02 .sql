
select substr(e.phone_number,1,3) as Operator, count (substr(e.phone_number,1,3)) as Total from HR.employees e GROUP BY substr(e.phone_number,1,3);



SELECT * FROM(SELECT substr(phone_number,1,3) Operator  from HR.employees )
PIVOT 
(
  COUNT(*) FOR Operator IN('515',590,603,650,'011')
  
);
