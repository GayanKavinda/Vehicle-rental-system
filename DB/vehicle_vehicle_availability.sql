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
-- Table structure for table `vehicle_availability`
--

DROP TABLE IF EXISTS `vehicle_availability`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `vehicle_availability` (
  `vid` int(11) NOT NULL,
  `day` varchar(45) DEFAULT NULL,
  `month` varchar(45) DEFAULT NULL,
  `year` varchar(45) DEFAULT NULL,
  `drop_day` varchar(45) DEFAULT NULL,
  `drop_month` varchar(45) DEFAULT NULL,
  `drop_year` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`vid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle_availability`
--

LOCK TABLES `vehicle_availability` WRITE;
/*!40000 ALTER TABLE `vehicle_availability` DISABLE KEYS */;
INSERT INTO `vehicle_availability` VALUES (1,'1','May','2019','20','May','2019'),(2,'1','January','2019','1','January','2019'),(3,'1','January','2019','1','January','2019'),(4,'1','January','2019','1','January','2019'),(5,'1','January','2019','1','January','2019'),(6,'1','January','2019','1','January','2019'),(7,'1','January','2019','1','January','2019'),(8,'1','January','2019','2','January','2019'),(9,'1','January','2019','2','January','2019'),(10,'1','January','2019','2','January','2019'),(11,'1','January','2019','3','January','2019'),(12,'2','February','2019','2','February','2019'),(13,'3','March','2019','3','January','2019'),(14,'10','May','2019','22','May','2019');
/*!40000 ALTER TABLE `vehicle_availability` ENABLE KEYS */;
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
