CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria
(
	id SERIAL PRIMARY KEY,
    nome VARCHAR(20) NOT NULL,
    descricao VARCHAR(50) NOT NULL
);

CREATE TABLE tb_pizza
(
	id SERIAL PRIMARY KEY,
    sabor VARCHAR(50) NOT NULL,
    tamanho VARCHAR(7) DEFAULT 'GRANDE',
	valor DECIMAL(5,2) NOT NULL,
    categoria_id BIGINT UNSIGNED NOT NULL,
    FOREIGN KEY(categoria_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_categoria (nome, descricao) VALUES ("Salgada", "Pizzas salgadas");
INSERT INTO tb_categoria (nome, descricao) VALUES ("Doce", "Pizzas doces");
INSERT INTO tb_categoria (nome, descricao) VALUES ("VEGETARIANA", "Pizzas vegetariana");


INSERT INTO tb_pizza (sabor, tamanho, valor, categoria_id) VALUES ("Mussarela", "BROTO", 35.50, 1);
INSERT INTO tb_pizza (sabor, valor, categoria_id) VALUES ("Calabresa", 40.50, 1);
INSERT INTO tb_pizza (sabor, tamanho, valor, categoria_id) VALUES ("4 queijos", "BROTO", 50, 1);
INSERT INTO tb_pizza (sabor, valor, categoria_id) VALUES ("Brigadeiro", 65, 2);
INSERT INTO tb_pizza (sabor, tamanho, valor, categoria_id) VALUES ("Chocolate branco", "BROTO", 60, 2);
INSERT INTO tb_pizza (sabor, valor, categoria_id) VALUES ("Brócolis", 58, 3);
INSERT INTO tb_pizza (sabor, tamanho, valor, categoria_id) VALUES ("Milho verde", "BROTO", 30, 3);
INSERT INTO tb_pizza (sabor, valor, categoria_id) VALUES ("Marguerita", 30, 3);

SELECT p.sabor, p.tamanho, p.valor, c.nome "categoria"
	FROM tb_pizza p INNER JOIN tb_categoria c
    ON p.categoria_id = c.id
    WHERE p.valor > 45;
    
SELECT p.sabor, p.tamanho, p.valor, c.nome "categoria"
	FROM tb_pizza p INNER JOIN tb_categoria c
    ON p.categoria_id = c.id
    WHERE p.valor BETWEEN 29 AND 60;

SELECT p.sabor, p.tamanho, p.valor, c.nome "categoria"
	FROM tb_pizza p INNER JOIN tb_categoria c
    ON p.categoria_id = c.id
    WHERE p.sabor LIKE "%c%";

SELECT p.sabor, p.tamanho, p.valor, c.nome "categoria", c.descricao
	FROM tb_pizza p INNER JOIN tb_categoria c
    ON p.categoria_id = c.id;

SELECT p.sabor, p.tamanho, p.valor, c.nome "categoria"
	FROM tb_pizza p INNER JOIN tb_categoria c
    ON p.categoria_id = c.id
    WHERE c.nome = "Doce";

