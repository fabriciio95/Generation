CREATE DATABASE db_cidade_das_carnes;

USE db_cidade_das_carnes;

CREATE TABLE tb_categoria
(
	id SERIAL PRIMARY KEY,
    nome VARCHAR(20) NOT NULL,
    descricao VARCHAR(255) NOT NULL
);

INSERT INTO tb_categoria (nome, descricao) VALUES ("Primeira", "Conhecidas por terem uma textura mais macia e estão localizadas nas regiões menos usadas no corpo dos bois");
INSERT INTO tb_categoria (nome, descricao) VALUES ("Segunda", "Localizadas nas regiões mais expostas dos animais, sendo um pouco mais duras e rígidas");
INSERT INTO tb_categoria (nome, descricao) VALUES ("Terceira", "Possuem uma maior quantidade de gordura e nervos");

CREATE TABLE tb_produtos
(
	id SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    quantidade FLOAT NOT NULL,
	valor DECIMAL(5,2) NOT NULL,
    categoria_id BIGINT UNSIGNED NOT NULL,
    FOREIGN KEY(categoria_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_produtos (nome, quantidade, valor, categoria_id) VALUES ("Maminha", 40.1, 60.4, 1);
INSERT INTO tb_produtos (nome, quantidade, valor, categoria_id) VALUES ("Picanha", 140.50, 80, 1);
INSERT INTO tb_produtos (nome, quantidade, valor, categoria_id) VALUES ("Filé mignon", 30, 75.5, 1);
INSERT INTO tb_produtos (nome, quantidade, valor, categoria_id) VALUES ("Costela", 89.3, 50.50, 2);
INSERT INTO tb_produtos (nome, quantidade, valor, categoria_id) VALUES ("Fraldinha", 45.6, 30, 2);
INSERT INTO tb_produtos (nome, quantidade, valor, categoria_id) VALUES ("Paleta", 100, 25, 2);
INSERT INTO tb_produtos (nome, quantidade, valor, categoria_id) VALUES ("Músculo", 150.5, 15, 3);
INSERT INTO tb_produtos (nome, quantidade, valor, categoria_id) VALUES ("Pescoço", 80, 14, 3);

SELECT p.nome, p.quantidade, p.valor, c.nome "categoria"
	FROM tb_produtos p INNER JOIN tb_categoria c
    ON p.categoria_id = c.id
    WHERE p.valor > 50;
    
SELECT p.nome, p.quantidade, p.valor, c.nome "categoria"
	FROM tb_produtos p INNER JOIN tb_categoria c
    ON p.categoria_id = c.id
    WHERE p.valor BETWEEN 3 AND 60;
    
SELECT p.nome, p.quantidade, p.valor, c.nome "categoria"
	FROM tb_produtos p INNER JOIN tb_categoria c
    ON p.categoria_id = c.id
    WHERE p.nome LIKE "%c%";

SELECT p.nome, p.quantidade, p.valor, c.nome "categoria"
	FROM tb_produtos p INNER JOIN tb_categoria c
    ON p.categoria_id = c.id;
    
SELECT p.nome, p.quantidade, p.valor, c.nome "categoria"
	FROM tb_produtos p INNER JOIN tb_categoria c
    ON p.categoria_id = c.id
    WHERE c.nome = "Primeira";