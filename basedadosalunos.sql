CREATE DATABASE basedadosalunos;

USE basedadosalunos;

CREATE TABLE Aluno(
  ra int primary key auto_increment,
    nome varchar(50) not null,
    pri double not null,
    seg double not null,
    ter double not null,
    qua double not null,
    media double,
    status_final varchar (15)
    );

    SELECT * FROM Aluno;