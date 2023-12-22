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
public class DetailsCommande {

    // Attributes corresponding to the DetailsCommande table in the database
    private int idDetailsCommande;
    private int idCommande; // Foreign key reference to Commande
    private int idArticle; // Foreign key reference to Article
    private int quantite;

    // Constructor without parameters
    public DetailsCommande() {
    }

    // Constructor with parameters
    public DetailsCommande(int idDetailsCommande, int idCommande, int idArticle, int quantite) {
        this.idDetailsCommande = idDetailsCommande;
        this.idCommande = idCommande;
        this.idArticle = idArticle;
        this.quantite = quantite;
    }

    // Getters and setters for each attribute
    public int getIdDetailsCommande() {
        return idDetailsCommande;
    }

    public void setIdDetailsCommande(int idDetailsCommande) {
        this.idDetailsCommande = idDetailsCommande;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public int getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    // toString method for debugging and logging purposes
    @Override
    public String toString() {
        return "DetailsCommande{" +
                "idDetailsCommande=" + idDetailsCommande +
                ", idCommande=" + idCommande +
                ", idArticle=" + idArticle +
                ", quantite=" + quantite +
                '}';
    }
}
