-- phpMyAdmin SQL Dump
-- version 4.0.10.14
-- http://www.phpmyadmin.net
--
-- Host: localhost:3306
-- Generation Time: Feb 28, 2017 at 06:13 AM
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
-- Table structure for table `ApplicationData`
--

CREATE TABLE IF NOT EXISTS `ApplicationData` (
  `APPLICANT_ID` int(10) NOT NULL,
  `JOB_POSTING_ID` int(10) NOT NULL,
  `APPLICANT_FNAME` varchar(30) NOT NULL,
  `APPLICANT_LNAME` varchar(30) NOT NULL,
  `APPLICANT_EMAIL` varchar(40) NOT NULL,
  `STATUS` varchar(20) NOT NULL,
  `CV` text NOT NULL,
  PRIMARY KEY (`APPLICANT_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ApplicationData`
--

INSERT INTO `ApplicationData` (`APPLICANT_ID`, `JOB_POSTING_ID`, `APPLICANT_FNAME`, `APPLICANT_LNAME`, `APPLICANT_EMAIL`, `STATUS`, `CV`) VALUES
(2100, 12301023, 'James', 'Tang', 'Jamesgtang.com', '', 'THis is cv'),
(12320, 230120, 'Jack', 'Zhu', 'jackzhu@gmail.com', 'Ugrad', 'This is jack'),
(99999, 11111, 'Bob', 'Smith', 'bob.smith@mail.mcgill.ca', 'UGRAD', 'CV'),
(12345643, 34431413, 'Bob', 'Cool', 'email.com', 'UGRAD', 'CV'),
(32103910, 23127301, 'Mark', 'Young', 'mark.young@mail.mcgill.ca', 'UGRAD', 'urigh');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
