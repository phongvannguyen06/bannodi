INSERT INTO `bannodidb`.`orders` (user_id, delivery_address, total, status)
VALUES (1, '711-2880 Nulla St.', 22.36, 1),
       (2, '606-3727 Ullamcorper. Street.', 22.36, 1),
       (3, 'Ap #285-7193 Ullamcorper Avenue', 22.36, 1),
       (3, 'Ap #285-7193 Ullamcorper Avenue', 22.36, 1),
       (4, '666-4366 Lacinia Avenue', 22.36, 1),
       (4, '666-4366 Lacinia Avenue', 22.36, 1),
       (4, '666-4366 Lacinia Avenue', 22.36, 1),
       (5, '5587 Nunc. Avenue', 22.36, 1),
       (5, '5587 Nunc. Avenue', 22.36, 1),
       (6, 'P.O. Box 929 4189 Nunc Road', 22.36, 1);

INSERT INTO `bannodidb`.`order_item_detail` (product_id, order_id, price, quantity)
VALUES ('XR393083', '1', 599.99, 1),
       ('CT842081', '1', 10.00, 2),
       ('CA672707', '2', 19.99, 5),
       ('PR850984', '2', 299.99, 1),
       ('CT842081', '2', 10.00, 3),
       ('ZE714973', '3', 699.99, 3),
       ('TE062305', '3', 7.99, 5),
       ('CK143479', '4', 2.99, 1),
       ('GH168750', '5', 2.99, 10),
       ('TE062305', '5', 5.99, 3);

