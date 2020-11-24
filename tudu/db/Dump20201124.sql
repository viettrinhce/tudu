CREATE DATABASE  IF NOT EXISTS `tudu` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `tudu`;
-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: tudu
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `category_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  `team_category_id` int DEFAULT NULL,
  PRIMARY KEY (`category_id`),
  KEY `team_category_id_idx` (`team_category_id`),
  CONSTRAINT `team_category_id` FOREIGN KEY (`team_category_id`) REFERENCES `team` (`team_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (7,'Category 1',13),(8,'Category 4',14),(9,'Category 4',10),(10,'Category 4',12),(11,'Se',6),(12,'Se~',16);
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `task`
--

DROP TABLE IF EXISTS `task`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `task` (
  `task_id` int NOT NULL AUTO_INCREMENT,
  `task_name` varchar(255) NOT NULL,
  `task_description` varchar(255) NOT NULL,
  `user_id` int NOT NULL,
  `task_duedate` datetime DEFAULT NULL,
  `color` varchar(64) DEFAULT NULL,
  `status` int DEFAULT NULL,
  `category_id` int DEFAULT NULL,
  `date_created` datetime DEFAULT NULL,
  `recurrent_status` int DEFAULT '9001',
  PRIMARY KEY (`task_id`),
  UNIQUE KEY `task_name_UNIQUE` (`task_name`),
  KEY `user_id` (`user_id`),
  KEY `category_id_idx` (`category_id`),
  CONSTRAINT `category_id` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `task_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `task`
--

LOCK TABLES `task` WRITE;
/*!40000 ALTER TABLE `task` DISABLE KEYS */;
INSERT INTO `task` VALUES (31,'first','firstdescr',1,'2020-10-22 00:00:00','java.awt.Color[r=255,g=102,b=204]',3,NULL,'2020-10-22 15:06:36',9001),(34,'second','asdfasdf',1,'2020-10-23 00:00:00','java.awt.Color[r=255,g=102,b=102]',2,NULL,'2020-10-22 15:15:18',9001),(35,'hello 1','hello  1 1',7,'2020-11-07 00:00:00',NULL,2,NULL,'2020-11-12 17:25:31',9001),(39,'hehehehehe','heheheheh',7,'2020-11-14 00:00:00',NULL,4,7,'2020-11-12 20:23:19',9001),(40,'123','123123',7,'2020-11-13 00:00:00',NULL,1,7,'2020-11-12 20:49:06',9001),(41,'zzz','zzz',7,'2020-11-14 00:00:00',NULL,2,8,'2020-11-12 20:51:31',9001),(42,'Se~','8 times',8,'2020-11-15 00:00:00',NULL,3,12,'2020-11-14 21:56:45',9001),(43,'11231','123123',4,'2020-11-05 00:00:00',NULL,3,10,'2020-11-23 20:26:36',9001),(44,'wtf','is going on here',4,'2020-11-14 00:00:00',NULL,1,11,'2020-11-23 20:42:22',9001),(45,'wtf 2','zzzz',4,'2020-11-06 00:00:00',NULL,2,11,'2020-11-23 20:55:48',9001),(47,'hehehehehe1','zzzzzzzrwqrw',4,'2020-11-06 04:41:20',NULL,4,11,'2020-11-24 01:18:00',1),(48,'12312312','12312312',4,'2020-11-13 04:41:20',NULL,2,11,'2020-11-24 01:18:00',1),(49,'123124124124','235235',4,'2020-11-20 00:00:00',NULL,2,11,'2021-08-09 21:09:18',2),(50,'zzz123','wtfff',4,'2020-11-24 02:47:15',NULL,2,11,'2020-11-24 01:18:00',1);
/*!40000 ALTER TABLE `task` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `task_user`
--

DROP TABLE IF EXISTS `task_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `task_user` (
  `task_user_id` int NOT NULL AUTO_INCREMENT,
  `task_id` int NOT NULL,
  `user_id` int NOT NULL,
  PRIMARY KEY (`task_user_id`),
  KEY `user_id` (`user_id`),
  KEY `task_id` (`task_id`),
  CONSTRAINT `task_user_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `task_user_ibfk_2` FOREIGN KEY (`task_id`) REFERENCES `task` (`task_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `task_user`
--

LOCK TABLES `task_user` WRITE;
/*!40000 ALTER TABLE `task_user` DISABLE KEYS */;
INSERT INTO `task_user` VALUES (15,34,2),(16,35,7);
/*!40000 ALTER TABLE `task_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `team`
--

DROP TABLE IF EXISTS `team`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `team` (
  `team_id` int NOT NULL AUTO_INCREMENT,
  `team_name` varchar(45) NOT NULL DEFAULT 'noname',
  `team_owner_id` int DEFAULT NULL,
  PRIMARY KEY (`team_id`),
  KEY `team_owner_id_idx` (`team_owner_id`),
  CONSTRAINT `team_owner_id` FOREIGN KEY (`team_owner_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team`
--

LOCK TABLES `team` WRITE;
/*!40000 ALTER TABLE `team` DISABLE KEYS */;
INSERT INTO `team` VALUES (6,'Team name',7),(7,'Team 1',7),(8,'Team 2',7),(9,'Team 3',7),(10,'Team 4',7),(11,'Team 5',7),(12,'Team 6',7),(13,'Team 7',7),(14,'Team 8',7),(15,'Housework',8),(16,'Family',8),(18,'Team name',4);
/*!40000 ALTER TABLE `team` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) DEFAULT '123456',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'nicholas','123456'),(2,'nicholas2','123456'),(3,'nicholas','123456'),(4,'1','1'),(5,'wednesday','123456'),(7,'123','123'),(8,'trinhlovesviet','12345');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_team`
--

DROP TABLE IF EXISTS `user_team`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_team` (
  `user_team_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL,
  `team_id` int NOT NULL,
  PRIMARY KEY (`user_team_id`),
  KEY `user_id_idx` (`user_id`),
  KEY `team_id_idx` (`team_id`),
  CONSTRAINT `team_id` FOREIGN KEY (`team_id`) REFERENCES `team` (`team_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=135 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_team`
--

LOCK TABLES `user_team` WRITE;
/*!40000 ALTER TABLE `user_team` DISABLE KEYS */;
INSERT INTO `user_team` VALUES (44,7,6),(45,7,6),(46,7,6),(47,7,6),(48,7,6),(49,7,6),(50,7,6),(51,7,6),(52,7,6),(53,7,6),(54,7,6),(55,7,6),(56,7,6),(57,7,6),(58,7,6),(59,7,6),(60,7,6),(61,7,6),(62,7,6),(63,7,14),(64,7,10),(65,8,6),(66,8,6),(67,8,6),(68,8,6),(69,8,6),(70,4,6),(71,4,6),(72,4,6),(73,4,6),(74,4,6),(75,4,6),(76,4,6),(77,4,6),(78,4,6),(79,4,6),(80,4,6),(81,4,6),(82,4,6),(83,4,6),(84,4,6),(85,4,6),(86,4,6),(87,4,6),(88,4,6),(89,4,6),(90,4,6),(91,4,6),(92,4,6),(93,4,6),(94,4,6),(95,4,6),(96,4,6),(97,4,6),(98,4,6),(99,4,6),(100,4,6),(101,4,6),(102,4,6),(103,4,6),(104,4,6),(105,4,6),(106,4,6),(107,4,6),(108,4,6),(109,4,6),(110,4,6),(111,4,6),(112,4,6),(113,4,6),(114,4,6),(115,4,6),(116,4,6),(117,4,6),(118,4,6),(119,4,6),(120,4,6),(121,4,6),(122,4,6),(123,4,6),(124,4,6),(125,4,6),(126,4,6),(127,4,6),(128,4,6),(129,4,6),(130,4,6),(131,4,6),(132,4,6),(133,4,6),(134,4,6);
/*!40000 ALTER TABLE `user_team` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-24 13:39:40
