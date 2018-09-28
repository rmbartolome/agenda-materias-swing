-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generaci�n: 13-11-2014 a las 14:24:01
-- Versi�n del servidor: 5.5.39
-- Versi�n de PHP: 5.4.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `AgendaMaterias`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `AgendaMaterias`
--

CREATE TABLE IF NOT EXISTS `Agenda` (
`Id_Agenda` int(11) NOT NULL,
  `nombre_materia` varchar(50) NOT NULL,
  `docente` varchar(50) NOT NULL,
`tipoMateria` varchar(50) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `AgendaMaterias`
--

INSERT INTO `Agenda`(`Id_Agenda`, `nombre_materia`, `docente`, `tipoMateria`) VALUES
(1, 'Matematica', 'Jose Calderon', 'Cuantitativa'),
(2, 'Lengua y literatura', 'Roberto Bartolome', 'Cuanlitativa');

--
-- �ndices para tablas volcadas
--

--
-- Indices de la tabla `AgendaMaterias`
--
ALTER TABLE `Agenda`
 ADD PRIMARY KEY (`Id_Agenda`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `AgendaMaterias`
--
ALTER TABLE `Agenda`
MODIFY `Id_Agenda` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;