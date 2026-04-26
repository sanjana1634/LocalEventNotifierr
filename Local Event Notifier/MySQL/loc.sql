CREATE DATABASE local_event_db;
USE local_event_db;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100)
);

CREATE TABLE events (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100),
    description TEXT,
    event_date DATE,
    location VARCHAR(100)
);

CREATE TABLE notifications (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    event_id INT,
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (event_id) REFERENCES events(id)
);
SELECT * FROM users;
SELECT * FROM events;
USE local_event_db;
INSERT INTO users (name, email)
VALUES ('TestUser', 'test@gmail.com');
SELECT * FROM users;

