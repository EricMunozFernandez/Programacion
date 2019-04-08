-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 13-03-2019 a las 10:07:38
-- Versión del servidor: 5.6.13
-- Versión de PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bdacontecimientoscompleta`
--
CREATE DATABASE IF NOT EXISTS `bdacontecimientoscompleta` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `bdacontecimientoscompleta`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acontecimientos`
--

CREATE TABLE IF NOT EXISTS `acontecimientos` (
  `nombre` varchar(40) NOT NULL,
  `lugar` varchar(40) NOT NULL,
  `fecha` date NOT NULL,
  `horaInicio` time NOT NULL,
  `horaFin` time NOT NULL,
  `aforo` int(4) NOT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresas`
--

CREATE TABLE IF NOT EXISTS `empresas` (
  `nif` varchar(9) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `razonSocial` varchar(40) NOT NULL,
  `cnae` int(4) NOT NULL,
  PRIMARY KEY (`nif`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE IF NOT EXISTS `personas` (
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `apellidos` varchar(40) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  `nif` varchar(9) NOT NULL,
  PRIMARY KEY (`dni`),
  KEY `nif` (`nif`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personasacontecimientos`
--

CREATE TABLE IF NOT EXISTS `personasacontecimientos` (
  `nombre` varchar(40) NOT NULL,
  `dni` varchar(9) NOT NULL,
  PRIMARY KEY (`nombre`,`dni`),
  KEY `dni` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `personas`
--
ALTER TABLE `personas`
  ADD CONSTRAINT `personas_ibfk_1` FOREIGN KEY (`nif`) REFERENCES `empresas` (`nif`);

--
-- Filtros para la tabla `personasacontecimientos`
--
ALTER TABLE `personasacontecimientos`
  ADD CONSTRAINT `personasacontecimientos_ibfk_2` FOREIGN KEY (`dni`) REFERENCES `personas` (`dni`),
  ADD CONSTRAINT `personasacontecimientos_ibfk_1` FOREIGN KEY (`nombre`) REFERENCES `acontecimientos` (`nombre`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
