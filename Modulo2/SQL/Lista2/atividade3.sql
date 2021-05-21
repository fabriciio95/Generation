CREATE DATABASE db_farmacia_do_bem;

USE db_farmacia_do_bem;

CREATE TABLE tb_categoria
(
	id SERIAL PRIMARY KEY,
    nome VARCHAR(20) NOT NULL,
    descricao VARCHAR(255) NOT NULL
);

CREATE TABLE tb_produtos
(
	id SERIAL PRIMARY KEY,
    nome VARCHAR(70) NOT NULL,
    quantidade INT UNSIGNED DEFAULT 0,
	preco DECIMAL(8,2) NOT NULL,
    categoria_id BIGINT UNSIGNED NOT NULL,
    FOREIGN KEY(categoria_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_categoria (nome, descricao) VALUES ("Fitoterápico", "Medicamento feito exclusivamente à base de plantas.");
INSERT INTO tb_categoria (nome, descricao) VALUES ("Referência", "É um produto inovador, registrado no órgão federal responsável pela vigilância sanitária e comercializado no país;");
INSERT INTO tb_categoria (nome, descricao) VALUES ("Genérico", "Medicamento registrado pelo nome genérico ou químico da substância ativa que o compõe, mas que não possui os testes de biodisponibilidade.");
INSERT INTO tb_categoria (nome, descricao) VALUES ("Similar", "Apresenta a mesma concentração, forma farmacêutica, via de administração, posologia e indicação terapêutica, preventiva ou diagnóstica, em comparação ao medicamento de referência");
INSERT INTO tb_categoria (nome, descricao) VALUES ("Homeopático", "Medicamento que segue a doutrina da cura pelo semelhante, ou seja, são substâncias capazes de causar sintomas de uma determinada doença no organismo sadio para que o sistema imunológico defenda a doença");

INSERT INTO tb_produtos (nome, quantidade, preco, categoria_id) VALUES ("Ginko Biloba", 300, 50, 1);
INSERT INTO tb_produtos (nome, quantidade, preco, categoria_id) VALUES ("Buchinha paulista", 30, 70, 5);
INSERT INTO tb_produtos (nome, quantidade, preco, categoria_id) VALUES ("Amoxicilina", 100, 15,3);
INSERT INTO tb_produtos (nome, quantidade, preco, categoria_id) VALUES ("Aspirina", 50, 20, 2);
INSERT INTO tb_produtos (nome, quantidade, preco, categoria_id) VALUES ("Buscopan", 300, 30, 2);
INSERT INTO tb_produtos (nome, quantidade, preco, categoria_id) VALUES ("ADDERALL XR 10", 10, 34, 3);
INSERT INTO tb_produtos (nome, quantidade, preco, categoria_id) VALUES ("Equivalex", 50, 40, 4);
INSERT INTO tb_produtos (nome, quantidade, preco, categoria_id) VALUES ("Agritoss", 25, 60, 1);


SELECT p.nome, p.quantidade, p.preco, c.nome "categoria"
	FROM tb_produtos p INNER JOIN tb_categoria c
    ON p.categoria_id = c.id
    WHERE p.preco > 50;
    
SELECT p.nome, p.quantidade, p.preco, c.nome "categoria"
	FROM tb_produtos p INNER JOIN tb_categoria c
    ON p.categoria_id = c.id
    WHERE p.preco BETWEEN 3 AND 60;

SELECT p.nome, p.quantidade, p.preco, c.nome "categoria"
	FROM tb_produtos p INNER JOIN tb_categoria c
    ON p.categoria_id = c.id
    WHERE p.nome LIKE "%b%";
    
SELECT p.nome, p.quantidade, p.preco, c.nome "categoria"
	FROM tb_produtos p INNER JOIN tb_categoria c
    ON p.categoria_id = c.id;
    
SELECT p.nome, p.quantidade, p.preco, c.nome "categoria"
	FROM tb_produtos p INNER JOIN tb_categoria c
    ON p.categoria_id = c.id
    WHERE c.nome = "Fitoterápico";
