Use Company;
select ename,sal from Empl where sal>=2200;
select * from empl where comm IS NULL or comm=0.00;
select ename,sal from Empl where sal not between 2500 and 4000;
select ename, job, sal from Empl where mgr IS NULL or mgr=0;
select ename from Empl where ename regexp '^[A-Za-z]{2}a';
select ename from Empl where ename regexp 'T$';



create database company;
Use company;
create table Empl(
empno int not null primary key,
ename varchar(20),
job varchar(20),
mgr int,
hiredate date,
sal float,
comm float,
deptno int
);

insert into Empl values
(8369, 'SMITH', 'CLERK', 8902, '1990-12-18', 800.00, NULL, 20),
(8499, 'ANYA', 'SALESMAN', 8698, '1991-02-20', 1600.00, 300.00, 30),
(8521, 'SETH', 'SALESMAN', 8698,'1991-02-22', 1250.00, 500.00, 30),
(8566, 'MAHADEVAN', 'MANAGER',8839, '1991-04-02', 2985.00, NULL, 20),
(8654, 'MOMIN', 'SALESMAN', 8698, '1991-09-28', 1250.00, 1400.00, 30),
(8698, 'BINA', 'MANAGER', 8839, '1991-05-01', 2850.00, NULL, 30),
(8882, 'SHIVANSH', 'MANAGER', 8839, '1991-06-09', 2450.00, NULL, 10),
(8888, 'SCOTT', 'ANALYST', 8566, '1992-12-09', 3000.00, NULL, 20),
(8839, 'AMIR', 'PRESIDENT', NULL, '1991-11-18', 5000.00, NULL, 10),
(8844, 'KULDEEP', 'SALESMAN', 8698, '1991-09-06', 1500.00, 0.00, 30);

