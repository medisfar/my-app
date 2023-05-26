package com.example.application.data.entity;

import jakarta.persistence.Entity;

@Entity
public class Banque extends AbstractEntity {

    private String nom_banque;
    private String adresse;

    public String getNom_banque() {
        return nom_banque;
    }
    public void setNom_banque(String nom_banque) {
        this.nom_banque = nom_banque;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

}
