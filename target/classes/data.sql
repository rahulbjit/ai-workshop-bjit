DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users (
    id INT PRIMARY KEY,
    username VARCHAR(50),
    email VARCHAR(50),
    password VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS products (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    category VARCHAR(50),
    description VARCHAR(255),
    price DECIMAL(10, 2),
    stock INT
);

CREATE TABLE IF NOT EXISTS orders (
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    product_id INT,
    quantity INT,
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (product_id) REFERENCES products(id)
);

INSERT INTO users (id, username, email, password) VALUES (1, 'john_doe', 'john@example.com', 'password123');
INSERT INTO products (id, name, category, description, price, stock) VALUES (1, 'Laptop', 'Electronics', 'A high-performance laptop', 999.99, 10);
INSERT INTO products (id, name, category, description, price, stock) VALUES (2, 'Smartphone', 'Electronics', 'A latest model smartphone', 699.99, 20);
INSERT INTO orders (id, user_id, product_id, quantity) VALUES (1, 1, 1, 1);