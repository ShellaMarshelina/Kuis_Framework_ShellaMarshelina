-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 12 Des 2017 pada 15.43
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shella_kuiss`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `cv_1079`
--

CREATE TABLE `cv_1079` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `cv_1079`
--

INSERT INTO `cv_1079` (`id`, `description`, `name`) VALUES
(1, 'Good', 'Shella'),
(2, 'Nice', 'Ulfa'),
(3, 'Ok', 'Fandy'),
(4, 'Good', 'Risya');

-- --------------------------------------------------------

--
-- Struktur dari tabel `nilai_1079`
--

CREATE TABLE `nilai_1079` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(150) NOT NULL,
  `price` double NOT NULL,
  `cv_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `nilai_1079`
--

INSERT INTO `nilai_1079` (`id`, `description`, `name`, `price`, `cv_id`) VALUES
(1, 'Good', 'Isti', 12, 1),
(2, 'Oke', 'Yogi', 13, 1),
(3, 'Nice', 'Verdi', 15, 2),
(4, 'OK', 'Hanum', 16, 4);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_category`
--

CREATE TABLE `tbl_category` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_product`
--

CREATE TABLE `tbl_product` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(150) NOT NULL,
  `price` double NOT NULL,
  `category_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cv_1079`
--
ALTER TABLE `cv_1079`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_lb6711ru3xl0j5ra21fg4kkkc` (`name`);

--
-- Indexes for table `nilai_1079`
--
ALTER TABLE `nilai_1079`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKj0vxg4sko6mmo3byspd2d4l2l` (`cv_id`);

--
-- Indexes for table `tbl_category`
--
ALTER TABLE `tbl_category`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_8f25rdca1qev4kqtyrxwsx0k8` (`name`);

--
-- Indexes for table `tbl_product`
--
ALTER TABLE `tbl_product`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKfq7110lh85cseoy13cgni7pet` (`category_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cv_1079`
--
ALTER TABLE `cv_1079`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `nilai_1079`
--
ALTER TABLE `nilai_1079`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `tbl_category`
--
ALTER TABLE `tbl_category`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tbl_product`
--
ALTER TABLE `tbl_product`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `nilai_1079`
--
ALTER TABLE `nilai_1079`
  ADD CONSTRAINT `FKj0vxg4sko6mmo3byspd2d4l2l` FOREIGN KEY (`cv_id`) REFERENCES `cv_1079` (`id`);

--
-- Ketidakleluasaan untuk tabel `tbl_product`
--
ALTER TABLE `tbl_product`
  ADD CONSTRAINT `FKfq7110lh85cseoy13cgni7pet` FOREIGN KEY (`category_id`) REFERENCES `tbl_category` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
