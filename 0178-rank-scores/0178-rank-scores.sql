# Write your MySQL query statement below
select score, x.rank
from(
    select *,
    dense_rank() over(order by score desc) as 'rank'
    from Scores
) x;
