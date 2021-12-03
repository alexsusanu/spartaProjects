



```sql
--create a database
--create database eng100;

--use eng100

-- create table film_table(
--     film_name varchar(10),
--     film_type varchar(10),
--     age_rating int
-- );

-- drop table if EXISTS film_table;

-- create table film_table(
--     id int not null primary key identity(1,1),
--     film_name varchar(255),
--     film_type varchar(50),
--     date_of_release date,
--     director varchar(100),
--     writer varchar(100),
--     star varchar(100),
--     film_language varchar(50),
--     official_website varchar(255),
--     plot_summary varchar(MAX)
-- );

-- insert into film_table(film_name, film_type, date_of_release, director, writer, star, film_language, official_website, plot_summary)
-- values(
--     'rebel without a cause',
--     'melodrama',
--     '1955-10-12',
--     'Nicholas Ray',
--     'Stewart Stern',
--     'James Dean',
--     'English',
--     'https://en.wikipedia.org/wiki/Rebel_Without_a_Cause',
--     'Rebel Without a Cause is a 1955 American drama film about emotionally confused suburban, middle-class teenagers.'
-- );

-- alter table film_table
-- add rating int;

select * from film_table;

-- alter table film_table
-- drop column rating;

-- sp_help film_table;
```

