-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Gazdă: 127.0.0.1
-- Timp de generare: mart. 31, 2021 la 05:17 PM
-- Versiune server: 10.4.17-MariaDB
-- Versiune PHP: 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Bază de date: `gestiune_auto`
--

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `bon`
--

CREATE TABLE `bon` (
  `id_bon` int(11) NOT NULL,
  `id_client` int(11) DEFAULT NULL,
  `id_piesa` int(11) DEFAULT NULL,
  `id_mecanic` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `client`
--

CREATE TABLE `client` (
  `id_client` int(11) NOT NULL,
  `Nume` varchar(50) DEFAULT NULL,
  `Prenume` varchar(50) DEFAULT NULL,
  `CNP` varchar(50) DEFAULT NULL,
  `Adresa` varchar(50) DEFAULT NULL,
  `Nr_Tel` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Eliminarea datelor din tabel `client`
--

INSERT INTO `client` (`id_client`, `Nume`, `Prenume`, `CNP`, `Adresa`, `Nr_Tel`) VALUES
(2, 'dasda', 'asdas', '1231232', 'mortaul2131', 31231),
(3, 'Marx', 'Taxx', '123213123', 'ssafsfas', 31132),
(4, 'Marx', 'Taxx', '123213123', 'ssafsfas', 31132),
(5, 'Marx', 'Taxx', '123213123', 'ssafsfas', 31132),
(6, NULL, NULL, NULL, NULL, NULL),
(7, NULL, NULL, NULL, NULL, NULL),
(8, 'dasda', 'asdas', '1231232', 'mortaul2131', NULL);

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `mecanic`
--

CREATE TABLE `mecanic` (
  `id_mecanic` int(11) NOT NULL,
  `Nume` varchar(50) DEFAULT NULL,
  `Prenume` varchar(50) DEFAULT NULL,
  `CNP` varchar(50) DEFAULT NULL,
  `Adresa` varchar(50) DEFAULT NULL,
  `Nr_Tel` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Eliminarea datelor din tabel `mecanic`
--

INSERT INTO `mecanic` (`id_mecanic`, `Nume`, `Prenume`, `CNP`, `Adresa`, `Nr_Tel`) VALUES
(1, 'dasad', 'sad', '123', '123', 1232),
(3, 'Malforsix', 'Plocat', '5231', 'Mariciului 5', 8921);

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `piesa`
--

CREATE TABLE `piesa` (
  `id_piesa` int(11) NOT NULL,
  `Cantitate` int(11) DEFAULT NULL,
  `Denumire` varchar(50) DEFAULT NULL,
  `Pret` int(11) DEFAULT NULL,
  `Gramaj` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Eliminarea datelor din tabel `piesa`
--

INSERT INTO `piesa` (`id_piesa`, `Cantitate`, `Denumire`, `Pret`, `Gramaj`) VALUES
(1, 122, 'das', 112, 112),
(2, 123, 'dsad', 123, 123),
(3, 26, 'MAXEL S R L', 12, 123),
(4, 26, 'MAXEL S R L', 12, 123);

--
-- Indexuri pentru tabele eliminate
--

--
-- Indexuri pentru tabele `bon`
--
ALTER TABLE `bon`
  ADD PRIMARY KEY (`id_bon`),
  ADD KEY `id_client` (`id_client`),
  ADD KEY `id_piesa` (`id_piesa`),
  ADD KEY `id_mecanic` (`id_mecanic`);

--
-- Indexuri pentru tabele `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id_client`);

--
-- Indexuri pentru tabele `mecanic`
--
ALTER TABLE `mecanic`
  ADD PRIMARY KEY (`id_mecanic`);

--
-- Indexuri pentru tabele `piesa`
--
ALTER TABLE `piesa`
  ADD PRIMARY KEY (`id_piesa`);

--
-- AUTO_INCREMENT pentru tabele eliminate
--

--
-- AUTO_INCREMENT pentru tabele `client`
--
ALTER TABLE `client`
  MODIFY `id_client` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT pentru tabele `mecanic`
--
ALTER TABLE `mecanic`
  MODIFY `id_mecanic` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pentru tabele `piesa`
--
ALTER TABLE `piesa`
  MODIFY `id_piesa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
