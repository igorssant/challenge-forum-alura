BEGIN;
CREATE TABLE tbl_autor (
	aut_id INT NOT NULL AUTO_INCREMENT,
	aut_nome VARCHAR(50) NOT NULL,
	aut_usuario VARCHAR(100) NOT NULL,
	aut_senha VARCHAR(64) NOT NULL,
	aut_data_cadastro DATETIME NOT NULL DEFAULT NOW(),
	PRIMARY KEY (aut_id)
);

CREATE TABLE tbl_estado_topico (
	est_id INT NOT NULL AUTO_INCREMENT,
	est_descricao VARCHAR(20) NOT NULL,
	PRIMARY KEY (est_id)
);

CREATE TABLE tbl_curso (
	cur_id INT NOT NULL AUTO_INCREMENT,
	cur_nome VARCHAR(50) NOT NULL,
	cur_data_cadastro DATETIME NOT NULL DEFAULT NOW(),
	PRIMARY KEY (cur_id)
);

CREATE TABLE tbl_topico (
	top_id INT NOT NULL AUTO_INCREMENT,
	top_titulo VARCHAR(100) NOT NULL,
	top_mensagem TEXT NOT NULL,
	top_data_criacao DATETIME NOT NULL DEFAULT NOW(),
	est_id_tbl_estado INT,
	aut_id_tbl_autor INT,
	cur_id_tbl_curso INT,
	PRIMARY KEY (top_id),
	FOREIGN KEY (est_id_tbl_estado) REFERENCES tbl_estado_topico (est_id) ON UPDATE CASCADE,
	FOREIGN KEY (aut_id_tbl_autor) REFERENCES tbl_autor (aut_id) ON UPDATE CASCADE,
	FOREIGN KEY (cur_id_tbl_curso) REFERENCES tbl_curso (cur_id) ON UPDATE CASCADE
);
COMMIT;

BEGIN;
-- AUTOR
INSERT INTO tbl_autor (aut_nome) VALUES ('FULANO', 'fulano@email.com', '12345678');
INSERT INTO tbl_autor (aut_nome) VALUES ('CICRANO', 'cicrano@email.com', '87654321');
INSERT INTO tbl_autor (aut_nome) VALUES ('OUTRO', 'outro@email.com', '00110011');
-- ESTADO
INSERT INTO tbl_estado_topico (est_descricao) VALUES ('ABERTO');
INSERT INTO tbl_estado_topico (est_descricao) VALUES ('RESPONDIDO');
-- CURSO
INSERT INTO tbl_curso (cur_nome) VALUES ('COMPUTACAO');
INSERT INTO tbl_curso (cur_nome) VALUES ('ENGENHARIA');
INSERT INTO tbl_curso (cur_nome) VALUES ('MATEMATICA');
INSERT INTO tbl_curso (cur_nome) VALUES ('FISICA');
INSERT INTO tbl_curso (cur_nome) VALUES ('QUIMICA');
-- TOPICO
INSERT INTO tbl_topico (top_titulo, top_mensagem, est_id_tbl_estado, aut_id_tbl_autor, cur_id_tbl_curso) VALUES ('JAVA', 'CURSO GRATIS', 1, 3, 1);
INSERT INTO tbl_topico (top_titulo, top_mensagem, est_id_tbl_estado, aut_id_tbl_autor, cur_id_tbl_curso) VALUES ('PYTHON', 'CURSO GRATIS', 2, 1, 1);
INSERT INTO tbl_topico (top_titulo, top_mensagem, est_id_tbl_estado, aut_id_tbl_autor, cur_id_tbl_curso) VALUES ('C#', 'CURSO PAGO', 1, 2, 1);
COMMIT;
