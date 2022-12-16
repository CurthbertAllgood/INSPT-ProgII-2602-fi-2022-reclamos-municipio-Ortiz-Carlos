CREATE DATABASE  IF NOT EXISTS `municipio_ortiz_carlos` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `municipio_ortiz_carlos`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: municipio_ortiz_carlos
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
-- Table structure for table `reclamo`
--

DROP TABLE IF EXISTS `reclamo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reclamo` (
  `id_Reclamo` int NOT NULL,
  `Descripcion` varchar(100) DEFAULT NULL,
  `Fecha_Creacion` date DEFAULT NULL,
  `Fecha_Resolucion` date DEFAULT NULL,
  `Resolucion` varchar(50) DEFAULT NULL,
  `Categoria` varchar(15) DEFAULT NULL,
  `id_Persona` int DEFAULT NULL,
  `domidilio_id_domicilio` int DEFAULT NULL,
  PRIMARY KEY (`id_Reclamo`),
  KEY `domicilio_ibfk_1_idx` (`domidilio_id_domicilio`),
  KEY `reclamo_ibfk_1` (`id_Persona`),
  CONSTRAINT `reclamo_ibfk_1` FOREIGN KEY (`id_Persona`) REFERENCES `persona` (`id_Persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reclamo`
--

LOCK TABLES `reclamo` WRITE;
/*!40000 ALTER TABLE `reclamo` DISABLE KEYS */;
INSERT INTO `reclamo` VALUES (1,'no hay agua','2022-12-12','2022-01-10','asagas','PLUVIAL',4,4),(2,'no hay agua','2022-12-12','2202-03-10','asgasgag','ARBOLADO',2,2),(3,'asgags','2022-12-12','2202-12-12','resuelto','ARBOLADO',2,2),(4,'el arbolito esta roto','2022-10-08',NULL,NULL,'PLUVIAL',3,4),(5,'inundacion','2022-10-08',NULL,'resuelto','PLUVIAL',4,4);
/*!40000 ALTER TABLE `reclamo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-16 14:21:32
