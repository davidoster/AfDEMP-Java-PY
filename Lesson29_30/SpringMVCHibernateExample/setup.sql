CREATE TABLE STUDENT(
    id INT NOT NULL auto_increment, 
    name TEXT NOT NULL,
    entering_date DATE NOT NULL,
    nationality TEXT NOT NULL,
    code VARCHAR(30) NOT NULL UNIQUE,
    PRIMARY KEY (id)
);