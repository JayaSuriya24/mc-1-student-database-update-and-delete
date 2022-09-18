-- create the database called school
CREATE DATABASE IF NOT  EXISTS `school`;
--use the school database
USE `school`;
--create the table student
CREATE TABLE IF NOT EXISTS `school`.`student`(
`roll_number` int not null primary key ,
`name` varchar(40) not null,
`grade` char not null,
`total_marks` int not null
);
