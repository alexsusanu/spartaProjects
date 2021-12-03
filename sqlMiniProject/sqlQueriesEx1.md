```sql
-- Write a query that lists all Customers in either Paris or London.
-- Include Customer ID, Company Name and all address fields.
select * from Customers c
where c.City = 'Paris' or c.City = 'London';

-- List all products stored in bottles.
select * from Products p
where p.QuantityPerUnit like '%bottle%'
or p.QuantityPerUnit like '%500 ml%';

-- Repeat question above, but add in the Supplier Name and Country.
select p.ProductName, s.CompanyName, s.Country
from Products p
inner join Suppliers s
on p.SupplierID = s.SupplierID
where p.QuantityPerUnit like '%bottle%'
or p.QuantityPerUnit like '%500 ml%'

-- Write an SQL Statement that shows how many products there are in each category.
-- Include Category Name in result set and list the highest number first.

select c.CategoryName, count(c.CategoryID) as 'Total count'
from Products p
inner join  Categories c
on p.CategoryID = c.CategoryID
group by c.CategoryName
order by count(c.CategoryID) desc

-- List all UK employees using concatenation to join their title of courtesy, first name and last name together.
-- Also include their city of residence
select e.TitleOfCourtesy + ' ' +e.FirstName + ' ' + e.LastName as 'Name', e.City
from Employees e
where e.Country = 'UK'

-- List Sales Totals for all Sales Regions (via the Territories table using 4 joins)
-- with a Sales Total greater than 1,000,000. Use rounding or FORMAT to present the numbers.
-- > 1000000 ???
select r.RegionDescription, (round(sum(od.Quantity * od.UnitPrice * (1 - od.Discount)), 2)) as 'Total'
from Region r
inner join Territories T on r.RegionID = T.RegionID
inner join EmployeeTerritories ET on T.TerritoryID = ET.TerritoryID
inner join Orders O on ET.EmployeeID = O.EmployeeID
inner join [Order Details] od on O.OrderID = od.OrderID
group by r.RegionDescription


-- Count how many Orders have a Freight amount greater than 100.00 and either USA or UK as Ship Country.
select count(o.OrderID) as 'Freight amount greater than 100.00', o.ShipCountry
from Orders o
where o.Freight > 100.00
group by o.ShipCountry
having o.ShipCountry = 'USA' or o.ShipCountry = 'UK'

-- Write an SQL Statement to identify the Order Number of the Order
-- with the highest amount of discount applied to that order.
select distinct o.OrderID
from Orders o
inner join [Order Details] od
on o.OrderID = od.OrderID
where od.Discount = (select max(od.Discount) from [Order Details] od)

```

