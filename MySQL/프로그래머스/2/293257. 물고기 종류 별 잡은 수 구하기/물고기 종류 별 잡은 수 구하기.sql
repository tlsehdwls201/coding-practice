-- 코드를 작성해주세요
select count(b.FISH_TYPE) FISH_COUNT, FISH_NAME from FISH_NAME_INFO a inner join FISH_INFO b
on a.FISH_TYPE = b.FISH_TYPE
group by FISH_NAME
order by FISH_COUNT desc;