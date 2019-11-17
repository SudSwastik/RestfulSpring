create table customer (
	id INT primary key auto_increment,
	name VARCHAR(50) not null,
	email VARCHAR(50) unique,
	gender VARCHAR(50),
	phone VARCHAR(50) unique
);