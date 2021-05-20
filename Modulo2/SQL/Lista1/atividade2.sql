CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos
(
	id SERIAL PRIMARY KEY,
    nome VARCHAR(30) NOT NULL,
    quantidade INT UNSIGNED NOT NULL,
    preco DECIMAL(8,2) NOT NULL,
	descricao VARCHAR(255) DEFAULT '-'
);

INSERT INTO tb_produtos (nome, quantidade, preco) VALUES ("Tênis", 300, 189.90);
INSERT INTO tb_produtos (nome, quantidade, preco, descricao) VALUES ("Mochila", 100, 89.90, "Mochila de couro resistente");
INSERT INTO tb_produtos (nome, quantidade, preco, descricao) VALUES ("Perfume", 20, 599.90, "Perfume feminino 100ml");
INSERT INTO tb_produtos (nome, quantidade, preco, descricao) VALUES ("Mala", 50, 250, "Mala de porte grande para viagens");
INSERT INTO tb_produtos (nome, quantidade, preco, descricao) VALUES ("Óculos", 30, 100, "Óculos de sol com proteção UV400");
INSERT INTO tb_produtos (nome, quantidade, preco, descricao) VALUES ("Sapato", 10, 150, "Sapato social");
INSERT INTO tb_produtos (nome, quantidade, preco, descricao) VALUES ("Relógio", 5, 800, "Relógio a prova d'agua");
INSERT INTO tb_produtos (nome, quantidade, preco, descricao) VALUES ("Corrente", 15, 50, "Corrente banhada a ouro");

SELECT * FROM tb_produtos WHERE preco > 500;
SELECT * FROM tb_produtos WHERE preco < 500;

UPDATE	tb_produtos SET descricao = "Tênis para corrida" WHERE id = 1;

