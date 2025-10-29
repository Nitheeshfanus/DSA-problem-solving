with action_total as (
    select user_id, action, count(user_id) as total
    from Confirmations
    group by user_id,action
)

select s.user_id,
    round(
        ifnull(
            sum(case when a.action= 'confirmed' then a.total else 0 end)/
            sum(a.total)
              ,0)
         ,2) as confirmation_rate
    from Signups s
    left join action_total a
    on s.user_id=a.user_id
    group by s.user_id;