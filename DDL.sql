create schema avaliacao;

use avaliacao;

create user 'user'@'localhost' identified by 'pass123';

grant select, insert, delete, update on avaliacao.* to user@'localhost';

create table tra_trabalho (
  tra_id bigint unsigned primary key auto_increment,
  tra_titulo varchar(100) not null,
  tra_data_hora_apresentacao datetime not null,
  tra_aluno varchar(200) not null,
  tra_orientador varchar(200) not null
);

create table ava_avaliacao (
  ava_id bigint unsigned primary key auto_increment,
  ava_nota int not null default 0,
  tra_id bigint unsigned not null,
  constraint ava_tra_fk foreign key (tra_id)
    references tra_trabalho (tra_id)
);
