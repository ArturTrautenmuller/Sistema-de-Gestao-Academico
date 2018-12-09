-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 09-Dez-2018 às 18:32
-- Versão do servidor: 10.1.36-MariaDB
-- versão do PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sga`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastro`
--

CREATE TABLE `cadastro` (
  `Matricula` int(10) NOT NULL,
  `Nome` varchar(30) NOT NULL,
  `Sobrenome` varchar(30) NOT NULL,
  `ddn` varchar(11) NOT NULL,
  `CidadeNascimento` varchar(30) NOT NULL,
  `UFNascimento` varchar(30) NOT NULL,
  `EstadoCivil` varchar(30) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Rua` varchar(50) NOT NULL,
  `Numero` varchar(10) NOT NULL,
  `Complemento` varchar(100) NOT NULL,
  `Bairro` varchar(30) NOT NULL,
  `CEP` varchar(10) NOT NULL,
  `Cidade` varchar(20) NOT NULL,
  `TelefoneResidencial` varchar(15) NOT NULL,
  `SituacaoAcademica` varchar(15) NOT NULL,
  `Documento` varchar(20) NOT NULL,
  `DDD` varchar(10) NOT NULL,
  `TipoLogradouro` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cadastro`
--

INSERT INTO `cadastro` (`Matricula`, `Nome`, `Sobrenome`, `ddn`, `CidadeNascimento`, `UFNascimento`, `EstadoCivil`, `Email`, `Rua`, `Numero`, `Complemento`, `Bairro`, `CEP`, `Cidade`, `TelefoneResidencial`, `SituacaoAcademica`, `Documento`, `DDD`, `TipoLogradouro`) VALUES
(15, 'joao', 'almeida', '23/06/1998', 'Goiania', 'Sao Paulo SP', 'Solteiro', 'ja@gmail.com', 'qualquer', '546132', '546132', 'qualquer', '84515252', 'Goiânia', '981659588', 'Suspenso', '455321', '17', ''),
(16, 'henry', 'allen', '14/02/1996', 'Sao Paulo', 'Sao Paulo SP', 'Solteiro', 'ha@gmail.com', 'qualquer', '54135', '54135', 'qualquer', '6453120', 'Aparecida de Goiânia', '165166532', 'Matriculado', '5641313', '62', 'Avenida'),
(17, 'artur', 'schneider', '19/09/2000', 'Londrina', 'Parana PR', 'Solteiro', 'arturtmuller13@gmai.com', 'praca', '23', '23', 'SaoCarlos', '75084235', 'Goiânia', '33240614', 'Matriculado', '5570047', '62', 'Rua');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cadastro`
--
ALTER TABLE `cadastro`
  ADD PRIMARY KEY (`Matricula`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cadastro`
--
ALTER TABLE `cadastro`
  MODIFY `Matricula` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
