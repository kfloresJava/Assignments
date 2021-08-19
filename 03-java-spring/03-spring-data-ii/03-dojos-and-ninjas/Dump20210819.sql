-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ninjadojo
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dojo`
--

DROP TABLE IF EXISTS `dojo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dojo` (
  `did` bigint NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `d_name` varchar(255) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dojo`
--

LOCK TABLES `dojo` WRITE;
/*!40000 ALTER TABLE `dojo` DISABLE KEYS */;
INSERT INTO `dojo` VALUES (1,'2021-08-19 10:40:51.478000','Arcadia Dojo',NULL),(2,'2021-08-19 10:40:57.587000','San Fernando Dojo',NULL),(3,'2021-08-19 10:41:04.867000','BroomStick Stix Dojo',NULL);
/*!40000 ALTER TABLE `dojo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ninja`
--

DROP TABLE IF EXISTS `ninja`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ninja` (
  `nid` bigint NOT NULL AUTO_INCREMENT,
  `age` int NOT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `dojo_id` bigint DEFAULT NULL,
  PRIMARY KEY (`nid`),
  KEY `FKl6a2fdpp4vhpbfkgy7op37suw` (`dojo_id`),
  CONSTRAINT `FKl6a2fdpp4vhpbfkgy7op37suw` FOREIGN KEY (`dojo_id`) REFERENCES `dojo` (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ninja`
--

LOCK TABLES `ninja` WRITE;
/*!40000 ALTER TABLE `ninja` DISABLE KEYS */;
INSERT INTO `ninja` VALUES (1,2,'2021-08-19 10:50:47.357000','asd','asd',NULL,2),(2,22,'2021-08-19 11:22:42.554000','ew','Samson',NULL,1),(3,16,'2021-08-19 11:25:54.991000','Richard','Bertinson',NULL,1),(4,10,'2021-08-19 11:30:08.412000','Simon','Cowel',NULL,1),(5,10,'2021-08-19 11:30:28.023000','Simon','Cowel',NULL,1),(6,10,'2021-08-19 11:30:34.974000','Simon','Cowel',NULL,1),(7,43,'2021-08-19 11:31:30.615000','Peter','Cobra',NULL,2);
/*!40000 ALTER TABLE `ninja` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-19 11:33:37
