CREATE TABLE questions
(
    question_id  	SERIAL          PRIMARY KEY,
    name            VARCHAR(100)     NOT NULL UNIQUE
);

INSERT INTO questions(name)
VALUES
	('Какое название было самым первым у Java?'),
	('Какой целочисленный примитивный тип в Java занимает 4 байта в памяти?'),
	('Какой оператор вычисляет остаток от деления?'),
	('В какой версии Java добавили ключевое слово var?');

SELECT question_id, name
FROM questions;

CREATE TABLE answers
(
    answer_id    	INTEGER         NOT NULL,
    name       		VARCHAR(50)     NOT NULL UNIQUE,
	isCorrect		BOOL,
    question_id  	INTEGER         REFERENCES questions (question_id) ON DELETE CASCADE
);

INSERT INTO answers(answer_id, name, isCorrect, question_id)
VALUES
	(1, 'OAK', true, 1),
	(2, 'Star7', false, 1),
	(3, 'Polaris', false, 1),
	(4, 'Spectrum', false, 1),
	(1, 'Byte', false, 2),
	(2, 'Int', true, 2),
	(3, 'Short', false, 2),
	(4, 'Long', false, 2),
	(1, '++', false, 3),
	(2, '/', false, 3),
	(3, '%', true, 3),
	(4, '*', false, 3),
	(1, 'Java 10', true, 4),
	(2, 'Java 11', false, 4),
	(3, 'Java 8', false, 4),
	(4, 'Java 14', false, 4);

SELECT * FROM answers;

SELECT q.name, a.answer_id, a.name, a.isCorrect
FROM questions AS q
JOIN answers AS a
ON a.question_id = q.question_id;

SELECT q.name, a.answer_id, a.name, a.isCorrect
FROM questions AS q
JOIN answers AS a
ON a.question_id = q.question_id
WHERE q.name = 'Какое название было самым первым у Java?';

DROP TABLE questions, answers;