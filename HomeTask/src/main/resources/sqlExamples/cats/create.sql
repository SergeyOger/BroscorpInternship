create table cats
(
    name varchar(30) primary key,
    age  integer not null
);
create table kittens
(
    catName    varchar(30) references cats (name) on delete cascade not null,
    kittenName varchar(30) primary key,
    age        integer                                              not null
);


