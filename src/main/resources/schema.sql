
create table if not exists Ingredient (
  id varchar(4) not null,
  name varchar(25) not null,
  type varchar(10) not null,
  category varchar(10) not null
);
create table if not exists Crepe (
  id identity,
  name varchar(50) not null,
  createdAt timestamp not null
);
create table if not exists Crepe_Ingredients (
  crepe bigint not null,
  ingredient varchar(4) not null
);
alter table Crepe_Ingredients
    add foreign key (taco) references Taco(id);
alter table Crepe_Ingredients
    add foreign key (ingredient) references Ingredient(id);

create table if not exists Crepe_Order (
    id identity,
    deliveryName varchar(50) not null,
    deliveryStreet varchar(50) not null,
    deliveryCity varchar(50) not null,
    deliveryState varchar(2) not null,
    deliveryZip varchar(10) not null,
    ccNumber varchar(16) not null,
    ccExpiration varchar(5) not null,
    ccCVV varchar(3) not null,
    placedAt timestamp not null
);
create table if not exists Crepe_Order_Crepes (
  crepeOrder bigint not null,
  crepe bigint not null
);
alter table Crepe_Order_Crepes
    add foreign key (crepeOrder) references Crepe_Order(id);
alter table Crepe_Order_Crepes
    add foreign key (crepe) references Crepe(id);