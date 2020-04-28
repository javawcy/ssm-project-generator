create table hello
(
	id bigint not null auto_increment,
	msg varchar(255) not null,
    primary key (id)
) engine=innodb default character set utf8;


insert into hello values (1,'hello');


