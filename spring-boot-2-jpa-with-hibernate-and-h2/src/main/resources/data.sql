DROP TABLE IF EXISTS usuario;
 
CREATE TABLE usuario (
  id INT AUTO_INCREMENT PRIMARY KEY,
  login VARCHAR(50) NOT NULL,
  senha VARCHAR(50) NOT NULL,
  nome VARCHAR(100) DEFAULT NULL,
  administrador BOOLEAN DEFAULT FALSE
);

CREATE TABLE pais (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(50) NOT NULL,
  sigla VARCHAR(50) NOT NULL,
  gentilico VARCHAR(100) DEFAULT NULL
);

CREATE TABLE token (
  id INT AUTO_INCREMENT PRIMARY KEY,
  token VARCHAR(50) NOT NULL,
  login VARCHAR(50) NOT NULL,
  expiracao TIMESTAMP DEFAULT NULL,
  administrador BOOLEAN DEFAULT FALSE
);

CREATE SEQUENCE SEQ_USUARIO;
CREATE SEQUENCE SEQ_PAIS;

insert into usuario(id,login,senha,nome,administrador) values
(SEQ_USUARIO.NEXTVAL, 'convidado', 'manager', 'Usuário convidado',
0);

insert into usuario(id,login,senha,nome,administrador) values
(SEQ_USUARIO.NEXTVAL, 'admin', 'suporte', 'Gestor', 1);

insert into pais(id,nome,sigla,gentilico) values (SEQ_PAIS.NEXTVAL,
'Brasil', 'BR', 'Brasileiro');
insert into pais(id,nome,sigla,gentilico) values (SEQ_PAIS.NEXTVAL,
'Argentina', 'AR', 'Argentino');
insert into pais(id,nome,sigla,gentilico) values (SEQ_PAIS.NEXTVAL,
'Alemanha', 'AL', 'Alemão');