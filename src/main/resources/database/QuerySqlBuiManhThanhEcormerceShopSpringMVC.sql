create database BuiManhThanhEcormerceSpringMVC;
use BuiManhThanhEcormerceSpringMVC;
-- drop database BuiManhThanhEcormerceSpringMVC;
create table `customers` (
	id int primary key auto_increment,
    email varchar(100) not null unique,
    shipping_address nvarchar(255) null,
    phone varchar(20) not null unique,
    full_name nvarchar(55) not null,
    address nvarchar(255) null,
    `rank` nvarchar(55) null,
    user_name varchar(32) not null unique
);

create table users(
	user_name varchar(50) not null primary key,
	password varchar(50) not null,
	enabled boolean not null
);

create table authorities (
	user_name varchar(50) not null,
	authority varchar(50) not null,
    primary key (user_name,authority)
);

create table staff (
	id int primary key auto_increment,
    email varchar(100) not null unique,
    phone varchar(20) not null unique,
    full_name nvarchar(55) not null,
    address nvarchar(255) null,
    user_name varchar(32) not null unique
);

create table orders (
	id int primary key auto_increment,
    customer_id int not null,
    order_status varchar(20) not null,
    ammount int not null,
    payment_method varchar(20) null,
    create_time datetime not null
);

create table order_details (
	id int primary key auto_increment,
    product_id int not null,
    order_id int not null,
    price double not null,
    quantity int not null
);

create table products (
	id int primary key auto_increment,
    `name` varchar(55) not null,
    price double not null,
    `description` nvarchar(255) null,
    thumbnail varchar(55) null,
    category_id int not null
); 

create table categories (
	id int primary key auto_increment,
    `name` nvarchar(50) not null,
    thumbnail varchar(50) null,
    `description` nvarchar(255) null
);

create table product_images (
	id int primary key auto_increment,
    product_id int not null,
    url varchar(255) null
);

create table carts (
	id int primary key auto_increment,
    customer_id int not null,
    ammount double not null,
    create_time datetime not null
);

create table cart_details (
	id int primary key auto_increment,
    product_id int not null,
    cart_id int not null,
    price double not null,
    quantity int not null
);

ALTER TABLE customers ADD FOREIGN KEY (user_name) REFERENCES users(user_name);
ALTER TABLE staff ADD FOREIGN KEY (user_name) REFERENCES users(user_name);
ALTER TABLE authorities ADD FOREIGN KEY (user_name) REFERENCES users(user_name);
ALTER TABLE orders ADD FOREIGN KEY (customer_id) REFERENCES customers(id);
ALTER TABLE order_details ADD FOREIGN KEY (order_id) REFERENCES orders(id);
ALTER TABLE order_details ADD FOREIGN KEY (product_id) REFERENCES products(id);
ALTER TABLE products ADD FOREIGN KEY (category_id) REFERENCES categories(id);
ALTER TABLE product_images  ADD FOREIGN KEY (product_id) REFERENCES products(id);
ALTER TABLE cart_details ADD FOREIGN KEY (product_id) REFERENCES products(id);
ALTER TABLE cart_details ADD FOREIGN KEY (cart_id) REFERENCES carts(id);
ALTER TABLE carts ADD FOREIGN KEY (customer_id) REFERENCES customers(id);


