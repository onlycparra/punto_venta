

DROP TABLE IF EXISTS `sale_details`;
DROP TABLE IF EXISTS `sales`;
DROP TABLE IF EXISTS `products`;
DROP TABLE IF EXISTS `users`;


CREATE TABLE IF NOT EXISTS `users` (
  `username` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `pass` varchar(40) NOT NULL,
  `level` tinyint(4) NOT NULL,
  CONSTRAINT `pk0_users` PRIMARY KEY (`username`)
);


CREATE TABLE IF NOT EXISTS `products` (
  `barcode` varchar(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `purchase_price` int(11) NOT NULL,
  `sale_price` int(11) NOT NULL,
  `bulk_sale` tinyint(4) NOT NULL,
  CONSTRAINT `pk0_products` PRIMARY KEY (`barcode`)
);


CREATE TABLE IF NOT EXISTS `sales` (
  `sale_code` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `time_stamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  CONSTRAINT `pk0_sales` PRIMARY KEY (`sale_code`),
  CONSTRAINT `fk0_sales` FOREIGN KEY (`username`) REFERENCES `users`(`username`)
);


CREATE TABLE IF NOT EXISTS `sale_details` (
  `sale_code` int(11) NOT NULL,
  `barcode` varchar(20) NOT NULL,
  `quantity` int(11) NOT NULL,
  `purchase_price` int(11) NOT NULL,
  `sale_price` int(11) NOT NULL,
  CONSTRAINT `pk0_sale_detail` PRIMARY KEY (`sale_code`,`barcode`),
  CONSTRAINT `fk0_sale_detail` FOREIGN KEY (`sale_code`) REFERENCES `sales`(`sale_code`),
  CONSTRAINT `fk1_sale_detail` FOREIGN KEY (`barcode`) REFERENCES `products`(`barcode`)
);


-- DML --
INSERT INTO `users` (`username`, `name`, `pass`, `level`) VALUES
('admin', 'Julio Cortazar', 'admin', 3),
('venta', 'Edgar Allan Poe', 'venta', 1);

INSERT INTO `products` (`barcode`, `name`, `purchase_price`, `sale_price`, `bulk_sale`) VALUES
('333', 'Tallarines', 100, 200, 0),
('444', 'Arroz', 120, 350, 1),
('555', 'Puré de Topo', 500, 600, 0),
('666', 'Trigo bacán', 800, 1000, 1),
('777', 'Azucar Acuenta', 550, 2000, 0),
('888', 'Trigo Blanco', 800, 1000, 1),
('999', 'Pan', 480, 790, 1);

INSERT INTO `sales` (`sale_code`, `username`, `time_stamp`) VALUES
(1, 'venta', '2014-12-04 15:25:54'),
(2, 'venta', '2014-12-04 15:25:54');

INSERT INTO `sale_details` (`sale_code`, `barcode`, `quantity`, `purchase_price`, `sale_price`) VALUES
(1, '333', 1, 100, 200),
(1, '444', 3, 120, 350),
(1, '666', 2, 800, 1000),
(2, '999', 1, 480, 790);