CREATE DATABASE userloginApp;
USE userloginApp;

CREATE TABLE users(
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL,
    name VARCHAR(100) NOT NULL,
    role ENUM('user', 'manager') NOT NULL
);

INSERT INTO users (username, password, name, role) VALUES 
('user1', 'pass1', 'User One', 'user'),
('manager1', 'pass2','Manager One', 'manager');
