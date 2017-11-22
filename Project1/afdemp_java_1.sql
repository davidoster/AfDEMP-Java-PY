-- Adminer 4.3.1 MySQL dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

CREATE DATABASE `afdemp_java_1` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `afdemp_java_1`;

CREATE TABLE `accounts` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `user_id` int(100) unsigned NOT NULL,
  `transaction_date` datetime NOT NULL,
  `amount` double NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `accounts_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `accounts` (`id`, `user_id`, `transaction_date`, `amount`) VALUES
(1,	1,	'2017-11-13 19:28:47',	100000),
(2,	2,	'2017-11-13 19:29:06',	1000),
(3,	3,	'2017-11-13 19:29:15',	1000);

CREATE TABLE `users` (
  `id` int(100) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `users` (`id`, `username`, `password`) VALUES
(1,	'admin',	'admin'),
(2,	'user1',	'password1'),
(3,	'user2',	'password2');

-- 2017-11-13 17:30:28
GRANT ALL PRIVILEGES ON `afdemp_java_1`.* TO 'afdemp'@'%' IDENTIFIED BY 'afdemp';