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


public class Paiement {

    // Attributes corresponding to the Paiements table in the database
    private int idPaiement;
    private int idFacture; // Foreign key reference to Facture
    private double montantPaye;
    private Date datePaiement;

    // Constructor without parameters
    public Paiement() {
    }

    // Constructor with parameters
    public Paiement(int idPaiement, int idFacture, double montantPaye, Date datePaiement) {
        this.idPaiement = idPaiement;
        this.idFacture = idFacture;
        this.montantPaye = montantPaye;
        this.datePaiement = datePaiement;
    }

    // Getters and setters for each attribute
    public int getIdPaiement() {
        return idPaiement;
    }

    public void setIdPaiement(int idPaiement) {
        this.idPaiement = idPaiement;
    }

    public int getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(int idFacture) {
        this.idFacture = idFacture;
    }

    public double getMontantPaye() {
        return montantPaye;
    }

    public void setMontantPaye(double montantPaye) {
        this.montantPaye = montantPaye;
    }

    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    // toString method for debugging and logging purposes
    @Override
    public String toString() {
        return "Paiement{" +
                "idPaiement=" + idPaiement +
                ", idFacture=" + idFacture +
                ", montantPaye=" + montantPaye +
                ", datePaiement=" + datePaiement +
                '}';
    }
}
