select *
from cats
where age > 2;

select kittenname
from kittens
         inner join cats c on kittens.catname = c.name
where c.age > 2;

select distinct catname
from kittens
order by "catname" desc;

select distinct name                                                             as mycats,
                (select count(*) from kittens where cats.name = kittens.catname) as kittensNumber,
                avg(k.age)                                                       as kittensAge
from cats
         right outer join kittens k on cats.name = k.catname
group by name;

select avg(cats.age) as catAge, avg(k.age) as kittenAge
from cats
         right outer join kittens k on cats.name = k.catname;

select catname, k.kittenname
from cats
         right join kittens k on cats.name = k.catname
group by catname, kittenname
order by catname;

