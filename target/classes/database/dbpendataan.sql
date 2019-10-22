-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: dbpendataan
-- ------------------------------------------------------
-- Server version	5.5.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `angkel`
--

DROP TABLE IF EXISTS `angkel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `angkel` (
  `no_angkel` int(11) NOT NULL AUTO_INCREMENT,
  `status` varchar(255) DEFAULT NULL,
  `id_penduduk` int(11) NOT NULL,
  `no_kk` int(11) NOT NULL,
  PRIMARY KEY (`no_angkel`),
  KEY `id_penduduk` (`id_penduduk`),
  KEY `no_kk` (`no_kk`),
  CONSTRAINT `angkel_ibfk_1` FOREIGN KEY (`id_penduduk`) REFERENCES `penduduk` (`id_penduduk`),
  CONSTRAINT `angkel_ibfk_2` FOREIGN KEY (`no_kk`) REFERENCES `kk` (`no_kk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `angkel`
--

LOCK TABLES `angkel` WRITE;
/*!40000 ALTER TABLE `angkel` DISABLE KEYS */;
/*!40000 ALTER TABLE `angkel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kelahiran`
--

DROP TABLE IF EXISTS `kelahiran`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kelahiran` (
  `id_kelahiran` int(11) NOT NULL AUTO_INCREMENT,
  `alamat` varchar(255) DEFAULT NULL,
  `berat_bayi` varchar(255) DEFAULT NULL,
  `hari_lahir` int(11) DEFAULT NULL,
  `jenis_kelahiran` int(11) DEFAULT NULL,
  `jenis_kelamin_akte` int(11) DEFAULT NULL,
  `kelahiran_ke` int(11) DEFAULT NULL,
  `nama_anak` varchar(255) DEFAULT NULL,
  `nama_ayah` varchar(255) DEFAULT NULL,
  `nama_ibu` varchar(255) DEFAULT NULL,
  `nomor_akte` int(11) DEFAULT NULL,
  `panjang_bayi` varchar(255) DEFAULT NULL,
  `pekerjaan_suami` varchar(255) DEFAULT NULL,
  `pembantu_kelahiran` varchar(255) DEFAULT NULL,
  `pukul` time DEFAULT NULL,
  `tanggal_lahir` datetime DEFAULT NULL,
  `tempat_dilahirkan` varchar(255) DEFAULT NULL,
  `tempat_kelahiran` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_kelahiran`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kelahiran`
--

LOCK TABLES `kelahiran` WRITE;
/*!40000 ALTER TABLE `kelahiran` DISABLE KEYS */;
/*!40000 ALTER TABLE `kelahiran` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kematian`
--

DROP TABLE IF EXISTS `kematian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kematian` (
  `no_kematian` int(11) NOT NULL AUTO_INCREMENT,
  `hari_meninggal` varchar(255) DEFAULT NULL,
  `info_meninggal` varchar(255) DEFAULT NULL,
  `tempat_meninggal` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `sebab_meninggal` varchar(255) DEFAULT NULL,
  `tanggal_meninggal` datetime DEFAULT NULL,
  `umur` varchar(255) DEFAULT NULL,
  `id_penduduk` int(11) NOT NULL,
  PRIMARY KEY (`no_kematian`),
  KEY `id_penduduk` (`id_penduduk`),
  CONSTRAINT `kematian_ibfk_1` FOREIGN KEY (`id_penduduk`) REFERENCES `penduduk` (`id_penduduk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kematian`
--

LOCK TABLES `kematian` WRITE;
/*!40000 ALTER TABLE `kematian` DISABLE KEYS */;
/*!40000 ALTER TABLE `kematian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kk`
--

DROP TABLE IF EXISTS `kk`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kk` (
  `no_kk` int(11) NOT NULL AUTO_INCREMENT,
  `akseptor_kb` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `alamat_kk` varchar(255) DEFAULT NULL,
  `kodepos` int(11) DEFAULT NULL,
  `nama_kepala_keluarga` varchar(255) DEFAULT NULL,
  `no_pindah` int(11) DEFAULT NULL,
  PRIMARY KEY (`no_kk`),
  KEY `no_pindah` (`no_pindah`),
  CONSTRAINT `kk_ibfk_1` FOREIGN KEY (`no_pindah`) REFERENCES `pindah` (`no_pindah`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kk`
--

LOCK TABLES `kk` WRITE;
/*!40000 ALTER TABLE `kk` DISABLE KEYS */;
/*!40000 ALTER TABLE `kk` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `membership`
--

DROP TABLE IF EXISTS `membership`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `membership` (
  `id_member` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `nama_belakang` varchar(255) DEFAULT NULL,
  `nama_depan` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_member`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `membership`
--

LOCK TABLES `membership` WRITE;
/*!40000 ALTER TABLE `membership` DISABLE KEYS */;
/*!40000 ALTER TABLE `membership` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pendatang`
--

DROP TABLE IF EXISTS `pendatang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pendatang` (
  `no_pendatang` int(11) NOT NULL AUTO_INCREMENT,
  `alamat_asal` varchar(255) DEFAULT NULL,
  `alamat_tujuan` varchar(255) DEFAULT NULL,
  `keterangan` varchar(255) DEFAULT NULL,
  `tanggal_datang` datetime DEFAULT NULL,
  `id_penduduk` int(11) NOT NULL,
  PRIMARY KEY (`no_pendatang`),
  KEY `id_penduduk` (`id_penduduk`),
  CONSTRAINT `pendatang_ibfk_1` FOREIGN KEY (`id_penduduk`) REFERENCES `penduduk` (`id_penduduk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pendatang`
--

LOCK TABLES `pendatang` WRITE;
/*!40000 ALTER TABLE `pendatang` DISABLE KEYS */;
/*!40000 ALTER TABLE `pendatang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `penduduk`
--

DROP TABLE IF EXISTS `penduduk`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `penduduk` (
  `id_penduduk` int(11) NOT NULL AUTO_INCREMENT,
  `alamat` varchar(255) DEFAULT NULL,
  `nama_lengkap` varchar(255) DEFAULT NULL,
  `nik_penduduk` int(11) DEFAULT NULL,
  `nomor_telepon` int(11) DEFAULT NULL,
  `tanggal_registrasi` datetime DEFAULT NULL,
  `tempat_lahir` varchar(255) DEFAULT NULL,
  `golongan_darah` varchar(255) DEFAULT NULL,
  `jenis_kelamin` varchar(255) DEFAULT NULL,
  `kewarganegaraan` varchar(255) DEFAULT NULL,
  `pendidikan_terakhir` varchar(255) DEFAULT NULL,
  `status_pendidikan` varchar(255) DEFAULT NULL,
  `status_perkawinan` varchar(255) DEFAULT NULL,
  `pekerjaan` varchar(255) DEFAULT NULL,
  `status_ekonomi` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_penduduk`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `penduduk`
--

LOCK TABLES `penduduk` WRITE;
/*!40000 ALTER TABLE `penduduk` DISABLE KEYS */;
INSERT INTO `penduduk` VALUES (1,'KOMPLEK MUSTIKA WANASARI BLOK C8 NO. 59 CIBITUNG BEKASI','WIWIT SETYO PUTRO',NULL,812813297,NULL,'JAKARTA','B','LAKI_LAKI','INDONESIA','S1','LULUS','MENIKAH',NULL,NULL),(2,'PERUMAHAN SAKINAH 4 CIKARANG BARAT BEKASI','BUDI SUTRISNO',NULL,811288370,NULL,'JAKARTA','B','LAKI_LAKI','INDONESIA','SMK','LULUS','MENIKAH',NULL,NULL),(4,'PEKAYON JAYA','NUNIK',NULL,812813297,NULL,'JAKARTA','B','PEREMPUAN','INDONESIA','SMU','LULUS','MENIKAH','SWASTA',3600000);
/*!40000 ALTER TABLE `penduduk` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pindah`
--

DROP TABLE IF EXISTS `pindah`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pindah` (
  `no_pindah` int(11) NOT NULL AUTO_INCREMENT,
  `alamat_tujuan` varchar(255) DEFAULT NULL,
  `keterangan` varchar(255) DEFAULT NULL,
  `tanggal_pindah` datetime DEFAULT NULL,
  `id_penduduk` int(11) NOT NULL,
  PRIMARY KEY (`no_pindah`),
  KEY `id_penduduk` (`id_penduduk`),
  CONSTRAINT `pindah_ibfk_1` FOREIGN KEY (`id_penduduk`) REFERENCES `penduduk` (`id_penduduk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pindah`
--

LOCK TABLES `pindah` WRITE;
/*!40000 ALTER TABLE `pindah` DISABLE KEYS */;
/*!40000 ALTER TABLE `pindah` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-22 17:23:22
