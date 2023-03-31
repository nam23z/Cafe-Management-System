create table users (
	id serial primary key,
	name Varchar(255),
	contact_number Varchar(255),
	email Varchar(255),
	password Varchar(255),
	status Varchar(255),
	role Varchar(255)
);
create table category (
    id serial primary key,
    name Varchar(255)
);
create table products (
    id serial primary key,
    name Varchar(255),
    category_fk Int not null,
    description Varchar(255),
    price Int,
    status Varchar(255),
    constraint fk_category foreign key (category_fk) references category (id) on delete cascade
);

create table bill (
    id serial primary key,
    uuid Varchar(255),
    name Varchar(255),
    email Varchar(255),
    contactnumber Varchar(255),
    paymentmethod Varchar(255),
    total Int,
    productdetails JSON,
    createdby Varchar(255)
);