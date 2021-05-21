CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classe
(
	id SERIAL PRIMARY KEY,
	nome VARCHAR(40) NOT NULL,
    descricao VARCHAR(100) NOT NULL
);

ALTER TABLE tb_classe CHANGE COLUMN descricao descricao VARCHAR(255) NOT NULL;

CREATE TABLE tb_personagem
(
	id SERIAL PRIMARY KEY,
	nome VARCHAR(40) NOT NULL,
    poder_ataque INT UNSIGNED NOT NULL,
    poder_defesa INT UNSIGNED NOT NULL,
    classe_id BIGINT UNSIGNED NOT NULL,
    FOREIGN KEY (classe_id) REFERENCES tb_classe(id)
);


INSERT INTO tb_classe (nome, descricao) VALUES ("Guerreiro","Alta resistência e combate corporal com espadas, lanças, machados, maças e escudos");
INSERT INTO tb_classe (nome, descricao) VALUES ("Caçador","Baixa resistência e combate a distância com arco e flecha (às vezes com vários tipos de flechas como fogo, gelo, prata, etc)");
INSERT INTO tb_classe (nome, descricao) VALUES ("Mago","Baixa resistência e combate a distância com magias de variados elementos (fogo, gelo, terra, raios, sombra, etc).");
INSERT INTO tb_classe (nome, descricao) VALUES ("Ladrão","Baixa resistência mas com muitos meios de não ser atingido e Combate corporal com adagas, katares, punhais e outras armas de punho");
INSERT INTO tb_classe (nome, descricao) VALUES ("Curandeiro","Alta resistência e combate a distância com magias de luz ou da natureza. Às vezes podem usar maças para atacar de perto.");

INSERT INTO tb_personagem (nome, poder_ataque, poder_defesa, classe_id) VALUES ("Tomaz Ryger", 1000, 1500 , 5);
INSERT INTO tb_personagem (nome, poder_ataque, poder_defesa, classe_id) VALUES ("Slayer", 4000, 1500 , 6);
INSERT INTO tb_personagem (nome, poder_ataque, poder_defesa, classe_id) VALUES ("Mog", 6000, 3500 , 3);
INSERT INTO tb_personagem (nome, poder_ataque, poder_defesa, classe_id) VALUES ("Divine", 1100, 2500 , 4);
INSERT INTO tb_personagem (nome, poder_ataque, poder_defesa, classe_id) VALUES ("Arrow", 5000, 2000 , 3);
INSERT INTO tb_personagem (nome, poder_ataque, poder_defesa, classe_id) VALUES ("Shiryu", 6500, 3000 , 1);
INSERT INTO tb_personagem (nome, poder_ataque, poder_defesa, classe_id) VALUES ("Hunter", 4500, 1500 , 3);
INSERT INTO tb_personagem (nome, poder_ataque, poder_defesa, classe_id) VALUES ("Mage", 900, 4000 , 4);
INSERT INTO tb_personagem (nome, poder_ataque, poder_defesa, classe_id) VALUES ("Executor", 2000, 1100 , 1);

SELECT p.nome, p.poder_ataque, p.poder_defesa, c.nome "classe"
 FROM tb_personagem p 
 INNER JOIN tb_classe c
 ON p.classe_id = c.id
 WHERE p.poder_ataque > 2000;

SELECT p.nome, p.poder_ataque, p.poder_defesa, c.nome "classe"
 FROM tb_personagem p 
 INNER JOIN tb_classe c
 ON p.classe_id = c.id
 WHERE p.poder_defesa BETWEEN 1000 AND 2000;
 
 SELECT p.nome, p.poder_ataque, p.poder_defesa, c.nome "classe"
 FROM tb_personagem p 
 INNER JOIN tb_classe c
 ON p.classe_id = c.id
 WHERE p.nome LIKE "%C%";
 
 SELECT p.nome, p.poder_ataque, p.poder_defesa, c.nome "classe", c.descricao
 FROM tb_personagem p 
 INNER JOIN tb_classe c
 ON p.classe_id = c.id;
 
 SELECT p.nome, p.poder_ataque, p.poder_defesa, c.nome "classe", c.descricao
 FROM tb_personagem p 
 INNER JOIN tb_classe c
 ON p.classe_id = c.id
 WHERE c.nome = "Caçador";