/* Initial data for user table */
INSERT INTO `bannodidb`.`user` (first_name, last_name, cell, email, password_salted_hashed)
VALUES ('teo', 'nguyen', '1234567890', 'teo@gmail.com', 'teopassword'),
       ('Matthew', 'Rasmussen', '9548978974', 'Matthew@gmail.com', 'Matthewpassword'),
       ('Lincoln', 'Juarez', '8032081267', 'Lincoln@gmail.com', 'Lincolnpassword'),
       ('Tamsin', 'Correa', '2030701412', 'Tamsin@gmail.com', 'Tamsinpassword'),
       ('Farrah', 'Luna', '1606173931', 'Farrah@gmail.com', 'Farrahpassword'),
       ('Maksymilian', 'Churchill', '0762456283', 'Maksymilian@gmail.com', 'Churchillpassword'),
       ('Rehan', 'Bonner', '0074776758', 'Rehan@gmail.com', 'Rehanpassword'),
       ('Bobbie', 'Cooke', '4868254128', 'Bobbie@gmail.com', 'Bobbiepassword'),
       ('Rebekah', 'Nguyen', '8137272364', 'Rebekah@gmail.com', 'Rebekahpassword');

/* Initial data for address table */
INSERT INTO `bannodidb`.`address` (user_id, line1, line2, city, state, zip_code)
VALUES (1, '711-2880 Nulla St.', 'APT #E', 'Mankato', 'MD', '9652'),
       (1, '606-3727 Ullamcorper. Street.', 'APT #H', 'Roseville ', 'NH', '11523'),
       (1, '8679 Sodales Av.', 'Ap #651', 'Tamuning', 'PA', '10855');
INSERT INTO `bannodidb`.`address` (user_id, line1, city, state, zip_code)
VALUES (2, '191-103 Integer Rd.', 'Corona ', 'NM', '08219'),
       (2, 'P.O. Box 887 2508 Dolor. Av.', 'Muskegon', 'KY', '12482'),
       (3, 'Ap #285-7193 Ullamcorper Avenue', 'Amesbury  ', 'HI', '93373'),
       (4, '666-4366 Lacinia Avenue', 'Idaho Falls ', 'OH', '19253'),
       (5, '5587 Nunc. Avenue', 'Erie ', 'RI', '24975'),
       (6, 'P.O. Box 929 4189 Nunc Road', 'Lebanon', 'KY', '69409');
