create table if not exists hotel (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    location VARCHAR(255),
    rating INT
);

create table if not exists room (
    id INT Primary Key AUTO_INCREMENT,
    roomNumber VARCHAR(255),
    type VARCHAR(255),
    price double,
    hotelId INT,
    FOREIGN KEY (hotelId) REFERENCES hotel(id)
);
