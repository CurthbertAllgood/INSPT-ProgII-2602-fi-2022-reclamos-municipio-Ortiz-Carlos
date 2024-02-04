-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: municipio_ortiz_carlos
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `logger`
--

DROP TABLE IF EXISTS `logger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `logger` (
  `id_logger` int NOT NULL AUTO_INCREMENT,
  `user_id` varchar(45) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `id_Persona` int NOT NULL,
  PRIMARY KEY (`id_logger`),
  KEY `id_user_idx` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logger`
--

LOCK TABLES `logger` WRITE;
/*!40000 ALTER TABLE `logger` DISABLE KEYS */;
INSERT INTO `logger` VALUES (1,'carlosOrtiz','2022-12-14','17:00:00',1),(2,'fernandaZela','2022-12-14','16:00:00',2),(3,'contri','2022-12-14','10:00:00',4),(4,'contri','2022-12-14','08:00:00',4),(5,'root','2022-02-20','06:38:41',3),(6,'root','2022-02-20','06:38:41',3),(7,'root','2022-12-15','17:35:07',3),(8,'root','2022-12-15','17:58:15',3),(9,'root','2022-12-15','18:03:07',3),(10,'root','2022-12-15','18:35:16',3),(11,'root','2022-12-15','18:36:58',3),(12,'root','2022-12-15','18:37:33',3),(13,'contri','2022-12-15','18:37:55',4),(14,'contri','2022-12-15','18:58:26',4),(15,'root','2022-12-15','18:58:43',3),(16,'fernandaZela','2022-12-15','18:58:58',2),(17,'carlosOrtiz','2022-12-15','19:28:15',1),(18,'fernandaZela','2022-12-15','19:28:39',2),(19,'root','2022-12-15','19:28:55',3),(20,'root','2022-12-15','19:29:32',3),(21,'carlosOrtiz','2022-12-15','19:35:12',1),(22,'root','2022-12-15','19:48:18',3),(23,'contri','2022-12-15','19:52:22',4),(24,'root','2022-12-15','19:55:50',3),(25,'root','2022-12-16','07:06:38',3),(26,'root','2024-01-16','10:06:44',3),(27,'carlosOrtiz','2024-01-16','10:07:10',1),(28,'carlosOrtiz','2024-01-16','10:07:49',1),(29,'contri','2024-01-16','10:08:35',4),(30,'carlosOrtiz','2024-01-16','10:10:07',1),(31,'root','2024-01-16','15:43:58',3),(32,'root','2024-01-16','16:18:04',3),(33,'root','2024-01-16','16:24:35',3),(34,'carlosOrtiz','2024-01-16','16:24:57',1);
/*!40000 ALTER TABLE `logger` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-04 14:13:24
