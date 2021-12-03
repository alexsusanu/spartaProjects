```sql
-- show schema
exec sp_columns CustomersType

drop table if exists Customers
drop table if exists CustomersType
drop table if exists Accounts
drop table if exists Transactions

create table Customers(
    customer_id int primary key not null IDENTITY (1,1),
    first_name varchar(255),
    last_name varchar(255),
    dob datetime,
    address varchar(255),
    city varchar(100),
    phone char(11),
    start_date datetime
);


create table CustomersType(
    customer_type_id int primary key not null IDENTITY (1,1),
    customer_id int foreign key references Customers(customer_id),
    personal bit default 1,
    business bit default 0
);

create table Accounts(
    account_id int primary key not null IDENTITY (1,1),
    customer_id int foreign key references Customers(customer_id),
    account_name varchar(50),
    start_date datetime
)

create table Transactions(
    transaction_id int primary key not null IDENTITY (1,1),
    account_id int foreign key references Accounts(account_id),
    amount float,
    transaction_type varchar(10)
);
```

