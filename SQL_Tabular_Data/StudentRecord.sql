-- phpMyAdmin SQL Dump
-- version 4.0.10.14
-- http://www.phpmyadmin.net
--
-- Host: localhost:3306
-- Generation Time: Feb 28, 2017 at 06:15 AM
-- Server version: 5.6.33-cll-lve
-- PHP Version: 5.6.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `TAMAS_ECSE321`
--

-- --------------------------------------------------------

--
-- Table structure for table `StudentRecord`
--

CREATE TABLE IF NOT EXISTS `StudentRecord` (
  `STUDENT_ID` int(10) NOT NULL,
  `FNAME` varchar(40) NOT NULL,
  `LNAME` varchar(40) NOT NULL,
  `STATUS` varchar(10) NOT NULL,
  `EMAIL` varchar(40) NOT NULL,
  `PASSWORD` varchar(40) NOT NULL,
  UNIQUE KEY `STUDENT_ID` (`STUDENT_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `StudentRecord`
--

INSERT INTO `StudentRecord` (`STUDENT_ID`, `FNAME`, `LNAME`, `STATUS`, `EMAIL`, `PASSWORD`) VALUES
(12312030, 'James', 'Java', 'UGRAD', 'Jame.java@java.com', 'jamesjava123'),
(13124, 'James', 'Python', 'UGRAD', 'james.python@mcgill.ca', '1994'),
(12312021, 'James', 'Java', 'UGRAD', 'Jame.java@java.com', 'jamesjava123'),
(294312804, 'Jay', 'Haskell ', 'UGRAD', 'jay.haskell@mcgill.ca', '199701286'),
(235689, 'bob', 'gog', 'UGRAD', 'bobgog@gmail.com', 'chicken'),
(123456789, 'bijan', 'gog', 'UGRAD', 'gkgk', 'gog');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
