-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 13-03-2019 a las 09:51:04
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

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
