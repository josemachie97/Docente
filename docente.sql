-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 31-Jan-2022 às 13:54
-- Versão do servidor: 10.4.21-MariaDB
-- versão do PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `docente`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `docente_model`
--

CREATE TABLE `docente_model` (
  `docente_id` bigint(20) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `disciplina` varchar(255) DEFAULT NULL,
  `idade` tinyint(4) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `docente_model`
--

INSERT INTO `docente_model` (`docente_id`, `nome`, `disciplina`, `idade`) VALUES
(1, 'Denilson Marcos', 'Física', 45),
(2, 'Fáusia Margarida', 'Gestão de Empresas', 26),
(4, 'Laurinda Matosse', 'Direito', 27),
(6, 'Aaliya fernanda narciso maciel ', 'lingua portuguesa ', 25);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario_model`
--

CREATE TABLE `usuario_model` (
  `usuario_id` bigint(20) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `usuario_model`
--

INSERT INTO `usuario_model` (`usuario_id`, `password`, `user_name`, `email`) VALUES
(1, '$2a$12$mJ0vfRJx7dbh5PGco/lkveHRmcAOpQ289LE/MP5NQiVetl5V8LO0S', 'José Machie', 'josemachie@gmail.com'),
(2, '$2a$12$h/YcixVKXmESdy/8ti1c8eJXTt8m.F0OztcN0TIPLp8qkxTotLOAO', 'Fausia Machie', 'fausiamachie@gmail.com'),
(3, '$2a$10$EimD0a55n.ml4OMw77ES5.2NnqzrhoojyxxQQiux3Uailpni/GH6O', 'Chaly Machie', 'machie@gmail.com'),
(5, '$2a$10$AyboGYg9Qhoof5u6NRc56.EBNvzC.xYaXQyNuWsgmvJPyuxVFAlAS', 'Arone Machava', 'aronemachava@gmail.com'),
(6, '$2a$10$BUYi3lQcSXViw20cgfcKK.M06I.8WXMUmxK2gEBrZCmtDobJebHo6', 'Lionel Messi', 'Messi@gmail.com');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `docente_model`
--
ALTER TABLE `docente_model`
  ADD PRIMARY KEY (`docente_id`);

--
-- Índices para tabela `usuario_model`
--
ALTER TABLE `usuario_model`
  ADD PRIMARY KEY (`usuario_id`),
  ADD UNIQUE KEY `UK_ot6aymwb5bn04agn5j9gc9ksn` (`password`) USING HASH,
  ADD UNIQUE KEY `UK_cqltx0iwmf6ia6ik0dqj9v7fo` (`user_name`) USING HASH,
  ADD UNIQUE KEY `UK_qpmosrdn1nxltxb3bmeneafv8` (`email`) USING HASH;

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `docente_model`
--
ALTER TABLE `docente_model`
  MODIFY `docente_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `usuario_model`
--
ALTER TABLE `usuario_model`
  MODIFY `usuario_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
