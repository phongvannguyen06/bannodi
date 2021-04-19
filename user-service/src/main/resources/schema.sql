DROP TABLE IF EXISTS `bannodidb`.`address`;
DROP TABLE IF EXISTS `bannodidb`.`user`;

/* Script for creating User table */
CREATE TABLE `bannodidb`.`user`
(
    `id`                     INT         NOT NULL AUTO_INCREMENT,
    `first_name`             VARCHAR(50) NULL DEFAULT NULL,
    `last_name`              VARCHAR(50) NULL DEFAULT NULL,
    `cell`                   VARCHAR(15) NULL,
    `email`                  VARCHAR(50) NULL,
    `password_salted_hashed` VARCHAR(32) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `uq_cell` (`cell` ASC),
    UNIQUE INDEX `uq_email` (`email` ASC)
);

/* Script for creating Address table */
CREATE TABLE `bannodidb`.`address`
(
    `id`       INT          NOT NULL AUTO_INCREMENT,
    `user_id`  INT          NOT NULL,
    `line1`    VARCHAR(125) NOT NULL,
    `line2`    VARCHAR(125) NULL DEFAULT NULL,
    `city`     VARCHAR(125) NOT NULL,
    `state`    VARCHAR(2)   NOT NULL,
    `zip_code` VARCHAR(10)  NOT NULL,
    PRIMARY KEY (`id`),
    CONSTRAINT `fk_address_user`
        FOREIGN KEY (`user_id`)
            REFERENCES `bannodidb`.`user` (`id`)
);