-- create database
CREATE DATABASE sparta_demo;

-- select which database to use;
-- an SQL server can contain multiple databases
USE sparta_demo;

-- create a table
CREATE TABLE personnel(
    first_name VARCHAR(20), --variable character. 20 bites -> 20 chars. 1 char == 1 bit
    last_name VARCHAR(20)
);

-- remove table from db
DROP TABLE personnel; --all data is deleted, drops the table instantly, no ask "are you sure"

-- remove table if it exists
DROP TABLE IF EXISTS personnel;

-- dropping the table (if doesnt exists) will throw an error
-- having drop the table and immediately create a new one will work
-- only if the "drop table if exists" command is run
-- otherwise if the command "drop table" is run
-- it will not create a new table as it will be stopped on the drop table error


-- DATA TYPES
varchar(max) -- max allowed
char(11) -- phone number for example
date -- dob
datetime -- date and time
time -- time
int -- integer
decimal -- (4,2) (precision, scale)
        -- precision total number of digits (including after decimal point)
        -- scale number of digits after decimal point
        -- 4 digits number and 2 number after decimal point
        -- 32.12 (4 digits total, 2 after decimal point)
float -- 3.45e11 | rounds the number
bit -- 1 or 0 | true or false



-- INSERTING DATA
INSERT INTO personnel(
    first_name,
    last_name
) VALUES(
    'TestName',
    'TestSurname'
);


-- CONSTRAINTS
NOT NULL -- cannot be null
DEFAULT -- default value if none is entered (bit, default 0)


-- FK
CREATE TABLE students(
    student_id INT PRIMARY KEY IDENTITY (1,1), -- identity start at 1, increment by 1
    -- IDENTITY(100,10) . start at 100, increment by 10. automatic id numbers
    student_name VARCHAR(20),
    course_id INT REFERENCES courses (course_id)
);

-- UPDATING TABLES
ALTER TABLE films -- update table by adding, removing, altering columns. not the data
ADD budget DECIMAL(10,0) -- add new column

ALTER TABLE films
ALTER COLUMN runtime_min DECIMAL(5,2);

ALTER TABLE films
DROP COLUMN budget;


UPDATE ice_cream -- update ice_cream table
SET flavour = 'updated name here'
WHERE id = 2;

UPDATE ice_cream -- update ice_cream table. not alter, UPDATE DATA in the table
SET price = 4
WHERE price = 2; -- update price to 4 where it was  2 before
