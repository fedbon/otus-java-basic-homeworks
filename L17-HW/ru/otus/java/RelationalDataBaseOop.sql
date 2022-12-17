CREATE TABLE users
(
    user_id  		SERIAL          PRIMARY KEY,
    user_name       VARCHAR(100)    NOT NULL UNIQUE,
	correct_count	INTEGER			DEFAULT 0,
	wrong_count		INTEGER			DEFAULT 0
);

INSERT INTO users(user_name)
VALUES
	('Иванов Максим Петрович'),
	('Сергеев Алексей Олегович'),
	('Максимов Александр Евгеньевич');

SELECT u.user_id, u.user_name, u.correct_count, u.wrong_count
FROM users AS u;

CREATE TABLE test_elements
(
    test_element_id SERIAL          PRIMARY KEY,
    question_name   VARCHAR(100)    NOT NULL UNIQUE,
	answer_options  VARCHAR(100)[]  NOT NULL UNIQUE,
	correct_answer  INTEGER			NOT NULL,
	user_id  		INTEGER         REFERENCES users (user_id) ON DELETE CASCADE
);

INSERT INTO test_elements(question_name, answer_options, correct_answer)
VALUES
	('Какое название было самым первым у Java?',
	 '{"1. OAK", "2. Star7", "3. Polaris", "4. Spectrum"}', 1),
	('Какой целочисленный примитивный тип в Java занимает 4 байта в памяти?',
     '{"1. Byte", "2. Int", "3. Short", "4. Long"}', 2),
    ('Какой оператор вычисляет остаток от деления?',
     '{"1. ++", "2. /", "3. %", "4. *"}', 3),
    ('В какой версии Java добавили ключевое слово var?',
     '{"1. Java 10", "2. Java 11", "3. Java 8", "4. Java 14"}', 1);

SELECT te.test_element_id, te.question_name, te.answer_options, te.correct_answer
FROM test_elements AS te;

SELECT * FROM users AS u, test_elements
WHERE u.user_name = 'Иванов Максим Петрович';

DROP TABLE users, test_elements;