create table user(
userId int auto_increment,
userName varchar(16) not null,
password varchar(16) not null,
gender int not null,
primary key(userId)
);