-- Création de la base de données
CREATE DATABASE IF NOT EXISTS blanchisserie;
USE blanchisserie;

-- Création de la table Clients
CREATE TABLE IF NOT EXISTS Clients (
    idClient INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    prenom VARCHAR(255) NOT NULL,
    adresse TEXT,
    email VARCHAR(255),
    telephone VARCHAR(255)
);

-- Création de la table Commandes
CREATE TABLE IF NOT EXISTS Commandes (
    idCommande INT AUTO_INCREMENT PRIMARY KEY,
    idClient INT NOT NULL,
    dateCommande DATE NOT NULL,
    statut VARCHAR(255) NOT NULL,
    FOREIGN KEY (idClient) REFERENCES Clients(idClient)
);

-- Création de la table Articles
CREATE TABLE IF NOT EXISTS Articles (
    idArticle INT AUTO_INCREMENT PRIMARY KEY,
    nomArticle VARCHAR(255) NOT NULL,
    description TEXT,
    prixUnitaire DECIMAL(10, 2) NOT NULL,
    stockDisponible INT NOT NULL
);

-- Création de la table DetailsCommande
CREATE TABLE IF NOT EXISTS DetailsCommande (
    idDetailsCommande INT AUTO_INCREMENT PRIMARY KEY,
    idCommande INT NOT NULL,
    idArticle INT NOT NULL,
    quantite INT NOT NULL,
    FOREIGN KEY (idCommande) REFERENCES Commandes(idCommande),
    FOREIGN KEY (idArticle) REFERENCES Articles(idArticle)
);

-- Création de la table Factures
CREATE TABLE IF NOT EXISTS Factures (
    idFacture INT AUTO_INCREMENT PRIMARY KEY,
    idCommande INT NOT NULL,
    montantTotal DECIMAL(10, 2) NOT NULL,
    dateEmission DATE NOT NULL,
    FOREIGN KEY (idCommande) REFERENCES Commandes(idCommande)
);

-- Création de la table Paiements
CREATE TABLE IF NOT EXISTS Paiements (
    idPaiement INT AUTO_INCREMENT PRIMARY KEY,
    idFacture INT NOT NULL,
    montantPaye DECIMAL(10, 2) NOT NULL,
    datePaiement DATE NOT NULL,
    FOREIGN KEY (idFacture) REFERENCES Factures(idFacture)
);

-- Création de la table Employes
CREATE TABLE IF NOT EXISTS Employes (
    idEmploye INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    prenom VARCHAR(255) NOT NULL,
    fonction VARCHAR(255) NOT NULL,
    dateEmbauche DATE NOT NULL,
    salaire DECIMAL(10, 2) NOT NULL
);

-- Création de la table TachesEmployes
CREATE TABLE IF NOT EXISTS TachesEmployes (
    idTacheEmploye INT AUTO_INCREMENT PRIMARY KEY,
    idEmploye INT NOT NULL,
    idCommande INT NOT NULL,
    description TEXT,
    statut VARCHAR(255) NOT NULL,
    FOREIGN KEY (idEmploye) REFERENCES Employes(idEmploye),
    FOREIGN KEY (idCommande) REFERENCES Commandes(idCommande)
);
