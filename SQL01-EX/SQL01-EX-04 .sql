
create table HR.emp(
"EMPLOYEE_ID" NUMBER(6,0), 
	"FIRST_NAME" VARCHAR2(20 BYTE), 
	"LAST_NAME" VARCHAR2(25 BYTE) , 
	"EMAIL" VARCHAR2(25 BYTE) , 
	"PHONE_NUMBER" VARCHAR2(20 BYTE), 
	"HIRE_DATE" DATE, 
	"JOB_ID" VARCHAR2(10 BYTE), 
	"SALARY" NUMBER(8,2), 
	"COMMISSION_PCT" NUMBER(2,2), 
	"MANAGER_ID" NUMBER(6,0), 
	"DEPARTMENT_ID" NUMBER(4,0)
);
--SELECT * FROM HR.EMP
INSERT INTO  HR.emp(employee_�d,f�rst_name,last_name,ema�l,h�re_date,salary,phone_number) values(250,'erman ','bili�im','erman@bili�im','12121999',12000,'555.555.5555');

UPDATE HR.emp
SET salary = 999999, phone_number = '111.111.1111'
WHERE employee_�d=250;

select * from HR.emp;
DELETE FROM hr.emp  WHERE employee_�d = 250;
drop table HR.emp;