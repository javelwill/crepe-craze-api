
create table if not exists User (
    id identity,
    username varchar(50) not null,
    password varchar(100) not null,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    street varchar(50) not null,
    city varchar(50) not null,
    state varchar(2) not null,
    zip varchar(10) not null,
    phone_number varchar(10) not null
);

create table if not exists Ingredient (
  id varchar(4) not null,
  name varchar(25) not null,
  type varchar(10) not null,
  category varchar(10) not null
);
create table if not exists Crepe (
  id identity,
  name varchar(50) not null,
  created_at timestamp not null
);
create table if not exists Crepe_Ingredient (
  crepe_id bigint not null,
  ingredient_id varchar(4) not null
);
alter table Crepe_Ingredient
    add foreign key (crepe_id) references Crepe(id);
alter table Crepe_Ingredient
    add foreign key (ingredient_id) references Ingredient(id);

create table if not exists Crepe_Order (
    id identity,
    name varchar(50) not null,
    street varchar(50) not null,
    city varchar(50) not null,
    state varchar(2) not null,
    zip varchar(10) not null,
    cc_number varchar(16) not null,
    cc_expiration varchar(5) not null,
    cc_cvv varchar(3) not null,
    placed_at timestamp not null
);
create table if not exists Crepe_Order_Crepes (
  crepe_order bigint not null,
  crepe bigint not null
);
alter table Crepe_Order_Crepes
    add foreign key (crepe_order) references Crepe_Order(id);
alter table Crepe_Order_Crepes
    add foreign key (crepe) references Crepe(id);

create table if not exists User_Crepe_Orders (
    user bigint not null,
    crepe_order bigint not null
);

alter table User_Crepe_Orders
    add foreign key (user) references User(id);
alter table User_Crepe_Orders
    add foreign key (crepe_order) references Crepe_Order(id);