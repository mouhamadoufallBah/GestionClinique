-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : Dim 21 nov. 2021 à 00:26
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `clinique`
--

-- --------------------------------------------------------

--
-- Structure de la table `dossiermedical`
--

DROP TABLE IF EXISTS `dossiermedical`;
CREATE TABLE IF NOT EXISTS `dossiermedical` (
  `idM` int(11) NOT NULL AUTO_INCREMENT,
  `contenue` text NOT NULL,
  PRIMARY KEY (`idM`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `medicament`
--

DROP TABLE IF EXISTS `medicament`;
CREATE TABLE IF NOT EXISTS `medicament` (
  `codeM` int(11) NOT NULL AUTO_INCREMENT,
  `nomM` varchar(255) NOT NULL,
  `posologie` varchar(255) NOT NULL,
  PRIMARY KEY (`codeM`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `ordonance`
--

DROP TABLE IF EXISTS `ordonance`;
CREATE TABLE IF NOT EXISTS `ordonance` (
  `idO` int(11) NOT NULL AUTO_INCREMENT,
  `code` int(11) DEFAULT NULL,
  `codeM` int(11) DEFAULT NULL,
  PRIMARY KEY (`idO`),
  KEY `codeM` (`codeM`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `rv`
--

DROP TABLE IF EXISTS `rv`;
CREATE TABLE IF NOT EXISTS `rv` (
  `idR` int(11) NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `heure` time NOT NULL,
  `libelleR` varchar(255) NOT NULL,
  `temperature` double DEFAULT NULL,
  `tension` double DEFAULT NULL,
  `prestationAf` varchar(255) DEFAULT NULL,
  `libelleP` varchar(255) DEFAULT NULL,
  `idC` int(11) DEFAULT NULL,
  `idP` int(11) DEFAULT NULL,
  PRIMARY KEY (`idR`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `rv`
--

INSERT INTO `rv` (`idR`, `date`, `heure`, `libelleR`, `temperature`, `tension`, `prestationAf`, `libelleP`, `idC`, `idP`) VALUES
(1, '2021-11-17', '16:30:00', 'Consultation', NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  `role` enum('medecin,secretaire,responsableP,patient') DEFAULT NULL,
  `codeP` int(11) DEFAULT NULL,
  `antecedent` varchar(255) DEFAULT NULL,
  `statu` varchar(255) DEFAULT NULL,
  `idR` int(11) DEFAULT NULL,
  `idO` int(11) DEFAULT NULL,
  `codeRp` int(11) DEFAULT NULL,
  `codeS` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idR` (`idR`),
  KEY `idO` (`idO`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `users`
--

INSERT INTO `users` (`id`, `nom`, `prenom`, `login`, `pwd`, `role`, `codeP`, `antecedent`, `statu`, `idR`, `idO`, `codeRp`, `codeS`) VALUES
(1, 'ba', 'mouha', 'mouha.ba', '123', NULL, NULL, 'asthme', NULL, NULL, NULL, NULL, NULL);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
