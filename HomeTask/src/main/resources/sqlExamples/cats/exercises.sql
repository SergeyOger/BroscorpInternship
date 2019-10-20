select *
from cats
order by name;

select *
from kittens
order by kittenname;

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

select catname, (select count(*) from kittens group by catname)
from kittens;

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

select catname, count(*) as kittens_counter
from kittens
group by catname
order by catname;

select avg(counters) as average_kittens_number
from (select count(*) counters from kittens group by catname) as counters;

select distinct catname
from kittens
order by catname;

select catname, max(age)
from kittens
group by catname
order by catname;

select catname, min(age)
from kittens
group by catname
order by catname;

select catname, max(age) - min(age) as kittens_age_difference
from kittens
group by catname
order by catname;

select name, age as cat_age, age - min_kittens_age as difference, min_kittens_age
from (select name,
             age,
             (select min(age) from kittens group by cats.age) as min_kittens_age
      from cats) as result
order by name;

select catname, kittens_average_age
from (select catname, avg(age) kittens_average_age from kittens group by catname) as average_age_of_kittens
where kittens_average_age > 2
group by catname, kittens_average_age
order by catname;

select catname, avg(age) kittens_average_age
from kittens
group by catname
having avg(age) > 2;