DROP TABLE IF EXISTS PRICING;
  
CREATE TABLE `PRICING` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `service_id` INT NOT NULL,
  `price` DOUBLE NOT NULL,
  `discount` INT NULL DEFAULT 0,
  `on_inspection` TINYINT NULL,
  PRIMARY KEY (`id`, `service_id`));