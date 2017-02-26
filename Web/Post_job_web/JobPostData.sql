-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Feb 26, 2017 at 08:53 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `TAMAS_ECSE321`
--

-- --------------------------------------------------------

--
-- Table structure for table `JobPostData`
--

CREATE TABLE `JobPostData` (
  `POST_ID` int(10) NOT NULL,
  `INSTRUCTOR_NAME` varchar(100) NOT NULL,
  `COURSE` varchar(20) NOT NULL,
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
  `FRI_END_TIME` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `JobPostData`
--

INSERT INTO `JobPostData` (`POST_ID`, `INSTRUCTOR_NAME`, `COURSE`, `HOUR`, `DESCRIPTION`, `DAYS_OF_WEEK`, `MON_START_TIME`, `MON_END_TIME`, `TUE_START_TIME`, `TUE_END_TIME`, `WED_START_TIME`, `WED_END_TIME`, `THU_START_TIME`, `THU_END_TIME`, `FRI_START_TIME`, `FRI_END_TIME`) VALUES
(1, 'Proferssor Paul Python', 'ECSE222', 14, 'Offered by: Electrical & Computer Engr (Faculty of Engineering)\r\n\r\nOverview\r\nElectrical Engineering : An introduction to digital logic, binary numbers and Boolean algebra, combinational circuits, optimized implementation of combinational circuits, arithmetic circuits, combinational circuit building blocks, flip-flops, registers, counters, design of digital circuits with VHDL, and synchronous sequential circuits.\r\n\r\nTerms: Winter 2017', 'Monday Wednesday Friday', 800, 900, 800, 800, 900, 1200, 800, 800, 900, 1000),
(2, 'Proferssor Paul Python', 'ECSE223', 15, 'Offered by: Electrical & Computer Engr (Faculty of Engineering)\r\n\r\nOverview\r\nElectrical Engineering : Data structures (arrays, lists, stacks, queues, dequeues and trees) and their machine representation and simple algorithms. Peripheral devices: printers, keyboards, magnetic type drives, magnetic disc drives. Peripheral interfacing and busses. Introduction to operating systems. System integration. Computer systems and networks.\r\n\r\nTerms: Fall 2012, Winter 2013', 'Tuesday Wednesday', 800, 800, 800, 900, 800, 1000, 800, 800, 800, 800),
(3, 'Proferssor Paul Python', 'ECSE321', 15, 'Offered by: Electrical & Computer Engr (Faculty of Engineering)\r\n\r\nOverview\r\nElectrical Engineering : Design, development and testing of software systems. Software life cycle: requirements analysis, software architecture and design, implementation, integration, test planning, and maintenance. The course involves a group project.', 'Tuesday Wednesday Thursdsday', 800, 800, 800, 1200, 800, 900, 800, 1000, 800, 800);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `JobPostData`
--
ALTER TABLE `JobPostData`
  ADD PRIMARY KEY (`POST_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `JobPostData`
--
ALTER TABLE `JobPostData`
  MODIFY `POST_ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;