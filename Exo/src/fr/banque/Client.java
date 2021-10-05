package fr.banque;

import java.util.Arrays;

public class Client {
    private String nom;
    private String prenom;
    private Integer age;
    private Integer numero;
    private Compte[] compte;

    public Client() {
    }

    public Client(String nom, String prenom, Integer age, Integer numero, Compte[] compte) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numero = numero;
        this.compte = compte;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Compte getCompte(int numeroCompte) {
        return compte[numeroCompte];
    }

    public void setCompte(Compte[] compte) {
        this.compte = compte;
    }

    public void ajouterCompte(Compte unCompte){
        numero +=1;
        compte[unCompte.getNumero()] = new Compte();
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                ", compte=" + Arrays.toString(compte) +
                '}';
    }
}

