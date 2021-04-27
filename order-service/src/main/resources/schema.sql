DROP TABLE IF EXISTS `bannodidb`.`order_item_detail`;
DROP TABLE IF EXISTS `bannodidb`.`orders`;

/* Script for creating Order table */
CREATE TABLE `bannodidb`.`orders`
(
    `id`               INT           NOT NULL AUTO_INCREMENT,
    `user_id`          INT           NOT NULL,
    `delivery_address` VARCHAR(255)  NOT NULL,
    `total`            DECIMAL(7, 2) NOT NULL DEFAULT 0,
    `status`           INT           NOT NULL DEFAULT 0,
    PRIMARY KEY (`id`)
);

/* Script for creating Order Item Detail table */
CREATE TABLE `bannodidb`.`order_item_detail`
(
    `id`         INT           NOT NULL AUTO_INCREMENT,
    `product_id` CHAR(8)       NOT NULL,
    `order_id`   INT           NOT NULL,
    `price`      DECIMAL(7, 2) NOT NULL DEFAULT 0,
    `quantity`   INT           NOT NULL DEFAULT 0,
    PRIMARY KEY (`id`),
    CONSTRAINT `fk_order_item_detail_order`
        FOREIGN KEY (`order_id`)
            REFERENCES `bannodidb`.`orders` (`id`)
);