-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 12-03-2019 a las 08:37:43
-- Versión del servidor: 5.6.13
-- Versión de PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bdacontecimientos`
--
CREATE DATABASE IF NOT EXISTS `bdacontecimientos` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `bdacontecimientos`;

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

--
-- Volcado de datos para la tabla `acontecimientos`
--

INSERT INTO `acontecimientos` (`nombre`, `lugar`, `fecha`, `horaInicio`, `horaFin`, `aforo`) VALUES
('aaaaaaaaaa', 'Artium', '2019-03-16', '00:30:00', '01:00:00', 1),
('aaaaaaaaaaaa', 'Mendizorroza', '2019-03-04', '00:00:00', '00:00:00', 12),
('aaaaaaaaaaaaaa', 'Artium', '2019-03-16', '01:00:00', '01:30:00', 10),
('AAAAAAAAAAAAAAAaa', 'Teatro Principal', '2019-03-30', '02:30:00', '03:30:00', 100),
('cuatro', 'Iradier Arena', '2019-04-05', '05:00:00', '05:30:00', 50),
('pp2', 'Artium', '2019-03-29', '02:00:00', '03:00:00', 10),
('tres', 'Artium', '2019-03-22', '03:00:00', '04:30:00', 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresas`
--

CREATE TABLE IF NOT EXISTS `empresas` (
  `nombre` varchar(40) NOT NULL,
  `direccion` varchar(40) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE IF NOT EXISTS `personas` (
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  `empresa` varchar(40) NOT NULL,
  PRIMARY KEY (`dni`),
  KEY `empresa` (`empresa`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personasacontecimientos`
--

CREATE TABLE IF NOT EXISTS `personasacontecimientos` (
  `dni` varchar(9) NOT NULL,
  `nombreAcontecimiento` varchar(40) NOT NULL,
  PRIMARY KEY (`dni`,`nombreAcontecimiento`),
  KEY `nombreAcontecimiento` (`nombreAcontecimiento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `personas`
--
ALTER TABLE `personas`
  ADD CONSTRAINT `personas_ibfk_1` FOREIGN KEY (`empresa`) REFERENCES `empresas` (`nombre`);

--
-- Filtros para la tabla `personasacontecimientos`
--
ALTER TABLE `personasacontecimientos`
  ADD CONSTRAINT `personasacontecimientos_ibfk_1` FOREIGN KEY (`dni`) REFERENCES `personas` (`dni`),
  ADD CONSTRAINT `personasacontecimientos_ibfk_2` FOREIGN KEY (`nombreAcontecimiento`) REFERENCES `acontecimientos` (`nombre`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
