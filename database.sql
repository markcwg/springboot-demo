create database springboot_demo;

use springboot_demo;

create table User
(
    id   int auto_increment
        primary key,
    name varchar(15) null,
    age  int         null
);