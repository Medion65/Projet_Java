package fr.banque;

import java.util.Arrays;

public class Client {
    private String nom;
    private String prenom;
    private Integer age;
    private Integer numero;
    private Compte[] comptes;

    //region Constructeur
    public Client() {
    }

    public Client(String nom, String prenom, Integer age, Integer numero, Compte[] compte) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numero = numero;
        this.comptes = compte;
    }
    //endregion

    //region Getter/Setter
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Compte[] getComptes() {
        return comptes;
    }

    public void setComptes(Compte[] compte) {
        this.comptes = compte;
    }
    //endregion

    public void ajouterCompte(Compte unCompte) {
        for (int i = 0; i < this.comptes.length; i++) {
            if (this.comptes[i] == null) {
                this.comptes[i] = unCompte;
                break;
            } else
                System.out.println("Vous avez le max de compte");
        }
    }

    public Compte getCompte(Integer numeroCompte) {
        Compte compteCopy = null;
        for (Compte compte:this.getComptes()) {
            if(compte.getNumero() == numeroCompte) {
                compteCopy = compte;
                break;
            }
        }
        if (compteCopy == null) {
            System.out.println("Le compte n'existe pas");
        }
        return compteCopy;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                ", compte=" + Arrays.toString(comptes) +
                '}';
    }
}

