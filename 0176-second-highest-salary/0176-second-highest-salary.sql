# Write your MySQL query statement below
select distinct max(Salary) as SecondHighestSalary
from Employee   
where Salary<(select max(salary) from employee);