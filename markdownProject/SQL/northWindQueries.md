```sql
select count(*) from Employees
where City = 'London';

select * from Employees
where City = 'London';
---

select * from Employees
where TitleOfCourtesy = 'Dr.';

select * from Employees
where TitleOfCourtesy like 'D%';

---

select * from Products
where Discontinued = 1;

---

select CompanyName, ContactName
from Customers
where country = 'France'
ORDER by CompanyName ASC;

select top 10 CompanyName, City
from Customers
where country = 'France';

SELECT top 2 with ties *
from [Order Details]
order by Quantity desc;

select ProductName, UnitPrice
from Products
where CategoryID = 1 and Discontinued = 0;

OPERATORS
select ProductName, UnitPrice, UnitsInStock
from Products
where UnitsInStock > 0 and UnitPrice >= 30

select distinct Country 
from Customers
where ContactTitle = 'Owner'

create view french_customers AS
select CompanyName, ContactName, Phone
from Customers
where Country = 'France'

select * from french_customers;

% -> 0 to many chars

select ProductName
from Products
where ProductName like '%sca%'
_ -> one char substitution .. __ (2 x _)-> 2 chars ecc

select a city of length long 6 chars _ x 6
select * from Customers
where city like '______'

select *
from Customers
where ContactName like '[aeiou]%'


select *
from Customers
where ContactName like '[^aeiou]%'

region in () acts like a list / for anything in this list
select * from Customers
where region in ('wa', 'sp')

between clause
select * from EmployeeTerritories
where TerritoryID BETWEEN 068800 and 099999

select ProductName, ProductID
from Products
where UnitPrice < 5.00;

select * from Categories
where CategoryName like '[BS]%'

select count(*) from Orders
where EmployeeID = 5 or EmployeeID = 7;

select count(*) from Orders
where EmployeeID in (5,7)

select CompanyName as 'Name', City + ', ' + Country as 'City'
from Customers

select FirstName + ', ' + LastName + ': ' + HomePhone as 'First Name, Last Name Contact Number'
from Employees

select Country
from Customers
where region is NULL -- is null, not (= null)

select OrderID, UnitPrice, Quantity, Discount, 
UnitPrice * Quantity as 'Gross Total',
UnitPrice * Quantity - (1 - Discount) as 'Net Total'
from [Order Details]

select OrderID, UnitPrice, Quantity, Discount, 
UnitPrice * Quantity as 'Gross Total',
UnitPrice * Quantity - (1 - Discount) as 'Net Total'
from [Order Details]

```

