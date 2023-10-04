DROP TABLE IF EXISTS PROJECT;
DROP TABLE IF EXISTS Task;

CREATE TABLE project (
    id SERIAL PRIMARY KEY,
    title TEXT NOT NULL,
    description TEXT
);

CREATE TABLE task (
    id SERIAL PRIMARY KEY,
    title TEXT NOT NULL,
    description TEXT,
    project INTEGER NOT NULL,
    FOREIGN KEY (project) REFERENCES project(id)
);