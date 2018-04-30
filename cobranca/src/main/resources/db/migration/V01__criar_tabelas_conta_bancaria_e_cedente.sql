CREATE TABLE conta (
    codigo SERIAL,
    nome VARCHAR(100) NOT NULL,
   PRIMARY KEY(codigo)
); 

insert into conta (nome) values ('wladimir');