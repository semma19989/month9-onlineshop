
    create table items (
       id integer auto_increment,
       name varchar(128),
       image varchar(128),
       price integer,
        count integer,
        primary key (id)
    );

    create table users (
       id integer auto_increment,
        email varchar(128),
        full_name varchar(128),
        password varchar(128),
        primary key (id)
    );