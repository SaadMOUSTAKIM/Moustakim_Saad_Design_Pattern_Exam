package Entities;

public abstract class Entite {
    public String nom;

    public Entite(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
