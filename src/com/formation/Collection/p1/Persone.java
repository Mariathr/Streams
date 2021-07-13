package com.formation.Collection.p1;

public class Persone {
    private String nom, prenom, genre, ville;
    private int annee_naissance;
    private Double salary;

    public Persone( String prenom, String nom, int annee_naissance, Double salary, String genre, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.ville = ville;
        this.annee_naissance = annee_naissance;
        this.salary = salary;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getAnnee_naissance() {
        return annee_naissance;
    }

    public void setAnnee_naissance(int annee_naissance) {
        this.annee_naissance = annee_naissance;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Persone{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", genre='" + genre + '\'' +
                ", ville='" + ville + '\'' +
                ", annee_naissance=" + annee_naissance +
                ", salary=" + salary +
                '}';
    }
}
