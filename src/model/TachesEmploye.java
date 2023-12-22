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

/**
 *
 * @author assi
 */
@Entity
public class TachesEmploye {

    // Attributes corresponding to the TachesEmployes table in the database
    private int idTacheEmploye;
    private int idEmploye; // Foreign key reference to Employe
    private int idCommande; // Foreign key reference to Commande
    private String description;
    private String statut;

    // Constructor without parameters
    public TachesEmploye() {
    }

    // Constructor with parameters
    public TachesEmploye(int idTacheEmploye, int idEmploye, int idCommande, String description, String statut) {
        this.idTacheEmploye = idTacheEmploye;
        this.idEmploye = idEmploye;
        this.idCommande = idCommande;
        this.description = description;
        this.statut = statut;
    }

    // Getters and setters for each attribute
    public int getIdTacheEmploye() {
        return idTacheEmploye;
    }

    public void setIdTacheEmploye(int idTacheEmploye) {
        this.idTacheEmploye = idTacheEmploye;
    }

    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    // toString method for debugging and logging purposes
    @Override
    public String toString() {
        return "TachesEmploye{" +
                "idTacheEmploye=" + idTacheEmploye +
                ", idEmploye=" + idEmploye +
                ", idCommande=" + idCommande +
                ", description='" + description + '\'' +
                ", statut='" + statut + '\'' +
                '}';
    }
}
