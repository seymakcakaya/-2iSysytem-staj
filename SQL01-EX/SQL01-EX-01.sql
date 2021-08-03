
    Select REGEXP_REPLACE(SUBSTR(name_surname,0,INSTR(name_surname,' ',-1)),'\w','*',3)   || '' || REGEXP_REPLACE(SUBSTR(name_surname,INSTR(name_surname,' ',-1)),'\w','*',4) as name_surname 
From hr.users;
