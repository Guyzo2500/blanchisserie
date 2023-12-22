/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 *
 * @author assi
 */
@Entity


public class Employe {

    // Attributes corresponding to the Employes table in the database
    private int idEmploye;
    private String nom;
    private String prenom;
    private String fonction;
    private Date dateEmbauche;
    private double salaire;

    // Constructor without parameters
    public Employe() {
    }

    // Constructor with parameters
    public Employe(int idEmploye, String nom, String prenom, String fonction, Date dateEmbauche, double salaire) {
        this.idEmploye = idEmploye;
        this.nom = nom;
        this.prenom = prenom;
        this.fonction = fonction;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }

    // Getters and setters for each attribute
    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    // toString method for debugging and logging purposes
    @Override
    public String toString() {
        return "Employe{" +
                "idEmploye=" + idEmploye +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", fonction='" + fonction + '\'' +
                ", dateEmbauche=" + dateEmbauche +
                ", salaire=" + salaire +
                '}';
    }
}
