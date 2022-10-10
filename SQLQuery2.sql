--Select
--Select * from Customers
--Select ContactName ,CompanyName,City from Customers
--Alias kullanımı var
--ANSII standarları
Select ContactName Adi,CompanyName SirketAdi,City Sehir from Customers

--Tek tırnak kullan 
--Case insensitive
Select * from Customers where City = 'London'

SeLect * from Products where categoryId=1 or categoryId=3

SeLect * from Products where categoryId=1 and UnitPrice>=10

SeLect * from Products order by ProductName

SeLect * from Products order by CategoryId,ProductName

SeLect * from Products order by UnitPrice asc --ascending artan 

SeLect * from Products order by UnitPrice desc --descending azalan

SeLect * from Products where categoryId=1 order by UnitPrice desc

Select count(*) from Products --Toplam satır sayısı

Select count(*) Adet from Products where CategoryID = 2

Select categoryId,count(*) ürünSayisi from products group by CategoryID

Select categoryId,count(*) ürünSayisi from products 
 group by CategoryID having count(*)<10

Select categoryId,count(*) ürünSayisi from products where UnitPrice > 20
group by CategoryID having count(*)<10

--İnner Join
select Products.ProductID,Products.ProductName,Products.UnitPrice,Categories.CategoryName
from products inner join Categories
on Products.CategoryID = Categories.CategoryID

select Products.ProductID,Products.ProductName,Products.UnitPrice,Categories.CategoryName
from products inner join Categories
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice >10

--inner join sadece eşleşen dataları bir araya getirir.

--DTO Data Transformation Object
--Boşluklu isimlendirmeleri bir bütün tanıyabilmesi için köşeli parantez koyulmalıdır
sELECT * from Products p inner join [Order Details] od
on p.ProductID = od.ProductID

--left solda olup  sağda olmayanlarıda getir
sELECT * from Products p left join [Order Details] od
on p.ProductID = od.ProductID

sELECT * from Customers c inner join Orders o
on c.CustomerID = o.CustomerId --830

sELECT * from Customers c left join Orders o
on c.CustomerID = o.CustomerId --832
where o.CustomerID is null

--left sağda olup solda olmayanlarıda getir
sELECT * from Customers c right join Orders o
on c.CustomerID = o.CustomerId --832
where o.CustomerID is null

sELECT * from Products p inner join [Order Details] od
on p.ProductID = od.ProductID
inner join Orders o
on o.OrderID = od.OrderID