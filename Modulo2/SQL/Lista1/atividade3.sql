CREATE DATABASE db_escola;

USE db_escola;
CREATE TABLE tb_alunos
(
	id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
	idade TINYINT NOT NULL,
    matricula VARCHAR(15) NOT NULL,
    nota DECIMAL(3,1)  NOT NULL
);

INSERT INTO tb_alunos (nome, idade, matricula, nota) VALUES ("João Figueiredo", 14, "293.2329-22", 7.5);
INSERT INTO tb_alunos (nome, idade, matricula, nota) VALUES ("Joana Martins", 12, "222.239.490", 9.5);
INSERT INTO tb_alunos (nome, idade, matricula, nota) VALUES ("Miguel Azevedo", 17, "111.293.23", 8.5);
INSERT INTO tb_alunos (nome, idade, matricula, nota) VALUES ("Felipe Cunha", 16, "9982.232.24", 5.5);
INSERT INTO tb_alunos (nome, idade, matricula, nota) VALUES ("Amanda Silva", 15, "22.234.50", 10.0);
INSERT INTO tb_alunos (nome, idade, matricula, nota) VALUES ("Dayne Oliveira", 15, "333.3443.43", 9.0);
INSERT INTO tb_alunos (nome, idade, matricula, nota) VALUES ("Lais Torres", 14, "112.342", 4.5);
INSERT INTO tb_alunos (nome, idade, matricula, nota) VALUES ("Richard Souza", 17, "9243.3249", 7.9);

SELECT * FROM tb_alunos WHERE nota > 7;
SELECT * FROM tb_alunos WHERE nota < 7;

UPDATE tb_alunos SET nota = 6.9 WHERE id = 5;
