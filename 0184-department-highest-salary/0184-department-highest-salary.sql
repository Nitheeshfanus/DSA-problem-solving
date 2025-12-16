# Write your MySQL query statement below
 select Department, name as Employee,salary as  Salary
 from(
    select e.*,
    dense_rank() over(partition by departmentId order by salary desc) as   
    rn, d.name
    as Department
    from Employee e
    join Department d
    on e.departmentId=d.id
 ) x
 where rn=1;
