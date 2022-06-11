
create database payrolldb;
show databases;
show tables;

create table emplyoyee(id int auto_increment,name varchar(30),salary double,age int,department varchar(20),joining_date date,primary key(id));
show databases;
create database payroll_service;
show databases;
use payroll_service;
create table emplyoyee_payroll;
create table emplyoyee(id int auto_increment,name varchar(30),salary double,age int,department varchar(20),joining_date date,primary key(id));
desc employee;
insert into emplyoyee(name,salary,age,department,joining_date) values ('Amit',30000,27,'Software Engineer','2019-02-15'),('Ragu',40000,25,'Software Engineer','2014-05-12'),('Nthin',20000,28,'Software Engineer','2020-07-29'),('Mohak',28000,29,'Software Engineer','2015-06-20'),('Sandy',50000,28,'Software Engineer','2016-09-24');
select *from emplyoyee;
update emplyoyee set department ='Desktop Engineer' where id=2 or id=4;
select count(*) from emplyoyee;
select sum(salary) as sum, avg(salary) as average from emplyoyee;
alter table emplyoyee modify column salary bigint;
alter table emplyoyee add column city varchar(20);
update emplyoyee set city='Delhi' where id in (2,4);
update emplyoyee set age=32 where city like 'De%';
select max(salary) as maximum from emplyoyee;
delete from emplyoyee where id=5;
