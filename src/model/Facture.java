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
public class Facture {

    // Attributes corresponding to the Factures table in the database
    private int idFacture;
    private int idCommande; // Foreign key reference to Commande
    private double montantTotal;
    private Date dateEmission;

    // Constructor without parameters
    public Facture() {
    }

    // Constructor with parameters
    public Facture(int idFacture, int idCommande, double montantTotal, Date dateEmission) {
        this.idFacture = idFacture;
        this.idCommande = idCommande;
        this.montantTotal = montantTotal;
        this.dateEmission = dateEmission;
    }

    // Getters and setters for each attribute
    public int getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(int idFacture) {
        this.idFacture = idFacture;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public Date getDateEmission() {
        return dateEmission;
    }

    public void setDateEmission(Date dateEmission) {
        this.dateEmission = dateEmission;
    }

    // toString method for debugging and logging purposes
    @Override
    public String toString() {
        return "Facture{" +
                "idFacture=" + idFacture +
                ", idCommande=" + idCommande +
                ", montantTotal=" + montantTotal +
                ", dateEmission=" + dateEmission +
                '}';
    }
}
