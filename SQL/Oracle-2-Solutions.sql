----P1
--create table course_info(
--  course_code int,
--  course varchar(20),
--  course_description varchar(20),
--  course_start_date date
--);
--
----P2
--alter table course_info modify (course_code varchar(20));
--
--alter table course_info modify (course_description varchar(200));
--
--alter table course_info add (
--  course_duration int,
--  number_of_participants int,
--  course_type char(3)
--);
--
--alter table course_info rename column course to course_name;
--
----P3
--alter table course_info rename to cms_course_info;
--drop table cms_course_info;
--
----P4 Need to rename course to course name and make course_description into 200 chars
--create table course_info(
--  course_code varchar(20),
--  course varchar(20),
--  course_description varchar(200),
--  course_start_date date
--);

----P5
insert into course_info values (343, 'Java Programming', 'Basics of Java', date '2012-12-12');
insert into course_info values (167, 'C Programming', 'Basics of C', date '2011-11-11');
insert into course_info values (347, 'RDBMS', 'Basics of RDBMS', '');
insert into course_info values (106, 'Oracle', 'Oracle Sql', date '2011-03-11');

update course_info
set course_name = 'MYSQL', course_description = 'MYSQL'
where course_code = 106;

delete from course_info where course_name = 'RDBMS';

--P6

insert into course_info values (106, 'Oracle', 'Oracle PK Sql', date '2011-03-11');
insert into course_info values (302, 'Oracle', 'Oracle Architecture', date '2011-04-11');
insert into course_info values (231, 'Core Java', 'Java IO', date '2011-06-11');

select * from course_info where course_name = 'Core Java';
select * from course_info where course_name = 'Core Java' AND course_code = 343;
select distinct course_name from course_info;