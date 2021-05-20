CREATE DATABASE db_funcionario;

USE db_funcionario;

CREATE TABLE tb_funcionarios
(
	id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(15) UNIQUE NOT NULL,
	telefone VARCHAR(15) UNIQUE NOT NULL,
    salario DECIMAL(8,2) NOT NULL
);

INSERT INTO tb_funcionarios (nome, cpf, telefone, salario) VALUES ("Rodolfo Gomes", "111.111.111-11", "11 91111-1111", 1500.00);
INSERT INTO tb_funcionarios (nome, cpf, telefone, salario) VALUES ("Maria Ferraz", "222.222.222-22", "11 92222-2222", 5540.00);
INSERT INTO tb_funcionarios (nome, cpf, telefone, salario) VALUES ("Michael Oliveira", "333.333.333-33", "11 93333-3333", 3500.00);
INSERT INTO tb_funcionarios (nome, cpf, telefone, salario) VALUES ("Julia Costa", "444.444.444-44", "11 94444-4444", 22500.00);
INSERT INTO tb_funcionarios (nome, cpf, telefone, salario) VALUES ("Rosangela Silva", "555.555.555-55", "11 95555-5555", 100500.00);

SELECT * FROM tb_funcionarios WHERE salario > 2000;
SELECT * FROM tb_funcionarios WHERE salario < 2000;

UPDATE tb_funcionarios SET nome = "Fabricio Macedo", salario = 1999.99 WHERE id = 3;
