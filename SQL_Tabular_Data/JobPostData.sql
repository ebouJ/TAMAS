-- phpMyAdmin SQL Dump
-- version 4.0.10.14
-- http://www.phpmyadmin.net
--
-- Host: localhost:3306
-- Generation Time: Feb 28, 2017 at 06:14 AM
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
-- Table structure for table `JobPostData`
--

CREATE TABLE IF NOT EXISTS `JobPostData` (
  `POST_ID` int(10) NOT NULL AUTO_INCREMENT,
  `INSTRUCTOR_NAME` varchar(100) NOT NULL,
  `COURSE` varchar(20) NOT NULL,
  `JOB_TYPE` varchar(10) NOT NULL,
  `HOUR` int(10) NOT NULL,
  `DESCRIPTION` text NOT NULL,
  `DAYS_OF_WEEK` varchar(100) NOT NULL,
  `MON_START_TIME` int(10) NOT NULL,
  `MON_END_TIME` int(10) NOT NULL,
  `TUE_START_TIME` int(10) NOT NULL,
  `TUE_END_TIME` int(10) NOT NULL,
  `WED_START_TIME` int(10) NOT NULL,
  `WED_END_TIME` int(10) NOT NULL,
  `THU_START_TIME` int(10) NOT NULL,
  `THU_END_TIME` int(10) NOT NULL,
  `FRI_START_TIME` int(10) NOT NULL,
  `FRI_END_TIME` int(10) NOT NULL,
  PRIMARY KEY (`POST_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=235 ;

--
-- Dumping data for table `JobPostData`
--

INSERT INTO `JobPostData` (`POST_ID`, `INSTRUCTOR_NAME`, `COURSE`, `JOB_TYPE`, `HOUR`, `DESCRIPTION`, `DAYS_OF_WEEK`, `MON_START_TIME`, `MON_END_TIME`, `TUE_START_TIME`, `TUE_END_TIME`, `WED_START_TIME`, `WED_END_TIME`, `THU_START_TIME`, `THU_END_TIME`, `FRI_START_TIME`, `FRI_END_TIME`) VALUES
(1, 'Proferssor Paul Python', 'ECSE222', 'Marker', 14, 'Offered by: Electrical & Computer Engr (Faculty of Engineering)\r\nOverview\r\n\r\nElectrical Engineering : An introduction to digital logic, binary numbers and Boolean algebra, combinational circuits, optimized implementation of combinational circuits, arithmetic circuits, combinational circuit building blocks, flip-flops, registers, counters, design of digital circuits with VHDL, and synchronous sequential circuits', 'Monday Tuesday Thursdsday', 800, 900, 800, 900, 800, 800, 800, 1000, 800, 800),
(2, 'Proferssor Paul Python', 'ECSE223', 'Grader', 15, 'Electrical Engineering : Integration of modelling with programming; abstraction in software engineering; structural modelling; state-based modelling; modelling of object-oriented systems, code generation; natural language constraints in modelling notations; architectural and design patterns; integrated development environments; programming tools (debugging, continuous build/integration, version control and code repositories, diff, defect and issue tracking, refactoring); code review processes.\r\n\r\nTerms: Winter 2017\r\n\r\nInstructors: Gunter Mussbacher (Winter) ', 'Tuesday Wednesday', 800, 800, 800, 800, 900, 900, 800, 800, 800, 800),
(3, 'Proferssor Paul Python', 'ECSE223', 'Marker', 20, 'Overview\r\n\r\nElectrical Engineering : Integration of modelling with programming; abstraction in software engineering; structural modelling; state-based modelling; modelling of object-oriented systems, code generation; natural language constraints in modelling notations; architectural and design patterns; integrated development environments; programming tools (debugging, continuous build/integration, version control and code repositories, diff, defect and issue tracking, refactoring); code review processes.\r\n\r\nTerms: Winter 2017\r\n\r\nInstructors: Gunter Mussbacher (Winter) ', 'Tuesday Wednesday', 800, 800, 800, 900, 800, 900, 800, 800, 800, 800),
(4, 'Proferssor Paul Python', 'ECSE222', 'Grader', 20, 'Overview\r\n\r\nElectrical Engineering : Design, development and testing of software systems. Software life cycle: requirements analysis, software architecture and design, implementation, integration, test planning, and maintenance. The course involves a group project.\r\n\r\nTerms: Fall 2016, Winter 2017 ', 'Wednesday Thursdsday', 800, 800, 800, 800, 800, 1600, 900, 1300, 800, 800),
(5, 'Proferssor Paul Python', 'ECSE321', 'Marker', 20, 'Overview\r\n\r\nElectrical Engineering : Design, development and testing of software systems. Software life cycle: requirements analysis, software architecture and design, implementation, integration, test planning, and maintenance. The course involves a group project.\r\n\r\nTerms: Fall 2016, Winter 2017 ', 'Wednesday Thursdsday', 800, 800, 800, 800, 800, 1000, 800, 1000, 800, 800),
(8, 'James McGill', 'ECSE333', 'GRADER', 20, 'This is a cool class', 'Monday Tuesday', 800, 800, 1000, 800, 900, 800, 900, 900, 1000, 1100),
(12, 'DANIEL VARRO', 'ECSE 222', 'TA', 80, 'Looking for a TA for ECSE 222. Must be competent in digital logic.', 'Monday Wednesday Friday', 9, 11, 8, 8, 12, 14, 8, 8, 12, 13),
(231, 'JACK YOUNG', 'ECSE231', 'GRADER', 12, 'HIRING A GRADER', '', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(232, 'Proferssor Paul Python', 'ECSE223', 'Marker', 231, 'HIRING!', 'Monday Wednesday Thursdsday', 800, 900, 800, 800, 800, 1000, 800, 1200, 800, 800),
(233, 'Proferssor Paul Python', 'ECSE321', 'Grader', 23, 'HIRING!', 'Wednesday Thursdsday', 800, 800, 800, 800, 800, 900, 800, 1000, 800, 800),
(234, 'Proferssor Paul Python', 'ECSE222', 'Marker', 23, 'HIRING!', 'Wednesday Thursdsday Friday', 800, 800, 800, 800, 800, 800, 800, 800, 800, 800);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
