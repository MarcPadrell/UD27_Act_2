CREATE DATABASE  IF NOT EXISTS `Los_Cientificos` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `Los_Cientificos`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 192.168.1.78    Database: Los_Cientificos
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `Asignado_A`
--

create table usuario (id int auto_increment, password varchar(255), role varchar(255), username varchar(255), primary key (id));

INSERT INTO usuario (username, password, role) VALUES ('admin', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.','admin');

DROP TABLE IF EXISTS `asignado_a`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asignado_a` (
  `id` int not null auto_increment,
  `cientifico` varchar(8),
  `proyecto` char(4),
  PRIMARY KEY (`Id`,`cientifico`,`proyecto`),
  KEY `proyecto` (`proyecto`),
  CONSTRAINT `Asignado_A_ibfk_1` FOREIGN KEY (`cientifico`) REFERENCES `cientificos` (`dni`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `Asignado_A_ibfk_2` FOREIGN KEY (`proyecto`) REFERENCES `proyecto` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Asignado_A`
--

LOCK TABLES `asignado_a` WRITE;
/*!40000 ALTER TABLE `asignado_a` DISABLE KEYS */;
INSERT INTO `asignado_a`(cientifico, proyecto) VALUES ('67753256','1'),('45523698','2'),('65436732','4');
/*!40000 ALTER TABLE `asignado_a` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Cientificos`
--

DROP TABLE IF EXISTS `cientificos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cientificos` (
  `dni` varchar(8) NOT NULL,
  `nomapels` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cientificos`
--

LOCK TABLES `cientificos` WRITE;
/*!40000 ALTER TABLE `cientificos` DISABLE KEYS */;
INSERT INTO `cientificos` VALUES ('45523698','Borja'),('55353467','Alvar'),('65436732','Sergi'),('67753256','Arnau'),('88665342','Dani');
/*!40000 ALTER TABLE `cientificos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Proyecto`
--

DROP TABLE IF EXISTS `proyecto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proyecto` (
  `id` char(4) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `horas` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Proyecto`
--

LOCK TABLES `proyecto` WRITE;
/*!40000 ALTER TABLE `proyecto` DISABLE KEYS */;
INSERT INTO `proyecto` VALUES ('1','RF',4500),('2','NFC',340),('3','Implant',112),('4','Monitoring',9980),('5','Research',5560);
/*!40000 ALTER TABLE `proyecto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-17  9:34:31
