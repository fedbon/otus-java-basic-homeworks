CREATE TABLE questions
(
    question_id  	SERIAL           PRIMARY KEY,
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
    answer_id    	INTEGER         PRIMARY KEY,
    name       		VARCHAR(50)     NOT NULL UNIQUE
);

INSERT INTO answers(answer_id, name)
VALUES
	(1, 'OAK'),
	(2, 'Star7'),
	(3, 'Polaris'),
	(4, 'Spectrum'),
	(5, 'Byte'),
	(6, 'Int'),
	(7, 'Short'),
	(8, 'Long'),
	(9, '++'),
	(10, '/'),
	(11, '%'),
	(12, '*'),
	(13, 'Java 10'),
	(14, 'Java 11'),
	(15, 'Java 8'),
	(16, 'Java 14');

SELECT * FROM answers;

CREATE TABLE question_to_answers
(
    question_id  	INTEGER         REFERENCES questions (question_id) ON DELETE CASCADE,
    answer_id    	INTEGER         REFERENCES answers (answer_id) ON DELETE CASCADE,
    isCorrect		BOOL
);

INSERT INTO question_to_answers(question_id, answer_id, isCorrect)
VALUES
	(1, 1, true),
	(1, 2, false),
	(1, 3, false),
	(1, 4, false),
	(2, 5, false),
	(2, 6, true),
	(2, 7, false),
	(2, 8, false),
	(3, 9, false),
	(3, 10, false),
	(3, 11, true),
	(3, 12, false),
	(4, 13, true),
	(4, 14, false),
	(4, 15, false),
	(4, 16, false);

SELECT a.answer_id, a.name, qa.isCorrect
FROM question_to_answers AS qa
JOIN answers AS a
ON qa.answer_id = a.answer_id
WHERE qa.question_id = 1;

DROP TABLE questions, answers;