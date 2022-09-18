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
--query to select all the values in the table
SELECT * FROM school.student;
-- query to insert the values inside the table for all the fields
--query for rollNumber 625
INSERT INTO `school`.`student` (`roll_number`, `name`, `grade`,`total_marks`) VALUES ('625', 'ajay', 'b','454');
--query for rollNumber 626
INSERT INTO `school`.`student` (`roll_number`, `name`, `grade`,`total_marks`) VALUES ('626', 'stanley', 'c','583');
--query for rollNumber 627
INSERT INTO `school`.`student` (`roll_number`, `name`, `grade`,`total_marks`) VALUES ('627', 'sugeen', 'c','490');
--query for rollNumber 628
INSERT INTO `school`.`student` (`roll_number`, `name`, `grade`,`total_marks`) VALUES ('628', 'hari', 'a','498');

--delete query
DELETE FROM `school`.`student` WHERE (`roll_number` = '627');

--update query
UPDATE `school`.`student` SET `name` = 'suriya',`grade`= 'a',`total_marks`= '500' WHERE (`roll_number` = '625');