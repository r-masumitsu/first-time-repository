-- テーブルが存在したら削除する
DROP TABLE IF EXISTS users CASCADE;
DROP TABLE IF EXISTS quiz;

-- テーブルの作成
CREATE TABLE users (
    name VARCHAR(20) PRIMARY KEY,
    password VARCHAR(255) NOT NULL
);
CREATE TABLE quiz (
    quiz_id SERIAL PRIMARY KEY,
    question TEXT NOT NULL,
    option1 TEXT NOT NULL,
    option2 TEXT NOT NULL,
    option3 TEXT NOT NULL,
    option4 TEXT NOT NULL,
    answer INT NOT NULL CHECK (answer BETWEEN 1 AND 4),
    author_name VARCHAR(20) NOT NULL,
    genre VARCHAR(20) NOT NULL,
    description TEXT NOT NULL,
    FOREIGN KEY (author_name) REFERENCES users(name)
);