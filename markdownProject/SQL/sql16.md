```sql
-- drop table if EXISTS Customers;
-- drop table if EXISTS Orders;

-- --deletes the content of the table but not the table itself
-- --keeps track of the dependencies (FK)
-- -- truncate table film_table

-- create table Customers(
--     CustomerID int IDENTITY(1,1) PRIMARY KEY,
--     Name varchar(MAX) not null,
--     Height decimal(7,3),
--     Is_happy bit
-- );

-- create table Orders(
--     OrderID int IDENTITY(1,1) primary key not NULL,
--     OrderNumber int not null,
--     CustomerID int FOREIGN KEY (CustomerID) references Customers(CustomerID)
-- );

insert into Customers(
    Name,
    Height,
    Is_happy
)
values('alex', 170, 1),('mike', 180, 0)

insert into Orders(
    OrderNumber,
    CustomerID
)
values(0033, 1),(0093,2)

select * from Customers;
select * from Orders;

select 
Name, OrderNumber 
from Orders o
inner join Customers c
on o.CustomerID = c.CustomerID
```

