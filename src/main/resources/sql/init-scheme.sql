create table if not exists board
(
    number integer PRIMARY KEY,
    title VARCHAR(20),
    content VARCHAR(100),
    nickname VARCHAR(20),
);
