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
public class Article {

    // Attributes corresponding to the Articles table in the database
    private int idArticle;
    private String nomArticle;
    private String description;
    private double prixUnitaire;
    private int stockDisponible;

    // Constructor without parameters
    public Article() {
    }

    // Constructor with parameters
    public Article(int idArticle, String nomArticle, String description, double prixUnitaire, int stockDisponible) {
        this.idArticle = idArticle;
        this.nomArticle = nomArticle;
        this.description = description;
        this.prixUnitaire = prixUnitaire;
        this.stockDisponible = stockDisponible;
    }

    // Getters and setters for each attribute
    public int getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    // toString method for debugging and logging purposes
    @Override
    public String toString() {
        return "Article{" +
                "idArticle=" + idArticle +
                ", nomArticle='" + nomArticle + '\'' +
                ", description='" + description + '\'' +
                ", prixUnitaire=" + prixUnitaire +
                ", stockDisponible=" + stockDisponible +
                '}';
    }
}
