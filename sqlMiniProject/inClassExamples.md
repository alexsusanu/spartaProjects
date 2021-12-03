```sql
-- CREATE VIEW
-- showAge as
-- select LastName + ' ' + FirstName as 'Full Name',
-- floor((cast(GETDATE() as integer) - cast(BirthDate as integer)) / 365.25) as 'Age'
-- from Employees;
--
-- select * from showAge
--
--
-- select [Full Name], Age,
-- CASE
--     when Age > 65
--         then 'Retired'
--     when Age > 60
--         then 'Retirement due'
--     else 'More than 5 years to go'
-- END
-- as 'Retirement'
-- from showAge
-- order by [Full Name] asc
--
--
--
--
--
-- select * from Employees
--
--
-- SELECT FirstName + ' ' + LastName AS 'Employee Name',
-- DATEDIFF(dd,BirthDate,GETDATE())/365.25 AS 'Age',
-- FLOOR(DATEDIFF(dd,BirthDate,GETDATE())/365.25) AS 'FLOOR',
-- CEILING(DATEDIFF(dd,BirthDate,GETDATE())/365.25) AS 'CEILING',
-- ROUND((DATEDIFF(dd,BirthDate,GETDATE())/365.25), 0) AS 'ROUND',
-- CAST((ROUND((DATEDIFF(dd,BirthDate,GETDATE())/365.25),0)) AS INT) AS 'CAST'
-- FROM Employees
--
-- select OrderId,
-- case
-- when DATEDIFF(dd, OrderDate, ShippedDate) < 10
-- then 'on time'
-- else 'overdue'
-- end
-- as 'status'
-- from Orders

-- aggregates (count(*), sum(), avg(), max(), min())
select
SupplierID,
    sum(UnitsOnOrder) as 'Total on order',
    avg(UnitsOnOrder) as 'Avg on order',
    min(UnitsOnOrder) as 'Min on order',
    max(UnitsOnOrder) as 'Max on order'
from Products
group by SupplierID

select UnitsOnOrder, ProductID
from Products
order by UnitsOnOrder desc


select CategoryID,
avg(ReorderLevel) 'Average'
from Products
group by CategoryID

select CategoryID,
avg(ReorderLevel) 'Average'
from Products
group by CategoryID
order by [Average] desc

select SupplierID,
       sum(UnitsOnOrder) as 'Total on order',
       avg(UnitsOnOrder) as 'Avg on order'
from Products
group by SupplierID
having avg(UnitsOnOrder) > 20
order by [Avg on order] desc

select e.EmployeeID,
e.FirstName + ' ' + e.LastName as 'Name',
count(TerritoryID) as 'Number of territories covered'
from EmployeeTerritories et
inner join Employees e
on et.EmployeeID = e.EmployeeID
group by e.EmployeeID, e.FirstName, e.LastName
having count(TerritoryID) > 5


-- joins and subqueries
-- join -> combine rows from different tables
-- inner join -> at least one match on both tables
-- left join -> all rows from left and match on right
-- full join -> everything from right and left table

select s.CompanyName,
       avg(UnitsOnOrder) as 'Order level'
from Products p
inner join Suppliers s
on s.SupplierID = p.SupplierID
group by s.SupplierID, s.CompanyName


select ProductName, UnitPrice, CompanyName as 'Supplier',
       CategoryName as 'Category'
from Products p
inner join Suppliers s
on p.SupplierID = s.SupplierID
join Categories c
on p.CategoryID = c.CategoryID

select CompanyName as 'Customers'
from Customers
where CustomerID not in
    (select distinct (customerID) from Orders)

select OrderID, ProductID, UnitPrice, Quantity, Discount,
       (select max(UnitPrice) from [Order Details]) as 'max price'
from [Order Details]


select
od.ProductID, sq1.totalamnt as 'total sold for this  product',
       UnitPrice, UnitPrice/totalamnt*100 as '% of Total'
from [Order Details] od
inner join
(
    select ProductID, sum(UnitPrice * Quantity) as totalamnt
    from [Order Details]
    group by ProductID
) sq1
on sq1.ProductID = od.ProductID

select ContactTitle as 'Title'
from Customers
union all
select Title
from Employees

select * from [Order Details]

select OrderID, ProductID, UnitPrice, Quantity, Discount
from [Order Details] od
where od.ProductID in
    (select ProductID from Products where Discontinued = 1)


select count(*) from Products

```

