DROP TABLE IF EXISTS `bannodidb`.`product`;
/* Script for creating Product table */
CREATE TABLE `bannodidb`.`product`
(
    `id`             INT           NOT NULL AUTO_INCREMENT,
    `product_code`   CHAR(8)       NOT NULL,
    `title`          VARCHAR(255)  NOT NULL,
    `product_detail` VARCHAR(255) NULL,
    `price`          DECIMAL(7, 2) NOT NULL DEFAULT 0,
    `quantity`       INT           NOT NULL DEFAULT 0,
    PRIMARY KEY (`id`)
--     CONSTRAINT `fk_product_user`
--         FOREIGN KEY (`user_id`)
--             REFERENCES `bannodidb`.`user` (`id`)
);
