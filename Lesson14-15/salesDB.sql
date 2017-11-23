/*
SQLyog Ultimate - MySQL GUI v8.2 
MySQL - 5.5.5-10.1.24-MariaDB : Database - sales
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`sales` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `sales`;

/*Table structure for table `customers` */

DROP TABLE IF EXISTS `customers`;

CREATE TABLE `customers` (
  `Ccode` int(10) unsigned NOT NULL,
  `Cname` varchar(20) NOT NULL,
  PRIMARY KEY (`Ccode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customers` */

insert  into `customers`(`Ccode`,`Cname`) values (100102,'Aleksiadis'),(100103,'Papadopoulos'),(100104,'Ioannou'),(100105,'Apostolou'),(100106,'Papamarkou'),(100107,'Drakopoulos');

/*Table structure for table `family` */

DROP TABLE IF EXISTS `family`;

CREATE TABLE `family` (
  `fname` varchar(20) DEFAULT NULL,
  `frelationship` varchar(20) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `salesman` int(10) unsigned DEFAULT NULL,
  KEY `fk_family` (`salesman`),
  CONSTRAINT `fk_family` FOREIGN KEY (`salesman`) REFERENCES `salesmen` (`Scode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `family` */

insert  into `family`(`fname`,`frelationship`,`dob`,`salesman`) values ('George','son','1981-02-11',101),('Mary','wife','1977-12-11',101);

/*Table structure for table `products` */

DROP TABLE IF EXISTS `products`;

CREATE TABLE `products` (
  `Pcode` int(10) unsigned NOT NULL,
  `Pdescr` varchar(45) NOT NULL,
  `Pprice` decimal(7,2) unsigned DEFAULT NULL,
  PRIMARY KEY (`Pcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `products` */

insert  into `products`(`Pcode`,`Pdescr`,`Pprice`) values (1310,'FooBar','50.00'),(1311,'Keyboard','100.00'),(1312,'HDD 250MB','60.00'),(1313,'Printer 24pin','81.00'),(1314,'TV 17\"','250.00'),(1315,'Printer inkjet','135.00');

/*Table structure for table `sales` */

DROP TABLE IF EXISTS `sales`;

CREATE TABLE `sales` (
  `Scode` int(10) unsigned NOT NULL,
  `Pcode` int(10) unsigned NOT NULL,
  `Sdate` date DEFAULT NULL,
  `Ccode` int(10) unsigned NOT NULL,
  `Smcode` int(10) unsigned NOT NULL,
  `Quant` int(10) unsigned DEFAULT NULL,
  `Cost` decimal(7,2) unsigned DEFAULT NULL,
  PRIMARY KEY (`Scode`),
  KEY `Icode_idx` (`Pcode`),
  KEY `Ccode_idx` (`Ccode`),
  KEY `FK_sales` (`Smcode`),
  CONSTRAINT `Ccode` FOREIGN KEY (`Ccode`) REFERENCES `customers` (`Ccode`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_sales` FOREIGN KEY (`Smcode`) REFERENCES `salesmen` (`Scode`),
  CONSTRAINT `Icode` FOREIGN KEY (`Pcode`) REFERENCES `products` (`Pcode`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sales` */

insert  into `sales`(`Scode`,`Pcode`,`Sdate`,`Ccode`,`Smcode`,`Quant`,`Cost`) values (10001,1310,'1993-06-10',100107,104,20,'800.00'),(10002,1313,'1993-07-12',100102,101,10,'700.00'),(10003,1312,'1993-03-15',100104,105,16,'760.00'),(10004,1310,'1993-04-21',100106,103,12,'400.00'),(10005,1310,'1992-12-02',100103,102,25,'1250.00'),(10006,1311,'1992-11-03',100107,104,30,'120.00'),(10007,1313,'1993-05-17',100105,104,20,'1600.00'),(10008,1312,'1993-02-12',100107,104,5,'100.00'),(10009,1310,'1992-12-02',100102,101,10,'500.00'),(10010,1311,'1992-11-03',100106,103,20,'80.00'),(10011,1313,'1993-04-04',100104,105,15,'1150.00');

/*Table structure for table `salesmen` */

DROP TABLE IF EXISTS `salesmen`;

CREATE TABLE `salesmen` (
  `Scode` int(10) unsigned NOT NULL,
  `Sname` varchar(20) NOT NULL,
  `Scity` varchar(15) DEFAULT NULL,
  `Scomm` decimal(5,2) unsigned DEFAULT NULL,
  PRIMARY KEY (`Scode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `salesmen` */

insert  into `salesmen`(`Scode`,`Sname`,`Scity`,`Scomm`) values (101,'Antoniou','Athens','0.14'),(102,'Dimou','Athens','0.15'),(103,'Vasileiou','Patra','0.17'),(104,'Raptis','Thessaloniki','0.16'),(105,'Lamprinakis','Irakleio','0.15');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
