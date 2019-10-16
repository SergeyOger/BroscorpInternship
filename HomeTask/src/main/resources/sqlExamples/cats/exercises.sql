select *
from cats
where age > 2;

select kittenname, c.name
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

select min(counter) as min_kittens_amount
from (select count(*) as counter from kittens group by catname) as result;

select max(counter) as max_kittens_amount
from (select count(*) as counter from kittens group by catname) as result;

select avg(counter) as avg_kittens_amount
from (select count(*) as counter from kittens group by catname) as result;



select cat_name, kittens_number, min_number_of_kittens
from (select name                                                             as cat_name,
             (select count(*) from kittens where cats.name = kittens.catname) as kittens_number,
             (select min(counter) as min_kittens_number
              from (select count(*) counter from kittens group by catname) c) as min_number_of_kittens
      from cats
               right outer join kittens k on cats.name = k.catname
      group by name) as c
where kittens_number = min_number_of_kittens;

select cat_name, kittens_number, min_number_of_kittens
from (select name                                                             as cat_name,
             (select count(*) from kittens where cats.name = kittens.catname) as kittens_number,
             (select max(counter) as min_kittens_number
              from (select count(*) counter from kittens group by catname) c) as min_number_of_kittens
      from cats
               right outer join kittens k on cats.name = k.catname
      group by name) as c
where kittens_number = min_number_of_kittens;


select min(counter) as min_value
from (select count(*) counter from kittens group by catname) result;