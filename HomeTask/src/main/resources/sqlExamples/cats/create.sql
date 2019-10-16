create table cats
(
    name varchar(30) primary key,
    age  integer not null
);
create table kittens
(
    catName    varchar(30) not null,
    kittenName varchar(30) primary key,
    age        integer     not null
);

alter table kittens
    add constraint fk_cats_name
        foreign key (catName) references cats (name)
            on DELETE CASCADE;
