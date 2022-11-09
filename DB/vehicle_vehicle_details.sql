-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: vehicle
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `vehicle_details`
--

DROP TABLE IF EXISTS `vehicle_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `vehicle_details` (
  `vid` int(11) NOT NULL AUTO_INCREMENT,
  `register_no` varchar(45) DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  `make` varchar(45) DEFAULT NULL,
  `model` varchar(45) DEFAULT NULL,
  `year` varchar(45) DEFAULT NULL,
  `color` varchar(45) DEFAULT NULL,
  `mileage` varchar(45) DEFAULT NULL,
  `monthly` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`vid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle_details`
--

LOCK TABLES `vehicle_details` WRITE;
/*!40000 ALTER TABLE `vehicle_details` DISABLE KEYS */;
INSERT INTO `vehicle_details` VALUES (1,'spcac9999','Economy','Nissan','Aqua','2004','black','12345','8465'),(2,'spcat2345','Mini Van','Suzuki','wagonr','2000','silver','12345','9850'),(3,'spkb6666','Compact','Toyota','SWIFT','2012','Black','11111','9765'),(4,'spkb1234','Standard Sedan','Nissan','Aqua','2016','black','12653','10000'),(5,'spkb2352','Economy','Suzuki','Wagonr','2016','White','42424','8490'),(6,'spkb5242','Economy','Suzuki','Wagonr','2014','Red','22355','6560'),(7,'spkk2222','Economy','Toyota','Aqua','2019','Silver','22222','7660'),(8,'spkk2346','Standard Sedan','Nissan','March','2017','White','31123','9680'),(9,'spkk3333','Mini Van','Toyota','Caravan','2003','White','12345','7670'),(10,'spkc4444','Standard Sedan','Nissan','March','2016','red','32132','10280'),(11,'spkk0001','Economy','Toyota','Aqua','2000','black','11111','7130'),(12,'spkk0002','Economy','Toyota','Aqua','2000','black','12345','8670'),(13,'spkk0003','Economy','Toyota','Aqua','2004','silver','12653','9670'),(14,'spkk8657','Economy','Toyota','Aqua','2014','Silver','11111','10000'),(15,'spcc9800','Compact','Toyota','SWIFT','2000','silver','12345','8000');
/*!40000 ALTER TABLE `vehicle_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-20 23:35:45
