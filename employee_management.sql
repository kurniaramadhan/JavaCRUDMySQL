-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 19, 2021 at 01:01 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `employee_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `karyawantetap`
--

CREATE TABLE `karyawantetap` (
  `nip` int(9) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `jam_kerja_per_hari` int(2) DEFAULT NULL,
  `lama_bekerja` int(2) DEFAULT NULL,
  `gaji_tetap` double DEFAULT NULL,
  `jumlah_dinas_luar` int(2) DEFAULT NULL,
  `total_gaji` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `karyawantetap`
--

INSERT INTO `karyawantetap` (`nip`, `nama`, `email`, `jam_kerja_per_hari`, `lama_bekerja`, `gaji_tetap`, `jumlah_dinas_luar`, `total_gaji`) VALUES
(120160502, 'Kurnia Ramadhan', 'kurniaramadhan@itenas.ac.id', 8, 5, 4500000, 0, 4725000);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `email` varchar(50) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  `firstname` varchar(30) DEFAULT NULL,
  `lastname` varchar(30) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `sex` varchar(1) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `admin` tinyint(1) DEFAULT NULL,
  `active` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`email`, `password`, `firstname`, `lastname`, `address`, `dob`, `sex`, `phone`, `admin`, `active`) VALUES
('kurniaramadhan@itenas.ac.id', '1234', 'Kurnia Ramadhan', 'Putra', 'Pasir Impun', '1991-03-11', 'P', '085320880888', 1, 1),
('sofia.umaroh@itenas.ac.id', '1234', 'Sofia', 'Umaroh', 'Cikutra', '1990-05-19', 'W', '085320880888', 0, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `karyawantetap`
--
ALTER TABLE `karyawantetap`
  ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
